package TestRunners.TabAgentTestRunners;

import Configuration.Setup;
import LoginFunctionalities.LoginPage;
import TabAgentFunctionalities.CreateAgent;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAgentTestRunner extends Setup {
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

    CreateAgent createAgent;
    @Test(priority = 2, description = "Check the required field error")
    public void testCreateNewAgentWithNoData() throws InterruptedException {
        createAgent = new CreateAgent(driver);
        createAgent.createNewAgentWithNoData();
        String errorMessageActual1 = driver.findElement(By.xpath("//p[normalize-space()='Name is required']")).getText();
        String errorMessageExpected2 = "Name is required";
        Assert.assertEquals(errorMessageActual1, errorMessageExpected2);
        Thread.sleep(1000);
    }

    @Test(priority = 3, description = "Create a new agent")
    public void testCreateNewAgent() throws InterruptedException {
        createAgent = new CreateAgent(driver);
        createAgent.createNewAgent();
        String errorMessageActual3 = driver.findElement(By.xpath("//div[@class='mosha__toast__content__description']")).getText();
        String errorMessageExpected4 = "New agent created successfully";
        Assert.assertEquals(errorMessageActual3, errorMessageExpected4);
        Thread.sleep(1000);
    }
}
