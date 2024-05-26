package TabAgentFunctionalities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EditAgent {
    @FindBy(xpath = "//a[normalize-space()='Agent']")
    WebElement agentTab;

    @FindBy(className = "primaryInputField")
    List<WebElement> agentMobileNumberForSearch;

    @FindBy(xpath = "//button[@id='submit-button']")
    WebElement searchButton;

    @FindBy(className = "primary-border-icon-btn")
    List<WebElement> editButton;

    @FindBy(className = "primaryInputField")
    List<WebElement> agentName;

    @FindBy(className = "primaryInputField")
    List<WebElement> agentMobileNumber;

    @FindBy(className = "primaryInputField")
    List<WebElement> agentEmailAddress;

    @FindBy(className = "primaryInputField")
    List<WebElement> agentPassword;

    @FindBy(className = "primaryInputField")
    List<WebElement> agentNid;

    @FindBy(className = "primaryInputField")
    List<WebElement> agentAddress;

    @FindBy(className = "p-dropdown-label")
    List<WebElement> companyDropdown;

    @FindBy(className = "p-dropdown-item")
    List<WebElement> companyDropdownItem;

    @FindBy(className = "p-dropdown-label")
    List<WebElement> counterDropdown;

    @FindBy(className = "p-dropdown-item")
    List<WebElement> counterDropdownItem;

    @FindBy(className = "p-multiselect-label")
    List<WebElement> routeDropdown;

    @FindBy(className = "p-multiselect-item")
    List<WebElement> routeDropdownItem;

    @FindBy(xpath = "//span[@class='p-multiselect-close-icon pi pi-times']")
    WebElement closeDropdownIcon;

    @FindBy(className = "p-dropdown-label")
    List<WebElement> paymentTypeDropdown;

    @FindBy(className = "p-dropdown-item")
    List<WebElement> paymentTypeDropdownItem;

    @FindBy(className = "dividerFieldInput")
    List<WebElement> commissionRate;

    @FindBy(className = "p-dropdown-label")
    List<WebElement> commissionTypeDropdown;

    @FindBy(className = "p-dropdown-item")
    List<WebElement> commissionTypeDropdownItem;

    @FindBy(className = "p-dropdown-label")
    List<WebElement> ticketLayoutDropdown;

    @FindBy(className = "p-dropdown-item")
    List<WebElement> ticketLayoutDropdownItem;

    @FindBy(className = "text-primaryText")
    List<WebElement> giveAllPermission;

    @FindBy(className = "text-primaryText")
    List<WebElement> phoneNumberRequiredPermissionCompany1;

    @FindBy(className = "text-primaryText")
    List<WebElement> phoneNumberRequiredPermissionCompany2;

    @FindBy(xpath = "//span[normalize-space()='Save changes']")
    WebElement saveChangesButton;

    public EditAgent(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void editExistingAgentWithNoData() throws InterruptedException {
        agentTab.click();
        Thread.sleep(1000);
        agentMobileNumberForSearch.get(0).sendKeys("01888000125");
        Thread.sleep(1000);
        searchButton.click();
        Thread.sleep(1000);
        editButton.get(0).click();
        Thread.sleep(1000);
        saveChangesButton.click();
        Thread.sleep(1000);
    }

    public void editExistingAgentWithData() throws InterruptedException {
        agentTab.click();
        Thread.sleep(1000);
        agentMobileNumberForSearch.get(0).sendKeys("01888000125");
        Thread.sleep(1000);
        searchButton.click();
        Thread.sleep(1000);
        editButton.get(0).click();
        Thread.sleep(1000);
        agentAddress.get(5).clear();
        agentAddress.get(5).sendKeys("Dhaka, Bangladesh");
        Thread.sleep(1000);
        phoneNumberRequiredPermissionCompany1.get(16).click();
        Thread.sleep(1000);
        phoneNumberRequiredPermissionCompany2.get(41).click();
        Thread.sleep(1000);
        saveChangesButton.click();
        Thread.sleep(1000);
    }
}
