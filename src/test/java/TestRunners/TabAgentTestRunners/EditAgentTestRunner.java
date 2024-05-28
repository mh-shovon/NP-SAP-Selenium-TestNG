package TestRunners.TabAgentTestRunners;

import Configuration.Setup;
import LoginFunctionalities.LoginPage;
import TabAgentFunctionalities.EditAgent;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EditAgentTestRunner extends Setup {
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

    EditAgent editAgent;
    @Test(priority = 2, description = "Edit an existing without changing any data or permission")
    public void testEditAgentWithNoData() throws InterruptedException {
        editAgent = new EditAgent(driver);
        editAgent.editExistingAgentWithNoData();
        String errorMessageActual1 = driver.findElement(By.xpath("//div[@class='mosha__toast__content__description']")).getText();
        String errorMessageExpected2 = "Agent updated successfully";
        Assert.assertEquals(errorMessageActual1, errorMessageExpected2);
        Thread.sleep(1000);
    }

    @Test(priority = 3, description = "Edit an existing with changing any data or permission")
    public void testEditAgentWithData() throws InterruptedException {
        editAgent = new EditAgent(driver);
        editAgent.editExistingAgentWithData();
        String errorMessageActual3 = driver.findElement(By.xpath("//div[@class='mosha__toast__content__description']")).getText();
        String errorMessageExpected4 = "Agent updated successfully";
        Assert.assertEquals(errorMessageActual3, errorMessageExpected4);
        Thread.sleep(1000);
    }
}
