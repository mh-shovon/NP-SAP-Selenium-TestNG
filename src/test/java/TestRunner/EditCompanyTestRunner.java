package TestRunner;

import BusCompany.EditCompany;
import Configuration.Setup;
import LoginFunctionalities.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EditCompanyTestRunner extends Setup {
    LoginPage loginPage;
    @Test(priority = 1)
    public void doLoginWithValidCreds() throws InterruptedException {
        loginPage = new LoginPage(driver);
        loginPage.doLogin("01983285059", "01983285059@jatri");
        String logoutButtonHeaderActual5 = driver.findElement(By.xpath("//button[normalize-space()='Logout']")).getText();
        String logoutButtonHeaderExpected5 = "Logout";
        Assert.assertEquals(logoutButtonHeaderActual5, logoutButtonHeaderExpected5);
    }

    EditCompany editCompany;
    @Test(priority = 2)
    public void editCompanyTest() throws InterruptedException {
        editCompany = new EditCompany(driver);
        editCompany.doEditCompany();
        WebElement updateSuccessMessage = driver.findElement(By.xpath("//div[@class='mosha__toast']"));
        updateSuccessMessage.isDisplayed();
    }

}
