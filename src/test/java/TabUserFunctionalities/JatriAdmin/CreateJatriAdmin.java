package TabUserFunctionalities.JatriAdmin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CreateJatriAdmin {
    @FindBy(xpath = "//a[normalize-space()='User']")
    WebElement userTab;

    @FindBy(className = "companyOwnerTabNonActive")
    List<WebElement> jatriAdminTab;

    @FindBy(xpath = "//span[normalize-space()='Add Jatri Admin']")
    WebElement addJatriAdminButton;

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
    List<WebElement> giveAllPermissionCheckbox;

    @FindBy(xpath = "//button[normalize-space()='Create jatri admin']")
    WebElement createJatriAdminButton;

    public CreateJatriAdmin(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void createNewJatriAdmin() throws InterruptedException {
        userTab.click();
        Thread.sleep(1000);
        jatriAdminTab.get(1).click();
        Thread.sleep(1000);
        addJatriAdminButton.click();
        Thread.sleep(1000);
        adminName.get(0).sendKeys("Automation Jatri Admin-2");
        Thread.sleep(1000);
        adminDesignation.get(1).sendKeys("Admin");
        Thread.sleep(1000);
        adminMobileNumber.get(2).sendKeys("01888000134");
        Thread.sleep(1000);
        adminPassword.get(4).sendKeys("01888000134");
        Thread.sleep(1000);
        giveAllPermissionCheckbox.get(3).click();
        Thread.sleep(1000);
        createJatriAdminButton.click();
        Thread.sleep(1000);
    }
}
