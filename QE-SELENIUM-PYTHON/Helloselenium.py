from selenium import webdriver

with webdriver.Firefox() as driver:
    # Navigate to the training support website
    driver.get("https://training-support.net")

    # Print the page title to the console
    print(driver.title)

    # Close the browser and end the session
    driver.quit()