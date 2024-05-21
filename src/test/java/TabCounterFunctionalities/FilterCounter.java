package TabCounterFunctionalities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FilterCounter {

    @FindBy(xpath = "//a[normalize-space()='Counter']")
    WebElement counterTab;

    @FindBy(className = "p-dropdown-label")
    List<WebElement> operatorDropdown;

    @FindBy(className = "p-dropdown-item")
    List<WebElement> operatorDropdownItem;

    @FindBy(className = "p-dropdown-label")
    List<WebElement> counterTypeDropdown;

    @FindBy(className = "p-dropdown-item")
    List<WebElement> counterTypeDropdownItem;

    @FindBy(xpath = "//input[@id='counter-name']")
    WebElement counterName;

    @FindBy(className = "p-dropdown-label")
    List<WebElement> stoppageDropdown;

    @FindBy(className = "p-dropdown-item")
    List<WebElement> stoppageDropdownItem;

    @FindBy(xpath = "//button[@id='submit-button']")
    WebElement searchButton;

    public FilterCounter(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void filterWithNoData() throws InterruptedException {
        counterTab.click();
        Thread.sleep(1000);
        searchButton.click();
        Thread.sleep(1000);
    }

    public void filterWithOperator() throws InterruptedException {
        counterTab.click();
        Thread.sleep(1000);
        operatorDropdown.get(0).click();
        Thread.sleep(1000);
        operatorDropdownItem.get(0).click();
        Thread.sleep(1000);
        searchButton.click();
        Thread.sleep(1000);
    }

    public void filterWithOperatorAndCounterType() throws InterruptedException {
        counterTab.click();
        Thread.sleep(1000);
        operatorDropdown.get(0).click();
        Thread.sleep(1000);
        operatorDropdownItem.get(0).click();
        Thread.sleep(1000);
        counterTypeDropdown.get(1).click();
        Thread.sleep(1000);
        counterTypeDropdownItem.get(0).click();
        Thread.sleep(1000);
        searchButton.click();
        Thread.sleep(1000);
    }

    public void filterWithOperatorAndCounterName() throws InterruptedException {
        counterTab.click();
        Thread.sleep(1000);
        operatorDropdown.get(0).click();
        Thread.sleep(1000);
        operatorDropdownItem.get(0).click();
        Thread.sleep(1000);
        counterName.sendKeys("Automation Counter-1");
        Thread.sleep(1000);
        searchButton.click();
        Thread.sleep(1000);
    }

    public void filterWithOperatorAndStoppage() throws InterruptedException {
        counterTab.click();
        Thread.sleep(1000);
        operatorDropdown.get(0).click();
        Thread.sleep(1000);
        operatorDropdownItem.get(0).click();
        Thread.sleep(1000);
        stoppageDropdown.get(2).click();
        Thread.sleep(1000);
        stoppageDropdownItem.get(0).click();
        Thread.sleep(1000);
        searchButton.click();
        Thread.sleep(1000);
    }

    public void filterWithAllData() throws InterruptedException {
        counterTab.click();
        Thread.sleep(1000);
        operatorDropdown.get(0).click();
        Thread.sleep(1000);
        operatorDropdownItem.get(0).click();
        Thread.sleep(1000);
        counterTypeDropdown.get(1).click();
        Thread.sleep(1000);
        counterTypeDropdownItem.get(0).click();
        Thread.sleep(1000);
        counterName.sendKeys("Automation Counter-1");
        Thread.sleep(1000);
        stoppageDropdown.get(2).click();
        Thread.sleep(1000);
        stoppageDropdownItem.get(0).click();
        Thread.sleep(1000);
        searchButton.click();
        Thread.sleep(1000);
    }
}
