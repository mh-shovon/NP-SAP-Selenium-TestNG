package TestRunner.BusCompanyManageTestRunners.RouteTestRunner;

import BusCompany.Route.CreateRoute;
import Configuration.Setup;
import LoginFunctionalities.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateRouteTestRunner extends Setup {
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

    CreateRoute createRoute;
    @Test(priority = 2, description = "Check the route is exist or not")
    public void checkExistingRouteTest() throws InterruptedException {
        createRoute = new CreateRoute(driver);
        createRoute.checkExistingRoute();
        String addRouteButtonHeaderActual = driver.findElement(By.xpath("//div[@class='mosha__toast__content__text']")).getText();
        String addRouteButtonHeaderExpected = "Error";
        Assert.assertEquals(addRouteButtonHeaderActual, addRouteButtonHeaderExpected);
    }

    @Test(priority = 3, description = "Creating a new route")
    public void createRouteTest() throws InterruptedException {
        createRoute = new CreateRoute(driver);
        createRoute.createNewRoute();
        String addRouteButtonHeaderActual = driver.findElement(By.xpath("//div[@class='mosha__toast__content__description']")).getText();
        String addRouteButtonHeaderExpected = "New route created successfully";
        Assert.assertEquals(addRouteButtonHeaderActual, addRouteButtonHeaderExpected);
    }
}
