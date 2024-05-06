package TestRunner;

import BusCompany.CreateCompany;
import Configuration.Setup;
import LoginFunctionalities.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateCompanyTestRunner extends Setup{
    LoginPage loginPage;
    @Test(priority = 1)
    public void doLoginWithValidCreds() throws InterruptedException {
        loginPage = new LoginPage(driver);
        loginPage.doLogin("01983285059", "01983285059@jatri");
        String logoutButtonHeaderActual5 = driver.findElement(By.xpath("//button[normalize-space()='Logout']")).getText();
        String logoutButtonHeaderExpected5 = "Logout";
        Assert.assertEquals(logoutButtonHeaderActual5, logoutButtonHeaderExpected5);
    }

    CreateCompany createCompany;
    @Test(priority = 2)
    public void createCompanyTest() throws InterruptedException {
        createCompany = new CreateCompany(driver);
        createCompany.doCreateCompany();
        Thread.sleep(2000);
        WebElement searchBtn = driver.findElement(By.xpath("//span[normalize-space()='Search']"));
        searchBtn.isDisplayed();
    }


}
