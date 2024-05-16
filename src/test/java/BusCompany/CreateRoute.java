package BusCompany;

import Configuration.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Set;

public class CreateRoute extends Setup {
    @FindBy(xpath = "//a[normalize-space()='Bus Company']")
    WebElement busCompanyTab;
    @FindBy(className = "corporate-blue-icon-btn")
    List<WebElement> manageButton;
    @FindBy(className = "companyOwnerTabNonActive")
    List<WebElement> companyRouteTab;
    @FindBy(xpath = "//span[normalize-space()='Add Route']")
    WebElement addRouteButton;
    @FindBy(xpath = "//span[@aria-label='Select origin city']")
    WebElement selectOriginCity;
//    @FindBy(xpath = "//li[@id='pv_id_71_0']")
//    WebElement selectCity1;
    @FindBy(xpath = "//span[@aria-label='Select destination city']")
    WebElement selectDestinationCity;
//    @FindBy(xpath = "//li[@id='pv_id_62_17']")
//    WebElement selectCity2;

//public void selectByList() {
//    driver.findElement(By.xpath("//span[@aria-label='Select origin city']")).click();
//    List<WebElement> allOptions = driver.findElements(By.cssSelector("select option"));
//    String option = "Dhaka";
//    for (int i = 0; i < allOptions.size(); i++) {
//        if (allOptions.get(i).getText().contains(option)) {
//            allOptions.get(i).click();
//            System.out.println("clicked");
//            break;
//        }
//    }
//}
    public CreateRoute(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void doCreateRoute() {
        busCompanyTab.click();
        manageButton.get(0).click();
        companyRouteTab.get(1).click();
        addRouteButton.click();
//        selectOriginCity.click();
//        selectCity1.click();
//        selectDestinationCity.click();
//        selectCity2.click();
        selectOriginCity.sendKeys("Dhaka");
        selectDestinationCity.sendKeys("Barishal");
    }
}
