from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains

driver = webdriver.Chrome()
driver.get("https://training-support.net/webelements/mouse-events")

print("Page Title:", driver.title)

actions = ActionChains(driver)

# Part 1: Click Cargo.lock → move to Cargo.toml → click
cargo_lock = driver.find_element(By.ID, "cargo-lock")
cargo_toml = driver.find_element(By.ID, "cargo-toml")

actions.click(cargo_lock)\
       .move_to_element(cargo_toml)\
       .click()\
       .perform()

message1 = driver.find_element(By.ID, "action-confirmation")
print("Confirmation 1:", message1.text)

# Part 2: Double click src → Right click target → Open
src = driver.find_element(By.ID, "src")
target = driver.find_element(By.ID, "target")
open_option = driver.find_element(By.ID, "open")

actions.double_click(src)\
       .context_click(target)\
       .click(open_option)\
       .perform()

message2 = driver.find_element(By.ID, "action-confirmation")
print("Confirmation 2:", message2.text)

driver.quit()