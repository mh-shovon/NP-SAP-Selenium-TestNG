package BusCompany;

import Configuration.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EditRoute extends Setup {
    WebDriver driver;
    @FindBy(xpath = "//a[normalize-space()='Bus Company']")
    WebElement busCompanyTab;

    @FindBy(className = "corporate-blue-icon-btn")
    List<WebElement> manageButton;

    @FindBy(className = "companyOwnerTabNonActive")
    List<WebElement> companyRouteTab;

    @FindBy(className = "paginationNextButton")
    List<WebElement> paginationNextButton;

    @FindBy(className = "primary-border-icon-btn")
    List<WebElement> editButton;

    @FindBy(className = "text-primaryText")
    List<WebElement> directionDown;

    @FindBy(className = "corporate-left-icon-btn")
    List<WebElement> saveChangesButton;

    public EditRoute(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void editRoute() throws InterruptedException {
        Thread.sleep(1000);
        busCompanyTab.click();
        Thread.sleep(1000);
        manageButton.get(0).click();
        Thread.sleep(1000);
        companyRouteTab.get(1).click();
        Thread.sleep(1000);
        paginationNextButton.get(0).click();
        Thread.sleep(1000);
        paginationNextButton.get(1).click();
        Thread.sleep(1000);
        editButton.get(0).click();
        Thread.sleep(1000);
        directionDown.get(7).click();
        Thread.sleep(1000);
        saveChangesButton.get(0).click();
        Thread.sleep(1000);
    }


}
