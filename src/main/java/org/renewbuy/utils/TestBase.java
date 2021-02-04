package org.renewbuy.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/***
 * @author verma.piyush
 */
public class TestBase {

    public static WebDriver driver;
    public static Properties prop=new Properties();
    private static Logger logger=LogManager.getLogger(TestBase.class);
    public static WebDriverWait wait;

    //define cluster to initialize the properties file
    public TestBase() {
        try {
            FileInputStream baseFile = new FileInputStream("src\\main\\resources\\configuration\\config.properties");
            prop.load(baseFile);
        } catch (FileNotFoundException e1) {
            logger.error(e1);
        } catch (IOException e2) {
            logger.error(e2);
        }
    }

    //define cluster to initialize the browser which return webdriver
    public static WebDriver initializeBrowser(){
        String browserName=prop.getProperty("browser");
        logger.info("initialising browser setup for test execution");

        if(browserName.equalsIgnoreCase("chrome")){
            logger.info("opening chrome browser");
            System.setProperty("webdriver.chrome.driver" , "src/main/resources/drivers/chromedriver.exe");
            logger.info("chrome browser property set");
            driver=new ChromeDriver();
            driver.manage().window().maximize();
            logger.info("maximizing the browser window");
        } else if(browserName.equalsIgnoreCase("firefox")){
            logger.info("opening firefox browser");
            System.setProperty("webdriver.gecko.driver" , "src/main/resources/drivers/geckodriver.exe");
            logger.info("firefox browser property set");
            driver=new FirefoxDriver();
            driver.manage().window().maximize();
            logger.info("maximizing the browser window");
        } else {
            logger.info("Provided browser name is invalid : Test execution failed");
        }

        driver.manage().timeouts().pageLoadTimeout(utilsTime.pageload_Time, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(utilsTime.implicit_Time , TimeUnit.SECONDS);
        wait =new WebDriverWait(driver, utilsTime.explicit_Time);
        logger.info("defined implicit and explicit wait");
        return driver;
    }

    /*
     * To pause execution if website is unstable
     * not recommended to use this method
     * use only when explicit wait is fail to handle situation
     * @param seconds duration to pause execution
     */
    public void pauseExecutionForSeconds(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            logger.error(e);
        }
    }

    //To provide Explicit wait for input WebElement
    public WebElement wait(WebElement element){

        return wait.until(ExpectedConditions.visibilityOf(element));
    }
}
