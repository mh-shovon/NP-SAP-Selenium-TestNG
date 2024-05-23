package TestRunner.TabUserTestRunners.CountermanTestRunners;

import Configuration.Setup;
import LoginFunctionalities.LoginPage;
import TabUserFunctionalities.Counterman.FilterCounterman;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FilterCountermanTestRunner extends Setup {
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

    FilterCounterman filterCounterman;
    @Test(priority = 2, description = "Filtering counterman with no data")
    public void testFilterCountermanWithNoData() throws InterruptedException {
        filterCounterman = new FilterCounterman(driver);
        Thread.sleep(1000);
        filterCounterman.filterCountermanWithNoData();
        WebElement dataDisplayed = driver.findElement(By.xpath("//button[normalize-space()='Next']"));
        dataDisplayed.isDisplayed();
        Thread.sleep(1000);
    }

    @Test(priority = 3, description = "Filtering counterman with operator only")
    public void testFilterCountermanWithOperator() throws InterruptedException {
        filterCounterman = new FilterCounterman(driver);
        Thread.sleep(1000);
        filterCounterman.filterCountermanWithOperator();
        WebElement dataDisplayed = driver.findElement(By.xpath("//button[normalize-space()='Next']"));
        dataDisplayed.isDisplayed();
        Thread.sleep(1000);
    }

    @Test(priority = 4, description = "Filtering counterman with counterman name only")
    public void testFilterCountermanWithCountermanName() throws InterruptedException {
        filterCounterman = new FilterCounterman(driver);
        Thread.sleep(1000);
        filterCounterman.filterCountermanWithCountermanName();
        WebElement dataDisplayed = driver.findElement(By.xpath("//tbody/tr[1]/td[3]"));
        dataDisplayed.isDisplayed();
        Thread.sleep(1000);
    }

    @Test(priority = 5, description = "Filtering counterman with counterman mobile only")
    public void testFilterCountermanWithCountermanMobile() throws InterruptedException {
        filterCounterman = new FilterCounterman(driver);
        Thread.sleep(1000);
        filterCounterman.filterCountermanWithCountermanMobile();
        WebElement dataDisplayed = driver.findElement(By.xpath("//td[normalize-space()='01888000062']"));
        dataDisplayed.isDisplayed();
        Thread.sleep(1000);
    }

    @Test(priority = 6, description = "Filtering counterman with all data")
    public void testFilterCountermanWithAllData() throws InterruptedException {
        filterCounterman = new FilterCounterman(driver);
        Thread.sleep(1000);
        filterCounterman.filterCountermanWithAllData();
        WebElement dataDisplayed = driver.findElement(By.xpath("//td[normalize-space()='Automation Counterman-1']"));
        dataDisplayed.isDisplayed();
        Thread.sleep(1000);
    }
}
