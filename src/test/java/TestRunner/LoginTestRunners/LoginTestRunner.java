package TestRunner.LoginTestRunners;

import Configuration.Setup;
import LoginFunctionalities.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestRunner extends Setup {
    LoginPage loginPage;

    @Test(priority = 1)
    public void doLoginWithNoCreds() throws InterruptedException {
        loginPage = new LoginPage(driver);
        loginPage.doLogin("", "");
        String errorMessageActual1 = driver.findElement(By.xpath("//p[normalize-space()='Phone is required']")).getText();
        String errorMessageExpected1 = "Phone is required";
        Assert.assertEquals(errorMessageActual1, errorMessageExpected1);
        Thread.sleep(2000);
    }

    @Test(priority = 2)
    public void doLoginWithInValidCreds() throws InterruptedException {
        loginPage = new LoginPage(driver);
        loginPage.doLogin("01983285058", "01983285059@jatr");
        String logoutButtonHeaderActual5 = driver.findElement(By.xpath("//button[@id='login-btn']")).getText();
        String logoutButtonHeaderExpected5 = "Log in";
        Assert.assertEquals(logoutButtonHeaderActual5, logoutButtonHeaderExpected5);
    }

    @Test(priority = 3)
    public void doLoginWithValidCreds() throws InterruptedException {
        loginPage = new LoginPage(driver);
        loginPage.doLogin("01983285059", "01983285059@jatri");
        String logoutButtonHeaderActual5 = driver.findElement(By.xpath("//button[normalize-space()='Logout']")).getText();
        String logoutButtonHeaderExpected5 = "Logout";
        Assert.assertEquals(logoutButtonHeaderActual5, logoutButtonHeaderExpected5);
    }
}

