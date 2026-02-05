package demos;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Activity10Test {

    WebDriver driver;

    // ✅ THIS ANNOTATION WAS MISSING
    @DataProvider(name = "excelData")
    public static Object[][] getExcelData() throws Exception {

        FileInputStream fis =
            new FileInputStream("src/test/resources/input1.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheetAt(0);

        int rows = sheet.getPhysicalNumberOfRows();
        int cols = sheet.getRow(0).getPhysicalNumberOfCells();

        Object[][] data = new Object[rows - 1][cols];

        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                data[i - 1][j] =
                    sheet.getRow(i).getCell(j).toString();
            }
        }

        workbook.close();
        return data;
    }

    // ✅ Test method
    @Test(dataProvider = "excelData")
    public void simpleFormTest(
            String FullName,
            String Email,
            String Date,
            String Details) {

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://training-support.net/webelements/simple-form");

        driver.findElement(By.id("Full Name")).sendKeys(FullName);
        driver.findElement(By.id("email")).sendKeys(Email);
        driver.findElement(By.id("date")).sendKeys(Date);
        driver.findElement(By.id("details")).sendKeys(Details);

        driver.findElement(By.xpath("//button[text()='Submit']")).click();

        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
    }

    @AfterMethod
    public void tearDown() {
        
    }
}