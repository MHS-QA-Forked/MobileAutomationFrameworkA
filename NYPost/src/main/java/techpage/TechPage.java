package techpage;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TechPage extends CommonAPI {

@FindBy(xpath = "//android.widget.TextView[@text='TECH']")
    WebElement TechPage;

@FindBy(xpath = "//android.widget.TextView[@content-desc=\"Turn On Notifications\"]\n")
    WebElement TurnOnNotifications;

}
