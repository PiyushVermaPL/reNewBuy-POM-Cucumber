package org.renewbuy.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/***
 * @author verma.piyush
 */
public class NewCarInsuranceQuotePage extends BasePage {

    private static Logger logger = LogManager.getLogger(NewCarInsuranceQuotePage.class);

    public NewCarInsuranceQuotePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    //Verify Heading String1(D2C INSURANCE BROKING PVT. LTD.)
    @FindBy(xpath = "//div[@class='broking']")
    WebElement heading;

    //Verify RenewBuy Logo
    @FindBy(xpath = "//a[@class='navbar-brand']/img")
    WebElement logo;

    //Motor Insurance(Hover)
    @FindBy(xpath = "//li[@class='nav-submenu hasmenu']/a[contains(text(),'Motor Insurance')]")
    WebElement motorInsurance;

    //Car Insurance(Hover)
    @FindBy(xpath = "(//a[contains(.,'Car Insurance')])[1]")
    WebElement carInsurance;

    //Renew Car Insurance(link)
    @FindBy(xpath = "(//a[contains(.,'Renew Car Insurance')])[1]")
    WebElement renewCarInsurance;

    //Compare Car Insurance(link)
    @FindBy(xpath = "(//a[contains(.,'Compare Car Insurance')])[1]")
    WebElement compareCarInsurance;

    //New Car Insurance(link)
    @FindBy(xpath = "(//a[contains(.,'New Car Insurance')])[1]")
    WebElement newCarInsurance;

    //Car Insurance Calculator(link)
    @FindBy(xpath = "(//a[contains(.,'Car Insurance Calculator')])[1]")
    WebElement carInsuranceCalculator;

    //Car Insurance Claim(link)
    @FindBy(xpath = "(//a[contains(.,'Car Insurance Claim')])[1]")
    WebElement carInsuranceClaim;

    //Car Insurance FAQs(link)
    @FindBy(xpath = "(//a[contains(.,'Car Insurance FAQs')])[1]")
    WebElement carInsuranceFAQs;

    //Two Wheeler Insurance(Hover)
    @FindBy(xpath = "(//a[contains(.,'Two Wheeler Insurance')])[1]")
    WebElement twoWheelerInsurance;

    //Renew Two Wheeler Insurance(link)
    @FindBy(xpath = "(//a[contains(.,'Renew Two Wheeler Insurance')])[1]")
    WebElement renewTwoWheelerInsurance;

    //Compare Two Wheeler Insurance(link)
    @FindBy(xpath = "(//a[contains(.,'Compare Two Wheeler Insurance')])[1]")
    WebElement compareTwoWheelerInsurance;

    //New Two Wheeler Insurance(link)
    @FindBy(xpath = "(//a[contains(.,'New Two Wheeler Insurance')])[1]")
    WebElement newTwoWheelerInsurance;

    //Multi Year Two Wheeler Insurance(link)
    @FindBy(xpath = "(//a[contains(.,'Multi Year Two Wheeler Insurance')])[1]")
    WebElement multiYearTwoWheelerInsurance;

    //Two Wheeler Insurance Calculator(link)
    @FindBy(xpath = "(//a[contains(.,'Two Wheeler Insurance Calculator')])[1]")
    WebElement twoWheelerInsuranceCalculator;

    //Two Wheeler Insurance FAQs(link)
    @FindBy(xpath = "(//a[contains(.,'Two Wheeler Insurance FAQs')])[1]")
    WebElement twoWheelerInsuranceFAQs;

    //Motor Insurance Reminder(link)
    @FindBy(xpath = "(//a[contains(.,'Motor Insurance Reminder ')])[1]")
    WebElement motorInsuranceReminder;

    //Health Insurance(Hover)
    @FindBy(xpath = "(//a[contains(.,'Health Insurance')])[1]")
    WebElement healthInsurance;

    //Compare Health Insurance(link)
    @FindBy(xpath = "(//a[contains(.,'Compare Health Insurance')])[1]")
    WebElement compareHealthInsurance;

    //Individual Health Insurance(link)
    @FindBy(xpath = "(//a[contains(.,'Individual Health Insurance')])[1]")
    WebElement individualHealthInsurance;

