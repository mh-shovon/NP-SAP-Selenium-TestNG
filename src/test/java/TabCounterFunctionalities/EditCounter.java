package TabCounterFunctionalities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EditCounter {
    @FindBy(xpath = "//a[normalize-space()='Counter']")
    WebElement counterTab;

    @FindBy(className = "p-dropdown-label")
    List<WebElement> operatorDropdown;

    @FindBy(className = "p-dropdown-item")
    List<WebElement> operatorDropdownItem;

    @FindBy(xpath = "//span[normalize-space()='Search']")
    WebElement searchButton;

    @FindBy(xpath = "//button[normalize-space()='14']")
    WebElement page14Button;

    @FindBy(className = "primary-border-icon-btn")
    List<WebElement> editButton;

    @FindBy(xpath = "//input[@placeholder='Enter counter code']")
    WebElement counterCode;

    @FindBy(xpath = "//button[normalize-space()='Update counter']")
    WebElement updateCounterButton;

    public EditCounter(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void editExistingCounter() throws InterruptedException {
        Thread.sleep(1000);
        counterTab.click();
        Thread.sleep(1000);
        operatorDropdown.get(0).click();
        Thread.sleep(1000);
        operatorDropdownItem.get(0).click();
        Thread.sleep(1000);
        searchButton.click();
        Thread.sleep(1000);
        page14Button.click();
        Thread.sleep(1000);
        editButton.get(5).click();
        Thread.sleep(1000);
        counterCode.clear();
        counterCode.sendKeys("AC-1");
        Thread.sleep(1000);
        updateCounterButton.click();
        Thread.sleep(1000);

    }
}
