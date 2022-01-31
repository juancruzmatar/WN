package ui_tests.wenance;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.welp_pageObject;
import utilities.Driver;

public class AssertionsTest extends Driver {
    public static Logger log = LogManager.getLogger(AssertionsTest.class);
    public String productName,productPrice;

   @Test(description = "login flow")
    public void loginCheck(){
       welp_pageObject welp_pageObject =new welp_pageObject(driver);
        try {

          welp_pageObject.welpLogin();
        }
        catch (Exception e){
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }


    @Test(description = "login flow via google account")
    public void lognViaGoogle(){
        welp_pageObject welp_pageObject =new welp_pageObject(driver);
        try {

            visit("https://monorepo-welp-ar.dev.fintechpeople.io/");
            welp_pageObject.welpLogin();
            log.info("clicking on sing in button");
        }
        catch (Exception e){
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }
}
