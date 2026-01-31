from selenium import webdriver
from selenium.webdriver.common.by import By
driver = webdriver.Firefox()
driver.get("https://training-support.net/webelements/login-form/")
print("Page Title:", driver.title)
username = driver.find_element(By.ID, "username")
username.send_keys("admin")
password = driver.find_element(By.ID, "password")
password.send_keys("password")
login_button = driver.find_element(By.XPATH, "//button[text()='Submit']")
login_button.click()
driver.quit()