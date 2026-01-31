def add(a,b):
    return a+b
def subtract(a,b):
    return a-b
def multiply(a,b):
    return a*b
def divide(a,b):
    if b==0:
        raise ValueError("cannot divide by Zero")
    return a/b

def test_add():
    assert add(2,4)==6