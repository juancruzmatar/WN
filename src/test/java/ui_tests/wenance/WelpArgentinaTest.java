package ui_tests.wenance;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.welp_pageObject;

import utilities.Driver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static utilities.ConfigReader.getJsonProp;
import static utilities.ConfigReader.getProperty;

public class WelpArgentinaTest extends Driver {

    Logger log = LogManager.getLogger(WelpArgentinaTest.class);

    @BeforeTest
    public void RunSetup() {
        visit(getProperty("url_welp"));
    }
    public void setUp() {
        log.info("Validation and navigation of the links located on the home page of each brand");
    }

    @DataProvider(name = "users")
    public Object[][] stores() {
        return new Object[][]{
                {"url_wenance"},
                {"url_welp"},

        };
    }

    @Test(priority = 1, dataProvider = "stores")
   // @Description("Smoke Testing - Cross URL Status code Validation & Navegation")

    public void navigationValidationToTheLinksOfEachBrand(String store) {
        visit(getProperty("url_welp"));
        isThereJSErrorOnThePage();

        List<WebElement> links = driver.findElements(By.tagName("a"));
        ArrayList<String> valid_links = new ArrayList<>();
        String flag = ""; // A flag is added so that the link is not repeated

        log.info("Total links found → " + links.size());

        for (WebElement link : links) {
            log.info(link.getAttribute("href"));
            if (link.getAttribute("href") != null && link.getAttribute("href").contains("http") && !link.getAttribute("href").equals(flag)) {
                valid_links.add(link.getAttribute("href"));
                flag = link.getAttribute("href");
            }
        }

        log.info("Total of valid links found → " + valid_links.size());

        int i = 0;
        for (String href : valid_links) {
            log.info((++i) + ":: Navigate to URL with href: " + href);
            driver.navigate().to(href);
        }
    }

    @Test(priority = 1, description = "login flow and validate URLs")

    public void NavigateAndValidatePages() {
        welp_pageObject welp_pageObject =new welp_pageObject(driver);

        visit(getProperty("url_welp"));
        welp_pageObject.welpLogin();
        wait(7);




        List<WebElement> links = driver.findElements(By.tagName("a"));
        ArrayList<String> valid_links = new ArrayList<>();
        String flag = ""; // A flag is added so that the link is not repeated

        log.info("Total links found → " + links.size());

        for (WebElement link : links) {
            log.info(link.getAttribute("href"));
            if (link.getAttribute("href") != null && link.getAttribute("href").contains("http") && !link.getAttribute("href").equals(flag)) {
                valid_links.add(link.getAttribute("href"));
                flag = link.getAttribute("href");
            }
        }

        log.info("Total of valid links found → " + valid_links.size());

        int i = 0;
        for (String href : valid_links) {
            log.info((++i) + ":: Navigate to URL with href: " + href);
            driver.navigate().to(href);
        }
    }


    public boolean isThereJSErrorOnThePage() {
        Set<String> errorStrings = new HashSet<>();
        errorStrings.add("SyntaxError");
        errorStrings.add("EvalError");
        errorStrings.add("ReferenceError");
        errorStrings.add("RangeError");
        errorStrings.add("TypeError");
        errorStrings.add("URIError");
        LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
        for (LogEntry logEntry : logEntries) {
            for (String errorString : errorStrings) {
                if (logEntry.getMessage().contains(errorString)) {
                    log.error("Java Script error has been detected:");
                    log.error(logEntry.getLevel() + " " + logEntry.getMessage());
                    return true;
                }
            }
        }
        return false;
    }

    @Test
    public void navigationValidationJSErros( ) {
        visit(getProperty("url_welp"));
        isThereJSErrorOnThePage();
    }


        @Test
        public void testUntitledTestCase() throws Exception {
            welp_pageObject welp_pageObject =new welp_pageObject(driver);

            driver.get(getProperty("url_welp"));
            welp_pageObject.welpLogin();
            wait(4);
            getAllUrls();

        }

    @AfterTest
    public void teardown() {
        closeDriver();
    }
}
