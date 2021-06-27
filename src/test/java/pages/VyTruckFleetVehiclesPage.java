package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class VyTruckFleetVehiclesPage {

    public VyTruckFleetVehiclesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[@class='title title-level-1'])[1]")
    public WebElement fleet;

    @FindBy(linkText = "Vehicles")
    public WebElement vehicles;

    @FindBy(xpath = "//div[@class='pull-left grid-toolbar-mass-actions']")
    public WebElement exportGrid;

    @FindBy(xpath = "//div[@class='pull-right grid-toolbar-tools']//following-sibling::div[@class='btn-group']")
    public WebElement viewPerPageDropdown;

    @FindBy(xpath = "//a[@title='CSV']")
    public WebElement csv;

    @FindBy(xpath = "//a[@title='XLSX']")
    public WebElement xlsx;

    @FindBy(xpath = "//div[@class='message']")
    public WebElement exportSuccessMessage;

    @FindBy(xpath = "//div[@class='pull-right grid-toolbar-tools']//following-sibling::div[@class='btn-group']")
    public WebElement filterButton;

}
