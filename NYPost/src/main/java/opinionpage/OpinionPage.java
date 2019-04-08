package opinionpage;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpinionPage extends CommonAPI {

    @FindBy(xpath = "//android.widget.TextView[@text='OPINION']")
    WebElement OpinionPage;

    @FindBy(xpath = "//android.widget.TextView[@content-desc='Turn On Notifications']")
    WebElement TurnOnNotifications;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Open menu\"]\n")
    WebElement OpenMenuOpinionPage;


}
