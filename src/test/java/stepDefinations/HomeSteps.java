package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.Covid;
import pages.WomenCare;
import utils.TestContextSetup;

public class HomeSteps {

    private final Covid WomenCare;
    public WebDriver driver;
    TestContextSetup testContextSetup;
    Covid covid;
    WomenCare women;

    public HomeSteps(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
        this.covid = testContextSetup.pageObjectManager.homePage();
        this.WomenCare= testContextSetup.pageObjectManager.homePage();

    }

    @Given("I've opened Chrome Browser")
    public void i_ve_opened_chrome_browser() {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();


    }
    @When("Open URL & Press Enter")
    public void open_url_press_enter() {
        driver.get("https://www.arogga.com/");


    }
    @Then("I should taken to the Homepage")
    public void i_should_taken_to_the_homepage() throws InterruptedException {
       Thread.sleep(5000);

    }

    @Given("Click on Covid {int} Special button")
    public void click_on_covid_special_button(Integer int1) throws InterruptedException {
        covid.getCovidBtn().click();
        Thread.sleep(2000);
    }

    @Then("Verify that Covid {int} Special page is displayed")
    public void verify_that_covid_special_page_is_displayed(Integer int1) {
        Assert.assertTrue(covid.getBanner().isDisplayed());
    }
    @Given("Click on womencare Button")
    public void click_on_womencare_button() {

    }
    @Then("Verify that womencare page is Displayed")
    public void verify_that_womencare_page_is_displayed() {

    }

}
