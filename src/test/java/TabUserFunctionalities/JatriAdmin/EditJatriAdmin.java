package TabUserFunctionalities.JatriAdmin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EditJatriAdmin {
    @FindBy(xpath = "//a[normalize-space()='User']")
    WebElement userTab;

    @FindBy(className = "companyOwnerTabNonActive")
    List<WebElement> jatriAdminTab;

    @FindBy(className = "primary-border-icon-btn")
    List<WebElement> editJatriAdminBtn;

    @FindBy(className = "primaryInputField")
    List<WebElement> adminName;

    @FindBy(className = "primaryInputField")
    List<WebElement> adminDesignation;

    @FindBy(className = "primaryInputField")
    List<WebElement> adminMobileNumber;

    @FindBy(className = "primaryInputField")
    List<WebElement> adminEmailAddress;

    @FindBy(className = "primaryInputField")
    List<WebElement> adminPassword;

    @FindBy(className = "primaryInputField")
    List<WebElement> adminNid;

    @FindBy(className = "primaryInputField")
    List<WebElement> adminAddress;

    @FindBy(className = "text-primaryText")
    List<WebElement> messageConfigurationPermissionCheckbox;

    @FindBy(xpath = "//span[normalize-space()='Save changes']")
    WebElement saveChangesButton;

    public EditJatriAdmin(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void editExistingJatriAdmin() throws InterruptedException {
        userTab.click();
        Thread.sleep(1000);
        jatriAdminTab.get(1).click();
        Thread.sleep(1000);
        editJatriAdminBtn.get(2).click();
        Thread.sleep(1000);
        adminEmailAddress.get(3).clear();
        adminEmailAddress.get(3).sendKeys("automationjatriadmin1@gmail.com");
        Thread.sleep(1000);
        adminNid.get(5).clear();
        adminNid.get(5).sendKeys("01888000134");
        Thread.sleep(1000);
        adminAddress.get(6).clear();
        adminAddress.get(6).sendKeys("Dhaka");
        Thread.sleep(1000);
        messageConfigurationPermissionCheckbox.get(77).click();
        Thread.sleep(1000);
        saveChangesButton.click();
        Thread.sleep(1000);
    }
}
