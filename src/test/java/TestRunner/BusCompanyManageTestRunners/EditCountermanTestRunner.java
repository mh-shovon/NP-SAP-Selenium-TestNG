package TestRunner.BusCompanyManageTestRunners;

import BusCompany.Counterman.EditCounterman;
import Configuration.Setup;
import LoginFunctionalities.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EditCountermanTestRunner extends Setup {
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

    EditCounterman editCounterman;
    @Test(priority = 2, description = "Creating a new counterman")
    public void editExistingCountermanTest() throws InterruptedException {
        editCounterman = new EditCounterman(driver);
        Thread.sleep(1000);
        editCounterman.editExistingCounterman();
        Thread.sleep(1000);
        String createCountermanSuccessfullyActualMessage = driver.findElement(By.xpath("//div[@class='mosha__toast__content__description']")).getText();
        String createCountermanSuccessfullyExpectedMessage = "Counterman updated successfully";
        Assert.assertEquals(createCountermanSuccessfullyActualMessage, createCountermanSuccessfullyExpectedMessage);
        Thread.sleep(1000);
    }
}
