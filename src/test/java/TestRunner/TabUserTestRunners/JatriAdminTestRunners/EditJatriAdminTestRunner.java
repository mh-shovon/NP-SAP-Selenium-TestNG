package TestRunner.TabUserTestRunners.JatriAdminTestRunners;

import Configuration.Setup;
import LoginFunctionalities.LoginPage;
import TabUserFunctionalities.JatriAdmin.EditJatriAdmin;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EditJatriAdminTestRunner extends Setup {
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

    EditJatriAdmin editJatriAdmin;
    @Test(priority = 2, description = "Edit an existing jatri admin")
    public void testEditNewJatriAdmin() throws InterruptedException {
        editJatriAdmin = new EditJatriAdmin(driver);
        Thread.sleep(1000);
        editJatriAdmin.editExistingJatriAdmin();
        Thread.sleep(1000);
        String ownerUpdatedSuccessfullyActualMessage = driver.findElement(By.xpath("//div[@class='mosha__toast__content__description']")).getText();
        String ownerUpdatedSuccessfullyExpectedMessage = "Jatri admin updated successfully";
        Assert.assertEquals(ownerUpdatedSuccessfullyActualMessage, ownerUpdatedSuccessfullyExpectedMessage);
        Thread.sleep(1000);
    }
}
