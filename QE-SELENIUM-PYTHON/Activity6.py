from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Chrome()
driver.get("https://training-support.net/webelements/dynamic-controls")

print("Page Title:", driver.title)

checkbox = driver.find_element(By.ID, "checkbox")
print("Checkbox selected:", checkbox.is_selected())

checkbox.click()
print("Checkbox selected after click:", checkbox.is_selected())

driver.quit()