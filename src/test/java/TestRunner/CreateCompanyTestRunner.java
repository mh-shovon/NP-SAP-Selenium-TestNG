package TestRunner;

import BusCompany.CreateCompany;
import Configuration.Setup;
import LoginFunctionalities.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

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

    public static String generateRandomNumber(int len) {
        String num = "0123456789";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++)
            sb.append(num.charAt(rnd.nextInt(num.length())));
        return sb.toString();
    }

    CreateCompany createCompany;
    @Test(priority = 2)
    public void createCompanyTest() throws InterruptedException {
        createCompany = new CreateCompany(driver);
        createCompany.doCreateCompany("Bus Company-"+generateRandomNumber(3));
        Thread.sleep(1000);
        WebElement searchBtn = driver.findElement(By.xpath("//span[normalize-space()='Search']"));
        searchBtn.isDisplayed();
    }

}
