package TabUserFunctionalities.JatriAdmin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FilterJatriAdmin {
    @FindBy(xpath = "//a[normalize-space()='User']")
    WebElement userTab;

    @FindBy(className = "companyOwnerTabNonActive")
    List<WebElement> jatriAdminTab;

    @FindBy(className = "primaryInputField")
    List<WebElement> jatriAdminName;

    @FindBy(className = "primaryInputField")
    List<WebElement> jatriAdminMobile;

    @FindBy(xpath = "//span[normalize-space()='Search']")
    WebElement searchButton;

    public FilterJatriAdmin(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void filterJatriAdminWithNoData() throws InterruptedException {
        userTab.click();
        Thread.sleep(1000);
        jatriAdminTab.get( 1).click();
        Thread.sleep(1000);
        searchButton.click();
        Thread.sleep(1000);
    }

    public void filterJatriAdminWithJatriAdminName() throws InterruptedException {
        userTab.click();
        Thread.sleep(1000);
        jatriAdminTab.get( 1).click();
        Thread.sleep(1000);
        jatriAdminName.get(0).sendKeys("Automation Jatri Admin-1");
        Thread.sleep(1000);
        searchButton.click();
        Thread.sleep(1000);
    }

    public void filterJatriAdminWithJatriAdminMobile() throws InterruptedException {
        userTab.click();
        Thread.sleep(1000);
        jatriAdminTab.get( 1).click();
        Thread.sleep(1000);
        jatriAdminMobile.get(1).sendKeys("01888000133");
        Thread.sleep(1000);
        searchButton.click();
        Thread.sleep(1000);
    }

    public void filterJatriAdminWithAllData() throws InterruptedException {
        userTab.click();
        Thread.sleep(1000);
        jatriAdminTab.get( 1).click();
        Thread.sleep(1000);
        jatriAdminName.get(0).sendKeys("Jatri Admin-1");
        Thread.sleep(1000);
        jatriAdminMobile.get(1).sendKeys("01888000131");
        Thread.sleep(1000);
        searchButton.click();
        Thread.sleep(1000);
    }
}
