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
//    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
//    WebElement fromDate;
//
//    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]")
//    WebElement toDate;
//
//    @FindBy(xpath = "//span[@aria-label='Wednesday, May 1, 2024']")
//    WebElement selectFromDate;
//
//    @FindBy(xpath = "//span[@aria-label='Friday, May 31, 2024']")
//    WebElement selectToDate;

    @FindBy(xpath = "//img[@alt='searchIcon']")
    WebElement searchButton;

    public DashboardFilter(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void filterDashboard() throws InterruptedException {
//        fromDate.click();
//        Thread.sleep(1000);
//        selectFromDate.click();
//        Thread.sleep(1000);
//        toDate.click();
//        Thread.sleep(1000);
//        selectToDate.click();
//        Thread.sleep(1000);
        searchButton.click();
        Thread.sleep(2000);
    }

}
