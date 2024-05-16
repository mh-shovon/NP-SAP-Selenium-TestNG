package TestRunner;

import BusCompany.CreateRoute;
import Configuration.Setup;
import LoginFunctionalities.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateRouteTestRunner extends Setup {
    LoginPage loginPage;
    @Test(priority = 1)
    public void doLoginWithValidCreds() throws InterruptedException {
        loginPage = new LoginPage(driver);
        loginPage.doLogin("01983285059", "01983285059@jatri");
        String logoutButtonHeaderActual5 = driver.findElement(By.xpath("//button[normalize-space()='Logout']")).getText();
        String logoutButtonHeaderExpected5 = "Logout";
        Assert.assertEquals(logoutButtonHeaderActual5, logoutButtonHeaderExpected5);
    }

    CreateRoute createRoute;
    @Test(priority = 2)
    public void createRouteTest() throws InterruptedException {
        createRoute = new CreateRoute(driver);
        Thread.sleep(500);
        createRoute.doCreateRoute();
    }
}
