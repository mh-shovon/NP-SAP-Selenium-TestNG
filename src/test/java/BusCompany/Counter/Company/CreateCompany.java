package BusCompany.Counter.Company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCompany {
    @FindBy(xpath = "//a[normalize-space()='Bus Company']")
    WebElement busCompanyTab;

    @FindBy(xpath = "//span[normalize-space()='Add Company']")
    WebElement addCompanyBtn;

    @FindBy(xpath = "//input[@id='name']")
    WebElement companyName;

    @FindBy(xpath = "//input[@id='displayName']")
    WebElement companyDisplayName;

    @FindBy(xpath = "//input[@id='phone']")
    WebElement companyPhone;

    @FindBy(xpath = "//input[@id='contactPerson']")
    WebElement companyContactPerson;

    @FindBy(xpath = "//*[@id=\"pv_id_35\"]/span")
    WebElement allowPassYes;

    @FindBy(xpath = "//input[@placeholder='Enter allowable goods weight']")
    WebElement allowableGoodsWeight;

    @FindBy(xpath = "//input[@placeholder='Enter overweight goods charge per kg']")
    WebElement allowableGoodsCharge;

    @FindBy(xpath = "//li[@id='pv_id_9_0']")
    WebElement allowQuotaYes;

    @FindBy(xpath = "//div[@class='p-multiselect-label p-placeholder']")
    WebElement ticketLayoutDropdown;

    @FindBy(xpath = "//span[normalize-space()='3 Part(4 Layer)']")
    WebElement selectTicketLayout3P4L;

    @FindBy(xpath = "//span[@class='p-multiselect-close-icon pi pi-times']")
    WebElement crossBtn;

    @FindBy(xpath = "//label[normalize-space()='Owner']")
    WebElement selectUserTypeOwner;

    @FindBy(xpath = "//div[@id='termsCondition']//div[@class='ql-editor ql-blank']")
    WebElement termsCondition;

    @FindBy(xpath = "//button[normalize-space()='Create company']")
    WebElement createCompanyBtn;

    public CreateCompany(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void doCreateCompany(String uniqueCompanyName) throws InterruptedException {
        busCompanyTab.click();
        Thread.sleep(500);
        addCompanyBtn.click();
        Thread.sleep(500);
        companyName.sendKeys(uniqueCompanyName);
        Thread.sleep(500);
        companyDisplayName.sendKeys("ABCD-1");
        Thread.sleep(500);
        companyPhone.sendKeys("01900000000");
        Thread.sleep(500);
        companyContactPerson.sendKeys("ABCD-1");
        Thread.sleep(500);
        //allowPassYes.click();
        Thread.sleep(500);
        allowableGoodsWeight.sendKeys("100");
        java.lang.Thread.sleep(500);
        allowableGoodsCharge.sendKeys("30");
        Thread.sleep(500);
        //allowQuotaYes.click();
        Thread.sleep(500);
        ticketLayoutDropdown.click();
        java.lang.Thread.sleep(500);
        Thread.sleep(500);
        selectTicketLayout3P4L.click();
        java.lang.Thread.sleep(500);
        Thread.sleep(500);
        crossBtn.click();
        java.lang.Thread.sleep(500);
        selectUserTypeOwner.click();
        java.lang.Thread.sleep(500);
        termsCondition.sendKeys("Jatri Services Ltd.");
        java.lang.Thread.sleep(500);
        createCompanyBtn.click();
        java.lang.Thread.sleep(500);
    }
}
