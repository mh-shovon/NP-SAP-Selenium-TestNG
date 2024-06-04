package TabTripsFunctionalities;

import Configuration.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CreateTrip extends Setup {
    /* <----- Trip Information Page Start -----> */
    @FindBy(xpath = "//a[normalize-space()='Trips']")
    WebElement tripsTab;

    @FindBy(className = "topBarAddButton")
    List<WebElement> addTripsButton;

    @FindBy(className = "p-dropdown-label")
    List<WebElement> operatorDropdown;

    @FindBy(className = "p-dropdown-item")
    List<WebElement> operatorDropdownItem;

    @FindBy(className = "p-dropdown-label")
    List<WebElement> busModelDropdown;

    @FindBy(className = "p-dropdown-item")
    List<WebElement> busModelDropdownItem;

//    @FindBy(className = "p-dropdown-label")
//    List<WebElement> busRegNoDropdown;
//
//    @FindBy(className = "p-dropdown-label")
//    List<WebElement> busRegNoDropdownItem;

    @FindBy(xpath = "//input[@placeholder='Enter coach/trip number']")
    WebElement coachOrTripNumber;

    @FindBy(className = "p-dropdown-label")
    List<WebElement> routeDropdown;

    @FindBy(className = "p-dropdown-item")
    List<WebElement> routeDropdownItem;

    @FindBy(xpath = "//input[@placeholder='Enter trip heading']")
    WebElement tripHeading;

    public static void setDepartureDate() throws InterruptedException {
        WebElement selectDepartureDateField = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div[1]/input"));
        selectDepartureDateField.click();
        Thread.sleep(500);
        String departureMonthYear = "July 2024";
        while (true) {
            String departureTextMonthYear = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div[2]/div/div/div[2]/div[1]/div/div[1]/div")).getText();
            System.out.println("textMonthYear: " + departureTextMonthYear + " logic: " + departureTextMonthYear.equals(departureMonthYear));
            if(departureTextMonthYear.equals(departureMonthYear)){
                break;
            }
            else {
                WebElement nextButton = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]"));
                nextButton.click();
                Thread.sleep(1000);
            }
        }
        WebElement selectDate = driver.findElement(By.xpath("//span[contains(text(),'25')]"));
        selectDate.click();
    }

    public static void setDepartureTime() throws InterruptedException {
        WebElement fakeClickOnPage = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[2]/div[2]"));

        WebElement selectDepartureTimeField = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/input[1]"));
        selectDepartureTimeField.click();
        Thread.sleep(500);
        WebElement hourDropDown = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div/div[2]/div[2]/div[1]/select"));
        hourDropDown.click();
        Thread.sleep(500);
        WebElement hourDropdownItem = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div/div[2]/div[2]/div[1]/select/option[12]"));
        hourDropdownItem.click();
        Thread.sleep(500);
        WebElement minuteDropdown = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]"));
        minuteDropdown.click();
        Thread.sleep(500);
        WebElement minuteDropdownItem = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div/div[2]/div[2]/div[2]/select/option[1]"));
        minuteDropdownItem.click();
        Thread.sleep(500);
        WebElement amPmSelection = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div/div[2]/div[2]/div[3]/button[2]"));
        amPmSelection.click();
        fakeClickOnPage.click();
        Thread.sleep(500);
    }

    public static void setArrivalDate() throws InterruptedException {
        WebElement selectArrivalDateField = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[3]/div[2]/div[1]"));
        selectArrivalDateField.click();
        Thread.sleep(500);
        String arrivalMonthYear = "July 2024";
        while (true) {
            String arrivalTextMonthYear = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")).getText();
            System.out.println("textMonthYear: " + arrivalTextMonthYear + " logic: " + arrivalTextMonthYear.equals(arrivalMonthYear));
            if(arrivalTextMonthYear.equals(arrivalMonthYear)){
                break;
            }
            else {
                WebElement nextButton = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]"));
                nextButton.click();
                Thread.sleep(1000);
            }
        }
        WebElement selectDate = driver.findElement(By.xpath("//span[contains(text(),'26')]"));
        selectDate.click();
    }

    public static void setArrivalTime() throws InterruptedException {
        WebElement fakeClickOnPage = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[2]/div[2]"));

        WebElement selectArrivalTimeField = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[2]/div[1]/input"));
        selectArrivalTimeField.click();
        Thread.sleep(500);
        WebElement hourDropDown = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]"));
        hourDropDown.click();
        Thread.sleep(500);
        WebElement hourDropdownItem = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[2]/div[2]/div/div/div/div/div[2]/div[2]/div[1]/select/option[9]"));
        hourDropdownItem.click();
        Thread.sleep(500);
        WebElement minuteDropdown = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]"));
        minuteDropdown.click();
        Thread.sleep(500);
        WebElement minuteDropdownItem = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[2]/div[2]/div/div/div/div/div[2]/div[2]/div[2]/select/option[1]"));
        minuteDropdownItem.click();
        Thread.sleep(500);
        WebElement amPmSelection = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[2]/div[2]/div/div/div/div/div[2]/div[2]/div[3]/button[1]"));
        amPmSelection.click();
        fakeClickOnPage.click();
        Thread.sleep(500);
    }

    @FindBy(xpath = "//button[@class='nextStepButton']")
    WebElement nextStepButton;
    /* <----- Trip Information Page End -----> */

    /* <----- Trip Permission Page Start -----> */
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")
    WebElement onlinePermissionYes;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]")
    WebElement onlinePermissionNo;

    public void setTripAvailableTime() throws InterruptedException {
        WebElement tripAvailableTime = driver.findElement(By.xpath("//input[@placeholder='Enter trip available time']"));
        tripAvailableTime.sendKeys(Keys.CONTROL + "a");
        tripAvailableTime.sendKeys(Keys.DELETE);
        tripAvailableTime.sendKeys("180");
        Thread.sleep(500);
    }

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]")
    WebElement onlineQuotaYes;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]")
    WebElement onlineQuotaNo;

    public void setOnlineCommissionFixed() throws InterruptedException {
        WebElement onlineCommission = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[4]/div[2]/input"));
        onlineCommission.sendKeys(Keys.CONTROL + "a");
        onlineCommission.sendKeys(Keys.DELETE);
        onlineCommission.sendKeys("50");
        WebElement commissionTypeDropdown= driver.findElements(By.className("p-dropdown-label")).get(0);
        commissionTypeDropdown.click();
        WebElement commissionTypeFixed= driver.findElements(By.className("p-dropdown-item")).get(1);
        commissionTypeFixed.click();
        Thread.sleep(500);
    }

    public void setOnlineCommissionPercentage() throws InterruptedException {
        WebElement onlineCommission = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[4]/div[2]/input"));
        onlineCommission.sendKeys(Keys.CONTROL + "a");
        onlineCommission.sendKeys(Keys.DELETE);
        onlineCommission.sendKeys("50");
        WebElement commissionTypeDropdown = driver.findElements(By.className("p-dropdown-label")).get(0);
        commissionTypeDropdown.click();
        WebElement commissionTypePercentage = driver.findElements(By.className("p-dropdown-item")).get(0);
        commissionTypePercentage.click();
        Thread.sleep(500);
    }

    public void setTripReservationReleaseTimeWithTripDate() throws InterruptedException {
        WebElement tripReservationReleaseTime = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]"));
        tripReservationReleaseTime.sendKeys(Keys.CONTROL + "a");
        tripReservationReleaseTime.sendKeys(Keys.DELETE);
        tripReservationReleaseTime.sendKeys("60");
        WebElement tripReservationReleaseTypeDropDown = driver.findElements(By.className("p-dropdown-label")).get(1);
        tripReservationReleaseTypeDropDown.click();
        WebElement tripReservationReleaseTypeTripDate = driver.findElements(By.className("p-dropdown-item")).get(0);
        tripReservationReleaseTypeTripDate.click();
        Thread.sleep(500);
    }

    public void setTripReservationReleaseTimeWithBoardingDate() throws InterruptedException {
        WebElement tripReservationReleaseTime = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]"));
        tripReservationReleaseTime.sendKeys(Keys.CONTROL + "a");
        tripReservationReleaseTime.sendKeys(Keys.DELETE);
        tripReservationReleaseTime.sendKeys("30");
        WebElement tripReservationReleaseTypeDropDown = driver.findElements(By.className("p-dropdown-label")).get(1);
        tripReservationReleaseTypeDropDown.click();
        WebElement tripReservationReleaseTypeBoardingDate = driver.findElements(By.className("p-dropdown-item")).get(1);
        tripReservationReleaseTypeBoardingDate.click();
        Thread.sleep(500);
    }
    public void setHighestDiscountCap(){
        WebElement  highestDiscountCap = driver.findElement(By.xpath("//input[@placeholder='Enter highest discount cap']"));
        highestDiscountCap.sendKeys(Keys.CONTROL + "a");
        highestDiscountCap.sendKeys(Keys.DELETE);
        highestDiscountCap.sendKeys("0");
    }

    @FindBy(xpath = "//body/div[@id='app']/div[2]/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]")
    WebElement discountYes;

    @FindBy(xpath = "//body/div[@id='app']/div[2]/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div[2]")
    WebElement discountNo;
    /* <----- Trip Permission Page End -----> */

    public CreateTrip(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void createNewTrip() throws InterruptedException {
        tripsTab.click();
        Thread.sleep(500);
        addTripsButton.get(0).click();
        Thread.sleep(500);
        operatorDropdown.get(0).click();
        Thread.sleep(500);
        operatorDropdownItem.get(0).click();
        Thread.sleep(500);
        busModelDropdown.get(1).click();
        Thread.sleep(500);
        busModelDropdownItem.get(0).click();
        Thread.sleep(500);
//        busRegNoDropdown.get(2).click();
//        Thread.sleep(500);
//        busRegNoDropdownItem.get(0).click();
//        Thread.sleep(500);
        coachOrTripNumber.sendKeys("Automation Trip-002");
        Thread.sleep(500);
        routeDropdown.get(3).click();
        Thread.sleep(500);
        routeDropdownItem.get(0).click();
        Thread.sleep(1000);
        tripHeading.sendKeys("Dhaka - Cox's Bazar(Automation Trip-002)");
        setDepartureDate();
        Thread.sleep(500);
        setDepartureTime();
        Thread.sleep(500);
        setArrivalDate();
        Thread.sleep(500);
        setArrivalTime();
        Thread.sleep(500);
        nextStepButton.click();
        Thread.sleep(500);
        onlinePermissionYes.click();
        Thread.sleep(500);
        setTripAvailableTime();
        Thread.sleep(500);
        onlineQuotaYes.click();
        Thread.sleep(500);
        setOnlineCommissionFixed();
        Thread.sleep(500);
        setTripReservationReleaseTimeWithTripDate();
        Thread.sleep(500);
        setHighestDiscountCap();
        Thread.sleep(500);
        discountYes.click();
        Thread.sleep(500);
    }
}
