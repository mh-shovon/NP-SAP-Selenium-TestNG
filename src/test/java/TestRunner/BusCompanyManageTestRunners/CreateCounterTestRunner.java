package TestRunner.BusCompanyManageTestRunners;

import BusCompany.Counter.CreateCounter;
import Configuration.Setup;
import LoginFunctionalities.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateCounterTestRunner extends Setup {
    LoginPage loginPage;
    @Test(priority = 1, description = "User Login")
    public void doLoginWithValidCreds() throws InterruptedException {
        loginPage = new LoginPage(driver);
        loginPage.doLogin("01983285059", "01983285059@jatri");
        Thread.sleep(1000);
        String logoutButtonHeaderActual = driver.findElement(By.xpath("//button[normalize-space()='Logout']")).getText();
        String logoutButtonHeaderExpected = "Logout";
        Assert.assertEquals(logoutButtonHeaderActual, logoutButtonHeaderExpected);
    }

    CreateCounter createCounter;
    @Test(priority = 2, description = "Create a new counter")
    public void createNewCounterTest() throws InterruptedException {
        createCounter = new CreateCounter(driver);
        createCounter.createNewCounter();
        Thread.sleep(1000);
        String createCounterSuccessfullyActualMessage = driver.findElement(By.xpath("//div[@class='mosha__toast__content__text']")).getText();
        String createCounterSuccessfullyExpectedMessage = "Success";
        Assert.assertEquals(createCounterSuccessfullyActualMessage, createCounterSuccessfullyExpectedMessage);
        Thread.sleep(1000);
    }
}
