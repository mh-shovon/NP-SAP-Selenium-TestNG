package Dashboard;

import Configuration.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class DashboardFilter {
    @FindBy(className = "primaryDateFieldInput")
    List<WebElement> fromDate;

//    @FindBy(className = "vc-day-content")
//    List<WebElement> selectFromDate;

    @FindBy(xpath = "//span[@aria-label='Wednesday, May 1, 2024']")
    WebElement selectFromDate;

    @FindBy(className = "primaryDateFieldInput")
    List<WebElement> toDate;

//    @FindBy(className = "vc-day-content")
//    List<WebElement> selectToDaTe;

    @FindBy(xpath = "//span[@aria-label='Wednesday, May 1, 2024']")
    WebElement selectToDate;

    @FindBy(xpath = "//img[@alt='searchIcon']")
    WebElement searchButton;

    public DashboardFilter(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void filterDashboard() throws InterruptedException {
//        fromDate.get(0).click();
//        Thread.sleep(1000);
////        selectFromDate.get(3).click();
////        Thread.sleep(1000);
//        selectFromDate.click();
//        Thread.sleep(1000);
//        toDate.get(1).click();
//        Thread.sleep(1000);
////        selectToDaTe.get(33).click();
////        Thread.sleep(1000);
//        selectToDate.click();
//        Thread.sleep(1000);
        searchButton.click();
        Thread.sleep(2000);
    }

}
