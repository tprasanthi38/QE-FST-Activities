package demos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5 {
    public static void main(String[] args) throws InterruptedException {

        FirefoxDriver driver = new FirefoxDriver();  
        driver.get("https://training-support.net/webelements/dynamic-controls");

        System.out.println("Page Title: " + driver.getTitle());

        WebElement checkbox = driver.findElement(By.id("checkbox"));
        System.out.println("Checkbox displayed: " + checkbox.isDisplayed());

        driver.findElement(By.id("checkbox")).click();
        Thread.sleep(2000);

        System.out.println("checkbox displayed after remove: " + checkbox.isDisplayed());

        driver.quit();
    }
}