"""Run Flask server and test delete endpoint"""
import sys, os, time, urllib.request, urllib.parse, urllib.error, threading

os.chdir(os.path.dirname(os.path.abspath(__file__)))

from app import app
import shutil

# Ensure compiled .pyc is in cache
cache_path = os.path.join(os.path.dirname(__file__), '__pycache__')
compiled = r'C:\Users\Yousef Razzouk\IdeaProjects\compiler_project\__pycache__\app.cpython-314.pyc'
target = os.path.join(cache_path, 'app.cpython-314.pyc')
shutil.copy2(compiled, target)

# Start server in background thread
def run_server():
    app.run(port=5179, debug=True, use_reloader=False)

server_thread = threading.Thread(target=run_server, daemon=True)
server_thread.start()
time.sleep(2)

def test():
    try:
        # 1. GET /
        print("1. GET /", end=' ', flush=True)
        resp = urllib.request.urlopen('http://localhost:5179/', timeout=10)
        print(resp.status)

        # 2. Add a product
        print("2. POST /add", end=' ', flush=True)
        data = urllib.parse.urlencode({
            'name': 'TestItem', 'price': '25', 'description': 'Testing',
            'specification': 'Spec123', 'img': 'http://pic.com/img.png'
        }).encode()
        req = urllib.request.Request('http://localhost:5179/add', data=data, method='POST')
        resp = urllib.request.urlopen(req, timeout=10)
        print(resp.status)

        # 3. Verify product
        print("3. GET /", end=' ', flush=True)
        resp = urllib.request.urlopen('http://localhost:5179/', timeout=10)
        body = resp.read().decode()
        has = 'TestItem' in body
        print(resp.status, f"found={has}")

        # 4. DELETE 1
        print("4. GET /delete/1", end=' ', flush=True)
        req = urllib.request.Request('http://localhost:5179/delete/1', method='GET')
        try:
            resp = urllib.request.urlopen(req, timeout=10)
            print(resp.status)
        except urllib.error.HTTPError as e:
            print(f"HTTP {e.code}", e.read()[:200])

        # 5. Verify deleted
        print("5. GET /", end=' ', flush=True)
        resp = urllib.request.urlopen('http://localhost:5179/', timeout=10)
        body = resp.read().decode()
        has = 'TestItem' in body
        print(resp.status, f"found={has}")

        print("\n=== ALL DONE ===")
    except Exception as e:
        import traceback
        traceback.print_exc()
    finally:
        os._exit(0)

test()
