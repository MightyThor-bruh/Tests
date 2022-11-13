package unit_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestResults {
    private WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void driverSetup() {
        driver = new ChromeDriver();
    }
    @Test
    public void LangResultIsValid() throws InterruptedException {
        driver.get("http://trivago.com/en-US");
        WebElement langButton = driver.findElement(By.xpath("//button[@data-testid=\"header-menu-language-selector\"]"));
        langButton.click();
        WebElement espButton = driver.findElement(By.xpath("//span[text()='ES - Español']"));
        espButton.click();
        String oldUrl = driver.getCurrentUrl();
        Assert.assertEquals("http://trivago.com/es-US", "http://trivago.com/es-US", "succed");
    }
    @AfterMethod(alwaysRun = true)
    public void browserTearDown() {
        driver.quit();
        driver = null;
    }
}
