package TabRoutesFunctionalities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CreateRoute {
    @FindBy(xpath = "//a[normalize-space()='Routes']")
    WebElement routesTab;

    @FindBy(xpath = "//span[normalize-space()='Add Route']")
    WebElement addRouteButton;

    @FindBy(className = "p-dropdown-label")
    List<WebElement> originCityDropdown;

    @FindBy(className = "p-dropdown-item")
    List<WebElement> originCityDropdownItem;

    @FindBy(className = "p-dropdown-label")
    List<WebElement> destinationCityDropdown;

    @FindBy(className = "p-dropdown-item")
    List<WebElement> destinationCityDropdownItem;

    @FindBy(className = "text-primaryText")
    List<WebElement> directionUp;

    @FindBy(className = "corporateButton")
    List<WebElement> createRoute;

    public CreateRoute(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void checkExistingRoute() throws InterruptedException {
        Thread.sleep(1000);
        routesTab.click();
        Thread.sleep(1000);
        addRouteButton.click();
        Thread.sleep(1000);
        originCityDropdown.get(0).click();
        Thread.sleep(1000);
        originCityDropdownItem.get(0).click();
        Thread.sleep(1000);
        destinationCityDropdown.get(1).click();
        Thread.sleep(1000);
        destinationCityDropdownItem.get(3).click();
        Thread.sleep(1000);
        directionUp.get(6).click();
        Thread.sleep(1000);
        createRoute.get(0).click();
        Thread.sleep(1000);
    }
    public void createNewRoute() throws InterruptedException {
        routesTab.click();
        Thread.sleep(1000);
        addRouteButton.click();
        Thread.sleep(1000);
        originCityDropdown.get(0).click();
        Thread.sleep(1000);
        originCityDropdownItem.get(0).click();
        Thread.sleep(1000);
        destinationCityDropdown.get(1).click();
        Thread.sleep(1000);
        destinationCityDropdownItem.get(16).click();
        Thread.sleep(1000);
        directionUp.get(6).click();
        Thread.sleep(1000);
        createRoute.get(0).click();
        Thread.sleep(1000);
    }
}
