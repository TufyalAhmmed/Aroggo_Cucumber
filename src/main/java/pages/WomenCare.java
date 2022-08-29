package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WomenCare {
    public static WebDriver driver;

    By womenCareBtn = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]");
    By femalebanner = By.xpath("//img[@alt='cat_banner']");

    public WomenCare(WebDriver driver) {
        WomenCare.driver = driver;
    }

    public WebElement getCovidBtn(){
        return driver.findElement(womenCareBtn);
    }

    public WebElement getBanner(){
        return driver.findElement(femalebanner);
    }
}
