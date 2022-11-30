package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LanguageTest {
    public static MainPage mainPage;
    public static EspanolPage espanolPage;
    public static WebDriver driver;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        WebDriver driver = new ChromeDriver();
        mainPage = new MainPage(driver);
        espanolPage = new EspanolPage(driver);
        driver.manage().window().maximize();
        driver.get(ConfProperties.getProperty("mainpage"));
    }
    @Test
    public void languageTest() {
        mainPage.clickLanguageButton();
        mainPage.clickEspanolButton();
        String langg = espanolPage.getLanguage();

        Assert.assertEquals(ConfProperties.getProperty("lang"), langg);
    }
//    @AfterClass
//    public static void tearDown() {
//        driver.quit();
//        driver = null;
//    }
}
