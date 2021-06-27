package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.VyTruckFleetVehiclesPage;
import utilities.Driver;
import utilities.LoginToVyTruck;

public class VyTruckTest {

    @BeforeMethod
    public void login(){
        LoginToVyTruck.login_to_fleetManagement();
    }

    @AfterMethod
    public void tearDown(){
        Driver.getDriver().quit();
    }

    @Test
    public void AC2(){

        /**
         TS: As a driver when I am on Vytrack => Fleet => Vehicles,
         I should be able to see Export Grid dropdown is on the left of the page

         TC:
         Given driver on user account home page
         When driver navigate to Fleet
         Then driver click on Fleet
         And driver click on Vehicles
         Then driver should be able to see Export Grid dropdown is on the left of the page
         */

        VyTruckFleetVehiclesPage vehiclesPage = new VyTruckFleetVehiclesPage();

        vehiclesPage.fleet.click();

        vehiclesPage.vehicles.click();

        String exportGridAttribute = vehiclesPage.exportGrid.getAttribute("class");

        Assert.assertTrue(exportGridAttribute.contains("left"));


    }



}
