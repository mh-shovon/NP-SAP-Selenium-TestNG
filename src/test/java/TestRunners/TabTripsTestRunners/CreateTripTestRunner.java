package TestRunners.TabTripsTestRunners;

import Configuration.Setup;
import LoginFunctionalities.LoginPage;
import TabTripsFunctionalities.CreateTrip;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateTripTestRunner extends Setup {
    LoginPage loginPage;
    @Test(priority = 1, description = "User Login")
    public void doLoginWithValidCreds() throws InterruptedException {
        loginPage = new LoginPage(driver);
        loginPage.doLogin("01983285059", "01983285059@jatri");
        Thread.sleep(2000);
        String logoutButtonHeaderActual = driver.findElement(By.xpath("//button[normalize-space()='Logout']")).getText();
        String logoutButtonHeaderExpected = "Logout";
        Assert.assertEquals(logoutButtonHeaderActual, logoutButtonHeaderExpected);
        System.out.println("User Login Successful");
    }

    CreateTrip createTrip;
    @Test(priority = 2, description ="Creating a new trip")
    public void testCreateNewTrip() throws InterruptedException {
        createTrip = new CreateTrip(driver);
        createTrip.createNewTrip();
        Thread.sleep(500);
        String createTripSuccessfullyActualMessage = driver.findElement(By.xpath("//div[@class='mosha__toast__content__text']")).getText();
        String createTripSuccessfullyExpectedMessage = "Success";
        Assert.assertEquals(createTripSuccessfullyActualMessage, createTripSuccessfullyExpectedMessage);
        Thread.sleep(1000);
        System.out.println("Trip created successfully");
    }
}
