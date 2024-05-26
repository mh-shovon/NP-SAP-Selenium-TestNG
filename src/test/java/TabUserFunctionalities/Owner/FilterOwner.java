package TabUserFunctionalities.Owner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FilterOwner {
    @FindBy(xpath = "//a[normalize-space()='User']")
    WebElement userTab;

    @FindBy(className = "p-dropdown-label")
    List<WebElement> operatorDropdown;

    @FindBy(className = "p-dropdown-item")
    List<WebElement> operatorDropdownItem;

    @FindBy(xpath = "//input[@placeholder='Enter name']")
    WebElement ownerName;

    @FindBy(xpath = "//input[@placeholder='Enter mobile number']")
    WebElement ownerMobile;

    @FindBy(xpath = "//button[@id='submit-button']")
    WebElement searchButton;

    public FilterOwner(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void filterOwnerWithNoData() throws InterruptedException {
        userTab.click();
        Thread.sleep(1000);
        searchButton.click();
    }

    public void filterOwnerWithOperator() throws InterruptedException {
        userTab.click();
        Thread.sleep(1000);
        operatorDropdown.get(0).click();
        Thread.sleep(1000);
        operatorDropdownItem.get(0).click();
        Thread.sleep(1000);
        searchButton.click();
        Thread.sleep(1000);
    }

    public void filterOwnerWithOwnerName() throws InterruptedException {
        userTab.click();
        Thread.sleep(1000);
        ownerName.sendKeys("Owner-1");
        Thread.sleep(1000);
        searchButton.click();
    }

    public void filterOwnerWithOwnerMobile() throws InterruptedException {
        userTab.click();
        Thread.sleep(1000);
        ownerName.clear();
        Thread.sleep(1000);
        ownerMobile.sendKeys("01888000002");
        Thread.sleep(1000);
        searchButton.click();
        Thread.sleep(1000);
    }

    public void filterOwnerWithAllData() throws InterruptedException {
        userTab.click();
        Thread.sleep(1000);
        operatorDropdown.get(0).click();
        Thread.sleep(1000);
        operatorDropdownItem.get(0).click();
        Thread.sleep(1000);
        ownerName.clear();
        ownerName.sendKeys("Owner-1");
        Thread.sleep(1000);
        ownerMobile.clear();
        ownerMobile.sendKeys("01888000002");
        Thread.sleep(1000);
        searchButton.click();
        Thread.sleep(1000);
    }
}