    //Family Health Insurance(link)
    @FindBy(xpath = "(//a[contains(.,'Family Health Insurance')])[1]")
    WebElement familyHealthInsurance;

    //Corporate Insurance(link)
    @FindBy(xpath = "(//a[contains(.,'Corporate Insurance')])[1]")
    WebElement corporateInsurance;

    //Become POS Advisor(link)
    @FindBy(xpath = "(//a[contains(.,'Become POS Advisor')])[1]")
    WebElement becomePOSAdviser;

    //One Click Renewal(link)
    @FindBy(xpath = "(//a[contains(.,'One-Click Renewal')])[1]")
    WebElement oneClickRenewal;

    //Articles(link)
    @FindBy(xpath = "(//a[contains(.,'Articles')])[1]")
    WebElement articles;

    //Login(Hover)
    @FindBy(xpath = "(//a[contains(.,'Login')])[1]")
    WebElement login;

    //Customer Login(click)
    @FindBy(xpath = "(//a[contains(.,'Customer Login')])[1]")
    WebElement customerLogin;

    //Partner Login(click)
    @FindBy(xpath = "(//a[contains(.,'Partner Login')])[1]")
    WebElement partnerLogin;

    //Edit Vehicle Modal(click)
    @FindBy(xpath = "(//div[@class='edit_data modal_pop no_mob'])[1]")
    WebElement editVehicleModal;

    //Cancel of Edit Vehicle Modal(click)
    @FindBy(xpath = "(//div[@class='data_update modal_pop close_input'])[1]")
    WebElement cancelEditVehicleModal;

    //Enter Vehicle Modal(enter)
    @FindBy(xpath = "//div[@id='vehicle_model_edit']//input[@class='ui-autocomplete-input']")
    WebElement enterVehicleModal;

    //Click on HYUNDAI FLUIDIC VERNA 1.4 CRDI EX (1396 cc)(D)(click)
    @FindBy(xpath = "//li[contains(.,'HYUNDAI FLUIDIC VERNA 1.4 CRDI EX (1396 cc)(D)')]")
    WebElement hyundaiFluidicVerna;

    //Edit Registered Rto(click)
    @FindBy(xpath = "(//div[@class='edit_data modal_pop no_mob'])[2]")
    WebElement editRegisteredRTO;

    //Cancel of Edit Registered Rto(click)
    @FindBy(xpath = "(//div[@class='data_update modal_pop close_input'])[2]")
    WebElement cancelEditRegisteredRTO;

    //Enter Registered RTO(enter)
    @FindBy(xpath = "//input[@id='selectcity']")
    WebElement enterRegisteredRTO;

    //Click on up13 Bulandshahr(click)
    @FindBy(xpath = "//li[contains(.,'UP13-Bulandshahr')]")
    WebElement up13bulandshahr;

    //Edit Purchasing Date(click)
    @FindBy(xpath = "(//div[@class='edit_data modal_pop no_mob'])[3]")
    WebElement editPurchasingDate;

    //Cancel of Edit Purchasing Date(click)
    @FindBy(xpath = "(//div[@class='data_update has_update modal_pop close_input'])[1]")
    WebElement cancelPurchasingDate;

    //Enter Purchasing Date(enter)
    @FindBy(xpath = "(//span[@class='filter-option pull-left'])[1]")
    WebElement enterPurchasingDate;
    @FindBy(xpath = "(//span[@class='text' and contains(.,'10')])[1]")
    WebElement selectDate;
    @FindBy(xpath = "(//span[@class='filter-option pull-left'])[2]")
    WebElement enterPurchasingMonth;
    @FindBy(xpath = "(//span[@class='text' and contains(.,'Jan')])[1]")
    WebElement selectMonth;
    @FindBy(xpath = "(//span[@class='filter-option pull-left'])[3]")
    WebElement enterPurchasingYear;
    @FindBy(xpath = "(//span[@class='text' and contains(.,'2019')])[1]")
    WebElement selectYear;

    //Click on Update Purchasing Date(click)
    @FindBy(xpath = "//div[@class='data_update has_update update']")
    WebElement updatePurchasingDate;

    //Edit Previous Insurer(click)
    @FindBy(xpath = "(//div[@class='edit_data modal_pop no_mob'])[4]")
    WebElement editPreviousInsurer;

