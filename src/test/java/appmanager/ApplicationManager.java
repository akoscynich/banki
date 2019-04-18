package appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver wd;
    static String baseUrl = "https://www.banki.ru/products/currency/converter/";
    private String browser = BrowserType.CHROME;
    private NavigationHelper navigationHelper;
    private ConverterHelper converterHelper;

    public void init() throws IOException {

            if (browser.equals(BrowserType.FIREFOX)) {
                wd = new FirefoxDriver();
            } else if (browser.equals(BrowserType.CHROME)) {
                wd = new ChromeDriver(/*new ChromeOptions().setHeadless(false)*/);
            } else if (browser.equals(BrowserType.IE)) {
                wd = new InternetExplorerDriver();
            }

        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //wd.manage().window().maximize();
        navigationHelper = new NavigationHelper(wd);
        converterHelper = new ConverterHelper(wd);
        wd.get(baseUrl);
    }

    public void stop() {
        wd.quit();
    }

    public NavigationHelper goTo() {
        return navigationHelper;
    }

    public ConverterHelper converter() {
        return converterHelper;
    }

}
