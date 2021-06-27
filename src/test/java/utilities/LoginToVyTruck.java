package utilities;

import pages.VyTruckLoginPage;

public class LoginToVyTruck {

    public static void login_to_fleetManagement(){

        Driver.getDriver().get(ConfigurationReader.getProperty("vyTruckUrl"));

        VyTruckLoginPage loginPage = new VyTruckLoginPage();

        loginPage.inputUserName.sendKeys(ConfigurationReader.getProperty("username_truckDriver1"));

        loginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("password"));

        loginPage.logInButton.click();
    }
}
