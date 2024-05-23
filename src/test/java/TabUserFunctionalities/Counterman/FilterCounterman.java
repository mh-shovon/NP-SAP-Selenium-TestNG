package TabUserFunctionalities.Counterman;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FilterCounterman {
    @FindBy(xpath = "//a[normalize-space()='User']")
    WebElement userTab;

    @FindBy(className = "companyOwnerTabNonActive")
    List<WebElement> countermanTab;

    @FindBy(className = "p-dropdown-label")
    List<WebElement> ownerDropdown;

    @FindBy(className = "p-dropdown-item")
    List<WebElement> ownerDropdownItem;

    @FindBy(xpath = "//i[@class='p-dropdown-clear-icon pi pi-times']")
    WebElement dropdownClearIcon;

    @FindBy(xpath = "//input[@placeholder='Enter name']")
    WebElement countermanName;

    @FindBy(xpath = "//input[@placeholder='Enter mobile number']")
    WebElement countermanMobile;

    @FindBy(xpath = "//button[@id='submit-button']")
    WebElement searchButton;

    public FilterCounterman(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void filterCountermanWithNoData() throws InterruptedException {
        userTab.click();
        Thread.sleep(1000);
        countermanTab.get(2).click();
        Thread.sleep(1000);
        searchButton.click();
    }

    public void filterCountermanWithOperator() throws InterruptedException {
        userTab.click();
        Thread.sleep(1000);
        countermanTab.get(2).click();
        Thread.sleep(1000);
        ownerDropdown.get(0).click();
        Thread.sleep(1000);
        ownerDropdownItem.get(0).click();
        Thread.sleep(1000);
        searchButton.click();
        Thread.sleep(1000);
    }

    public void filterCountermanWithCountermanName() throws InterruptedException {
        userTab.click();
        Thread.sleep(1000);
        countermanTab.get(2).click();
        Thread.sleep(1000);
        countermanName.sendKeys("CM.Gabtoli Counter(1)-1");
        Thread.sleep(1000);
        searchButton.click();
    }

    public void filterCountermanWithCountermanMobile() throws InterruptedException {
        userTab.click();
        Thread.sleep(1000);
        countermanTab.get(2).click();
        Thread.sleep(1000);
        countermanMobile.sendKeys("01888000062");
        Thread.sleep(1000);
        searchButton.click();
        Thread.sleep(1000);
    }

    public void filterCountermanWithAllData() throws InterruptedException {
        userTab.click();
        Thread.sleep(1000);
        countermanTab.get(2).click();
        Thread.sleep(1000);
        ownerDropdown.get(0).click();
        Thread.sleep(1000);
        ownerDropdownItem.get(0).click();
        Thread.sleep(1000);
        countermanName.sendKeys("Automation Counterman-1");
        Thread.sleep(1000);
        countermanMobile.sendKeys("01888000205");
        Thread.sleep(1000);
        searchButton.click();
        Thread.sleep(1000);
    }

}
