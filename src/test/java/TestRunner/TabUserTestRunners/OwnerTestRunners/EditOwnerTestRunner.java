package TestRunner.TabUserTestRunners.OwnerTestRunners;

import Configuration.Setup;
import LoginFunctionalities.LoginPage;
import TabUserFunctionalities.Owner.EditOwner;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EditOwnerTestRunner extends Setup {
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

    EditOwner editOwner;

    @Test(priority = 2, description = "Edit an existing owner")
    public void testCreateNewOwner() throws InterruptedException {
        editOwner = new EditOwner(driver);
        Thread.sleep(1000);
        editOwner.editExistingOwner();
        Thread.sleep(1000);
        String createOwnerSuccessfullyActualMessage = driver.findElement(By.xpath("//div[@class='mosha__toast__content__description']")).getText();
        String createOwnerSuccessfullyExpectedMessage = "Owner updated successfully";
        Assert.assertEquals(createOwnerSuccessfullyActualMessage, createOwnerSuccessfullyExpectedMessage);
        Thread.sleep(1000);
    }
}