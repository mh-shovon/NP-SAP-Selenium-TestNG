import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
        @FindBy(xpath = "//input[@placeholder='01XXXXXXXXX']")
        WebElement txtUsername;

        @FindBy(xpath = "//input[@placeholder='Password']")
        WebElement txtPassword;

        @FindBy(xpath = "//button[@id='login-btn']")
        WebElement loginButton;

        @FindBy(xpath = "//button[normalize-space()='Logout']")
        WebElement logoutButton;


        public LoginPage(WebDriver driver) {
            PageFactory.initElements(driver, this);
        }

        public void doLogin(String username, String password) {
            txtUsername.sendKeys(username);
            txtPassword.sendKeys(password);
            loginButton.click();
        }

        public void doLogout(){
            logoutButton.click();
        }
}
