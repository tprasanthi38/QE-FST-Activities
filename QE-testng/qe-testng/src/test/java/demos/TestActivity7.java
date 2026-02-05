package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestActivity7 {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void openPage() {
        driver.get("https://training-support.net/webelements/login-form");
    }

    @DataProvider(name = "Authentication")
    public Object[][] credentials() {
        return new Object[][] {
            {"admin", "password"},
            {"user", "password"}
        };
    }

    @Test(dataProvider = "Authentication")
    public void loginTest(String username, String password) {

        WebElement userNameField = driver.findElement(By.id("username"));
        userNameField.clear();
        userNameField.sendKeys(username);

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.clear();
        passwordField.sendKeys(password);

        driver.findElement(By.xpath("//button[text()='Submit']")).click();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}