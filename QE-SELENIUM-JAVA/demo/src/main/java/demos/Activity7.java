package demos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity7 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://training-support.net/webelements/dynamic-controls");

        System.out.println("Page Title: " + driver.getTitle());

        WebElement inputField = driver.findElement(By.id("input-text"));
        System.out.println("Input enabled: " + inputField.isEnabled());

        driver.findElement(By.id("toggleInput")).click();
        Thread.sleep(2000);

        System.out.println("Input enabled after click: " + inputField.isEnabled());

        driver.quit();
    }
}