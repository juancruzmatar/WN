package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import utilities.Driver;

import java.util.LinkedList;
import java.util.List;

public class welp_pageObject extends Driver {

    public static int count;
    public static String UiProductName, UiProductPrice;
    public static Logger log = LogManager.getLogger(welp_pageObject.class);

    //
    @FindBy(css = "[name='national_id']")
    public WebElement dni;
    //
    @FindBy(css = "[data='form_continue']")
    public WebElement continuar;

    @FindBy(css = ".RadioButtonstyles__RadioButtonLabel-as4cwk-0")
    public WebElement nombreApellido;

    @FindBy(css = "[alt='Banco Frances']")
    public WebElement bbva;

    @FindBy(css = "[name='email']")
    public WebElement mail;

    @FindBy(css = "[name='area_code']")
    public WebElement codigoarea;

    @FindBy(css = "[name='number']")
    public WebElement celular;

    @FindBy(css = ".boxPbP [alt]")
    public WebElement terminosycondiciones;

    @FindBy(css = "[name='sms_code']")
    public WebElement codigorecibido;

    @FindBy(css = ".Sliderstyled__Range-sc-1p2glhe-5")
    public WebElement monto;

    @FindBy(css = ".RadioButtonstyles__RadioButtonLabel-as4cwk-0")
    public WebElement cuotas;


    @FindBy(xpath = "//li[@id='cat-sale']")
    public WebElement btn_sale;

    @FindBy(css = "#popup-newsletter")
    public WebElement popup_newsletter;

    @FindBy(xpath = "//button[@class='cerrar no-boton']")
    public WebElement btn_closeNewsletter;

    @FindBy(css = "#promo-header")
    public WebElement promo_header;

    @FindBy(xpath = "//*[@id='promo-header']//i")
    public WebElement btn_closePromoHeader;

    @FindBy(id = "toTop")
    public WebElement btn_toTop;

    @FindBy(id = "search")
    public WebElement inp_search;
    @FindBy(xpath = "//li[contains(@data-href,'account/login/')]")
    public WebElement loginLink;
    @FindBy(id = "email")
    public WebElement loginEmail;
    @FindBy(id = "pass")
    public WebElement loginPassword;
    @FindBy(id = "send2")
    public WebElement loginEnterButton;
    @FindBy(xpath = "//li[contains(@data-href,'account/logout/')]")
    public WebElement ButtonLogOut;
    @FindBy(xpath = "(//nav[@id='menu']//a[contains(@href,'mujer.html') and text()='Mujer'])[1]")
    public WebElement mujerMainMenu;
    @FindBy(xpath = "//section[@id='galeria']/article")
    public List<WebElement> mujerMainMenu_ItemsCount;
    @FindBy(xpath = "//img[contains(@alt,'Admit One')]")
    public WebElement admitOneLogo;


    @FindBy(xpath = "(//nav[@id='menu']//a[contains(@href,'hombre.html') and text()='Hombre'])[1]")
    public WebElement hombreMainMenu;
    @FindBy(xpath = "//nav[@id='menu']//a[contains(@href,'ninos') and text()='Kids']")
    public WebElement kidsMainMenu;
    @FindBy(xpath = "//h1[@id='nombreProducto']")
    public WebElement productName;
    @FindBy(xpath = "//span[@itemprop='price']")
    public WebElement productPrice;

    @FindBy(xpath = "(//div[@class='swatchesContainer']//div[not(contains(@class,'disabledSwatch'))])[1]")
    public WebElement availableFirstSizeSelection;
    @FindBy(xpath = "//button[text()='Comprar']")
    public WebElement buyButton;

    @FindBy(xpath = " //a[text()='SEGUIR COMPRANDO']")
    public WebElement popUpContinueShopping;

    @FindBy(xpath = "//a[text()='IR A MI BOLSA']")
    public WebElement popUpGoToCart;

    @FindBy(xpath = "//a[text()='Login con Google']")
    public WebElement loginViaGoogle;

    @FindBy(xpath = "//span[text()='Finalizar compra']")
    public WebElement checkOutButton;

    @FindBy(xpath = "//div[@id='billing-buttons-container']//button[@title='Continuar']")
    public WebElement continueCustomerDetails;

    @FindBy(xpath = "//input[@id='s_method_pickuppoint_00001']")
    public WebElement deliveryFreeChargeOption;

    @FindBy(xpath = "//ul[@id='shipping_form_pickuppoint_00001']//select")
    public WebElement selectOptionToSend;