    //Select Previous Insurer(click)
    @FindBy(xpath = "(//span[@class='filter-option pull-left' and contains(.,'Select Insurer')])[1]")
    WebElement selectPreviousInsurer;

    //Cancel Previous Insurer(click)
    @FindBy(xpath = "(//div[@class='data_update has_update modal_pop close_input' and contains(.,'Cancel')])[2]")
    WebElement cancelPreviousInsurer;

    //Clear Previous Insurer(click)
    @FindBy(xpath = "//div[@class='data_update clear_input' and contains(.,'Clear')]")
    WebElement clearPreviousInsurer;




    //Verify Heading String1(D2C INSURANCE BROKING PVT. LTD.)
    public boolean verifyHeadingString1(String str1) {
        logger.info("Verifying Heading 'D2C INSURANCE BROKING PVT. LTD.' On New Car Insurance Home Page");
        return heading.getText().trim().equalsIgnoreCase(str1);
    }

    //Verify RenewBuy Logo
    public boolean reNewBuyLogo() {
        logger.info("Verifying RenewBuy Logo On New Car Insurance Home Page");
        return logo.isDisplayed();
    }

    //Renew Car Insurance
    public RenewCarInsurance renewCarInsurance() {
        logger.info("Renew Car Insurance Page link is available");
        Actions action = new Actions(driver);
        action.moveToElement(motorInsurance).moveToElement(carInsurance).moveToElement(renewCarInsurance).click().build().perform();
        return new RenewCarInsurance(driver);
    }

    //Compare Car Insurance
    public CompareCarInsurance compareCarInsurance() {
        logger.info("Compare Car Insurance Page link is available");
        Actions action = new Actions(driver);
        action.moveToElement(motorInsurance).moveToElement(carInsurance).moveToElement(compareCarInsurance).click().build().perform();
        return new CompareCarInsurance(driver);
    }

    //New Car Insurance
    public NewCarInsurance newCarInsurance() {
        logger.info("New Car Insurance Page link is available");
        Actions action = new Actions(driver);
        action.moveToElement(motorInsurance).moveToElement(carInsurance).moveToElement(newCarInsurance).click().build().perform();
        return new NewCarInsurance(driver);
    }

    //Car Insurance Calculator
    public CarInsuranceCalculator carInsuranceCalculator() {
        logger.info("Car Insurance Calculator Page link is available");
        Actions action = new Actions(driver);
        action.moveToElement(motorInsurance).moveToElement(carInsurance).moveToElement(carInsuranceCalculator).click().build().perform();
        return new CarInsuranceCalculator(driver);
    }

    //Car Insurance Claim
    public CarInsuranceClaim carInsuranceClaim() {
        logger.info("Car Insurance Claim Page link is available");
        Actions action = new Actions(driver);
        action.moveToElement(motorInsurance).moveToElement(carInsurance).moveToElement(carInsuranceClaim).click().build().perform();
        return new CarInsuranceClaim(driver);
    }

    //Car Insurance FAQs
    public CarInsuranceFAQs carInsuranceFAQs() {
        logger.info("Car Insurance FAQs Page link is available");
        Actions action = new Actions(driver);
        action.moveToElement(motorInsurance).moveToElement(carInsurance).moveToElement(carInsuranceFAQs).click().build().perform();
        return new CarInsuranceFAQs(driver);
    }

    //Renew Two Wheeler Insurance
    public RenewTwoWheelerInsurance renewTwoWheelerInsurance() {
        logger.info("Renew Two Wheeler Insurance Page link is available");
        Actions action = new Actions(driver);
        action.moveToElement(motorInsurance).moveToElement(twoWheelerInsurance).moveToElement(renewTwoWheelerInsurance).click().build().perform();
        return new RenewTwoWheelerInsurance(driver);
    }

    //Compare Two Wheeler Insurance
    public CompareTwoWheelerInsurance compareTwoWheelerInsurance() {
        logger.info("Compare Two Wheeler Insurance Page link is available");
        Actions action = new Actions(driver);
        action.moveToElement(motorInsurance).moveToElement(twoWheelerInsurance).moveToElement(compareTwoWheelerInsurance).click().build().perform();
        return new CompareTwoWheelerInsurance(driver);
    }

