from selenium import webdriver
from selenium.webdriver.common.by import By
import time

driver = webdriver.Firefox()
driver.get("https://training-support.net/webelements/dynamic-controls")

print("Page Title:", driver.title)

checkbox = driver.find_element(By.ID, "checkbox")
print("Checkbox displayed:", checkbox.is_displayed())

driver.find_element(By.ID, "checkbox").click()
time.sleep(2)

print("checkbox displayed after remove:", checkbox.is_displayed())

driver.quit()