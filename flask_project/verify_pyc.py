"""Verify our .pyc is actually used by checking import behavior"""
import sys, os, dis, importlib.util

os.chdir(os.path.dirname(os.path.abspath(__file__)))

# First, delete any existing cache and copy our .pyc
cache_path = os.path.join(os.path.dirname(__file__), '__pycache__')
for f in os.listdir(cache_path):
    if f.startswith('app.') and f.endswith('.pyc'):
        os.remove(os.path.join(cache_path, f))

compiled = r'C:\Users\Yousef Razzouk\IdeaProjects\compiler_project\__pycache__\app.cpython-314.pyc'
import shutil
target = os.path.join(cache_path, 'app.cpython-314.pyc')
shutil.copy2(compiled, target)

# Now import app fresh
# Use importlib to load from path
from app import app as flask_app

# Check the __file__ attribute
import app
print(f"app.__file__ = {app.__file__}")
print(f"app.__cached__ = {app.__cached__}")

# Check the delete function bytecode
delete_func = app.delete
print(f"\ndelete function: {delete_func}")
print(f"delete.__code__: {delete_func.__code__}")
print(f"co_names: {delete_func.__code__.co_names}")
print(f"co_varnames: {delete_func.__code__.co_varnames}")
print(f"co_consts: {delete_func.__code__.co_consts}")
print(f"co_code length: {len(delete_func.__code__.co_code)}")

# Check if any sub-code objects exist (listcomp, genexpr)
for const in delete_func.__code__.co_consts:
    if hasattr(const, 'co_code'):
        print(f"\n  Nested code: {const.co_name}")
        print(f"  co_code: {list(const.co_code)}")
        print(f"  co_varnames: {const.co_varnames}")
        print(f"  co_freevars: {const.co_freevars}")
        print(f"  co_cellvars: {const.co_cellvars}")
        dis.dis(const)

print("\n\n=== Full delete disassembly ===")
dis.dis(delete_func)
