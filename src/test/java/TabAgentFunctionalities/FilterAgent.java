package TabAgentFunctionalities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FilterAgent {
    @FindBy(xpath = "//a[normalize-space()='Agent']")
    WebElement agentTab;

    @FindBy(xpath = "//i[@class='p-dropdown-clear-icon pi pi-times']")
    WebElement operatorDropdownClear;

    @FindBy(className = "p-dropdown-label")
    List<WebElement> operatorDropdown;

    @FindBy(className = "p-dropdown-item")
    List<WebElement> operatorDropdownItem;

    @FindBy(className = "p-dropdown-label")
    List<WebElement> paymentTypeDropdown;

    @FindBy(className = "p-dropdown-item")
    List<WebElement> paymentTypeDropdownItem;

    @FindBy(className = "primaryInputField")
    List<WebElement> agentMobileNumber;

    @FindBy(xpath = "//button[@id='submit-button']")
    WebElement searchButton;

    public FilterAgent(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void filterAgentWithNoData() throws InterruptedException {
        agentTab.click();
        Thread.sleep(1000);
        operatorDropdownClear.click();
        Thread.sleep(1000);
        searchButton.click();
        Thread.sleep(1000);
    }
    public void filterAgentWithOperator() throws InterruptedException {
        agentTab.click();
        Thread.sleep(1000);
        operatorDropdownClear.click();
        Thread.sleep(1000);
        operatorDropdown.get(0).click();
        Thread.sleep(1000);
        operatorDropdownItem.get(1).click();
        Thread.sleep(1000);
        searchButton.click();
        Thread.sleep(1000);
    }

    public void filterAgentWithPaymentType() throws InterruptedException {
        agentTab.click();
        Thread.sleep(1000);
        operatorDropdownClear.click();
        Thread.sleep(1000);
        paymentTypeDropdown.get(1).click();
        Thread.sleep(1000);
        paymentTypeDropdownItem.get(0).click();
        Thread.sleep(1000);
        searchButton.click();
        Thread.sleep(1000);
    }

    public void filterAgentWithMobileNumber() throws InterruptedException {
        agentTab.click();
        Thread.sleep(1000);
        operatorDropdownClear.click();
        Thread.sleep(1000);
        agentMobileNumber.get(0).sendKeys("01888000121");
        Thread.sleep(1000);
        searchButton.click();
        Thread.sleep(1000);
    }

    public void filterAgentWithAllData() throws InterruptedException {
        agentTab.click();
        Thread.sleep(1000);
        paymentTypeDropdown.get(1).click();
        Thread.sleep(1000);
        paymentTypeDropdownItem.get(1).click();
        Thread.sleep(1000);
        agentMobileNumber.get(0).sendKeys("01888000200");
        Thread.sleep(1000);
        searchButton.click();
        Thread.sleep(1000);
    }
}
