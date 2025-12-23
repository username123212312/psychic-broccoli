package ast.htmlElement;

import ast.htmlContentItem.HtmlContentItem;

import java.util.List;

public class HtmlBodyItem extends  HtmlElementItem{
   private List<HtmlContentItem> contentItems;
   public HtmlBodyItem(int line_number , List<HtmlContentItem> contentItems){
       super("Html Body " , line_number);
       this.contentItems = contentItems;
   }
  public List<HtmlContentItem> getContentItems(){
       return  contentItems;
  }
  @Override
    public String toString(){
       return "HtmlBodyItem";
  }
}
