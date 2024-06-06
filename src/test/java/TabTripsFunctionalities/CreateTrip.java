package TabTripsFunctionalities;

import Configuration.Setup;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

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
            if (departureTextMonthYear.equals(departureMonthYear)) {
                break;
            } else {
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
        WebElement amPmSelection = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div/div[2]/div[2]/div[3]/button[1]"));
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
            if (arrivalTextMonthYear.equals(arrivalMonthYear)) {
                break;
            } else {
                WebElement nextButton = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]"));
                nextButton.click();
                Thread.sleep(1000);
            }
        }
        WebElement selectDate = driver.findElement(By.xpath("//span[contains(text(),'25')]"));
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
        WebElement amPmSelection = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[2]/div[2]/div/div/div/div/div[2]/div[2]/div[3]/button[2]"));
        amPmSelection.click();
        fakeClickOnPage.click();
        Thread.sleep(500);
    }

    @FindBy(className = "nextStepButton")
    List<WebElement> nextStepButton;
    /* <----- Trip Information Page End -----> */

    /* <----- Trip Permission Page Start -----> */
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")
    WebElement onlinePermissionYes;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]")
    WebElement onlinePermissionNo;

    public void setTripAvailableForOnline() throws InterruptedException {
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
        WebElement commissionTypeDropdown = driver.findElements(By.className("p-dropdown-label")).get(0);
        commissionTypeDropdown.click();
        WebElement commissionTypeFixed = driver.findElements(By.className("p-dropdown-item")).get(1);
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
        WebElement tripReservationReleaseTime = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/input"));
        tripReservationReleaseTime.sendKeys(Keys.CONTROL + "a");
        tripReservationReleaseTime.sendKeys(Keys.DELETE);
        tripReservationReleaseTime.sendKeys("60");
        Thread.sleep(500);
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

    public void setHighestDiscountCap() {
        WebElement highestDiscountCap = driver.findElement(By.xpath("//input[@placeholder='Enter highest discount cap']"));
        highestDiscountCap.sendKeys(Keys.CONTROL + "a");
        highestDiscountCap.sendKeys(Keys.DELETE);
        highestDiscountCap.sendKeys("0");
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[3]/div/div[2]/div/div[1]")
    WebElement discountYes;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[3]/div/div[2]/div/div[2]")
    WebElement discountNo;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[3]/div/div[3]/div/div[1]")
    WebElement reserveYes;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[3]/div/div[3]/div/div[2]")
    WebElement reserveNo;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[3]/div/div[4]/div/div[1]")
    WebElement tripCancelYes;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[3]/div/div[4]/div/div[2]")
    WebElement tripCancelNo;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[3]/div/div[5]/div/div[1]")
    WebElement eidTripYes;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[3]/div/div[5]/div/div[2]")
    WebElement eidTripNo;
    /* <----- Trip Permission Page End -----> */

    /* <----- Trip Seat-Fare & Boarding-Dropping Page Start -----> */
    public void counterMainRouteActivities() throws InterruptedException {
        WebElement counterMainRouteSelected = driver.findElement(By.id("counter0"));
        boolean isCounterMainRouteSelected = counterMainRouteSelected.isSelected();
        if (isCounterMainRouteSelected) {
            System.out.println("Main Route is selected by default");
            WebElement counterMainRouteFair = driver.findElements(By.className("primaryInputField")).get(0);
            Thread.sleep(500);
            counterMainRouteFair.sendKeys("1200");
            Thread.sleep(500);
        } else {
            System.out.println("That's must be an error");
        }
    }

    public void onlineMainRouteActivities() throws InterruptedException {
        WebElement onlineMainRouteSelected = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/label"));
        boolean isOnlineMainRouteSelected = onlineMainRouteSelected.isSelected();
        if (isOnlineMainRouteSelected) {
            System.out.println("Main route is selected for online");
        } else {
            onlineMainRouteSelected.click();
            System.out.println("Enable the main route on online");
            Thread.sleep(500);
        }
    }

    public void counterSubRoute1Activities() throws InterruptedException {
        WebElement selectSubRoute1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/label"));
        boolean isSubRoute1Selected = selectSubRoute1.isSelected();
        if (isSubRoute1Selected) {
            System.out.println("Go for next sub-route");
        } else {
            System.out.println("Logic:" + selectSubRoute1.isSelected());
            selectSubRoute1.click();
            System.out.println("Sub-route1 is selected");
            WebElement fairSubRoute1 = driver.findElements(By.className("primaryInputField")).get(1);
            Thread.sleep(500);
            fairSubRoute1.sendKeys("600");
            Thread.sleep(500);
        }
    }

    public void counterSubRoute2Activities() throws InterruptedException {
        WebElement selectSubRoute2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[1]/div[2]/div[3]/div[2]/div[2]/label"));
        boolean isSubRoute2Selected = selectSubRoute2.isSelected();
        if (isSubRoute2Selected) {
            System.out.println("Go for next sub-route");
        } else {
            System.out.println("Logic:" + selectSubRoute2.isSelected());
            selectSubRoute2.click();
            System.out.println("Sub-route2 is selected");
            WebElement fairSubRoute2 = driver.findElements(By.className("primaryInputField")).get(2);
            Thread.sleep(500);
            fairSubRoute2.sendKeys("900");
            Thread.sleep(500);
        }
    }

    public void counterSubRoute3Activities() throws InterruptedException {
        WebElement selectSubRoute3 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[1]/div[2]/div[4]/div[2]/div[2]/label"));
        boolean isSubRoute3Selected = selectSubRoute3.isSelected();
        if (isSubRoute3Selected) {
            System.out.println("Go for next sub-route");
        } else {
            System.out.println("Logic:" + selectSubRoute3.isSelected());
            selectSubRoute3.click();
            System.out.println("Sub-route3 is selected");
            WebElement fairSubRoute3 = driver.findElements(By.className("primaryInputField")).get(3);
            Thread.sleep(500);
            fairSubRoute3.sendKeys("700");
            Thread.sleep(500);
        }
    }

    public void counterSubRoute4Activities() throws InterruptedException {
        WebElement selectSubRoute4 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[1]/div[2]/div[5]/div[2]/div[2]/label"));
        boolean isSubRoute4Selected = selectSubRoute4.isSelected();
        if (isSubRoute4Selected) {
            System.out.println("Go for next sub-route");
        } else {
            System.out.println("Logic:" + selectSubRoute4.isSelected());
            selectSubRoute4.click();
            System.out.println("Sub-route4 is selected");
            WebElement fairSubRoute4 = driver.findElements(By.className("primaryInputField")).get(4);
            Thread.sleep(500);
            fairSubRoute4.sendKeys("1000");
            Thread.sleep(700);
        }
    }

    public void onlineSubRoute4Activities() throws InterruptedException {
        WebElement onlineSubRoute4Selected = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[1]/div[2]/div[5]/div[2]/div[1]/label"));
        boolean isOnlineSubRoute4Selected = onlineSubRoute4Selected.isSelected();
        if (isOnlineSubRoute4Selected) {
            System.out.println("Sub-route4 is selected for online");
        } else {
            onlineSubRoute4Selected.click();
            System.out.println("Enable the Sub-route4 on online");
            Thread.sleep(500);
            WebElement onlineMinFare = driver.findElements(By.className("primaryInputField")).get(6);
            onlineMinFare.sendKeys("1000");
            Thread.sleep(500);
            WebElement onlineMaxFare = driver.findElements(By.className("primaryInputField")).get(7);
            onlineMaxFare.sendKeys("1200");
            Thread.sleep(500);
        }
    }

    public void counterSubRoute5Activities() throws InterruptedException {
        WebElement selectSubRoute5 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[1]/div[2]/div[6]/div[2]/div[2]/label"));
        boolean isSubRoute5Selected = selectSubRoute5.isSelected();
        if (isSubRoute5Selected) {
            System.out.println("Go for next sub-route");
        } else {
            System.out.println("Logic:" + selectSubRoute5.isSelected());
            selectSubRoute5.click();
            System.out.println("Sub-route5 is selected");
            WebElement fairSubRoute5 = driver.findElements(By.className("primaryInputField")).get(5);
            Thread.sleep(500);
            fairSubRoute5.sendKeys("500");
            Thread.sleep(500);
        }
    }

    public void scrollWindow() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,500)");
    }

    public void setBoardingInformation1() throws InterruptedException {
        WebElement stoppageDropdown1 = driver.findElements(By.className("p-dropdown-label")).get(1);
        stoppageDropdown1.click();
        Thread.sleep(500);
        WebElement selectStoppage1 = driver.findElements(By.className("p-dropdown-item")).get(0);
        selectStoppage1.click();
        Thread.sleep(500);
        WebElement counterDropdown1 = driver.findElements(By.className("p-dropdown-label")).get(2);
        counterDropdown1.click();
        Thread.sleep(500);
        WebElement selectCounter1 = driver.findElements(By.className("p-dropdown-item")).get(0);
        selectCounter1.click();
        Thread.sleep(500);
        WebElement makeAvailableForOnline1 = driver.findElements(By.className("text-primaryText")).get(28);
        makeAvailableForOnline1.click();
        Thread.sleep(500);

        scrollWindow();
        Thread.sleep(500);
    }

    public void setBoardingInformation2() throws InterruptedException {
        WebElement stoppageDropdown2 = driver.findElements(By.className("p-dropdown-label")).get(4);
        stoppageDropdown2.click();
        Thread.sleep(500);
        WebElement selectStoppage2 = driver.findElements(By.className("p-dropdown-item")).get(0);
        selectStoppage2.click();
        Thread.sleep(500);
        WebElement counterDropdown2 = driver.findElements(By.className("p-dropdown-label")).get(5);
        counterDropdown2.click();
        Thread.sleep(500);
        WebElement selectCounter2 = driver.findElements(By.className("p-dropdown-item")).get(0);
        selectCounter2.click();
        Thread.sleep(500);

//        WebElement selectBoardingDateField2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[4]/div/div[1]/input"));
//        selectBoardingDateField2.click();
//        Thread.sleep(500);
//        String boardingDate2MonthYearExpected = "July 2024";
//        while (true) {
//            String boardingDate2MonthYearActual = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div[2]/div/div/div[2]/div[1]/div/div[1]/div")).getText();
//            System.out.println("boardingDate2TextMonthYear: " + boardingDate2MonthYearActual + " logic: " + boardingDate2MonthYearActual.equals(boardingDate2MonthYearExpected));
//            if(boardingDate2MonthYearActual.equals(boardingDate2MonthYearExpected)){
//                break;
//            }
//            else {
//                WebElement nextButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[4]/div/div[2]/div/div/div[2]/div[2]/div[2]"));
//                nextButton.click();
//                Thread.sleep(1000);
//            }
//        }
//        WebElement selectBoardingDate2 = driver.findElement(By.xpath("//span[contains(text(),'25')]"));
//        selectBoardingDate2.click();

        WebElement fakeClickOnPage = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]"));
        WebElement selectBoardingTimeField2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[5]/div/div[1]/input"));
        selectBoardingTimeField2.click();
        Thread.sleep(500);
        WebElement hourDropDown2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[5]/div/div[2]/div/div/div/div/div[2]/div[2]/div[1]/select"));
        hourDropDown2.click();
        Thread.sleep(500);
        WebElement hourDropdownItem2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[5]/div/div[2]/div/div/div/div/div[2]/div[2]/div[1]/select/option[3]"));
        hourDropdownItem2.click();
        Thread.sleep(500);
        WebElement minuteDropdown2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[5]/div/div[2]/div/div/div/div/div[2]/div[2]/div[2]/select"));
        minuteDropdown2.click();
        Thread.sleep(500);
        WebElement minuteDropdownItem2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[5]/div/div[2]/div/div/div/div/div[2]/div[2]/div[2]/select/option[1]"));
        minuteDropdownItem2.click();
        Thread.sleep(500);
        WebElement amPmSelection2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[5]/div/div[2]/div/div/div/div/div[2]/div[2]/div[3]/button[2]"));
        amPmSelection2.click();
        fakeClickOnPage.click();
        Thread.sleep(500);

        WebElement makeAvailableForOnline2 = driver.findElements(By.className("text-primaryText")).get(30);
        makeAvailableForOnline2.click();
        Thread.sleep(500);
    }

    public void setBoardingInformation3() throws InterruptedException {
        WebElement stoppageDropdown3 = driver.findElements(By.className("p-dropdown-label")).get(7);
        stoppageDropdown3.click();
        Thread.sleep(500);
        WebElement selectStoppage3 = driver.findElements(By.className("p-dropdown-item")).get(1);
        selectStoppage3.click();
        Thread.sleep(500);
        WebElement counterDropdown3 = driver.findElements(By.className("p-dropdown-label")).get(8);
        counterDropdown3.click();
        Thread.sleep(500);
        WebElement selectCounter3 = driver.findElements(By.className("p-dropdown-item")).get(0);
        selectCounter3.click();
        Thread.sleep(500);

        WebElement fakeClickOnPage = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[3]/div[2]"));
        WebElement selectBoardingTimeField3 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[3]/div[2]/div[1]/div[5]/div/div[1]/input"));
        selectBoardingTimeField3.click();
        Thread.sleep(500);
        WebElement hourDropDown3 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[3]/div[2]/div[1]/div[5]/div/div[2]/div/div/div/div/div[2]/div[2]/div[1]/select"));
        hourDropDown3.click();
        Thread.sleep(500);
        WebElement hourDropdownItem3 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[3]/div[2]/div[1]/div[5]/div/div[2]/div/div/div/div/div[2]/div[2]/div[1]/select/option[6]"));
        hourDropdownItem3.click();
        Thread.sleep(500);
        WebElement minuteDropdown3 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[3]/div[2]/div[1]/div[5]/div/div[2]/div/div/div/div/div[2]/div[2]/div[2]/select"));
        minuteDropdown3.click();
        Thread.sleep(500);
        WebElement minuteDropdownItem3 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[3]/div[2]/div[1]/div[5]/div/div[2]/div/div/div/div/div[2]/div[2]/div[2]/select/option[1]"));
        minuteDropdownItem3.click();
        Thread.sleep(500);
        WebElement amPmSelection3 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[3]/div[2]/div[1]/div[5]/div/div[2]/div/div/div/div/div[2]/div[2]/div[3]/button[2]"));
        amPmSelection3.click();
        fakeClickOnPage.click();
        Thread.sleep(500);
    }

    public void setDroppingInformation1() throws InterruptedException {
        WebElement stoppageDropdown1 = driver.findElements(By.className("p-dropdown-label")).get(10);
        stoppageDropdown1.click();
        Thread.sleep(500);
        WebElement selectStoppage1 = driver.findElements(By.className("p-dropdown-item")).get(0);
        selectStoppage1.click();
        Thread.sleep(500);
        WebElement counterDropdown1 = driver.findElements(By.className("p-dropdown-label")).get(11);
        counterDropdown1.click();
        Thread.sleep(500);
        WebElement selectCounter1 = driver.findElements(By.className("p-dropdown-item")).get(0);
        selectCounter1.click();
        Thread.sleep(500);

        scrollWindow();
        Thread.sleep(500);
    }

    public void setDroppingInformation2() throws InterruptedException {
        WebElement stoppageDropdown2 = driver.findElements(By.className("p-dropdown-label")).get(13);
        stoppageDropdown2.click();
        Thread.sleep(500);
        WebElement selectStoppage2 = driver.findElements(By.className("p-dropdown-item")).get(1);
        selectStoppage2.click();
        Thread.sleep(500);
        WebElement counterDropdown2 = driver.findElements(By.className("p-dropdown-label")).get(14);
        counterDropdown2.click();
        Thread.sleep(500);
        WebElement selectCounter2 = driver.findElements(By.className("p-dropdown-item")).get(0);
        selectCounter2.click();
        Thread.sleep(500);
    }

    public void setDroppingInformation3() throws InterruptedException {
        WebElement stoppageDropdown3 = driver.findElements(By.className("p-dropdown-label")).get(16);
        stoppageDropdown3.click();
        Thread.sleep(500);
        WebElement selectStoppage3 = driver.findElements(By.className("p-dropdown-item")).get(0);
        selectStoppage3.click();
        Thread.sleep(500);
        WebElement counterDropdown3 = driver.findElements(By.className("p-dropdown-label")).get(17);
        counterDropdown3.click();
        Thread.sleep(500);
        WebElement selectCounter3 = driver.findElements(By.className("p-dropdown-item")).get(0);
        selectCounter3.click();
        Thread.sleep(500);
        WebElement makeAvailableForOnline3 = driver.findElements(By.className("text-primaryText")).get(38);
        makeAvailableForOnline3.click();
        Thread.sleep(500);

        scrollWindow();
        Thread.sleep(500);
    }
    /* <----- Trip Seat-Fare & Boarding-Dropping Page End -----> */

    /* <----- Trip Restrict Counterman & Agent Page Start -----> */
    public void restrictCountermanAgent() throws InterruptedException {
        WebElement restrictCountermanAgent1 = driver.findElements(By.className("text-primaryText")).get(10);
        restrictCountermanAgent1.click();
        Thread.sleep(500);

        WebElement restrictCountermanAgent2 = driver.findElements(By.className("text-primaryText")).get(44); //Select All counterman or agent for restriction.
        restrictCountermanAgent2.click();
        Thread.sleep(500);

        WebElement restrictCountermanAgent3 = driver.findElements(By.className("text-primaryText")).get(56);
        restrictCountermanAgent3.click();
        Thread.sleep(1000);
    }
    /* <----- Trip Restrict Counterman & Agent Page End -----> */

    /* <----- Trip Assign Quota Page Start -----> */
    public void assignQuota1() throws InterruptedException {
        Thread.sleep(1000);
        WebElement counterListItem1 = driver.findElement(By.xpath("//div[contains(text(),'Online')]"));
        counterListItem1.click();
        Thread.sleep(500);
        WebElement selectQuotaDateTimeField1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[1]/div/div[3]/div[1]/div/div[1]/input"));
        selectQuotaDateTimeField1.click();
        Thread.sleep(500);
        String quotaDateTime1MonthYearExpected = "July 2024";
        while (true) {
            String quotaDateTime1MonthYearActual = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[1]/div/div[3]/div[1]/div/div[2]/div/div/div[2]/div[1]/div/div[1]/div")).getText();
            System.out.println("boardingDate2TextMonthYear: " + quotaDateTime1MonthYearActual + " logic: " + quotaDateTime1MonthYearActual.equals(quotaDateTime1MonthYearExpected));
            if (quotaDateTime1MonthYearActual.equals(quotaDateTime1MonthYearExpected)) {
                break;
            } else {
                WebElement nextButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[1]/div/div[3]/div[1]/div/div[2]/div/div/div[2]/div[2]/div[2]"));
                nextButton.click();
                Thread.sleep(1000);
            }
        }
        WebElement selectDate1 = driver.findElement(By.xpath("//span[contains(text(),'24')]"));
        selectDate1.click();

        WebElement hourDropDown1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[1]/div/div[3]/div[1]/div/div[2]/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/select"));
        hourDropDown1.click();
        Thread.sleep(500);
        WebElement hourDropdownItem1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[1]/div/div[3]/div[1]/div/div[2]/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/select/option[1]"));
        hourDropdownItem1.click();
        Thread.sleep(500);
        WebElement minuteDropdown1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[1]/div/div[3]/div[1]/div/div[2]/div/div/div[2]/div[3]/div/div[2]/div[2]/div[2]/select"));
        minuteDropdown1.click();
        Thread.sleep(500);
        WebElement minuteDropdownItem1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[1]/div/div[3]/div[1]/div/div[2]/div/div/div[2]/div[3]/div/div[2]/div[2]/div[2]/select/option[1]"));
        minuteDropdownItem1.click();
        Thread.sleep(500);
        WebElement amPmSelection1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[1]/div/div[3]/div[1]/div/div[2]/div/div/div[2]/div[3]/div/div[2]/div[2]/div[3]/button[2]"));
        amPmSelection1.click();
        Thread.sleep(500);
        WebElement fakeClick = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[1]/div/div[2]"));
        fakeClick.click();
        Thread.sleep(500);
        WebElement selectSeat1 = driver.findElements(By.className("quotaSeat")).get(0);
        selectSeat1.click();
        Thread.sleep(500);
        WebElement selectSeat2 = driver.findElements(By.className("quotaSeat")).get(1);
        selectSeat2.click();
        Thread.sleep(500);
        WebElement selectSeat3 = driver.findElements(By.className("quotaSeat")).get(3);
        selectSeat3.click();
        Thread.sleep(500);
        WebElement selectSeat4 = driver.findElements(By.className("quotaSeat")).get(4);
        selectSeat4.click();
        Thread.sleep(500);
        WebElement selectSeat5 = driver.findElements(By.className("quotaSeat")).get(5);
        selectSeat5.click();
        Thread.sleep(500);
        WebElement selectSeat6 = driver.findElements(By.className("quotaSeat")).get(6);
        selectSeat6.click();
        Thread.sleep(500);
        WebElement selectSeat7 = driver.findElements(By.className("quotaSeat")).get(8);
        selectSeat7.click();
        Thread.sleep(500);
        WebElement selectSeat8 = driver.findElements(By.className("quotaSeat")).get(9);
        selectSeat8.click();
        Thread.sleep(500);
        scrollWindow();
//        Thread.sleep(500);
        String selectedSeatsActual = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[2]/div/table/tbody/tr/td[2]")).getText();
        String selectedSeatsExpected = "A1, A2, A3, A4, B1, B2, B3, B4";
        Assert.assertEquals(selectedSeatsActual, selectedSeatsExpected);
        Thread.sleep(500);
    }
    /* <----- Trip Assign Quota Page End -----> */

    /* <----- Trip Facilities & Policies Page Start -----> */
    public void setTripFacilitiesAndPolicies() throws InterruptedException {
        Thread.sleep(1000);
        WebElement selectFacilities1 = driver.findElements(By.className("text-primaryText")).get(3);
        selectFacilities1.click();
        Thread.sleep(500);
        WebElement selectFacilities2 = driver.findElements(By.className("text-primaryText")).get(4);
        selectFacilities2.click();
        Thread.sleep(500);
        WebElement selectFacilities3 = driver.findElements(By.className("text-primaryText")).get(5);
        selectFacilities3.click();
        Thread.sleep(500);

        WebElement addPolicies = driver.findElements(By.className("primaryTextareaField")).get(0);
        addPolicies.sendKeys("Jatri Services Limited. 2024");
        Thread.sleep(500);
    }
    /* <----- Trip Facilities & Policies Page End -----> */

    /* <----- Trip Trip Publish Page Start -----> */
    public void setPublishTripValue() throws InterruptedException {
        WebElement publishTypeDropdown = driver.findElements(By.className("p-dropdown-label")).get(0);
        publishTypeDropdown.click();
        Thread.sleep(500);

        WebElement publishTypeDropdownItem = driver.findElements(By.className("p-dropdown-item")).get(0);
        publishTypeDropdownItem.click();
        Thread.sleep(500);

        WebElement tripAutoRenewalInDaysDropdown = driver.findElements(By.className("p-dropdown-label")).get(1);
        tripAutoRenewalInDaysDropdown.click();
        Thread.sleep(500);

        WebElement tripAutoRenewalInDaysDropdownItem = driver.findElements(By.className("p-dropdown-item")).get(0);
        tripAutoRenewalInDaysDropdownItem.click();
        Thread.sleep(2000);

        WebElement selectCheckForAll = driver.findElements(By.className("text-primaryText")).get(4);
        selectCheckForAll.click();
        Thread.sleep(500);

        WebElement saveAndPreviewButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[4]/button"));
        saveAndPreviewButton.click();
        Thread.sleep(500);
    }

    public void createTrip() throws InterruptedException {
        WebElement createTripButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[4]/button"));
        if(!createTripButton.isDisplayed()){
            scrollWindow();
        }
        else {
            createTripButton.click();
        }
        Thread.sleep(1000);
    }
    /* <----- Trip Trip Publish Page End -----> */

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
        nextStepButton.get(0).click();
        Thread.sleep(500);
        onlinePermissionYes.click();
        Thread.sleep(500);
        setTripAvailableForOnline();
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
        reserveYes.click();
        Thread.sleep(500);
        tripCancelYes.click();
        Thread.sleep(500);
        eidTripNo.click();
        Thread.sleep(500);
        nextStepButton.get(0).click();
        Thread.sleep(500);
        counterMainRouteActivities();
        Thread.sleep(500);
        counterSubRoute1Activities();
        Thread.sleep(500);
        counterSubRoute2Activities();
        Thread.sleep(500);
        counterSubRoute3Activities();
        Thread.sleep(500);
        counterSubRoute4Activities();
        Thread.sleep(500);
        counterSubRoute5Activities();
        Thread.sleep(500);
        onlineMainRouteActivities();
        Thread.sleep(500);
        onlineSubRoute4Activities();
        Thread.sleep(500);
        setBoardingInformation1();
        Thread.sleep(500);
        setBoardingInformation2();
        Thread.sleep(500);
        setBoardingInformation3();
        Thread.sleep(500);
        setDroppingInformation1();
        Thread.sleep(500);
        setDroppingInformation2();
        Thread.sleep(500);
        setDroppingInformation3();
        Thread.sleep(500);
        nextStepButton.get(0).click();
        Thread.sleep(3000);
        restrictCountermanAgent();
        Thread.sleep(1000);
        nextStepButton.get(0).click();
        Thread.sleep(3000);
        assignQuota1();
        Thread.sleep(3000);
        nextStepButton.get(0).click();
        Thread.sleep(1000);
        setTripFacilitiesAndPolicies();
        Thread.sleep(500);
        nextStepButton.get(0).click();
        Thread.sleep(500);
        setPublishTripValue();
        Thread.sleep(5000);
        createTrip();
        Thread.sleep(500);
    }
}
