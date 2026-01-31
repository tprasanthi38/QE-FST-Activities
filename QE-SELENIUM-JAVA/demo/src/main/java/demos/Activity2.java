package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

    public static void main(String[] args) {

        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/login-form/");
        System.out.println("Page Title: " + driver.getTitle());
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("admin");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");
        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Submit']"));
        loginButton.click();
        driver.quit();
    }
}