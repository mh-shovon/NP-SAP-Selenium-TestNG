package TestRunner.TabUserTestRunners.JatriAdminTestRunners;

import Configuration.Setup;
import LoginFunctionalities.LoginPage;
import TabUserFunctionalities.JatriAdmin.CreateJatriAdmin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateJatriAdminTestRunner extends Setup {
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

    CreateJatriAdmin createJatriAdmin;
    @Test(priority = 2, description = "Creating a new jatri admin")
    public void testCreateNewJatriAdmin() throws InterruptedException {
        createJatriAdmin = new CreateJatriAdmin(driver);
        Thread.sleep(1000);
        createJatriAdmin.createNewJatriAdmin();
        Thread.sleep(1000);
        String ownerCreatedSuccessfullyActualMessage = driver.findElement(By.xpath("//div[@class='mosha__toast__content__description']")).getText();
        String ownerCreatedSuccessfullyExpextedMessage = "New jatri admin created successfully";
        Assert.assertEquals(ownerCreatedSuccessfullyActualMessage, ownerCreatedSuccessfullyExpextedMessage);
        Thread.sleep(1000);
    }
}
