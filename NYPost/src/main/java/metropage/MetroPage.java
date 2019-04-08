package metropage;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MetroPage extends CommonAPI {

    @FindBy(xpath = "//android.widget.TextView[@text='METRO']")
    WebElement MetroPage;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Open menu\"]")
    WebElement OpenMenu;

    @FindBy(xpath = "//android.widget.TextView[@ content-desc='Turn On Notifications']")
    WebElement TurnOnNotifications;


}
