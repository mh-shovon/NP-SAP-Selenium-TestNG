package TabUserFunctionalities.Counterman;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EditCounterman {
    @FindBy(xpath = "//a[normalize-space()='User']")
    WebElement userTab;

    @FindBy(className = "companyOwnerTabNonActive")
    List<WebElement> countermanTab;

    @FindBy(className = "p-dropdown-label")
    List<WebElement> operatorDropdown;

    @FindBy(className = "p-dropdown-item")
    List<WebElement> operatorDropdownItem;

    @FindBy(xpath = "//button[@id='submit-button']")
    WebElement searchButton;

    @FindBy(xpath = "//button[normalize-space()='4']")
    WebElement countermanPage4;

    @FindBy(className = "primary-border-icon-btn")
    List<WebElement> countermanEditButton;

    @FindBy(className = "primaryInputField")
    List<WebElement> countermanEmail;

    @FindBy(className = "primaryInputField")
    List<WebElement> countermanNid;

    @FindBy(className = "primaryInputField")
    List<WebElement> countermanAddress;

    @FindBy(xpath = "//span[normalize-space()='Save changes']")
    WebElement countermanSaveChangesButton;

    public EditCounterman(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void editExistingCounterman() throws InterruptedException {
        Thread.sleep(1000);
        userTab.click();
        Thread.sleep(1000);
        operatorDropdown.get(0).click();
        Thread.sleep(1000);
        operatorDropdownItem.get(0).click();
        Thread.sleep(1000);
        searchButton.click();
        Thread.sleep(1000);
        countermanPage4.click();
        Thread.sleep(1000);
        countermanEditButton.get(3).click();
        Thread.sleep(1000);
        countermanEmail.get(2).clear();
        countermanEmail.get(2).sendKeys("automation-1@gmail.com");
        Thread.sleep(1000);
        countermanNid.get(5).clear();
        countermanNid.get(5).sendKeys("01888000205");
        Thread.sleep(1000);
        countermanAddress.get(6).clear();
        countermanAddress.get(6).sendKeys("Dhaka");
        Thread.sleep(1000);
        countermanSaveChangesButton.click();
        Thread.sleep(1000);
    }
}
