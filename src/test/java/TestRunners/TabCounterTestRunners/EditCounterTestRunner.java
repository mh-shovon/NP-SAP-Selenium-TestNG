package TestRunners.TabCounterTestRunners;

import Configuration.Setup;
import LoginFunctionalities.LoginPage;
import TabCounterFunctionalities.EditCounter;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EditCounterTestRunner extends Setup {
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

    EditCounter editCounter;
    @Test(priority = 2, description = "User Can edit the counter")
    public void testEditCounter() throws InterruptedException {
        editCounter = new EditCounter(driver);
        editCounter.editExistingCounter();
        Thread.sleep(1000);
        String createCounterSuccessfullyActualMessage = driver.findElement(By.xpath("//div[@class='mosha__toast__content__description']")).getText();
        String createCounterSuccessfullyExpectedMessage = "Counter updated successfully";
        Assert.assertEquals(createCounterSuccessfullyActualMessage, createCounterSuccessfullyExpectedMessage);
        Thread.sleep(1000);
    }
}
