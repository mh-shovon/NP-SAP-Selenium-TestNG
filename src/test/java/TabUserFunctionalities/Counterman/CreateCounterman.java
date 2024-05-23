package TabUserFunctionalities.Counterman;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CreateCounterman {
    @FindBy(xpath = "//a[normalize-space()='User']")
    WebElement userTab;

    @FindBy(className = "companyOwnerTabNonActive")
    List<WebElement> countermanTab;

    @FindBy(className = "p-dropdown-label")
    List<WebElement> operatorDropdown;

    @FindBy(className = "p-dropdown-item")
    List<WebElement> operatorDropdownItem;

    @FindBy(className = "topBarAddButton")
    List<WebElement> addCountermanButton;

    @FindBy(className = "primaryInputField")
    List<WebElement> countermanName;

    @FindBy(className = "primaryInputField")
    List<WebElement> countermanPhone;

    @FindBy(className = "primaryInputField")
    List<WebElement> countermanEmail;

    @FindBy(className = "primaryInputField")
    List<WebElement> countermanPassword;

    @FindBy(className = "p-dropdown-label")
    List<WebElement> counterDropdown;

    @FindBy(className = "p-dropdown-item")
    List<WebElement> selectCounter;

    @FindBy(className = "primaryInputField")
    List<WebElement> routeDropdown;

    @FindBy(className = "text-primaryText")
    List<WebElement> selectRoute;

    @FindBy(className = "corporate-left-icon-btn")
    List<WebElement> selectButton;

    @FindBy(className = "p-dropdown-label")
    List<WebElement> printerTypeDropdown;

    @FindBy(className = "p-dropdown-item")
    List<WebElement> selectPrinterType;

    @FindBy(className = "primaryInputField")
    List<WebElement> countermanNid;

    @FindBy(className = "primaryInputField")
    List<WebElement> countermanAddress;

    @FindBy(className = "p-dropdown-label")
    List<WebElement> pastTripValidateDropDown;

    @FindBy(className = "p-dropdown-item")
    List<WebElement> selectPastTripValidate;

    @FindBy(className = "primaryInputField")
    List<WebElement> countermanMaxDiscountCap;

    @FindBy(className = "primaryInputField")
    List<WebElement> countermanReportAccess;

    @FindBy(className = "text-primaryText")
    List<WebElement> giveAllPermission;

    @FindBy(xpath = "//button[normalize-space()='Create counterman']")
    WebElement createCountermanButton;

    public CreateCounterman(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void createNewCounterman() throws InterruptedException {
        userTab.click();
        Thread.sleep(1000);
        countermanTab.get(2).click();
        Thread.sleep(1000);
        operatorDropdown.get(0).click();
        Thread.sleep(1000);
        operatorDropdownItem.get(0).click();
        Thread.sleep(1000);
        addCountermanButton.get(0).click();
        Thread.sleep(1000);
        countermanName.get(0).sendKeys("Automation Counterman-3");
        Thread.sleep(1000);
        countermanPhone.get(1).sendKeys("01888000207");
        Thread.sleep(1000);
        countermanEmail.get(2).sendKeys("automationcounterman3@gmail.com");
        Thread.sleep(1000);
        countermanPassword.get(3).sendKeys("01888000207");
        Thread.sleep(1000);
        counterDropdown.get(0).click();
        Thread.sleep(1000);
        selectCounter.get(0).click();
        Thread.sleep(1000);
        routeDropdown.get(4).click();
        Thread.sleep(1000);
        selectRoute.get(55).click();
        Thread.sleep(1000);
        selectButton.get(0).click();
        Thread.sleep(1000);
        printerTypeDropdown.get(2).click();
        Thread.sleep(1000);
        selectPrinterType.get(0).click();
        Thread.sleep(1000);
        countermanNid.get(5).sendKeys("01888000207");
        Thread.sleep(1000);
        countermanAddress.get(6).sendKeys("Dhaka");
        Thread.sleep(1000);
        pastTripValidateDropDown.get(5).click();
        Thread.sleep(1000);
        selectPastTripValidate.get(7).click();
        Thread.sleep(1000);
        countermanMaxDiscountCap.get(7).sendKeys(Keys.BACK_SPACE);
        Thread.sleep(1000);
        countermanMaxDiscountCap.get(7).clear();
        Thread.sleep(1000);
        countermanMaxDiscountCap.get(7).sendKeys("100");
        Thread.sleep(1000);
        countermanReportAccess.get(8).sendKeys("30");
        Thread.sleep(1000);
        giveAllPermission.get(3).click();
        Thread.sleep(1000);
        createCountermanButton.click();
    }
}
