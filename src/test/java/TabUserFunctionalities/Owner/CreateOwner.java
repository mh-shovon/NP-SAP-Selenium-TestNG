package TabUserFunctionalities.Owner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CreateOwner {
    @FindBy(xpath = "//a[normalize-space()='Bus Company']")
    WebElement busCompanyTab;

    @FindBy(className = "corporate-blue-icon-btn")
    List<WebElement> manageButton;

    @FindBy(className = "companyOwnerTabNonActive")
    List<WebElement> companyOwnerTab;

    @FindBy(xpath = "//span[normalize-space()='Add User']")
    WebElement addOwnerButton;

    @FindBy(className = "primaryInputField")
    List<WebElement> ownerName;

    @FindBy(className = "primaryInputField")
    List<WebElement> ownerMobile;

    @FindBy(className = "primaryInputField")
    List<WebElement> ownerEmailAddress;

    @FindBy(className = "primaryInputField")
    List<WebElement> ownerPassword;

    @FindBy(className = "p-dropdown-label")
    List<WebElement> userTypeDropdown;

    @FindBy(className = "p-dropdown-item")
    List<WebElement> userDropdownItem;

    @FindBy(className = "text-primaryText")
    List<WebElement> allPermission;

    @FindBy(xpath = "//button[normalize-space()='Create owner']")
    WebElement createOwnerButton;

    public CreateOwner(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void createNewOwner() throws InterruptedException {
        busCompanyTab.click();
        Thread.sleep(1000);
        manageButton.get(0).click();
        Thread.sleep(1000);
        companyOwnerTab.get(0).click();
        Thread.sleep(1000);
        addOwnerButton.click();
        Thread.sleep(1000);
        ownerName.get(0).sendKeys("Automation Owner-2");
        Thread.sleep(1000);
        ownerMobile.get(1).sendKeys("01888000009");
        Thread.sleep(1000);
        ownerEmailAddress.get(2).sendKeys("automationowner2@gmail.com");
        Thread.sleep(1000);
        ownerPassword.get(3).sendKeys("01888000009");
        Thread.sleep(1000);
        userTypeDropdown.get(1).click();
        Thread.sleep(1000);
        userDropdownItem.get(0).click();
        Thread.sleep(1000);
        allPermission.get(3).click();
        Thread.sleep(1000);
        createOwnerButton.click();
        Thread.sleep(1000);
    }
}
