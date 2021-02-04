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

public class HomePage extends BasePage{

    private static Logger logger= LogManager.getLogger(HomePage.class);

    public HomePage(WebDriver driver){
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    //verify Heading text
    @FindBy(xpath = "//div[contains(text(),'D2C INSURANCE BROKING PVT. LTD.')]")
    WebElement heading;

    //verify RenewBuy logo
    @FindBy(xpath = "//div[@class='container']/nav/a/img")
    WebElement renewBuyLogo;

    //Motor Insurance(Hover)
    @FindBy(xpath = "//a[@id='navbarDropdownMenuLink' and contains(.,' Motor Insurance ')]")
    WebElement motorInsurance;

    //Car Insurance(Hover)
    @FindBy(xpath = "//a[@id='navbarDropdownMenuLink1' and contains(.,'Car Insurance')]")
    WebElement carInsurance;

    //Renew Car Insurance(click)
    @FindBy(xpath = "//a[@class='dropdown-item deskattr' and contains(.,'Renew Car Insurance')]")
    WebElement renewCarInsurance;

    //Compare Car Insurance(click)
    @FindBy(xpath = "//a[@class='dropdown-item deskattr' and contains(.,'Compare Car Insurance')]")
    WebElement compareCarInsurance;

    //New Car Insurance(click)
    @FindBy(xpath = "//a[@class='dropdown-item deskattr' and contains(.,'New Car Insurance')]")
    WebElement newCarInsurance;

    //Car Insurance Calculator(click)
    @FindBy(xpath = "//a[@class='dropdown-item deskattr' and contains(.,'Car Insurance Calculator')]")
    WebElement carInsuranceCalculator;

    //Car Insurance Claim(click)
    @FindBy(xpath = "//a[@class='dropdown-item deskattr' and contains(.,'Car Insurance Claim')]")
    WebElement carInsuranceClaim;

    //Car Insurance FAQs(click)
    @FindBy(xpath = "//a[@class='dropdown-item deskattr' and contains(.,'Car Insurance FAQs')]")
    WebElement carInsuranceFAQs;

    //Two Wheeler Insurance(Hover)
    @FindBy(xpath = "//a[@id='navbarDropdownMenuLink2' and contains(.,'Two Wheeler Insurance')]")
    WebElement twoWheelerInsurance;

    //Compare Two Wheeler Insurance(click)
    @FindBy(xpath = "//a[@class='dropdown-item deskattr' and contains(.,'Compare Two Wheeler Insurance')]")
    WebElement compareTwoWheelerInsurance;

    //Renew Two Wheeler Insurance(click)
    @FindBy(xpath = "//a[@class='dropdown-item deskattr' and contains(.,'Renew Two Wheeler Insurance')]")
    WebElement renewTwoWheelerInsurance;

    //New Two Wheeler Insurance(click)
    @FindBy(xpath = "//a[@class='dropdown-item deskattr' and contains(.,'New Two Wheeler Insurance')]")
    WebElement newTwoWheelerInsurance;

    //Two Wheeler Insurance FAQs(click)
    @FindBy(xpath = "//a[@class='dropdown-item deskattr' and contains(.,'Two Wheeler Insurance FAQs')]")
    WebElement twoWheelerInsuranceFAQs;

    //Motor Insurance Reminder(click)
    @FindBy(xpath = "//a[@class='dropdown-item deskattr' and contains(.,'Motor Insurance Reminder')]")
    WebElement motorInsuranceReminder;

    //Health Insurance(Hover)
    @FindBy(xpath = "//a[@id='navbarDropdownMenuLink' and contains(.,'Health Insurance')]")
    WebElement healthInsurance;

    //Compare Health Insurance(click)
    @FindBy(xpath = "//a[@class='dropdown-item deskattr' and contains(.,'Compare Health Insurance')]")
    WebElement compareHealthInsurance;

    //Individual Health Insurance(click)
    @FindBy(xpath = "//a[@class='dropdown-item deskattr' and contains(.,'Individual Health Insurance')]")
    WebElement individualHealthInsurance;

    //Family Health Insurance(click)
    @FindBy(xpath = "//a[@class='dropdown-item deskattr' and contains(.,'Family Health Insurance')]")
    WebElement familyHealthInsurance;

    //Corporate Insurance(click)
    @FindBy(xpath = "//a[@class='nav-link deskattr' and contains(.,'Corporate Insurance')]")
    WebElement corporateInsurance;

    //Life Insurance(click)
    @FindBy(xpath = "//a[@class='nav-link deskattr' and contains(.,'Life Insurance')]")
    WebElement lifeInsurance;

    //Articles(click)
    @FindBy(xpath = "//a[@class='nav-link deskattr' and contains(.,'Articles')]")
    WebElement articles;

    //Become POSP Advisor(click)
    @FindBy(xpath = "//a[@class='nav-link deskattr' and contains(.,'Become POSP Advisor')]")
    WebElement becomePOSPAdvisor;

    //Login(Hover)
    @FindBy(xpath = "//a[@class='nav-link dropdown-toggle deskattr' and contains(.,'Login')]")
    WebElement login;

    //Customer Login(click)
    @FindBy(xpath = "//a[@class='dropdown-item deskattr' and contains(.,'Customer login')]")
    WebElement customerLogin;

    //Partner Login(click)
    @FindBy(xpath = "//a[@class='dropdown-item deskattr' and contains(.,'Partner Login')]")
    WebElement partnerLogin;

    //View Insurance Plans Button(click)
    @FindBy(xpath = "//div[@class='fall']/button[contains(text(),'View Insurance Plans')]")
    WebElement viewInsurancePlans;

    //Get Expert Advice Button(click)
    @FindBy(xpath = "//div[@class='fall']/button[contains(text(),'Get Expert Advice')]")
    WebElement getExpertAdvice;

    //verify Heading text
    public boolean verifyHeadingTextDisplayed(String headingHP){
        boolean result = false;
        if (headingHP.isEmpty()){
            logger.info("Heading is taking from config. file and verifying Heading Text is available");
            result = wait(heading).getText().trim().equalsIgnoreCase(prop.getProperty("c_heading"));
        }
        else {
            logger.info("Heading is taking from feature file and verifying Heading Text is available");
            result = wait(heading).getText().trim().equalsIgnoreCase(headingHP);
        }
        return result;
    }

    //verify renewbuy logo
    public boolean verifyRenewBuyLogoDisplayed(){
        logger.info("verifying renewBuy Logo is available");
        return wait(renewBuyLogo).isDisplayed();
    }

    //Renew Car Insurance
    public RenewCarInsurance clickOnRenewCarInsuranceLink(){
        logger.info("Verifying Renew Car Insurance link is available");
        Actions action = new Actions(driver);
        action.moveToElement(motorInsurance).moveToElement(carInsurance).moveToElement(wait(renewCarInsurance)).click().build().perform();
        return new RenewCarInsurance(driver);
    }

    //Compare Car Insurance
    public CompareCarInsurance clickOnCompareCarInsuranceLink(){
        logger.info("Verifying Compare Car Insurance link is available");
        Actions action = new Actions(driver);
        action.moveToElement(motorInsurance).moveToElement(carInsurance).moveToElement(wait(compareCarInsurance)).click().build().perform();
        return new CompareCarInsurance(driver);
    }

    //New Car Insurance
    public NewCarInsurance clickOnNewCarInsuranceLink(){
        logger.info("Verifying New Car Insurance link is available");
        Actions action = new Actions(driver);
        action.moveToElement(motorInsurance).moveToElement(carInsurance).moveToElement(newCarInsurance).click().build().perform();
        return new NewCarInsurance(driver);
    }

    //Car Insurance Calculator
    public CarInsuranceCalculator clickOnCarInsuranceCalculatorLink(){
        logger.info("Car Insurance Calculator link is available");
        Actions action = new Actions(driver);
        action.moveToElement(motorInsurance).moveToElement(carInsurance).moveToElement(wait(carInsuranceCalculator)).click().build().perform();
        return new CarInsuranceCalculator(driver);
    }

    //Car Insurance Claim
    public CarInsuranceClaim clickOnCarInsuranceClaimLink(){
        logger.info("Car Insurance Claim link is available");
        Actions action = new Actions(driver);
        action.moveToElement(motorInsurance).moveToElement(carInsurance).moveToElement(wait(carInsuranceClaim)).click().build().perform();
        return new CarInsuranceClaim(driver);
    }

    //Car Insurance FAQs
    public CarInsuranceFAQs clickOnCarInsuranceFAQsLink(){
        logger.info("Car Insurance FAQs link is available");
        Actions action = new Actions(driver);
        action.moveToElement(motorInsurance).moveToElement(carInsurance).moveToElement(wait(carInsuranceFAQs)).click().build().perform();
        return new CarInsuranceFAQs(driver);
    }

    //Compare Two Wheeler Insurance
    public CompareTwoWheelerInsurance clickOnCompareTwoWheelerInsuranceLink(){
        logger.info("Compare Two Wheeler Insurance link is available");
        Actions action = new Actions(driver);
        action.moveToElement(motorInsurance).moveToElement(twoWheelerInsurance).moveToElement(wait(compareTwoWheelerInsurance)).click().build().perform();
        return new CompareTwoWheelerInsurance(driver);
    }

    //Renew Two Wheeler Insurance
    public RenewTwoWheelerInsurance clickOnRenewTwoWheelerInsuranceLink(){
        logger.info("Renew Two Wheeler Insurance link is available");
        Actions action = new Actions(driver);
        action.moveToElement(motorInsurance).moveToElement(twoWheelerInsurance).moveToElement(wait(renewTwoWheelerInsurance)).click().build().perform();
        return new RenewTwoWheelerInsurance(driver);
    }

    //New Two Wheeler Insurance
    public NewTwoWheelerInsurance clickOnNewTwoWheelerInsuranceLink() {
        logger.info("New Two Wheeler Insurance link is available");
        Actions action = new Actions(driver);
        action.moveToElement(motorInsurance).moveToElement(twoWheelerInsurance).moveToElement(wait(newTwoWheelerInsurance)).click().build().perform();
        return new NewTwoWheelerInsurance(driver);
    }

    //Two Wheeler Insurance FAQs
    public TwoWheelerInsuranceFAQs clickOnTwoWheelerInsuranceFAQsLink() {
        logger.info("Two Wheeler Insurance FAQs link is available");
        Actions action = new Actions(driver);
        action.moveToElement(motorInsurance).moveToElement(twoWheelerInsurance).moveToElement(wait(twoWheelerInsuranceFAQs)).click().build().perform();
        return new TwoWheelerInsuranceFAQs(driver);
    }

    //Motor Insurance Reminder
    public MotorInsuranceReminder clickOnMotorInsuranceReminderLink() {
        logger.info("Motor Insurance Reminder link is available");
        Actions action = new Actions(driver);
        action.moveToElement(motorInsurance).moveToElement(wait(motorInsuranceReminder)).click().build().perform();
        return new MotorInsuranceReminder(driver);
    }

    //Compare Health Insurance
    public CompareHealthInsurance clickOnCompareHealthInsuranceLink() {
        logger.info("Compare Health Insurance link is available");
        Actions action = new Actions(driver);
        action.moveToElement(healthInsurance).moveToElement(wait(compareHealthInsurance)).click().build().perform();
        return new CompareHealthInsurance(driver);
    }

    //Individual Health Insurance
    public IndividualHealthInsurance clickOnIndividualHealthInsuranceLink() {
        logger.info("Individual Health Insurance link is available");
        Actions action = new Actions(driver);
        action.moveToElement(healthInsurance).moveToElement(wait(individualHealthInsurance)).click().build().perform();
        return new IndividualHealthInsurance(driver);
    }

    //Family Health Insurance
    public FamilyHealthInsurance clickOnFamilyHealthInsuranceLink() {
        logger.info("Family Health Insurance link is available");
        Actions action = new Actions(driver);
        action.moveToElement(healthInsurance).moveToElement(wait(familyHealthInsurance)).click().build().perform();
        return new FamilyHealthInsurance(driver);
    }

    //Corporate Insurance
    public CorporateInsurance clickOnCorporateInsuranceLink() {
        logger.info("Corporate Insurance link is available");
        wait(corporateInsurance).click();
        return new CorporateInsurance(driver);
    }

    //Life Insurance
    public LifeInsurance clickOnLifeInsuranceLink() {
        logger.info("Life Insurance link is available");
        wait(lifeInsurance).click();
        return new LifeInsurance(driver);
    }

    //Articles
    public Articles clickOnArticlesLink() {
        logger.info("Articles link is available");
        wait(articles).click();
        return new Articles(driver);
    }

    //Become POSP Advisor
    public BecomePOSPAdvisor clickOnBecomePOSPAdvisorLink() {
        logger.info("Become POSP Advisor link is available");
        wait(becomePOSPAdvisor).click();
        return new BecomePOSPAdvisor(driver);
    }

    //Customer Login
    public CustomerLogin clickOnCustomerLoginLink() {
        logger.info("Customer Login link is available");
        Actions action = new Actions(driver);
        action.moveToElement(login).moveToElement(wait(customerLogin)).click().build().perform();
        return new CustomerLogin(driver);
    }

    //Partner Login
    public PartnerLogin clickOnPartnerLoginLink() {
        logger.info("Partner Login link is available");
        Actions action = new Actions(driver);
        action.moveToElement(login).moveToElement(wait(partnerLogin)).click().build().perform();
        return new PartnerLogin(driver);
    }

    //View Insurance Plans
    public ViewInsurancePlans clickOnViewInsurancePlansButton() {
        logger.info("View Insurance Plans Button is available");
        wait(viewInsurancePlans).click();
        return new ViewInsurancePlans(driver);
    }

    //Get Expert Advice
    public GetExpertAdvice clickOnGetExpertAdviceButton() {
        logger.info("Get Expert Advice Button is available");
        wait(getExpertAdvice).click();
        return new GetExpertAdvice(driver);
    }
}
