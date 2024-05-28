package TestRunners.TabCounterTestRunners;

import Configuration.Setup;
import LoginFunctionalities.LoginPage;
import TabCounterFunctionalities.FilterCounter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FilterCounterTestRunner extends Setup {
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

    FilterCounter filterCounter;
    @Test(priority = 2, description = "Counter Filter with No Data")
    public void testCounterFilterWithNoData() throws InterruptedException {
        filterCounter = new FilterCounter(driver);
        Thread.sleep(1000);
        filterCounter.filterWithNoData();
        String filterErrorActual = driver.findElement(By.xpath("//p[contains(text(),'Operator is required')]")).getText();
        String filterErrorExpected = "Operator is required";
        Assert.assertEquals(filterErrorActual, filterErrorExpected);
        Thread.sleep(1000);
    }

    @Test(priority = 3, description = "Counter Filter with operator only")
    public void testCounterFilterWithOperatorOnly() throws InterruptedException {
        filterCounter = new FilterCounter(driver);
        Thread.sleep(1000);
        filterCounter.filterWithOperator();
        String filterResultFindActual = driver.findElement(By.xpath("//button[normalize-space()='Next']")).getText();
        String filterResultFindExpected = "Next";
        Assert.assertEquals(filterResultFindActual, filterResultFindExpected);
        Thread.sleep(1000);
    }

    @Test(priority = 4, description = "Counter Filter with operator & counter type")
    public void testCounterFilterWithOperatorAndCounterType() throws InterruptedException {
        filterCounter = new FilterCounter(driver);
        Thread.sleep(1000);
        filterCounter.filterWithOperatorAndCounterType();
        String filterResultFindActual = driver.findElement(By.xpath("//button[normalize-space()='Next']")).getText();
        String filterResultFindExpected = "Next";
        Assert.assertEquals(filterResultFindActual, filterResultFindExpected);
        Thread.sleep(1000);
    }

    @Test(priority = 5, description = "Counter Filter with operator & counter name")
    public void testFilterWithOperatorAndCounterName() throws InterruptedException {
        filterCounter = new FilterCounter(driver);
        Thread.sleep(1000);
        filterCounter.filterWithOperatorAndCounterName();
        WebElement iconDisplayed = driver.findElement(By.xpath("//img[@alt='User Icon']"));
        iconDisplayed.isDisplayed();
        Thread.sleep(1000);
    }

    @Test(priority = 6, description = "Counter Filter with operator & stoppage")
    public void testFilterWithOperatorAndStoppage() throws InterruptedException {
        filterCounter = new FilterCounter(driver);
        Thread.sleep(1000);
        filterCounter.filterWithOperatorAndStoppage();
        WebElement iconDisplayed = driver.findElement(By.xpath("//img[@alt='User Icon']"));
        iconDisplayed.isDisplayed();
        Thread.sleep(1000);
    }

    @Test(priority = 7, description = "Counter Filter with all data")
    public void testFilterWithAllData() throws InterruptedException {
        filterCounter = new FilterCounter(driver);
        Thread.sleep(1000);
        filterCounter.filterWithAllData();
        WebElement iconDisplayed = driver.findElement(By.xpath("//img[@alt='User Icon']"));
        iconDisplayed.isDisplayed();
        Thread.sleep(1000);
    }
}