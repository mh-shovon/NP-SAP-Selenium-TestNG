package BusCompany.Counterman;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EditCounterman {
    @FindBy(xpath = "//a[normalize-space()='Bus Company']")
    WebElement busCompanyTab;

    @FindBy(className = "corporate-blue-icon-btn")
    List<WebElement> manageButton;

    @FindBy(className = "companyOwnerTabNonActive")
    List<WebElement> companyCountermanTab;

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

    public EditCounterman() throws InterruptedException {
        Thread.sleep(1000);

    }

    public void editExistingCounterman() throws InterruptedException {
        Thread.sleep(1000);
        busCompanyTab.click();
        Thread.sleep(1000);
        manageButton.get(0).click();
        Thread.sleep(1000);
        companyCountermanTab.get(5).click();
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
