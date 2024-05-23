package TestRunner.TabUserTestRunners.CountermanTestRunners;


import Configuration.Setup;
import LoginFunctionalities.LoginPage;
import TabUserFunctionalities.Counterman.CreateCounterman;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateCountermanTestRunner extends Setup {
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

    CreateCounterman createCounterman;
    @Test(priority = 2, description = "Create a new counterman")
    public void testCreateNewCounterman() throws InterruptedException {
        createCounterman = new CreateCounterman(driver);
        Thread.sleep(1000);
        createCounterman.createNewCounterman();
        Thread.sleep(2000);
        String createCountermanSuccessfullyActualMessage = driver.findElement(By.xpath("//div[@class='mosha__toast__content__text']")).getText();
        String createCountermanSuccessfullyExpectedMessage = "Success";
        Assert.assertEquals(createCountermanSuccessfullyActualMessage, createCountermanSuccessfullyExpectedMessage);
        Thread.sleep(1000);
    }
}
