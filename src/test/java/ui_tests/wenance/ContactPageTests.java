package ui_tests.wenance;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Driver;

import static utilities.ConfigReader.getProperty;

public class ContactPageTests extends Driver {
    Logger log = LogManager.getLogger(ContactPageTests.class);
    @BeforeMethod
    public void setUp() {

    }

    @Test
    public void SendFormTest() {
        visit(getProperty("url_welp"));
    }

    @AfterMethod
    public void tearDown() {
        closeDriver();
    }
}
