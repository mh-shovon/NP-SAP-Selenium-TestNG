package TestRunner.TabRoutesTestRunners;

import Configuration.Setup;
import LoginFunctionalities.LoginPage;
import TabRoutesFunctionalities.FilterRoute;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FilterRouteTestRunner extends Setup {
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

    FilterRoute filterRoute;
    @Test(priority = 2, description = "Route Filter with No Data")
    public void testRoutesFilterWithNoData() throws InterruptedException {
        filterRoute = new FilterRoute(driver);
        Thread.sleep(1000);
        filterRoute.filterWithNoData();
        String filterErrorActual = driver.findElement(By.xpath("//p[contains(text(),'Operator is required')]")).getText();
        String filterErrorExpected = "Operator is required";
        Assert.assertEquals(filterErrorActual, filterErrorExpected);
        Thread.sleep(1000);
    }

    @Test(priority = 3, description = "Route Filter with operator only")
    public void TestRoutesFilterWithOperatorOnly() throws InterruptedException {
        filterRoute = new FilterRoute(driver);
        Thread.sleep(1000);
        filterRoute.filterWithOperator();
        String filterResultFindActual = driver.findElement(By.xpath("//button[normalize-space()='Next']")).getText();
        String filterResultFindExpected = "Next";
        Assert.assertEquals(filterResultFindActual, filterResultFindExpected);
        Thread.sleep(1000);
    }

    @Test(priority = 4, description = "Route Filter with operator & origin city")
    public void TestRoutesFilterWithOperatorAndOriginCity() throws InterruptedException {
        filterRoute = new FilterRoute(driver);
        Thread.sleep(1000);
        filterRoute.filterWithOperatorAndOriginCity();
        String filterResultFindActual = driver.findElement(By.xpath("//button[normalize-space()='Next']")).getText();
        String filterResultFindExpected = "Next";
        Assert.assertEquals(filterResultFindActual, filterResultFindExpected);
        Thread.sleep(1000);
    }

    @Test(priority = 5, description = "Route Filter with operator & origin city")
    public void TestRoutesFilterWithOperatorAndDestinationCity() throws InterruptedException {
        filterRoute = new FilterRoute(driver);
        Thread.sleep(1000);
        filterRoute.filterWithOperatorAndOriginCity();
        String filterResultFindActual = driver.findElement(By.xpath("//td[contains(text(),\"Dhaka-Comilla-Chittagong-Cox's Bazar\")]")).getText();
        String filterResultFindExpected = "Dhaka-Comilla-Chittagong-Cox's Bazar";
        Assert.assertEquals(filterResultFindActual, filterResultFindExpected);
        Thread.sleep(1000);
    }

    @Test(priority = 6, description = "Route Filter with operator & origin city")
    public void TestRoutesFilterWithAllData() throws InterruptedException {
        filterRoute = new FilterRoute(driver);
        Thread.sleep(1000);
        filterRoute.filterWithAllData();
        String filterResultFindActual = driver.findElement(By.xpath("//td[contains(text(),\"Dhaka-Comilla-Chittagong-Cox's Bazar\")]")).getText();
        String filterResultFindExpected = "Dhaka-Comilla-Chittagong-Cox's Bazar";
        Assert.assertEquals(filterResultFindActual, filterResultFindExpected);
        Thread.sleep(1000);
    }
}
