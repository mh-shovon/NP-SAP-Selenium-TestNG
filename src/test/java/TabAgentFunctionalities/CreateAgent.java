package TabAgentFunctionalities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CreateAgent {
    @FindBy(xpath = "//a[normalize-space()='Agent']")
    WebElement agentTab;

    @FindBy(xpath = "//span[normalize-space()='Add agent']")
    WebElement addAgentButton;

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

    @FindBy(xpath = "//button[normalize-space()='Create agent']")
    WebElement createAgentButton;

    public CreateAgent(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void createNewAgentWithNoData() throws InterruptedException {
        agentTab.click();
        Thread.sleep(1000);
        addAgentButton.click();
        Thread.sleep(1000);
        createAgentButton.click();
        Thread.sleep(1000);
    }

    public void createNewAgent() throws InterruptedException {
        agentTab.click();
        Thread.sleep(1000);
        addAgentButton.click();
        Thread.sleep(1000);
        agentName.get(0).sendKeys("Automation Agent-2");
        Thread.sleep(1000);
        agentMobileNumber.get(1).sendKeys("01888000126");
        Thread.sleep(1000);
        agentPassword.get(3).sendKeys("01888000126");
        Thread.sleep(1000);
        companyDropdown.get(1).click();
        Thread.sleep(1000);
        companyDropdownItem.get(0).click();
        Thread.sleep(1000);
        counterDropdown.get(2).click();
        Thread.sleep(1000);
        counterDropdownItem.get(0).click();
        Thread.sleep(1000);
        routeDropdown.get(0).click();
        Thread.sleep(1000);
        routeDropdownItem.get(0).click();
        Thread.sleep(1000);
        routeDropdownItem.get(1).click();
        Thread.sleep(1000);
        closeDropdownIcon.click();
        Thread.sleep(1000);
        commissionRate.get(0).sendKeys("10");
        Thread.sleep(1000);
        commissionTypeDropdown.get(4).click();
        Thread.sleep(1000);
        commissionTypeDropdownItem.get(1).click();
        Thread.sleep(1000);
        ticketLayoutDropdown.get(5).click();
        Thread.sleep(1000);
        ticketLayoutDropdownItem.get(0).click();
        Thread.sleep(1000);
        giveAllPermission.get(3).click();
        Thread.sleep(1000);
        createAgentButton.click();
        Thread.sleep(1000);
    }
}
