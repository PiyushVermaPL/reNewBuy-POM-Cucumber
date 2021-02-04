package org.renewbuy.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.renewbuy.pages.BasePage;
import org.renewbuy.pages.HomePage;
import org.renewbuy.pages.NewCarInsurance;
import org.renewbuy.pages.NewCarInsuranceQuotePage;
import org.renewbuy.utils.TestBase;

/***
 * @author verma.piyush
 */
public class newCarInsuranceStepDef1 {

    TestBase testBase = new TestBase();
    BasePage basePage;
    HomePage homePage;
    NewCarInsurance newCarInsurance;
    NewCarInsuranceQuotePage newCarInsuranceQuotePage;
    WebDriver driver;

    public void _init() {
        basePage = new BasePage(driver);
        homePage = new HomePage(driver);
        newCarInsurance = new NewCarInsurance(driver);
        newCarInsuranceQuotePage = new NewCarInsuranceQuotePage(driver);
    }

    @Before("@NewCarInsurance")
    public void initialiseBrowser() {
        driver = TestBase.initializeBrowser();
        _init();
    }

    @Given("^user open website for \"(.*)\" URL$")
    public void user_open_website_for_URL(String url) {
        basePage.launchURL(url);
    }

    @When("^user can see heading \"(.*)\" on Home Page$")
    public void user_can_see_heading_on_Home_Page(String headingHP) {
        Assert.assertTrue(homePage.verifyHeadingTextDisplayed(headingHP));
    }

    @Then("^user can see logo of renewBuy on Home Page$")
    public void user_can_see_logo_of_renewBuy_on_Home_Page() {
        Assert.assertTrue(homePage.verifyRenewBuyLogoDisplayed());
    }

    @Then("^user Hover over Motor Insurance then Hover over Car Insurance then clicks on New Car Insurance$")
    public void user_Hover_over_Motor_Insurance_then_Hover_over_Car_Insurance_then_clicks_on_New_Car_Insurance() {
        homePage.clickOnNewCarInsuranceLink();
    }

    @Then("^user can see heading \"(.*)\" on New Car Insurance Page$")
    public void user_can_see_heading_on_New_Car_Insurance_Page(String headingNCIP) {
        newCarInsurance.verifyHeadingString1(headingNCIP);
    }

    @Then("^user wait for \"(.*)\" seconds to get Pop Up Msg$")
    public void user_wait_for_seconds_to_get_Pop_Up_Msg(int sec) {
        testBase.pauseExecutionForSeconds(sec);
    }

    @Then("^user close the POpUp window$")
    public void user_close_the_POpUp_window() {
        newCarInsurance.closePopUpWindow();
    }

    @Then("^user enters \"(.*)\" in 'Type Your Vehicle Modal' text field then select complete modalname$")
    public void user_enters_in_Type_Your_Vehicle_Modal_text_field_then_select_complete_modalname(String vehicleModal) {
        newCarInsurance.enterVehicleModal(vehicleModal);
    }

    @Then("^user select \"(.*)\" year as purchasing year$")
    public void user_select_year_as_purchasing_year(String purchasingYear) {
        newCarInsurance.enterPurchasingYear(purchasingYear);
    }

    @Then("^user click on Instant Quote Button$")
    public void user_click_on_Instant_Quote_Button() {
        newCarInsurance.clickOnNewCarInsuranceQuoteButton();
    }

    @Then("^user wait for \"(.*)\" seconds to page get load$")
    public void user_wait_for_seconds_to_page_get_load(int sec) {
        testBase.pauseExecutionForSeconds(sec);
    }

    @Then("^user changes the Vehicle Modal name as \"(.*)\"$")
    public void user_changes_the_Vehicle_Modal_name_as(String vehicleName) {
        newCarInsuranceQuotePage.changeVehicleModal(vehicleName);
    }

    @Then("^user wait for \"(.*)\" seconds to page get Vehicle Modal$")
    public void user_wait_for_seconds_to_page_get_Vehicle_Modal(int sec) {
        testBase.pauseExecutionForSeconds(sec);
    }

    @Then("^user changes the Registered RTO as \"(.*)\"$")
    public void user_changes_the_Registered_RTO_as(String registeredRTO) {
        newCarInsuranceQuotePage.changeRegisteredRTO(registeredRTO);
    }

    @Then("^user wait for \"(.*)\" seconds to page get Registered RTO$")
    public void user_wait_for_seconds_to_page_get_Registered_RTO(int sec) {
        testBase.pauseExecutionForSeconds(sec);
    }
/*
    @Then("^user Updates the Purchasing Date as \"(.*)\"$")
    public void user_Updates_the_Purchasing_Date_as(String date) {
        newCarInsuranceQuotePage.updatePurchasingDate(date);
    }

    @Then("^user Updates the Purchasing Month as \"(.*)\"$")
    public void user_Updates_the_Purchasing_date_as(String month) {
        newCarInsuranceQuotePage.updatePurchasingMonth(month);
    }

    @Then("^user Updates the Purchasing Year as \"(.*)\"$")
    public void user_Updates_the_Purchasing_Year_as(String year) {
        newCarInsuranceQuotePage.updatePurchasingYear(year);
    }
*/
    @Then("^user Updates the Purchasing Date as \"(.*)\" Month as \"(.*)\" Year as \"(.*)\"$")
    public void user_Updates_the_Purchasing_Date_as_Month_as_Year_as(String Date, String Month, String Year) {
    newCarInsuranceQuotePage.setUpdatePurchasingDate(Date, Month,Year);
}

    @Then("^user wait for \"(.*)\" seconds to page get Purchasing date$")
    public void user_wait_for_seconds_to_page_get_Purchasing_date(int sec) {
        testBase.pauseExecutionForSeconds(sec);
    }

    @After("@NewCarInsurance")
    public void tearDown() {
        basePage.tearDown();
    }
}
