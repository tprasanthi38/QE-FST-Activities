package stepdefinitions;

import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class Activity2Steps {

    WebDriver driver;
    WebDriverWait wait;

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.manage().window().maximize();
        driver.get("https://training-support.net/webelements/login-form");
    }

    @When("the user enters username and password")
    public void the_user_enters_username_and_password() {
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));

        username.sendKeys("admin");
        password.sendKeys("password");
    }

    @And("clicks the Submit button")
    public void clicks_the_submit_button() {
        WebElement SubmitButton = driver.findElement(By.xpath("//button[text()='Submit']"));
        SubmitButton.click();
    }

    @Then("get the confirmation message and verify it")
public void get_the_confirmation_message_and_verify_it() {

    // Verify welcome message
    WebElement welcomeText = wait.until(
            ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//h2[contains(text(),'Welcome Back')]")
            )
    );
    String actualMessage =welcomeText.getText();
    System.out.println("Confirmation Message: "+actualMessage);
    Assertions.assertTrue(welcomeText.getText().contains("Admin"));

    driver.quit();
}
    }


    