    //New Two Wheeler Insurance
    public NewTwoWheelerInsurance newTwoWheelerInsurance() {
        logger.info("New Two Wheeler Insurance Page link is available");
        Actions action = new Actions(driver);
        action.moveToElement(motorInsurance).moveToElement(twoWheelerInsurance).moveToElement(newTwoWheelerInsurance).click().build().perform();
        return new NewTwoWheelerInsurance(driver);
    }

    //Multi Year Two Wheeler Insurance
    public MultiYearTwoWheelerInsurance multiYearTwoWheelerInsurance() {
        logger.info("Multi Year Two Wheeler Insurance Page link is available");
        Actions action = new Actions(driver);
        action.moveToElement(motorInsurance).moveToElement(twoWheelerInsurance).moveToElement(multiYearTwoWheelerInsurance).click().build().perform();
        return new MultiYearTwoWheelerInsurance(driver);
    }

    //Two Wheeler Insurance Calculator
    public TwoWheelerInsuranceCalculator twoWheelerInsuranceCalculator() {
        logger.info("Two Wheeler Insurance Calculator Page link is available");
        Actions action = new Actions(driver);
        action.moveToElement(motorInsurance).moveToElement(twoWheelerInsurance).moveToElement(twoWheelerInsuranceCalculator).click().build().perform();
        return new TwoWheelerInsuranceCalculator(driver);
    }

    //Two Wheeler Insurance FAQs
    public TwoWheelerInsuranceFAQs twoWheelerInsuranceFAQs() {
        logger.info("Two Wheeler Insurance FAQs Page link is available");
        Actions action = new Actions(driver);
        action.moveToElement(motorInsurance).moveToElement(twoWheelerInsurance).moveToElement(twoWheelerInsuranceFAQs).click().build().perform();
        return new TwoWheelerInsuranceFAQs(driver);
    }

    //Motor Insurance Reminder
    public MotorInsuranceReminder motorInsuranceReminder() {
        logger.info("Motor Insurance Reminder Page link is available");
        Actions action = new Actions(driver);
        action.moveToElement(motorInsurance).moveToElement(motorInsuranceReminder).click().build().perform();
        return new MotorInsuranceReminder(driver);
    }

    //Compare Health Insurance
    public CompareHealthInsurance compareHealthInsurance() {
        logger.info("Compare Health Insurance Page link is available");
        Actions action = new Actions(driver);
        action.moveToElement(healthInsurance).moveToElement(compareHealthInsurance).click().build().perform();
        return new CompareHealthInsurance(driver);
    }

    //Individual Health Insurance
    public IndividualHealthInsurance individualHealthInsurance() {
        logger.info("Individual Health Insurance Page link is available");
        Actions action = new Actions(driver);
        action.moveToElement(healthInsurance).moveToElement(individualHealthInsurance).click().build().perform();
        return new IndividualHealthInsurance(driver);
    }

    //Family Health Insurance
    public FamilyHealthInsurance familyHealthInsurance() {
        logger.info("Family Health Insurance Page link is available");
        Actions action = new Actions(driver);
        action.moveToElement(healthInsurance).moveToElement(familyHealthInsurance).click().build().perform();
        return new FamilyHealthInsurance(driver);
    }

    //Corporate Insurance
    public CorporateInsurance corporateInsurance() {
        logger.info("Corporate Insurance Page link is available");
        corporateInsurance.click();
        return new CorporateInsurance(driver);
    }

    //Become POS Advisor
    public BecomePOSPAdvisor becomePOSPAdvisor() {
        logger.info("Become POS Advisor Page link is available");
        becomePOSAdviser.click();
        return new BecomePOSPAdvisor(driver);
    }

    //One Click Renewal
    public OneClickRenewal oneClickRenewal() {
        logger.info("One Click Renewal Page link is available");
        oneClickRenewal.click();
        return new OneClickRenewal(driver);
    }

    //Articles
    public Articles articles() {
        logger.info("Articles Page link is available");
        articles.click();
        return new Articles(driver);
    }

    //Customer Login
    public CustomerLogin customerLogin() {
        logger.info("Customer Login Page link is available");
        Actions action = new Actions(driver);
        action.moveToElement(login).moveToElement(customerLogin).click().build().perform();
        return new CustomerLogin(driver);
    }

