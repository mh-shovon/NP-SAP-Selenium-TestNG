package BusCompany;

import Configuration.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;

public class CreateRoute extends Setup{
    @FindBy(xpath = "//a[normalize-space()='Bus Company']")
    WebElement busCompanyTab;
    @FindBy(className = "corporate-blue-icon-btn")
    List<WebElement> manageButton;
    @FindBy(className = "companyOwnerTabNonActive")
    List<WebElement> companyRouteTab;
    @FindBy(xpath = "//span[normalize-space()='Add Route']")
    WebElement addRouteButton;
//    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]")
//    WebElement originCityDropdown;
//    Select originCityDropdownSelect = new Select(originCityDropdown);

    public CreateRoute(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void doCreateRoute() throws InterruptedException {
        busCompanyTab.click();
        Thread.sleep(500);
        manageButton.get(0).click();
        Thread.sleep(500);
        companyRouteTab.get(1).click();
        Thread.sleep(500);
        addRouteButton.click();
        Thread.sleep(500);
//        originCityDropdown.click();
//        originCityDropdownSelect.selectByValue("Dhaka");
    }
}