    @FindBy(xpath = "//div[@id='shipping-method-buttons-container']//button")
    public WebElement continueShippingMethodContinue;

    @FindBy(xpath = "//input[@id='p_method_mercadopago2_standard']")
    public WebElement mercadoPagoPayment;

    @FindBy(xpath = "//div[@id='payment-buttons-container']//button")
    public WebElement paymentContinueButton;

    @FindBy(xpath = "//button//span[text()='Realizar pago']")
    public WebElement finalPaymentButton;

    @FindBy(xpath = "//span[text()='MERCADO PAGO']")
    public WebElement mercadoPagoPaymentDisplayed;

    @FindBy(xpath = "//strong[text()='Total general']/../..//span[@class='price']")
    public WebElement totalGeneralPayment;

    @FindBy(xpath = "//span[@class='row-summary__price ']")
    public WebElement paymentPageAmount;





    public welp_pageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void loginCheck() {

        try {

            visit("https://monorepo-welp-ar.dev.fintechpeople.io/");

            //Assert.assertTrue(ButtonLogOut.isDisplayed());

        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void welpLogin() {
        try {
            wait(3);
            dni.sendKeys("31433335");
            log.info("Sending DNI");
            wait(2);
            continuar.click();
            log.info("Click on Continue Button");
            wait(2);
            nombreApellido.click();
            log.info("Sending Nombre y Apellido");
            continuar.click();
            log.info("Click on Continue Button");
            wait(2);
            bbva.click();
            log.info("Click on BBVA");
            wait(2);
            continuar.click();
            log.info("Click on Continue Button");
            wait(2);
            mail.sendKeys("juan.matar@wenance.com");
            log.info("Sending mail");
            codigoarea.sendKeys("11");
            log.info("Sending codigo de area");
            celular.sendKeys("42424242");
            log.info("Sending telefono");
            wait(2);


            //terminosycondiciones.click();
            //continuar.sendKeys();



        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public int clickOnMujerMenu() {

        try {

            mujerMainMenu.click();
            log.info("clicking on mujer link");
            count = mujerMainMenu_ItemsCount.size();
            log.info("the total count is " + count);

        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
        return count;
    }

    public int clickOnHombreMenu() {

        try {


            hombreMainMenu.click();
            log.info("clicking on hombre link");
            count = mujerMainMenu_ItemsCount.size();
            log.info("the total count is " + count);

        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
        return count;
    }

    public int clickOnKidsMenu() {

        try {

            kidsMainMenu.click();
            log.info("clicking on kids link");
            count = mujerMainMenu_ItemsCount.size();
            log.info("the total count is " + count);

        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
        return count;
    }

    public LinkedList<String> selectItemFromDisplay(int itemNumber, WebElement selectSize, WebElement buyOrCheckOut) {
        LinkedList<String> itemList = new LinkedList<String>();
        try {

            mujerMainMenu_ItemsCount.get(itemNumber).click();
            log.info("Clicking on first item ");
            UiProductName = productName.getText();
            log.info("Getting product name " + UiProductName);
            itemList.add(UiProductName);
            UiProductPrice = productPrice.getText();
            log.info("Getting product price " + UiProductPrice);
            itemList.add(UiProductPrice);
            selectSize.click();
            log.info("clicking on the size");
            buyButton.click();
            log.info("clicking on buy Button");
            Thread.sleep(2000);
            buyOrCheckOut.click();

        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
        return itemList;
    }

    public void selectDeliveryOption(int optionToSelect) {

        try {
            deliveryFreeChargeOption.click();
            log.info("clicking on free delivery charge details");
            Select se = new Select(selectOptionToSend);
            se.selectByIndex(optionToSelect);
            continueShippingMethodContinue.click();


        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }

    }

    public void MercadoPaymentMethod(WebElement paymentType) {

        try {
            paymentType.click();
            log.info("clicking on mercado pago details");
            paymentContinueButton.click();


        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }

    }

    public String amountSplit(WebElement paymentAmount) {
        String totalPay = null;

        try {
            totalPay = paymentAmount.getText();
            log.info("the amount from UI is  " + totalPay);
            String[] arrOfStr = totalPay.split("$");
            totalPay = arrOfStr[1];
            log.info("the amount after removing $ is  " + totalPay);


        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
        return totalPay;

    }

    public void finalPayment(WebElement paymentType) {

        try {

            paymentType.click();
            log.info("clicking on final payment");


        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }


    }

}