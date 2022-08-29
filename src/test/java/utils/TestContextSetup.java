package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import pages.PageObjectManager;

public class TestContextSetup {

    public WebDriver driver;
    public PageObjectManager pageObjectManager;
    public TestBase testBase;

    public TestContextSetup() throws IOException
    {
        testBase = new TestBase();
        pageObjectManager = new PageObjectManager(testBase.WebDriverManager());
    }
}