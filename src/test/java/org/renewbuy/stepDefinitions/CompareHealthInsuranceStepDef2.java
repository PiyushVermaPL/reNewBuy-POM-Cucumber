package org.renewbuy.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.renewbuy.pages.BasePage;
import org.renewbuy.pages.CompareHealthInsurance;
import org.renewbuy.pages.HomePage;
import org.renewbuy.utils.TestBase;

/***
 * @author verma.piyush
 */
public class CompareHealthInsuranceStepDef2 {

    TestBase testBase = new TestBase();
    BasePage basePage;
    HomePage homePage;
    CompareHealthInsurance compareHealthInsurance;
    WebDriver driver;

    public void _init() {
        basePage = new BasePage(driver);
        homePage = new HomePage(driver);
        compareHealthInsurance = new CompareHealthInsurance(driver);
    }

    @Before("@CompareHealthInsurance")
    public void initialisingBrowser() {
        driver = TestBase.initializeBrowser();
        _init();
    }

    @Given("^user open website for \"(.*)\" URL$")
    public void user_open_website_for_URL(String stringURL) {
        basePage.launchURL(stringURL);
    }

    @When("^user can see heading \"(.*)\" on Home Page$")
    public void user_can_see_heading_on_Home_Page(String stringHeading) {
        Assert.assertTrue(homePage.verifyHeadingTextDisplayed(stringHeading));
    }

    @Then("^user can see logo of renewBuy on Home Page$")
    public void user_can_see_logo_of_renewBuy_on_Home_Page() {
        Assert.assertTrue(homePage.verifyRenewBuyLogoDisplayed());
    }

    @Then("^user Hover over Health Insurance then clicks on Compare Health Insurance$")
    public void user_Hover_over_Health_Insurance_then_clicks_on_Compare_Health_Insurance() {
        homePage.clickOnCompareHealthInsuranceLink();
    }

    @After("@CompareHealthInsurance")
    public void tearDown() {
        basePage.tearDown();
    }
}
