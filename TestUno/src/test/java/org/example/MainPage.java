package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    public WebDriver driver;
    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = "//button[@data-testid=\"header-menu-language-selector\"]")
    private WebElement languageButton;
    @FindBy(xpath = "//*[text()='ES - Español']")
    private WebElement espButton;
    public void clickLanguageButton() {
        languageButton.click();
    }
    public void clickEspanolButton() {
        espButton.click();
    }
}
