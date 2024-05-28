package TestRunners.TabUserTestRunners.JatriAdminTestRunners;

import Configuration.Setup;
import LoginFunctionalities.LoginPage;
import TabUserFunctionalities.JatriAdmin.FilterJatriAdmin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class FilterJatriAdminTestRunner extends Setup {
    LoginPage loginPage;
    @Test(priority = 1, description = "User Login")
    public void doLoginWithValidCreds() throws InterruptedException {
        loginPage = new LoginPage(driver);
        loginPage.doLogin("01983285059", "01983285059@jatri");
        Thread.sleep(2000);
        String logoutButtonHeaderActual = driver.findElement(By.xpath("//button[normalize-space()='Logout']")).getText();
        String logoutButtonHeaderExpected = "Logout";
        Assert.assertEquals(logoutButtonHeaderActual, logoutButtonHeaderExpected);
    }

    FilterJatriAdmin filterJatriAdmin;
    @Test(priority = 2, description = "Filtering jatri Admin with no data")
    public void testFilterJatriAdminWithNoData() throws InterruptedException {
        filterJatriAdmin = new FilterJatriAdmin(driver);
        filterJatriAdmin.filterJatriAdminWithNoData();
        List<WebElement> buttonDisplayed = driver.findElements(By.className("primary-border-icon-btn"));
        buttonDisplayed.get(0).isDisplayed();
        Thread.sleep(1000);
    }

    @Test(priority = 3, description = "Filtering jatri Admin with admin name")
    public void testFilterJatriAdminWithJatriAdminName() throws InterruptedException {
        filterJatriAdmin = new FilterJatriAdmin(driver);
        filterJatriAdmin.filterJatriAdminWithJatriAdminName();
        WebElement nameDisplayed = driver.findElement(By.xpath("//td[normalize-space()='Automation Jatri Admin-1']"));
        nameDisplayed.isDisplayed();
        Thread.sleep(1000);
    }

    @Test(priority = 4, description = "Filtering jatri Admin with admin name")
    public void testFilterJatriAdminWithJatriAdminMobile() throws InterruptedException {
        filterJatriAdmin = new FilterJatriAdmin(driver);
        filterJatriAdmin.filterJatriAdminWithJatriAdminMobile();
        WebElement mobileDisplayed = driver.findElement(By.xpath("//td[normalize-space()='01888000133']"));
        mobileDisplayed.isDisplayed();
        Thread.sleep(1000);
    }

    @Test(priority = 5, description = "Filtering jatri Admin with admin name")
    public void testFilterJatriAdminWithAllData() throws InterruptedException {
        filterJatriAdmin = new FilterJatriAdmin(driver);
        filterJatriAdmin.filterJatriAdminWithAllData();
        WebElement nameDisplayed = driver.findElement(By.xpath("//td[normalize-space()='Jatri Admin-1']"));
        nameDisplayed.isDisplayed();
        Thread.sleep(1000);
    }
}
