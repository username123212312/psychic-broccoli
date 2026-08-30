package gui;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GraphicsEnvironment;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class ParseTreeViewer {
    private static JFrame frame;
    private static JList<String> sidebar;
    private static DefaultListModel<String> listModel;
    private static CardLayout cards;
    private static JPanel cardsPanel;
    private static JLabel scaleLabel;
    private static final Map<String, TreeViewer> viewers = new LinkedHashMap<>();
    private static final Map<String, JComponentRef> panels = new LinkedHashMap<>();

    public static void show(String title, String[] ruleNames, ParseTree tree) {
        if (title == null || ruleNames == null || tree == null) return;
        if (GraphicsEnvironment.isHeadless()) return;
        SwingUtilities.invokeLater(() -> {
            ensureWindow();
            addOrReplace(title, ruleNames, tree);
        });
    }

    private static void ensureWindow() {
        if (frame != null && frame.isDisplayable()) return;

        listModel = new DefaultListModel<>();
        sidebar = new JList<>(listModel);
        sidebar.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        sidebar.setFixedCellWidth(220);
        sidebar.setFixedCellHeight(22);
        sidebar.setVisibleRowCount(20);

        cards = new CardLayout();
        cardsPanel = new JPanel(cards);
        scaleLabel = new JLabel("Scale: 1.5");

        JButton zoomIn = new JButton("Zoom In");
        JButton zoomOut = new JButton("Zoom Out");
        JButton reset = new JButton("Reset Zoom");

        zoomIn.addActionListener(e -> {
            TreeViewer viewer = currentViewer();
            if (viewer != null) viewer.setScale(viewer.getScale() * 1.2);
            updateScaleLabel();
        });
        zoomOut.addActionListener(e -> {
            TreeViewer viewer = currentViewer();
            if (viewer != null) viewer.setScale(viewer.getScale() / 1.2);
            updateScaleLabel();
        });
        reset.addActionListener(e -> {
            TreeViewer viewer = currentViewer();
            if (viewer != null) viewer.setScale(1.0);
            updateScaleLabel();
        });

        JPanel toolbar = new JPanel(new FlowLayout(FlowLayout.LEFT));
        toolbar.add(zoomIn);
        toolbar.add(zoomOut);
        toolbar.add(reset);
        toolbar.add(scaleLabel);

        JPanel right = new JPanel(new BorderLayout());
        right.add(toolbar, BorderLayout.NORTH);
        right.add(cardsPanel, BorderLayout.CENTER);

        JScrollPane sideScroll = new JScrollPane(sidebar);
        sideScroll.setBorder(BorderFactory.createEmptyBorder());

        JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, sideScroll, right);
        split.setDividerLocation(240);
        split.setResizeWeight(0.0);

        sidebar.addListSelectionListener(e -> {
            if (e.getValueIsAdjusting()) return;
            String selected = sidebar.getSelectedValue();
            if (selected != null) {
                cards.show(cardsPanel, selected);
                updateScaleLabel();
            }
        });

        frame = new JFrame("Parse Tree Viewer");
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.add(split);
        frame.setSize(1200, 720);
        frame.setLocationRelativeTo(null);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                reset();
            }
        });
        frame.setVisible(true);
    }

    private static void addOrReplace(String title, String[] ruleNames, ParseTree tree) {
        TreeViewer viewer = new TreeViewer(Arrays.asList(ruleNames), tree);
        viewer.setScale(1.5);

        JScrollPane pane = new JScrollPane(viewer);
        pane.setBorder(BorderFactory.createTitledBorder(title));

        boolean existing = panels.containsKey(title);
        if (!existing) {
            listModel.addElement(title);
        } else {
            cardsPanel.remove(panels.get(title).component);
        }

        panels.put(title, new JComponentRef(pane));
        viewers.put(title, viewer);
        cardsPanel.add(pane, title);

        sidebar.setSelectedValue(title, true);
        cards.show(cardsPanel, title);
        updateScaleLabel();
    }

    private static TreeViewer currentViewer() {
        String selected = sidebar.getSelectedValue();
        return selected == null ? null : viewers.get(selected);
    }

    private static void updateScaleLabel() {
        TreeViewer viewer = currentViewer();
        if (viewer != null) {
            scaleLabel.setText(String.format("Scale: %.2f", viewer.getScale()));
        }
    }

    private static void reset() {
        frame = null;
        listModel = null;
        sidebar = null;
        cards = null;
        cardsPanel = null;
        scaleLabel = null;
        viewers.clear();
        panels.clear();
    }

    private record JComponentRef(javax.swing.JComponent component) {
    }
}