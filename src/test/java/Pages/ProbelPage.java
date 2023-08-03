package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProbelPage {

    public ProbelPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="txtKA")
    public WebElement username;
    @FindBy(id="txtSF")
    public WebElement password;
    @FindBy(xpath="//input[@id='txtWSF']")
    public WebElement webpassword;
    @FindBy(id="btnLogin")
    public WebElement loginButton;
    @FindBy(xpath="//a[@title='Hasta Kayıt(F6)']")
    public WebElement patient;
    @FindBy(xpath="//input[@id='TXT_HASTA_KAYIT_ANA_KURUM_KODU']")
    public WebElement institution;
    @FindBy(xpath="//input[@id='TXT_HASTA_KAYIT_ALT_KURUM_KODU']")
    public WebElement institutionDetails;
    @FindBy(xpath="//label[normalize-space()='Hasta Türü']")
    public WebElement patientType;


}