    //Partner Login
    public PartnerLogin partnerLogin() {
        logger.info("Partner Login Page link is available");
        Actions action = new Actions(driver);
        action.moveToElement(login).moveToElement(partnerLogin).click().build().perform();
        return new PartnerLogin(driver);
    }

    //Change Vehicle Modal on New Car Insurance Quote Page
    public void changeVehicleModal(String fVehicleName) {
        if (fVehicleName.isEmpty()) {
            logger.info("Vehicle Name {} is taking from config. file", fVehicleName);
            editVehicleModal.click();
            enterVehicleModal.clear();
            enterVehicleModal.sendKeys(prop.getProperty("c_ChangeVehicleModal"));
            hyundaiFluidicVerna.click();
        }
        else {
            logger.info("Vehicle Name {} is taking from feature file", fVehicleName);
            editVehicleModal.click();
            enterVehicleModal.clear();
            enterVehicleModal.sendKeys(fVehicleName);
            hyundaiFluidicVerna.click();
        }
    }

    //Change Registered RTO
    public void changeRegisteredRTO(String fRegisteredRTO) {
        if (fRegisteredRTO.isEmpty()) {
            logger.info("Registered RTO {} is taking from config. file", fRegisteredRTO);
            editRegisteredRTO.click();
            enterRegisteredRTO.clear();
            enterRegisteredRTO.sendKeys(prop.getProperty("c_RegisteredRTO"));
            up13bulandshahr.click();
        }
        else {
            logger.info("Registered RTO {} is taking from feature file", fRegisteredRTO);
            editRegisteredRTO.click();
            enterRegisteredRTO.clear();
            enterRegisteredRTO.sendKeys(fRegisteredRTO);
            up13bulandshahr.click();
        }
    }
/*
    //Update Purchasing Date
    public void updatePurchasingDate(String fPurchasingDate) {
        if (fPurchasingDate.isEmpty()) {
            logger.info("updating date {} is taking from config. file", fPurchasingDate);
            editPurchasingDate.click();
            enterPurchasingDate.click();
            selectDate.click();
        }
        else {
            logger.info("updating date {} is taking from feature file", fPurchasingDate);
            editPurchasingDate.click();
            enterPurchasingDate.click();
            selectDate.click();
        }
    }

    //Update Purchasing Month
    public void updatePurchasingMonth(String fPurchasingMonth) {
        if (fPurchasingMonth.isEmpty()) {
            logger.info("updating Month {} is taking from config. file", fPurchasingMonth);
            enterPurchasingMonth.click();
            selectMonth.click();
        }
        else {
            logger.info("updating Month {} is taking from feature file", fPurchasingMonth);
            enterPurchasingMonth.click();
            selectMonth.click();
        }
    }

    //Update Purchasing Year
    public void updatePurchasingYear(String fPurchasingYear) {
        if (fPurchasingYear.isEmpty()) {
            logger.info("updating Year {} is taking from config. file", fPurchasingYear);
            enterPurchasingYear.click();
            selectYear.click();
            updatePurchasingDate.click();
        }
        else {
            logger.info("updating Year {} is taking from feature file", fPurchasingYear);
            enterPurchasingYear.click();
            selectYear.click();
            updatePurchasingDate.click();
        }
    }   */

    //Set Update Purchasing Year
    public void setUpdatePurchasingDate(String fPurchasingDate, String fPurchasingMonth, String fPurchasingYear) {
        if (fPurchasingDate.isEmpty() & fPurchasingMonth.isEmpty() & fPurchasingYear.isEmpty()) {
            logger.info("updating Date {}/{}/{} is taking from config. file", fPurchasingDate, fPurchasingMonth, fPurchasingYear);
            editPurchasingDate.click();
            enterPurchasingDate.click();
            selectDate.click();
            enterPurchasingMonth.click();
            selectMonth.click();
            enterPurchasingYear.click();
            selectYear.click();
            updatePurchasingDate.click();
        }
        else {
            logger.info("updating Date {}/{}/{} is taking from feature file", fPurchasingDate, fPurchasingMonth, fPurchasingYear);
            editPurchasingDate.click();
            enterPurchasingDate.click();
            selectDate.click();
            enterPurchasingMonth.click();
            selectMonth.click();
            enterPurchasingYear.click();
            selectYear.click();
            updatePurchasingDate.click();
        }
    }
}
