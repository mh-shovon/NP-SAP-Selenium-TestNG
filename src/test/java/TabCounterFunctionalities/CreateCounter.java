package TabCounterFunctionalities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CreateCounter {
    @FindBy(xpath = "//a[normalize-space()='Counter']")
    WebElement counterTab;

    @FindBy(className = "topBarAddButton")
    List<WebElement> addCounterButton;

    @FindBy(className = "p-dropdown-label")
    List<WebElement> operatorDropdown;

    @FindBy(className = "p-dropdown-item")
    List<WebElement> operatorDropdownItem;

    @FindBy(xpath = "//input[@placeholder='Enter counter name']")
    WebElement counterName;

    @FindBy(xpath = "//input[@placeholder='Enter counter code']")
    WebElement counterCode;

    @FindBy(xpath = "//span[@aria-label='Select city']")
    WebElement selectCity;

    @FindBy(className = "p-dropdown-item")
    List<WebElement> selectCityDropDownItem;

    @FindBy(xpath = "//span[@aria-label='Select stoppage']")
    WebElement selectStoppage;

    @FindBy(className = "p-dropdown-item")
    List<WebElement> selectStoppageDropDownItem;

    @FindBy(xpath = "//input[@placeholder='Enter mobile number']")
    WebElement counterMobileNumber;

    @FindBy(xpath = "//input[@placeholder='Enter counter address']")
    WebElement counterAddress;

    @FindBy(className = "p-dropdown-label")
    List<WebElement> futureTripValidation;

    @FindBy(className = "p-dropdown-item")
    List<WebElement> futureTripValidationDropDownItem;

    @FindBy(className = "corporateButton")
    List<WebElement> createCounterButton;

    public CreateCounter(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void createNewCounter() throws InterruptedException {
        Thread.sleep(1000);
        counterTab.click();
        Thread.sleep(1000);
        addCounterButton.get(0).click();
        Thread.sleep(1000);
        operatorDropdown.get(0).click();
        Thread.sleep(1000);
        operatorDropdownItem.get(0).click();
        Thread.sleep(1000);
        counterName.sendKeys("Automation Counter-2");
        Thread.sleep(1000);
        counterCode.sendKeys("AC-2");
        Thread.sleep(1000);
        selectCity.click();
        Thread.sleep(1000);
        selectCityDropDownItem.get(0).click();
        Thread.sleep(1000);
        selectStoppage.click();
        Thread.sleep(1000);
        selectStoppageDropDownItem.get(0).click();
        Thread.sleep(1000);
        counterMobileNumber.sendKeys("01888000312");
        Thread.sleep(1000);
        counterAddress.sendKeys("Gabtoli, Dhaka");
        Thread.sleep(1000);
        futureTripValidation.get(3).click();
        Thread.sleep(1000);
        futureTripValidationDropDownItem.get(7).click();
        Thread.sleep(1000);
        createCounterButton.get(0).click();
        Thread.sleep(1000);
    }
}
