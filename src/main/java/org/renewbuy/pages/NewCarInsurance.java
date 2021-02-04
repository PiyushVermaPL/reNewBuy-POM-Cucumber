package org.renewbuy.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/***
 * @author verma.piyush
 */
public class NewCarInsurance extends BasePage {

    private static Logger logger = LogManager.getLogger(NewCarInsurance.class);

    public NewCarInsurance(WebDriver driver){
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    //Verify Heading String1(D2C INSURANCE BROKING PVT. LTD.)
    @FindBy(xpath = "//div[@class='D2C_update']")
    WebElement heading;

    //Verify RenewBuy Logo
    @FindBy(xpath = "//a[@class='site-logo']")
    WebElement logo;

    //Verify Banner Image
    @FindBy(xpath = "//img[@class='banner_image align-left']")
    WebElement bannerImage;

    //Motor Insurance(Hover)
    @FindBy(xpath = "(//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Motor Insurance')])[1]")
    WebElement motorInsurance;

    //Car Insurance(Hover)
    @FindBy(xpath = "(//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Car Insurance')])[1]")
    WebElement carInsurance;

    //Compare Car Insurance(link)
    @FindBy(xpath = "//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Compare Car Insurance')]")
    WebElement compareCarInsurance;

    //Renew Car Insurance(link)
    @FindBy(xpath = "//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Renew Car Insurance')]")
    WebElement renewCarInsurance;

    //New Car Insurance(link)
    @FindBy(xpath = "//li[contains(@id,'main-menu-link-content')]/a[contains(.,'New Car Insurance')]")
    WebElement newCarInsurance;

    //Car Insurance Claim(link)
    @FindBy(xpath = "//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Car Insurance Claim')]")
    WebElement carInsuranceClaim;

    //Car Insurance Calculator(link)
    @FindBy(xpath = "//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Car Insurance Calculator')]")
    WebElement carInsuranceCalculator;

    //Car Insurance FAQs(link)
    @FindBy(xpath = "//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Car Insurance FAQs')]")
    WebElement carInsuranceFAQs;

    //Two Wheeler Insurance(Hover)
    @FindBy(xpath = "//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Two wheeler Insurance')]")
    WebElement twoWheelerInsurance;

    //Compare Two Wheeler Insurance(link)
    @FindBy(xpath = "//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Compare Two Wheeler Insurance')]")
    WebElement compareTwoWheelerInsurance;

    //Renew Two Wheeler Insurance(link)
    @FindBy(xpath = "//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Renew Two Wheeler Insurance')]")
    WebElement renewTwoWheelerInsurance;

    //New Two Wheeler Insurance(link)
    @FindBy(xpath = "//li[contains(@id,'main-menu-link-content')]/a[contains(.,'New Two Wheeler Insurance')]")
    WebElement newTwoWheelerInsurance;

    //Two Wheeler Insurance FAQs(link)
    @FindBy(xpath = "//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Two Wheeler Insurance FAQs')]")
    WebElement twoWheelerInsuranceFAQs;

    //Motor Insurance Reminder(link)
    @FindBy(xpath = "//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Motor Insurance Reminder')]")
    WebElement motorInsuranceReminder;

    //Health Insurance(Hover)
    @FindBy(xpath = "(//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Health Insurance')])[1]")
    WebElement healthInsurance;

    //Compare Health Insurance(link)
    @FindBy(xpath = "//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Compare Health Insurance')]")
    WebElement compareHealthInsurance;

    //Individual Health Insurance(link)
    @FindBy(xpath = "//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Individual Health Insurance')]")
    WebElement individualHealthInsurance;

    //Family Health Insurance(link)
    @FindBy(xpath = "//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Family Health Insurance')]")
    WebElement familyHealthInsurance;

    //Cashless Mediclaim Policy(link)
    @FindBy(xpath = "//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Cashless Mediclaim Policy')]")
    WebElement cashlessMediClaimPolicy;

    //Mediclaim Policy(link)
    @FindBy(xpath = "(//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Mediclaim Policy')])[2]")
    WebElement mediclaimPolicy;

    //Top Up Health Insurance(link)
    @FindBy(xpath = "//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Top Up Health Insurance')]")
    WebElement topUpHealthInsurance;

    //Become POS Advisor(link)
    @FindBy(xpath = "//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Become POS Advisor')]")
    WebElement becomePOSAdviser;

    //One Click Renewal(link)
    @FindBy(xpath = "//li[contains(@id,'main-menu-link-content')]/a[contains(.,'One Click Renewal')]")
    WebElement oneClickRenewal;

    //Articles(Hover)
    @FindBy(xpath = "//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Articles')]")
    WebElement articles;

    //Motor Insurance in Articles Menu Item(Hover)
    @FindBy(xpath = "(//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Motor Insurance')])[3]")
    WebElement motorInsuranceArticles;

    //Four Wheeler Insurance in Articles Menu Item(link)
    @FindBy(xpath = "//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Four Wheeler Insurance')]")
    WebElement fourWheelerInsuranceArticles;

    //Two Wheeler Insurance in Articles Menu Item(link)
    @FindBy(xpath = "(//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Two Wheeler Insurance')])[5]")
    WebElement twoWheelerInsuranceArticles;

    //Health Insurance in Articles Menu Item(link)
    @FindBy(xpath = "(//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Health Insurance')])[6]")
    WebElement healthInsuranceArticles;

    //Life Insurance in Articles Menu Item(link)
    @FindBy(xpath = "//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Life Insurance')]")
    WebElement lifeInsuranceArticles;

    //RTO in Articles Menu Item(link)
    @FindBy(xpath = "//li[contains(@id,'main-menu-link-content')]/a[contains(.,'RTO')]")
    WebElement rtoArticles;

    //Driving Licence in Articles Menu Item(link)
    @FindBy(xpath = "//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Driving Licence')]")
    WebElement drivingLicenceArticles;

    //General in Articles Menu Item(link)
    @FindBy(xpath = "//li[contains(@id,'main-menu-link-content')]/a[contains(.,'General')]")
    WebElement generalArticles;

    //Responsible Driving in Articles(link)
    @FindBy(xpath = "//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Responsible Driving')]")
    WebElement responsibleDrivingArticles;

    //Verify String2(GET LOWEST PREMIUM INSTANT POLICY ON)
    @FindBy(xpath = "//p[@class='home_insurance_form']")
    WebElement string2;

    //Verify String3(MOTOR INSURANCE PLANS)
    @FindBy(xpath = "//h3[@class='home_insurance_form2']")
    WebElement string3;

    //Verify String4(Multiple Choices)
    @FindBy(xpath = "//li[@class='home_insurance_form4']")
    WebElement string4;

    //Verify String5(Get policy in 2 minutes)
    @FindBy(xpath = "//li[@class='home_insurance_form4 home_insurance_form5']")
    WebElement string5;

    //Verify String6(Assistance from trusted partners)
    @FindBy(xpath = "//li[@class='home_insurance_form4 home_insurance_form6']")
    WebElement string6;

    //Close PopUp Window
    @FindBy(id = "bio_ep_close")
    WebElement popUpWindow;

    //Select Hyundai Santro Modal(click)
    @FindBy(xpath = "//li[contains(.,'HYUNDAI SANTRO 1.1 LP (1086 cc)(P)')]")
    WebElement hyundaiSantro;

    //"Type Your Vehicle Modal" Text Field
    @FindBy(xpath = "//input[@id='variant']")
    WebElement vehicleModal;

    //"Purchasing Year" Text Field
    @FindBy(xpath = "//select[@id='regYear']")
    WebElement purchaseYear;

    //"Instant Quote" Button
    @FindBy(xpath = "//button[@class='instantQuote btn']")
    WebElement instantQuoteButton;



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

    //Verify Banner Image
    public boolean bannerImage() {
        logger.info("Verifying Banner Image On New Car Insurance Home Page");
        return bannerImage.isDisplayed();
    }

    //Compare Car Insurance
    public CompareCarInsurance compareCarInsurance() {
        logger.info("Compare Car Insurance Page link is available");
        Actions action = new Actions(driver);
        action.moveToElement(motorInsurance).moveToElement(carInsurance).moveToElement(compareCarInsurance).click().build().perform();
        return new CompareCarInsurance(driver);
    }

    //Renew Car Insurance
    public RenewCarInsurance renewCarInsurance() {
        logger.info("Renew Car Insurance Page link is available");
        Actions action = new Actions(driver);
        action.moveToElement(motorInsurance).moveToElement(carInsurance).moveToElement(renewCarInsurance).click().build().perform();
        return new RenewCarInsurance(driver);
    }

    //New Car Insurance
    public NewCarInsurance newCarInsurance() {
        logger.info("New Car Insurance Page link is available");
        Actions action = new Actions(driver);
        action.moveToElement(motorInsurance).moveToElement(carInsurance).moveToElement(newCarInsurance).click().build().perform();
        return new NewCarInsurance(driver);
    }

    //Car Insurance Claim
    public CarInsuranceClaim carInsuranceClaim() {
        logger.info("Car Insurance Claim Page link is available");
        Actions action = new Actions(driver);
        action.moveToElement(motorInsurance).moveToElement(carInsurance).moveToElement(carInsuranceClaim).click().build().perform();
        return new CarInsuranceClaim(driver);
    }

    //Car Insurance Calculator
    public CarInsuranceCalculator carInsuranceCalculator() {
        logger.info("Car Insurance Calculator Page link is available");
        Actions action = new Actions(driver);
        action.moveToElement(motorInsurance).moveToElement(carInsurance).moveToElement(carInsuranceCalculator).click().build().perform();
        return new CarInsuranceCalculator(driver);
    }

    //Car Insurance FAQs
    public CarInsuranceFAQs carInsuranceFAQs() {
        logger.info("Car Insurance FAQs Page link is available");
        Actions action = new Actions(driver);
        action.moveToElement(motorInsurance).moveToElement(carInsurance).moveToElement(carInsuranceFAQs).click().build().perform();
        return new CarInsuranceFAQs(driver);
    }

    //Compare Two Wheeler Insurance
    public CompareTwoWheelerInsurance compareTwoWheelerInsurance() {
        logger.info("Compare Two Wheeler Insurance Page link is available");
        Actions action = new Actions(driver);
        action.moveToElement(motorInsurance).moveToElement(twoWheelerInsurance).moveToElement(compareTwoWheelerInsurance).click().build().perform();
        return new CompareTwoWheelerInsurance(driver);
    }

    //Renew Two Wheeler Insurance
    public RenewTwoWheelerInsurance renewTwoWheelerInsurance() {
        logger.info("Renew Two Wheeler Insurance Page link is available");
        Actions action = new Actions(driver);
        action.moveToElement(motorInsurance).moveToElement(twoWheelerInsurance).moveToElement(renewTwoWheelerInsurance).click().build().perform();
        return new RenewTwoWheelerInsurance(driver);
    }

    //New Two Wheeler Insurance
    public NewTwoWheelerInsurance newTwoWheelerInsurance() {
        logger.info("New Two Wheeler Insurance Page link is available");
        Actions action = new Actions(driver);
        action.moveToElement(motorInsurance).moveToElement(twoWheelerInsurance).moveToElement(newTwoWheelerInsurance).click().build().perform();
        return new NewTwoWheelerInsurance(driver);
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

    //Cashless Mediclaim Policy
    public CashlessMediclaimPolicy cashlessMediclaimPolicy() {
        logger.info("Cashless Mediclaim Policy Page link is available");
        Actions action = new Actions(driver);
        action.moveToElement(healthInsurance).moveToElement(cashlessMediClaimPolicy).click().build().perform();
        return new CashlessMediclaimPolicy(driver);
    }

    //Mediclaim Policy
    public MediclaimPolicy mediclaimPolicy() {
        logger.info("Mediclaim Policy Page link is available");
        Actions action = new Actions(driver);
        action.moveToElement(healthInsurance).moveToElement(mediclaimPolicy).click().build().perform();
        return new MediclaimPolicy(driver);
    }

    //Top Up Health Insurance
    public TopUpHealthInsurance topUpHealthInsurance() {
        logger.info("Top Up Health Insurance Page link is available");
        Actions action = new Actions(driver);
        action.moveToElement(healthInsurance).moveToElement(topUpHealthInsurance).click().build().perform();
        return new TopUpHealthInsurance(driver);
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

    //Four Wheeler Insurance in Articles Menu Item
    public FourWheelerInsuranceArticles fourWheelerInsuranceArticles() {
        logger.info("Four Wheeler Insurance Articles Page link is available");
        Actions action = new Actions(driver);
        action.moveToElement(articles).moveToElement(motorInsuranceArticles).moveToElement(fourWheelerInsuranceArticles).click().build().perform();
        return new FourWheelerInsuranceArticles(driver);
    }

    //Two Wheeler Insurance in Articles Menu Item
    public TwoWheelerInsuranceArticles twoWheelerInsuranceArticles() {
        logger.info("Two Wheeler Insurance Articles Page link is available");
        Actions action = new Actions(driver);
        action.moveToElement(articles).moveToElement(motorInsuranceArticles).moveToElement(twoWheelerInsuranceArticles).click().build().perform();
        return new TwoWheelerInsuranceArticles(driver);
    }

    //Health Insurance in Articles Menu Item
    public HealthInsuranceArticles healthInsuranceArticles() {
        logger.info("Health Insurance Articles Page link is available");
        Actions action = new Actions(driver);
        action.moveToElement(articles).moveToElement(healthInsuranceArticles).click().build().perform();
        return new  HealthInsuranceArticles(driver);
    }

    //Life Insurance in Articles Menu Item
    public LifeInsuranceArticles lifeInsuranceArticles() {
        logger.info("Life Insurance Articles Page link is Available");
        Actions action = new Actions(driver);
        action.moveToElement(articles).moveToElement(lifeInsuranceArticles).click().build().perform();
        return new LifeInsuranceArticles(driver);
    }

    //RTO in Articles Menu Item
    public RTO rto() {
        logger.info("RTO Page link is available");
        Actions action = new Actions(driver);
        action.moveToElement(articles).moveToElement(rtoArticles).click().build().perform();
        return new RTO(driver);
    }

    //Driving Licence in Articles Menu Item
    public DrivingLicenceArticles drivingLicenceArticles() {
        logger.info("Driving Licence Articles Page link is available");
        Actions action = new Actions(driver);
        action.moveToElement(articles).moveToElement(drivingLicenceArticles).click().build().perform();
        return new DrivingLicenceArticles(driver);
    }

    //General in Articles Menu Item
    public GeneralArticles generalArticles() {
        logger.info("General Articles Page link is available");
        Actions action = new Actions(driver);
        action.moveToElement(articles).moveToElement(generalArticles).click().build().perform();
        return new GeneralArticles(driver);
    }

    //Responsible Driving in Articles
    public ResponsibleDrivingArticles responsibleDrivingArticles() {
        logger.info("Responsible Driving Articles Page link is available");
        Actions action = new Actions(driver);
        action.moveToElement(articles).moveToElement(responsibleDrivingArticles).click().build().perform();
        return new ResponsibleDrivingArticles(driver);
    }

    //Verify String2(GET LOWEST PREMIUM INSTANT POLICY ON)
    public boolean string2(String str2) {
        logger.info("Verifying String 'GET LOWEST PREMIUM INSTANT POLICY ON' On New Car Insurance Home Page");
        return string2.getText().trim().equalsIgnoreCase(str2);
    }

    //Verify String3(MOTOR INSURANCE PLANS)
    public boolean string3(String str3) {
        logger.info("Verifying String 'MOTOR INSURANCE PLANS' On New Car Insurance Home Page");
        return string3.getText().trim().equalsIgnoreCase(str3);
    }

    //Verify String4(Multiple Choices)
    public boolean string4(String str4) {
        logger.info("Verifying String 'Multiple Choices' on New Car Insurance Page");
        return string4.getText().trim().equalsIgnoreCase(str4);
    }

    //Verify String5(Get policy in 2 minutes)
    public boolean string5(String str5) {
        logger.info("Verifying String {} on New Car Insurance Page", str5);
        return string5.getText().trim().equalsIgnoreCase(str5);
    }

    //Verify String6(Assistance from trusted partners)
    public boolean string6(String str6) {
        logger.info("Verifying String 'Assistance from trusted partners' on New Insurance Page");
        return string6.getText().trim().equalsIgnoreCase(str6);
    }

    //Close PopUp Window
    public void closePopUpWindow() {
        logger.info("Closing Pop Up Window");
        if(popUpWindow.isDisplayed()) {
            popUpWindow.click();
        }
    }

    //"Type Your Vehicle Modal" Text Field
    public void enterVehicleModal(String fVehicleName) {
        if(fVehicleName.isEmpty()) {
            logger.info("Vehicle Modal Name is taking from config. file");
            driver.switchTo().frame(0);
            vehicleModal.clear();
            vehicleModal.sendKeys(prop.getProperty("c_VehicleModalName"));
            hyundaiSantro.click();
            driver.switchTo().defaultContent();
        }
        else {
            logger.info("Vehicle Modal Name is taking from feature file");
            driver.switchTo().frame(0);
            vehicleModal.clear();
            vehicleModal.sendKeys(fVehicleName);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            hyundaiSantro.click();
            driver.switchTo().defaultContent();
        }
    }

    //"Purchasing Year" Text Field
    public void enterPurchasingYear(String fPurchasingYear) {
        if(fPurchasingYear.isEmpty()) {
            logger.info("Vehicle Purchasing Year is taking from config. file");
            driver.switchTo().frame(0);
            purchaseYear.sendKeys(prop.getProperty("c_PurchasingYear"));
            driver.switchTo().defaultContent();
        }
        else {
            logger.info("Vehicle Purchasing Year is taking from feature file");
            driver.switchTo().frame(0);
            purchaseYear.sendKeys(fPurchasingYear);
            driver.switchTo().defaultContent();
        }
    }

    //"Instant Quote" Button
    public NewCarInsuranceQuotePage clickOnNewCarInsuranceQuoteButton() {
        logger.info("New Car Insurance Instant Quote Button is available");
        driver.switchTo().frame(0);
        instantQuoteButton.click();
        return new NewCarInsuranceQuotePage(driver);
    }
}