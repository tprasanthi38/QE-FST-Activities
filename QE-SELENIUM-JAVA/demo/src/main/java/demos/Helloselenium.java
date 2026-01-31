package demos;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class Helloselenium {

    public static void main(String[] args) {
        // Initialize the Firefox Driver
        WebDriver driver = new FirefoxDriver();

        // Navigate to the training support website
        driver.get("https://training-support.net");

        // Print the page title to the console
        System.out.println(driver.getTitle());

        // Close the browser and end the session
        driver.quit();
    }
} 