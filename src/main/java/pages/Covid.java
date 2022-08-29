package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Covid {

    public static WebDriver driver;

    By covidBtn = By.xpath("//span[normalize-space()='Covid-19 Special']");
    By banner = By.xpath("//img[@alt='cat_banner']");

    public Covid(WebDriver driver) {
        Covid.driver = driver;
    }

    public WebElement getCovidBtn(){
        return driver.findElement(covidBtn);
    }

    public WebElement getBanner(){
        return driver.findElement(banner);
    }
}
