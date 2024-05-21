package TestRunner.BusCompanyManageTestRunners;

import BusCompany.Route.EditRoute;
import Configuration.Setup;
import LoginFunctionalities.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EditRouteTestRunner extends Setup {
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

    EditRoute editRoute;
    @Test(priority = 2, description = "Edit an existing route")
    public void editRouteTest() throws InterruptedException {
        editRoute = new EditRoute(driver);
        Thread.sleep(1000);
        editRoute.editRoute();
        Thread.sleep(1000);
        String editSuccessHeaderActual = driver.findElement(By.xpath("//div[@class='mosha__toast__content__description']")).getText();
        String editSuccessHeaderExpected = "Route updated successfully";
        Assert.assertEquals(editSuccessHeaderActual, editSuccessHeaderExpected);
    }
}
