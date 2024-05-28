package TestRunners.DashboardTestRunners;

import Configuration.Setup;
import Dashboard.DashboardFilter;
import LoginFunctionalities.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DashboardTestRunner extends Setup {
    LoginPage loginPage;
    @Test(priority = 1)
    public void doLoginWithValidCreds() throws InterruptedException {
        loginPage = new LoginPage(driver);
        Thread.sleep(1000);
        loginPage.doLogin("01983285059", "01983285059@jatri");
        Thread.sleep(1000);
        String logoutButtonHeaderActual5 = driver.findElement(By.xpath("//button[normalize-space()='Logout']")).getText();
        String logoutButtonHeaderExpected5 = "Logout";
        Assert.assertEquals(logoutButtonHeaderActual5, logoutButtonHeaderExpected5);
    }

    DashboardFilter dashboardFilter;
    @Test(priority = 2)
    public void testFilterDashboard() throws InterruptedException {
        dashboardFilter = new DashboardFilter(driver);
        Thread.sleep(1000);
        dashboardFilter.filterDashboard();
        Thread.sleep(1000);
        String logoutButtonHeaderActual5 = driver.findElement(By.xpath("//button[normalize-space()='Logout']")).getText();
        String logoutButtonHeaderExpected5 = "Logout";
        Assert.assertEquals(logoutButtonHeaderActual5, logoutButtonHeaderExpected5);
    }
}
