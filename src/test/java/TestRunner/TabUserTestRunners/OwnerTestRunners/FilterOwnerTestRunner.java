package TestRunner.TabUserTestRunners.OwnerTestRunners;

import Configuration.Setup;
import LoginFunctionalities.LoginPage;
import TabUserFunctionalities.Owner.FilterOwner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FilterOwnerTestRunner extends Setup {
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

    FilterOwner filterOwner;
    @Test(priority = 2, description = "Filtering owner with no data")
    public void testFilterOwnerWithNoData() throws InterruptedException {
        filterOwner = new FilterOwner(driver);
        filterOwner.filterOwnerWithNoData();
        WebElement dataDisplayed = driver.findElement(By.xpath("//button[normalize-space()='Next']"));
        dataDisplayed.isDisplayed();
        Thread.sleep(1000);
    }

    @Test(priority = 3, description = "Filtering owner with operator")
    public void testFilterOwnerWithOperator() throws InterruptedException {
        filterOwner = new FilterOwner(driver);
        filterOwner.filterOwnerWithOperator();
        String ownerNameActual = driver.findElement(By.xpath("//span[@aria-label='Jeddah Express Limited']")).getText();
        String ownerNameExpected = "Jeddah Express Limited";
        Assert.assertEquals(ownerNameActual, ownerNameExpected);
        Thread.sleep(1000);
    }

    @Test(priority = 4, description = "Filtering owner with operator")
    public void testFilterOwnerWithOwnerName() throws InterruptedException {
        filterOwner = new FilterOwner(driver);
        filterOwner.filterOwnerWithOwnerName();
        String ownerNameActual = driver.findElement(By.xpath("//td[normalize-space()='Owner-1']")).getText();
        String ownerNameExpected = "Owner-1";
        Assert.assertEquals(ownerNameActual, ownerNameExpected);
        Thread.sleep(1000);
    }

    @Test(priority = 5, description = "Filtering owner with operator")
    public void testFilterOwnerWithOwnerMobile() throws InterruptedException {
        filterOwner = new FilterOwner(driver);
        filterOwner.filterOwnerWithOwnerMobile();
        String ownerNameActual = driver.findElement(By.xpath("//td[normalize-space()='Owner-1']")).getText();
        String ownerNameExpected = "Owner-1";
        Assert.assertEquals(ownerNameActual, ownerNameExpected);
        Thread.sleep(1000);
    }

    @Test(priority = 6, description = "Filtering owner with operator")
    public void testFilterOwnerWithAllData() throws InterruptedException {
        filterOwner = new FilterOwner(driver);
        filterOwner.filterOwnerWithAllData();
        String ownerNameActual = driver.findElement(By.xpath("//td[normalize-space()='Owner-1']")).getText();
        String ownerNameExpected = "Owner-1";
        Assert.assertEquals(ownerNameActual, ownerNameExpected);
        Thread.sleep(1000);
    }
}
