package BusCompany.Counter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EditCounter {
    @FindBy(xpath = "//a[normalize-space()='Bus Company']")
    WebElement busCompanyTab;

    @FindBy(className = "corporate-blue-icon-btn")
    List<WebElement> manageButton;

    @FindBy(className = "companyOwnerTabNonActive")
    List<WebElement> companyCounterTab;

    @FindBy(xpath = "//button[normalize-space()='14']")
    WebElement page14Button;

    @FindBy(className = "primary-border-icon-btn")
    List<WebElement> editButton;

    @FindBy(xpath = "//input[@placeholder='Enter counter code']")
    WebElement counterCode;

    @FindBy(xpath = "//span[normalize-space()='Save changes']")
    WebElement saveChangesButton;

    public EditCounter(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void editExistingCounter() throws InterruptedException {
        Thread.sleep(1000);
        busCompanyTab.click();
        Thread.sleep(1000);
        manageButton.get(0).click();
        Thread.sleep(1000);
        companyCounterTab.get(2).click();
        Thread.sleep(1000);
        //paginationButton.get(3).click();
        page14Button.click();
        Thread.sleep(1000);
        editButton.get(5).click();
        Thread.sleep(1000);
        counterCode.sendKeys("AC-1");
        Thread.sleep(1000);
        saveChangesButton.click();
        Thread.sleep(1000);

    }
}
