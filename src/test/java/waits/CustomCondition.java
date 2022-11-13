package waits;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class CustomCondition {
    public static ExpectedCondition<Boolean> jQueryAJAXsCompleted() {
        return driver -> (Boolean) ((JavascriptExecutor)driver).executeScript("return (window.jQuery !=null) && (jQuery.active===0);");
    }

    public static ExpectedCondition<Boolean> changingURL(final String url) {
        return driver -> !driver.getCurrentUrl().equals(url);
    }
}
