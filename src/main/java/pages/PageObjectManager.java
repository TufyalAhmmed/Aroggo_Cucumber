package pages;

import org.openqa.selenium.WebDriver;


public class PageObjectManager {

    public WebDriver driver;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public Covid homePage() {
        return new Covid(driver);
    }


}