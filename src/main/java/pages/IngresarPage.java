package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import utilities.*;

import java.util.List;

public class IngresarPage extends Driver {

    public IngresarPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

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

    By PopupEmail = By.xpath("//*[@id='email']");
    By PopupBtn = By.xpath("//*[@id='popup-newsletter']/button");
    By LoginBtn = By.xpath("//*[@id='header-user']/button");


    public String lnk_sale = "//li[@id='cat-sale']//div//a";
    public String lnk_footer = "//footer//li//a";

    public void hoverToWebElement(WebDriver driver, WebElement webElement) {
        Actions builder = new Actions(driver);
        Action mouseOver = builder
                .moveToElement(webElement)
                .build();
        mouseOver.perform();
    }

    public List<WebElement> getDataFromComponent(WebDriver driver, String locator) {
        List<WebElement> data = driver.findElements(By.xpath(locator));
        return data;
    }

    public void welpLogin() {
        try {
            wait(3);
            dni.sendKeys("31433335");
            continuar.click();

        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }
}


