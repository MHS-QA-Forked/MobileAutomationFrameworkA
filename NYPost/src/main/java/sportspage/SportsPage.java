package sportspage;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SportsPage extends CommonAPI {


    @FindBy(xpath = "//android.widget.TextView[@text='SPORTS']")
    WebElement SportsPage;

    @FindBy (xpath = "//android.widget.TextView[@content-desc=\"Turn On Notifications\"]\n")
    WebElement TurnOnNotifications;


}
