package TestRunners.TabUserTestRunners.OwnerTestRunners;

import Configuration.Setup;
import LoginFunctionalities.LoginPage;
import TabUserFunctionalities.Owner.CreateOwner;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateOwnerTestRunner extends Setup {
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

    CreateOwner createOwner;
    @Test(priority = 2, description = "Creating a new owner")
    public void testCreateNewOwner() throws InterruptedException {
        createOwner = new CreateOwner(driver);
        Thread.sleep(1000);
        createOwner.createNewOwner();
        Thread.sleep(1000);
        String createOwnerSuccessfullyActualMessage = driver.findElement(By.xpath("//div[@class='mosha__toast__content__text']")).getText();
        String createOwnerSuccessfullyExpectedMessage = "Success";
        Assert.assertEquals(createOwnerSuccessfullyActualMessage, createOwnerSuccessfullyExpectedMessage);
        Thread.sleep(1000);
    }
}
