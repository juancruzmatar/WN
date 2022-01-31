package ui_tests.wenance;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.WenancePage;
import pages.welp_pageObject;
import utilities.Driver;

import static utilities.ConfigReader.getProperty;

public class WenanceTest extends Driver {
    public static Logger log = LogManager.getLogger(WenanceTest.class);
    public String productName, productPrice;

    @BeforeTest
    public void RunSetup() {
        visit(getProperty("url_wenance"));
    }


    @Test(description = "login flow")
    public void loginCheck() {

        WenancePage wenancePage_PO = new WenancePage(driver);
        try {
            wenancePage_PO.IngresarWenance();

        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }



    @Test(description = "Wenance Validate Navegation")
    public void ValidateNavegation() {

        WenancePage wenancePage_PO = new WenancePage(driver);
        try {
            wenancePage_PO.IngresarWenance();
            wenancePage_PO.NavigateValidation();

        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }



    @Test
    public void Register() {
        WenancePage wenancePage_PO = new WenancePage(driver);
        try {


            wenancePage_PO.registerCheck();
            wenancePage_PO.MailinatorChecking();
            wenancePage_PO.enterTokenAndPassword();
            //Driver.catch_brokenImages();

        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }


    @Test(description = "Search the product")
    public void searchProduct() {
        WenancePage wenancePage_PO = new WenancePage(driver);
        try {

            wenancePage_PO.registerCheck();
            wenancePage_PO.MailinatorChecking();
            wenancePage_PO.enterTokenAndPassword();
            wenancePage_PO.SearchProduct("Toalla");
            wenancePage_PO.cartCheckOut();
            wenancePage_PO.cartPageDetailFill();
            wenancePage_PO.paymentCashOption();
            wenancePage_PO.MailinatorToForOrderConfirmation();

        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    @Test(description = "delete the product from cart and add it again")
    public void deleteProductFrmCart() {
        WenancePage wenancePage_PO = new WenancePage(driver);
        try {


            wenancePage_PO.SearchProduct("Toalla");
            wenancePage_PO.cartCheckOut();
            wenancePage_PO.deleteItemCart();
            wenancePage_PO.SearchProduct("body");
            wenancePage_PO.cartCheckOut();

        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    @Test(description = "adding item to the cart")
    public void addingItemToCart() {
        String totalAmount, finalPageAmount;
        int getCount;
        welp_pageObject welp_pageObject = new welp_pageObject(driver);
        try {

            welp_pageObject.loginCheck();
            getCount = welp_pageObject.clickOnMujerMenu();
            Assert.assertTrue(getCount > 1);
            welp_pageObject.selectItemFromDisplay(3, welp_pageObject.availableFirstSizeSelection, welp_pageObject.popUpContinueShopping);


            getCount = welp_pageObject.clickOnHombreMenu();
            Assert.assertTrue(getCount > 1);
            welp_pageObject.selectItemFromDisplay(3, welp_pageObject.availableFirstSizeSelection, welp_pageObject.popUpContinueShopping);


            welp_pageObject.clickOnKidsMenu();
            welp_pageObject.selectItemFromDisplay(3, welp_pageObject.availableFirstSizeSelection, welp_pageObject.popUpGoToCart);

            Thread.sleep(2000);
            welp_pageObject.checkOutButton.click();
            log.info("clicking on checkoutButton");
            welp_pageObject.continueCustomerDetails.click();
            log.info("clicking on continue customer details");
            welp_pageObject.selectDeliveryOption(1);

            welp_pageObject.MercadoPaymentMethod(welp_pageObject.mercadoPagoPayment);

            totalAmount = welp_pageObject.amountSplit(welp_pageObject.totalGeneralPayment);

            welp_pageObject.finalPayment(welp_pageObject.finalPaymentButton);

            Assert.assertTrue(welp_pageObject.mercadoPagoPaymentDisplayed.isDisplayed());

            finalPageAmount = welp_pageObject.amountSplit(welp_pageObject.paymentPageAmount);
            Assert.assertEquals(totalAmount, finalPageAmount);


        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    @Test(description = "login flow via google account")
    public void lognViaGoogle() {
        welp_pageObject welp_pageObject = new welp_pageObject(driver);
        try {

            visit("https://www.admitone.com.ar/");
            welp_pageObject.loginLink.click();
            log.info("clicking on sing in button");
        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }
}
