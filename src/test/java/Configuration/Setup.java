package Configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class Setup {
    public static WebDriver driver;

    @BeforeTest
    public void setUp() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://dev.admin.intercity.jatri.co/login");
        Thread.sleep(500);

    }

    @AfterTest
    public void closeBrowser() {
//        driver.quit();
    }

}
