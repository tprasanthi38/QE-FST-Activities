import pytest

def test_login():
    assert True

def test_logout():
    assert True

@pytest.mark.activity
def test_add_item():
    assert 2 + 3 == 5

@pytest.mark.activity
def test_remove_item():
    assert 5 - 3 == 2