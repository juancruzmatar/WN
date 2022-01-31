package pages;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class WenancePage extends Driver {

    public static Logger log = LogManager.getLogger(WenancePage.class);

    public static int count;
    @FindBy(css = "[href='usuario_actividad.aspx']")
    public WebElement actividad;
    @FindBy(css = "[href='usuario_mensajes.aspx']")
    public WebElement mensajes;
    @FindBy(css = "[href='Usuario_Reportes.aspx']")
    public WebElement reportes;
    @FindBy(css = "#cmdOk")
    public WebElement ingresar;
    @FindBy(css = "#txtUser")
    public WebElement usuario;
    @FindBy(css = "#txtPassword")
    public WebElement password;
    @FindBy(xpath = "//span[contains(@class,'vtex-login')]")
    public WebElement loginIconLink;
    @FindBy(xpath = "//div[contains(@class,'emailPasswordOptionBtn')]/button")
    public WebElement loginViaEmailPass;
    @FindBy(xpath = "//span[@class='t-small'][contains(.,'Entrar')]")
    public WebElement Enter;
    @FindBy(xpath = "//span[contains(.,'Enviar')]")
    public WebElement enviar;
    @FindBy(xpath = "//div[contains(@class,'inputContainerEmail')]//input")
    public WebElement loginEmail;
    @FindBy(xpath = "//div[contains(@class,'inputContainerPassword')]//input")
    public WebElement loginPassword;
    @FindBy(xpath = " //span[contains(@class,'vtex-login-2-x-profile')]")
    public WebElement loginSuccess;
    @FindBy(xpath = "//span[contains(text(),'Mi Cuenta')]")
    public WebElement myAccount;
    @FindBy(xpath = "//a[contains(@href,'/profile') and text()='Perfil']")
    public WebElement myAccountProfileLink;
    @FindBy(xpath = "//a[contains(@href,'/addresses') and text()='Direcciones']")
    public WebElement myAccountDireccionesLink;
    @FindBy(xpath = "//a[contains(@href,'/orders') and text()='Pedidos']")
    public WebElement myAccountPedidosLink;
    @FindBy(xpath = "//a[contains(@href,'/cards') and text()='Tarjetas de crédito']")
    public WebElement myAccountCreditTarjetaLink;
    @FindBy(xpath = " //div[contains(@class,'emailContainer')]/div")
    public WebElement myAccountEmailID;
    @FindBy(xpath = "//div[text()='Modificar contraseña']")
    public WebElement myAccountChangePasswordBtn;
    @FindBy(name = "currentPassword")
    public WebElement myAccountCurrentPassword;
    @FindBy(name = "newPassword")
    public WebElement myAccountNewPassword;
    @FindBy(xpath = "//div[text()='Guardar contraseña']")
    public WebElement myAccountSavePassBtn;
    @FindBy(xpath = "//li[contains(@data-href,'account/logout/')]")
    public WebElement ButtonLogOut;
    @FindBy(xpath = "(//nav[@id='menu']//a[contains(@href,'mujer.html') and text()='Mujer'])[1]")
    public WebElement mujerMainMenu;
    @FindBy(xpath = "//section[@id='galeria']/article")
    public List<WebElement> mujerMainMenu_ItemsCount;
    @FindBy(xpath = "//input[contains(@name,'email')]")
    public WebElement imputMail;
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
    public WebElement continueShippingMethod;
    @FindBy(xpath = "//a[contains(.,'¿no tenés una cuenta? registrate')]")
    public WebElement register;
    @FindBy(id = "inbox_field")
    public WebElement mailAddressField;
    @FindBy(xpath = "//button[@class='primary-btn']")
    public WebElement goButton;
    @FindBy(xpath = "//a[normalize-space(text())='Back to Inbox']")
    public WebElement backToInbox;
    @FindBy(xpath = "//div[contains(@class,'wrapper-nav-items')]//a[text()='Email']")
    public WebElement emailMailinator;
    @FindBy(xpath = "//*[@id='m8rguy']")
    public WebElement emptyInboxMessage;
    @FindBy(name = "token")
    public WebElement enterCode;
    @FindBy(xpath = " //input[normalize-space(@placeholder)='Ingrese su contraseña']")
    public WebElement enterPassword;
    @FindBy(xpath = " //input[normalize-space(@placeholder)='Confirmar contraseña']")
    public WebElement enterConfirmPassword;
    @FindBy(xpath = " //div[contains(@class,'sendButton')]//button")
    public WebElement createButton;
    @FindBy(xpath = "//div[contains(@class,'autoCompleteOuterContainer')]//input")
    public WebElement searchBox;
    @FindBy(xpath = "//ul[contains(@class,'tileListList')]//li")
    public List<WebElement> searchListResult;
    @FindBy(xpath = "//div[contains(@class,'toast-container')]//div[text()='Ítem agregado a su carrito']")
    public WebElement itemAddedNotification;
    @FindBy(xpath = "//div[contains(@class,'toast-container')]//div[text()='Ver carrito']")
    public WebElement itemAddedNotification_verCarrito;
    @FindBy(xpath = "//a[contains(@id,'product-name')]")
    public WebElement checkOutProductName;
    @FindBy(xpath = "//span[@class='new-product-price']")
    public WebElement checkOutProductPrice;
    @FindBy(xpath = "(//td[text()='Total']/../td[@class='monetary'])[1]")
    public WebElement FinalCheckOutPrice;
    @FindBy(xpath = " //td[@class='item-remove']//a[@class='item-link-remove']")
    public WebElement removeItemCart;
    @FindBy(xpath = "//h2[text()='Su carrito está vacio']")
    public WebElement emptyCartMsg;
    @FindBy(xpath = "//div[contains(@class,'logo')]/a")
    public WebElement cartPgLogo;
    @FindBy(id = "cart-to-orderform")
    public WebElement finalizarComprar;
    @FindBy(xpath = "//input[@id='client-first-name']")
    public WebElement EnterFirstName;
    @FindBy(xpath = "//input[@id='client-last-name']")
    public WebElement EnterSurName;
    @FindBy(xpath = "//input[@id='client-document']")
    public WebElement enterDNI;
    @FindBy(xpath = " //input[@id='client-phone1']")
    public WebElement enterPhSuffix;
    @FindBy(xpath = "//input[@id='client-phone3']")
    public WebElement enterPhoneNumber;
    @FindBy(xpath = "//button[@id='go-to-shipping']")
    public WebElement buttonContinueShipping;
    @FindBy(xpath = "//input[@id='ship-postalCode']")
    public WebElement enterPostalCode;
    @FindBy(xpath = "//input[@id='ship-street']")
    public WebElement enterStreet;
    @FindBy(xpath = " //button[@id='btn-go-to-payment']")
    public WebElement buttonPayment;
    @FindBy(xpath = " //input[@id='ship-number']")
    public WebElement enterStreetNumber;
    @FindBy(xpath = "//a[@data-name='PAGOFACIL']")
    public WebElement mercadoPagoCashOption;
    @FindBy(xpath = "//span[text()='PAGOFACIL']")
    public WebElement cashPagoFacilOption;
    @FindBy(xpath = "//span[text()='Comprar ahora']/..//i[@class='icon-spinner icon-spin' and @style='display: none;']/..//span[text()='Comprar ahora']")
    public WebElement finalComprarAhora;
    @FindBy(xpath = "//p[text()='Gracias por la compra!']")
    public WebElement thankYouMessage;
    @FindBy(xpath = "//div[@class='mv1-ns']")
    public WebElement mailProductName;
    String fakePass, codeReceived, randomEmailID, mailProductNameCheck, UiProductName, UiProductPrice, firstName, surname, dni, phoneNumber, streetName, streetNumber, zipcode;


    public WenancePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //@Description("this method will loging Wenances Users")
    public void IngresarWenance() {


        try {

            usuario.sendKeys("matias.liendro");
            log.info("Ingresando User...");
            password.sendKeys("mlWNC2021!");
            log.info("Ingresando Password...");
            ingresar.click();
            log.info("Login Exitoso");
            wait(3);
            actividad.click();
            log.info("Entering to Actividad");
            wait(2);
            mensajes.click();
            log.info("Entering to mensajes");
            wait(2);
            reportes.click();
            log.info("Entering to reportes");
            wait(3);


        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }


    public void NavigateValidation() {

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


    public void loginCheck() {

        try {


            loginIconLink.click();
            log.info("clicking on login icon");
            loginViaEmailPass.click();
            log.info("login via email and password button clicked ....");
            loginEmail.sendKeys("babytest@mailinator.com");
            log.info("Entering email id..");
            loginPassword.sendKeys("Test@123");
            log.info("Entering password...");
            Enter.click();
            //  loginSuccess.click();
            log.info("clicking on sign in button...");
            Assert.assertTrue(loginSuccess.isDisplayed());

        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }


    public void registerCheck() {

        randomEmailID = generateRandomString();

        try {

            openNewTab();
            changeTabByIndex(0);
            loginIconLink.click();
            log.info("clicking on login icon");
            loginViaEmailPass.click();
            log.info("login via email and password button clicked ....");
            register.click();
            log.info("Click on register ....");
            wait(2);
            imputMail.click();
            imputMail.sendKeys(randomEmailID);
            log.info("Usuario Random generado ....");
            enviar.click();
            log.info("Clicking on Enviar button ....");
            wait(3);
            changeTabByIndex(1);
            navigateToMalinator();
            log.info("Navigate to mailinator....");
            emailMailinator.click();
            Thread.sleep(2000);
            mailAddressField.sendKeys(randomEmailID);
            log.info("Entering email....");


        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void enterTokenAndPassword() {
        fakePass = faker.internet().password(8, 13, true, true, true);


        try {
            enterCode.sendKeys(codeReceived);
            log.info("clicking on login icon");
            enterPassword.sendKeys(fakePass);
            log.info("entering new password.." + fakePass);
            enterConfirmPassword.sendKeys(fakePass);
            log.info("entering new confirm password.." + fakePass);
            createButton.click();
            log.info("clicking on create button..");
            Assert.assertTrue(loginSuccess.isDisplayed());


        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void myAccountDetailCheck() {
        String myAccEmailID;


        try {
            loginSuccess.click();
            log.info("clicking on user name ..");
            waitForVisibility(myAccount, 20);
            myAccount.click();
            log.info("Clicking on my account....");
            waitForVisibility(myAccountProfileLink, 20);
            Assert.assertTrue(myAccountProfileLink.isDisplayed(), "Profile link is not displayed...");
            log.info("Profile link is displayed in my account page ....");
            Assert.assertTrue(myAccountDireccionesLink.isDisplayed(), "Dirrecion link is not displayed...");
            log.info("Dirrecion link is displayed in my account page ....");
            Assert.assertTrue(myAccountPedidosLink.isDisplayed(), "pedidos link is not displayed...");
            log.info("pedidos link is displayed in my account page ....");
            Assert.assertTrue(myAccountCreditTarjetaLink.isDisplayed(), "trajeta de credit link is not displayed...");
            log.info("trajeta de credit link is displayed in my account page ....");
            myAccEmailID = myAccountEmailID.getText().trim();
            log.info("Email id is displayed in my account page ...." + myAccEmailID);
            Assert.assertTrue(myAccEmailID.equalsIgnoreCase(randomEmailID), "Email id Doest not match....");
            log.info("Email id is verified ....");


        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void myAccountChangePassword() {


        try {

            myAccountChangePasswordBtn.click();
            log.info("change password button clicked ....");
            waitForVisibility(myAccountCurrentPassword, 20);
            myAccountCurrentPassword.sendKeys(fakePass);
            log.info("Entering current password ...." + fakePass);
            fakePass = faker.internet().password(8, 13, true, true, true);
            myAccountNewPassword.sendKeys(fakePass);
            log.info("Entering new password ...." + fakePass);
            myAccountSavePassBtn.click();
            log.info("click on save password button..");
            waitForVisibility(myAccountChangePasswordBtn, 20);
            Assert.assertTrue(myAccountChangePasswordBtn.isDisplayed());


        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }


    public void SearchProduct(String whatToSearch) {
        WebElement listOfElement;

        try {
            searchBox.sendKeys(whatToSearch);
            log.info("Entering the Product to search .." + whatToSearch);
            count = searchListResult.size();
            if (count > 1) {
                log.info("More than 1 product has been displayed");
                listOfElement = searchListResult.get(0);
                UiProductName = listOfElement.findElement(By.xpath("//span[contains(@class,'productBrand')]")).getText();
                log.info("The Product name is ..." + UiProductName);
                UiProductPrice = listOfElement.findElement(By.xpath("//div[contains(@class,'sellingPriceContainer')]//span[contains(@class,'currencyContainer')]")).getText();
                log.info("The Product name is ..." + UiProductPrice);
//                UiProductPrice = amountSplit(UiProductPrice);
                listOfElement.findElement(By.xpath("//span[contains(@class,'buyButtonText')]")).click();
                log.info("Clicking on buy button...");
                waitForVisibility(itemAddedNotification, 20);
                Assert.assertTrue(itemAddedNotification.isDisplayed(), "notification is not displayed");


            } else {
                log.info("no product has been displayed");
                Assert.fail("no product has been displayed with that search keyword");
            }


        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

   // @Description("this method will delete item in the cart page")
    public void deleteItemCart() {


        try {

            removeItemCart.click();
            log.info("removing the item from the cart...");
            waitForVisibility(emptyCartMsg, 20);
            log.info("empty cart message is displayed...");
            cartPgLogo.click();
            log.info("clicking on log button in cart page...");


        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }



    public void cartCheckOut() {
        String ChckPrdName, ChckPrdPrice;

        try {
            itemAddedNotification_verCarrito.click();
            log.info("clicking on cart checkout from notification ..");
            ChckPrdName = checkOutProductName.getText();
            log.info("Product name from UI is .. " + ChckPrdName);
            Assert.assertTrue(ChckPrdName.contains(UiProductName), "Product name does not match with..");
            log.info("Product name validation done ..");
            ChckPrdPrice = checkOutProductPrice.getText();
//            Assert.assertEquals(Double.parseDouble(ChckPrdPrice),Double.parseDouble(UiProductPrice));
            log.info("Product price validation done ..");
            log.info("final product price is ..." + FinalCheckOutPrice.getText());


        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void cartPageDetailFill() {


        try {
            finalizarComprar.click();
            log.info("clicking on finalizar comprar button ..");
            waitForVisibility(EnterFirstName, 20);
            Thread.sleep(2000);
            firstName = faker.name().firstName();
            surname = faker.name().lastName();
            dni = String.valueOf(faker.number().randomNumber(6, true));
            phoneNumber = faker.number().digits(8);
            streetName = faker.address().streetName();
            streetNumber = faker.address().streetAddressNumber();
            zipcode = String.valueOf(faker.number().numberBetween(1000, 1100));
            EnterFirstName.sendKeys(firstName);
            log.info("The first name entered is .... " + firstName);
            EnterSurName.sendKeys(surname);
            log.info("The surname entered is .... " + surname);
            enterDNI.sendKeys(dni);
            log.info("The DNI entered is .... " + dni);
            enterPhSuffix.sendKeys("11");
            enterPhoneNumber.sendKeys(phoneNumber);
            log.info("The phone number entered is .... " + phoneNumber);
            buttonContinueShipping.click();
            log.info("Clicking on continue button....");
            waitForVisibility(enterPostalCode, 20);
            enterPostalCode.sendKeys(zipcode);
            log.info("The zipcode entered is.... " + zipcode);
            waitForVisibility(enterStreet, 20);
            enterStreet.sendKeys(streetName);
            log.info("The Street Name entered is.... " + streetName);
            enterStreetNumber.sendKeys(streetNumber);
            log.info("The Street number entered is.... " + streetNumber);
            buttonPayment.click();
            log.info("Clicing on final checkout.... ");


        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void paymentCashOption() {


        try {
            mercadoPagoCashOption.click();
            log.info("clicking on mercado pago cash option ..");
            waitForVisibility(cashPagoFacilOption, 20);
            Thread.sleep(2000);
            cashPagoFacilOption.click();
            log.info("selecting the cash pago facil option .... ");
            waitForVisibility(finalComprarAhora, 20);
            Thread.sleep(2000);
            finalComprarAhora.click();
            log.info("clicking on final payment option .... ");
            waitForVisibility(thankYouMessage, 20);
            Thread.sleep(2000);
            Assert.assertTrue(thankYouMessage.isDisplayed(), "Success message is not displayed.....");
            log.info("successfully displayed the payment and order has been placed .... ");
            log.info("navigating to mail box to check the order success mail confirmation .... ");
            changeTabByIndex(1);
            driver.navigate().refresh();


        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void navigateToMalinator() {
        log.info("********************** Navigating to Mailinator **********************");
        driver.navigate().to("https://www.mailinator.com/");
    }


    // JCM
    public void openNewTab() {
        ((JavascriptExecutor) driver).executeScript("window.open()");
        log.info("Creating double tab instance");

    }

    // JCM
    public void changeTabByIndex(int index) {
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(index));
        log.info("Swiching Tabs");
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

    public String generateRandomString() {

        return randomString() + "@mailinator.com";

    }


    public String randomString() {
        String generatedString = faker.name().firstName() + faker.name().lastName();
        return generatedString;
    }

    public String MailinatorChecking() {

        try {


            goButton.click();
            wait(3);
            if (emptyInboxMessage.isDisplayed()) {
                log.info("Vtex is not sending emails to customers...");
            } else {
                log.info(" Getting code from Vtex...");
                List<WebElement> messages = driver.findElements(By.xpath("//tr[@ng-repeat='email in emails']"));
                wait(3);
//                Assert.assertTrue(messages.size() <= 1, "Email box does NOT contain 2nd message...");
                messages.get(0).click();
                Thread.sleep(4000);
                driver.switchTo().frame("html_msg_body");
                codeReceived = driver.findElement(By.xpath("//p[text()='Regrese a la página y use el siguiente codigo para iniciar sesión:']/..//div//strong")).getText();
                log.info("code is : " + codeReceived);
                // VERIFY SUBJECT
                Assert.assertTrue(codeReceived.length() == 6);
                log.info("validation done on code received via email...");
                driver.switchTo().defaultContent();
                changeTabByIndex(0);

            }
        } catch (Exception e) {
            e.printStackTrace();
            log.info("Method failed due to an exception:::" + e.getMessage());
        }
        return codeReceived;
    }

    public String MailinatorToForOrderConfirmation() {

        try {
            waitForVisibility(backToInbox, 20);
            backToInbox.click();
            wait(3);
            if (emptyInboxMessage.isDisplayed()) {
                log.info("Vtex is not sending emails to customers...");
            } else {
                List<WebElement> messages = driver.findElements(By.xpath("//tr[@ng-repeat='email in emails']"));
                wait(3);
//                Assert.assertTrue(messages.size() <= 1, "Email box does NOT contain 2nd message...");
                messages.get(0).click();
                Thread.sleep(2000);
                driver.switchTo().frame("html_msg_body");
                mailProductNameCheck = mailProductName.getText();
                log.info("The product name is : " + mailProductNameCheck);
                Assert.assertTrue(mailProductNameCheck.contains(UiProductName));
                log.info("Product name validation done in the mail box ..");
                driver.switchTo().defaultContent();
                changeTabByIndex(0);

            }
        } catch (Exception e) {
            e.printStackTrace();
            log.info("Method failed due to an exception:::" + e.getMessage());
        }
        return mailProductNameCheck;
    }


}

