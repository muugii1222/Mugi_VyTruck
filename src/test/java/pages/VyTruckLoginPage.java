package pages;

import org.omg.CORBA.DynAnyPackage.Invalid;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class VyTruckLoginPage {

    public VyTruckLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "prependedInput")
    public WebElement inputUserName;

    @FindBy(id = "prependedInput2")
    public WebElement inputPassword;

    @FindBy(xpath = "//span[@class='custom-checkbox__icon']")
    public WebElement rememberMeOnThisComputer;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement logInButton;

    @FindBy(linkText = "Forgot your password?")
    public WebElement ForgotYourPassword;

    @FindBy(xpath = "//div[.='Invalid user name or password.']")
    public WebElement InvalidUserNameOrPassword;

}
