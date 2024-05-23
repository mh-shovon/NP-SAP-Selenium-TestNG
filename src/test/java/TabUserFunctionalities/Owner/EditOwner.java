package TabUserFunctionalities.Owner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EditOwner {
    @FindBy(xpath = "//a[normalize-space()='User']")
    WebElement userTab;

    @FindBy(className = "p-dropdown-label")
    List<WebElement> ownerDropdown;

    @FindBy(className = "p-dropdown-item")
    List<WebElement> ownerDropdownItem;

    @FindBy(xpath = "//button[@id='submit-button']")
    WebElement searchButton;

    @FindBy(className = "primary-border-icon-btn")
    List<WebElement> editButton;

    @FindBy(className = "primaryInputField")
    List<WebElement> ownerName;

    @FindBy(className = "primaryInputField")
    List<WebElement> ownerMobile;

    @FindBy(className = "primaryInputField")
    List<WebElement> ownerEmailAddress;

    @FindBy(className = "primaryInputField")
    List<WebElement> ownerPassword;

    @FindBy(className = "text-primaryText")
    List<WebElement> generateBillPermissionCheckbox;

    @FindBy(xpath = "//span[normalize-space()='Save changes']")
    WebElement saveChangesButton;

    public EditOwner(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void editExistingOwner() throws InterruptedException {
        userTab.click();
        Thread.sleep(1000);
        ownerDropdown.get(0).click();
        Thread.sleep(1000);
        ownerDropdownItem.get(0).click();
        Thread.sleep(1000);
        searchButton.click();
        Thread.sleep(1000);
        editButton.get(6).click();
        Thread.sleep(1000);
        ownerEmailAddress.get(2).clear();
        ownerEmailAddress.get(2).sendKeys("automationowner-1@gmail.com");
        Thread.sleep(1000);
        generateBillPermissionCheckbox.get(44).click();
        Thread.sleep(1000);
        saveChangesButton.click();
        Thread.sleep(1000);
    }
}
