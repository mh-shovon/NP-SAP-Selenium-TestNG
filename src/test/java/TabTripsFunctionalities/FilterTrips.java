package TabTripsFunctionalities;

import Configuration.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FilterTrips extends Setup {
    @FindBy(xpath = "//a[normalize-space()='Trips']")
    WebElement tripsTab;

    @FindBy(className = "p-dropdown-label")
    List<WebElement> operatorDropdown;

    @FindBy(className = "p-dropdown-item")
    List<WebElement> operatorDropdownItem;

    @FindBy(className = "p-dropdown-label")
    List<WebElement> fromDropdown;

    @FindBy(className = "p-dropdown-item")
    List<WebElement> fromDropdownItem;

    @FindBy(className = "p-dropdown-label")
    List<WebElement> toDropdown;

    @FindBy(className = "p-dropdown-item")
    List<WebElement> toDropdownItem;

    @FindBy(className = "primaryInputField")
    WebElement tripNoField;

    @FindBy(className = "p-dropdown-label")
    List<WebElement> directionDropdown;

    @FindBy(className = "p-dropdown-item")
    List<WebElement> directionDropdownItem;

    @FindBy(className = "p-dropdown-label")
    List<WebElement> tripProgressDropdown;

    @FindBy(className = "p-dropdown-item")
    List<WebElement> tripProgressDropdownItem;

    @FindBy(className = "p-dropdown-label")
    List<WebElement> tripStatusDropdown;

    @FindBy(className = "p-dropdown-item")
    List<WebElement> tripStatusDropdownItem;

    @FindBy(xpath = "//span[normalize-space()='Search']")
    WebElement searchButton;

    public FilterTrips(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void filterTripWithNoData() throws InterruptedException {
        tripsTab.click();
        Thread.sleep(1000);
        searchButton.click();
        Thread.sleep(1000);
    }

    public void filterTripWithOperator() throws InterruptedException {
        tripsTab.click();
        Thread.sleep(1000);
        operatorDropdown.get(0).click();
        Thread.sleep(1000);
        operatorDropdownItem.get(0).click();
        Thread.sleep(1000);
        searchButton.click();
        Thread.sleep(1000);
    }

    public void filterTripWithOperatorAndBothFromAndToStoppage() throws InterruptedException {
        tripsTab.click();
        Thread.sleep(1000);
        operatorDropdown.get(0).click();
        Thread.sleep(1000);
        operatorDropdownItem.get(0).click();
        Thread.sleep(1000);
        fromDropdown.get(1).click();
        Thread.sleep(1000);
        fromDropdownItem.get(0).click();
        Thread.sleep(1000);
        toDropdown.get(2).click();
        Thread.sleep(1000);
        toDropdownItem.get(3).click();
        Thread.sleep(1000);
        searchButton.click();
        Thread.sleep(1000);
    }

    public void filterTripWithOperatorAndTripStatusActive() throws InterruptedException {
        tripsTab.click();
        Thread.sleep(1000);
        operatorDropdown.get(0).click();
        Thread.sleep(1000);
        operatorDropdownItem.get(0).click();
        Thread.sleep(1000);
        tripStatusDropdown.get(5).click();
        Thread.sleep(1000);
        tripStatusDropdownItem.get(0).click();
        Thread.sleep(1000);
        searchButton.click();
        Thread.sleep(1000);
    }
    public void filterTripWithOperatorAndTripStatusInactive() throws InterruptedException {
        tripsTab.click();
        Thread.sleep(1000);
        operatorDropdown.get(0).click();
        Thread.sleep(1000);
        operatorDropdownItem.get(0).click();
        Thread.sleep(1000);
        tripStatusDropdown.get(5).click();
        Thread.sleep(1000);
        tripStatusDropdownItem.get(1).click();
        Thread.sleep(1000);
        searchButton.click();
        Thread.sleep(1000);
    }

    public void filterTripWithOperatorAndTripNo() throws InterruptedException {
        tripsTab.click();
        Thread.sleep(1000);
        operatorDropdown.get(0).click();
        Thread.sleep(1000);
        operatorDropdownItem.get(0).click();
        Thread.sleep(1000);
        tripNoField.sendKeys("Automation Trip-001");
        Thread.sleep(1000);
        searchButton.click();
        Thread.sleep(1000);
    }

    public static String monthYear = "July 2024";
    public void filterTripWithOperatorAndDate() throws InterruptedException {
        tripsTab.click();
        Thread.sleep(1000);
        operatorDropdown.get(0).click();
        Thread.sleep(1000);
        operatorDropdownItem.get(0).click();
        Thread.sleep(1000);
        WebElement dateField = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[1]/form/div/div[6]/div/div[1]"));
        dateField.click();
        Thread.sleep(1000);
        while (true){
            String textMonthYear = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[1]/form/div/div[6]/div/div[2]/div/div/div[2]/div[1]/div/div[1]/div")).getText();
            if(textMonthYear.equals(monthYear)){
                break;
            }
            else {
                WebElement nextButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[1]/form/div/div[6]/div/div[2]/div/div/div[2]/div[2]/div[2]"));
                nextButton.click();
            }
        }
        WebElement selectDate = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[1]/form/div/div[6]/div/div[2]/div/div/div[2]/div[1]/div/div[2]/div[33]/span"));
        selectDate.click();
        Thread.sleep(1000);
        searchButton.click();
        Thread.sleep(1000);
    }

}
