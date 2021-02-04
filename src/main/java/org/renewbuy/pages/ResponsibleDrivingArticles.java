package org.renewbuy.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/***
 * @author verma.piyush
 */
public class ResponsibleDrivingArticles extends BasePage {

    private static Logger logger = LogManager.getLogger(ResponsibleDrivingArticles.class);

    public ResponsibleDrivingArticles(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
