from selenium import webdriver
from selenium.webdriver.common.by import By
import time

# 1. Open browser
driver = webdriver.Chrome()
driver.maximize_window()

# 2. Open URL
driver.get("https://training-support.net/webelements/tables")

# Wait for page to load
time.sleep(2)

# 3. Get and print page title
print("Page Title:", driver.title)

# Locate the table
table = driver.find_element(By.XPATH, "//table")

# 4. Find number of rows
rows = table.find_elements(By.XPATH, ".//tbody/tr")
print("Number of rows:", len(rows))

# Find number of columns (from first row)
columns = table.find_elements(By.XPATH, ".//thead/tr/th")
print("Number of columns:", len(columns))

# 5. Print all cell values in the THIRD row
print("Third row values:")
third_row_cells = driver.find_elements(
    By.XPATH, "//table/tbody/tr[3]/td"
)

for cell in third_row_cells:
    print(cell.text)

# 6. Print value at SECOND row, SECOND column
cell_value = driver.find_element(
    By.XPATH, "//table/tbody/tr[2]/td[2]"
).text
print("Second row, second column value:", cell_value)

# 7. Close browser
driver.quit()