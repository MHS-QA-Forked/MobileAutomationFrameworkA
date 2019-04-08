package livingpage;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LivingPage extends CommonAPI {

    @FindBy(xpath = "//android.widget.TextView[@text='LIVING']")
    WebElement LivingPage;

    @FindBy(id = "br.com.golmobile.nypost:id/notifications")
    WebElement TurnOnNotifications;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Open menu\"]")
    WebElement menubar;


}
