package TabRoutesFunctionalities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FilterRoute {
    @FindBy(xpath = "//a[normalize-space()='Routes']")
    WebElement routesTab;

    @FindBy(className = "p-dropdown-label")
    List<WebElement> operatorDropdown;

    @FindBy(className = "p-dropdown-item")
    List<WebElement> operatorDropdownItem;

    @FindBy(className = "p-dropdown-label")
    List<WebElement> originCityDropdown;

    @FindBy(className = "p-dropdown-item")
    List<WebElement> originCityDropdownItem;

    @FindBy(className = "p-dropdown-label")
    List<WebElement> destinationCityDropdown;

    @FindBy(className = "p-dropdown-item")
    List<WebElement> destinationCityDropdownItem;

    @FindBy(xpath = "//span[normalize-space()='Search']")
    WebElement searchButton;

    public FilterRoute(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void filterWithNoData() throws InterruptedException {
        routesTab.click();
        Thread.sleep(1000);
        searchButton.click();
        Thread.sleep(1000);
    }

    public void filterWithOperator() throws InterruptedException {
        routesTab.click();
        Thread.sleep(1000);
        operatorDropdown.get(0).click();
        Thread.sleep(1000);
        operatorDropdownItem.get(0).click();
        Thread.sleep(1000);
        searchButton.click();
        Thread.sleep(1000);
    }

    public void filterWithOperatorAndOriginCity() throws InterruptedException {
        routesTab.click();
        Thread.sleep(1000);
        operatorDropdown.get(0).click();
        Thread.sleep(1000);
        operatorDropdownItem.get(0).click();
        Thread.sleep(1000);
        originCityDropdown.get(1).click();
        Thread.sleep(1000);
        originCityDropdownItem.get(0).click();
        Thread.sleep(1000);
        searchButton.click();
        Thread.sleep(1000);
    }

    public void filterWithOperatorAndDestinationCity() throws InterruptedException {
        routesTab.click();
        Thread.sleep(1000);
        operatorDropdown.get(0).click();
        Thread.sleep(1000);
        operatorDropdownItem.get(0).click();
        Thread.sleep(1000);
        destinationCityDropdown.get(2).click();
        Thread.sleep(1000);
        destinationCityDropdownItem.get(3).click();
        Thread.sleep(1000);
        searchButton.click();
        Thread.sleep(1000);
    }

    public void filterWithAllData() throws InterruptedException {
        routesTab.click();
        Thread.sleep(1000);
        operatorDropdown.get(0).click();
        Thread.sleep(1000);
        operatorDropdownItem.get(0).click();
        Thread.sleep(1000);
        originCityDropdown.get(1).click();
        Thread.sleep(1000);
        originCityDropdownItem.get(0).click();
        Thread.sleep(1000);
        destinationCityDropdown.get(2).click();
        Thread.sleep(1000);
        destinationCityDropdownItem.get(3).click();
        Thread.sleep(1000);
        searchButton.click();
        Thread.sleep(1000);
    }
}

