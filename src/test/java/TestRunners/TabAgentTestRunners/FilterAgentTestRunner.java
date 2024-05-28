package TestRunners.TabAgentTestRunners;

import Configuration.Setup;
import LoginFunctionalities.LoginPage;
import TabAgentFunctionalities.FilterAgent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FilterAgentTestRunner extends Setup {
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

    FilterAgent filterAgent;
    @Test(priority = 2, description = "Filter agent with no data" )
    public void testFilterAgentWithNoData() throws InterruptedException {
        filterAgent = new FilterAgent(driver);
        filterAgent.filterAgentWithNoData();
        WebElement buttonDisplayed = driver.findElement(By.xpath("//button[normalize-space()='Next']"));
        Assert.assertEquals(buttonDisplayed.getText(), "Next");
        Thread.sleep(1000);
    }

    @Test(priority = 3, description = "Filter agent with operator" )
    public void testFilterAgentWithOperator() throws InterruptedException {
        filterAgent = new FilterAgent(driver);
        filterAgent.filterAgentWithOperator();
        WebElement operatorDisplayed = driver.findElement(By.xpath("//span[@aria-label='Shingeki no Kyojin']"));
        Assert.assertEquals(operatorDisplayed.getText(), "Shingeki no Kyojin");
        Thread.sleep(1000);
    }

    @Test(priority = 4, description = "Filter agent with payment type" )
    public void testFilterAgentWithPaymentType() throws InterruptedException {
        filterAgent = new FilterAgent(driver);
        filterAgent.filterAgentWithPaymentType();
        WebElement buttonDisplayed = driver.findElement(By.xpath("//button[normalize-space()='Next']"));
        Assert.assertEquals(buttonDisplayed.getText(), "Next");
        Thread.sleep(1000);
    }

    @Test(priority = 5, description = "Filter agent with mobile number" )
    public void testFilterAgentWithMobileNumber() throws InterruptedException {
        filterAgent = new FilterAgent(driver);
        filterAgent.filterAgentWithMobileNumber();
        WebElement numberDisplayed = driver.findElement(By.xpath("//tbody/tr[1]/td[5]"));
        Assert.assertEquals(numberDisplayed.getText(), "01888000121");
        Thread.sleep(1000);
    }

    @Test(priority = 6, description = "Filter agent with all data" )
    public void testFilterAgentWithAllData() throws InterruptedException {
        filterAgent = new FilterAgent(driver);
        filterAgent.filterAgentWithAllData();
        WebElement numberDisplayed = driver.findElement(By.xpath("//td[normalize-space()='01888000200']"));
        Assert.assertEquals(numberDisplayed.getText(), "01888000200");
        Thread.sleep(1000);
    }
}
