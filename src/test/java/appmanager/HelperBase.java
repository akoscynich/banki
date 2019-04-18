package appmanager;

import org.openqa.selenium.*;

import java.util.List;

public class HelperBase {

    protected WebDriver wd;

    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }

    protected void type(By locator, String text) {
        wd.findElement(locator).sendKeys(text);
    }

    protected void click(By locator) {
        wd.findElement(locator).click();
    }

    protected void clear(By locator) {
        wd.findElement(locator).clear();
    }

    protected void find(By locator) {
        wd.findElement(locator);
    }

    protected void goTo(String url) {
        wd.get(url);
    }

    protected String getText(By locator) {
        return wd.findElement(locator).getText();
    }
    protected String getValue(By locator) {
        return wd.findElement(locator).getAttribute("value");
    }

    protected String getUrl() {
        return wd.getCurrentUrl();
    }

    protected List<WebElement> finds(By locator) {
        return wd.findElements(locator);
    }

    protected void switchTo(String name) {
        wd.switchTo().window(name);
    }

    protected void sleep(int mill) throws InterruptedException {
        Thread.sleep(mill);
    }

    public boolean isElementPresent(By by) {
        try {
            wd.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean isAlertPresent() {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
