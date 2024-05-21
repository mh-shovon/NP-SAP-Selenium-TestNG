package BusCompany.Counter.Company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EditCompany {
    @FindBy(xpath = "//a[normalize-space()='Bus Company']")
    WebElement busCompanyTab;

    @FindBy(xpath = "//button[normalize-space()='Next']")
    WebElement nextPage;

    @FindBy(className = "primary-border-icon-btn")
    List<WebElement> editButton;

    @FindBy(className = "p-dropdowm-label")
    List<WebElement> allowPassDropdown;

    @FindBy(className = "p-dropdown-item")
    List<WebElement> allowPassDropdownItem;

    @FindBy(className = "p-dropdowm-label")
    List<WebElement> allowQuotaDropdown;

    @FindBy(className = "p-dropdown-item")
    List<WebElement> allowQuotaDropdownItem;

    @FindBy(className = "p-dropdowm-label")
    List<WebElement> allowDigitalTicketingDropdown;

    @FindBy(className = "p-dropdown-item")
    List<WebElement> allowDigitalTicketingDropdownItem;

    @FindBy(xpath = "//button[normalize-space()='Update company']")
    WebElement updateCompanyButton;


    public EditCompany(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void doEditCompany() throws InterruptedException {
        busCompanyTab.click();
        Thread.sleep(500);
        nextPage.click();
        Thread.sleep(1000);
        editButton.get(8).click();
        Thread.sleep(500);
        allowPassDropdown.get(1).click();
        Thread.sleep(500);
        allowPassDropdownItem.get(0).click();
        Thread.sleep(500);
        allowQuotaDropdown.get(7).click();
        Thread.sleep(500);
        allowQuotaDropdownItem.get(0).click();
        Thread.sleep(500);
        allowDigitalTicketingDropdown.get(8).click();
        Thread.sleep(500);
        allowDigitalTicketingDropdownItem.get(0).click();
        Thread.sleep(500);
        updateCompanyButton.click();
        Thread.sleep(500);
    }
}
