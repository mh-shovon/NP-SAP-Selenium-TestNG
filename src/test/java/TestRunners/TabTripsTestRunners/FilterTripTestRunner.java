package TestRunners.TabTripsTestRunners;

import Configuration.Setup;
import LoginFunctionalities.LoginPage;
import TabTripsFunctionalities.FilterTrips;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class FilterTripTestRunner extends Setup {
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

    FilterTrips filterTrips;
//    @Test(priority = 2, description = "Filter trips without any data", enabled = false)
//    public void testFilterTripsWithNoData() throws InterruptedException {
//        filterTrips = new FilterTrips(driver);
//        filterTrips.filterTripWithNoData();
//        String requiredFieldErrorActual = driver.findElement(By.xpath("//p[contains(text(),'Operator is required')]")).getText();
//        String requiredFieldErrorExpected = "Operator is required";
//        Assert.assertEquals(requiredFieldErrorActual, requiredFieldErrorExpected);
//        Thread.sleep(2000);
//    }
//
//    @Test(priority = 2, description = "Filter trips with operator", enabled = false)
//    public void testFilterTripsWithOperator() throws InterruptedException {
//        filterTrips = new FilterTrips(driver);
//        filterTrips.filterTripWithOperator();
//        List<WebElement> editButtonDisplayed = driver.findElements(By.className("corporate-blue-icon-btn"));
//        editButtonDisplayed.get(0).isDisplayed();
//        Thread.sleep(2000);
//    }
//
//    @Test(priority = 3, description = "Filter trips with operator and both from and to stoppage", enabled = false)
//    public void testFilterTripWithOperatorAndBothFromAndToStoppage() throws InterruptedException {
//        filterTrips = new FilterTrips(driver);
//        filterTrips.filterTripWithOperatorAndBothFromAndToStoppage();
//        List<WebElement> editButtonDisplayed = driver.findElements(By.className("corporate-blue-icon-btn"));
//        editButtonDisplayed.get(0).isDisplayed();
//        Thread.sleep(2000);
//    }
//
//    @Test(priority = 4, description = "Filter trips with operator and active status", enabled = false)
//    public void testFilterTripWithOperatorAndTripStatusActive() throws InterruptedException {
//        filterTrips = new FilterTrips(driver);
//        filterTrips.filterTripWithOperatorAndTripStatusActive();
//        List<WebElement> editButtonDisplayed = driver.findElements(By.className("corporate-blue-icon-btn"));
//        editButtonDisplayed.get(0).isDisplayed();
//        Thread.sleep(2000);
//    }
//
//    @Test(priority = 5, description = "Filter trips with operator and inactive status", enabled = false)
//    public void testFilterTripWithOperatorAndTripStatusInactive() throws InterruptedException {
//        filterTrips = new FilterTrips(driver);
//        filterTrips.filterTripWithOperatorAndTripStatusInactive();
//        List<WebElement> editButtonDisplayed = driver.findElements(By.className("corporate-blue-icon-btn"));
//        editButtonDisplayed.get(0).isDisplayed();
//        Thread.sleep(2000);
//    }
//
//    @Test(priority = 6, description = "Filter trips with operator and trip no", enabled = false)
//    public void testFilterTripWithOperatorAndTripNo() throws InterruptedException {
//        filterTrips = new FilterTrips(driver);
//        filterTrips.filterTripWithOperatorAndTripNo();
//        List<WebElement> editButtonDisplayed = driver.findElements(By.className("corporate-blue-icon-btn"));
//        editButtonDisplayed.get(0).isDisplayed();
//        Thread.sleep(2000);
//    }

    @Test(priority = 7, description = "Filter trips with operator and date")
    public void testFilterTripWithOperatorAndDate() throws InterruptedException {
        filterTrips = new FilterTrips(driver);
        filterTrips.filterTripWithOperatorAndDate();
        List<WebElement> editButtonDisplayed = driver.findElements(By.className("corporate-blue-icon-btn"));
        editButtonDisplayed.get(0).isDisplayed();
        Thread.sleep(2000);
    }
}
