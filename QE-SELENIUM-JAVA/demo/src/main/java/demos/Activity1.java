package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

    public static void main(String[] args) {
        FirefoxDriver driver = new FirefoxDriver();    
        driver.get("https://training-support.net");
        System.out.println("Home Page Title: " + driver.getTitle());
        WebElement aboutLink = driver.findElement(By.linkText("About Us"));
        aboutLink.click();
        System.out.println("About Page Title: " + driver.getTitle());
        driver.quit();
    }
}
