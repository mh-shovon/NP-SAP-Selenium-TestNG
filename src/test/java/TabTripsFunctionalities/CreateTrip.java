package TabTripsFunctionalities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateTrip {
    @FindBy(xpath = "//a[normalize-space()='Trips']")
    WebElement tripsTab;

    @FindBy(className = "topBarAddButton")
    WebElement addTripsButton;
}
