package fashionpage;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FashionPage extends CommonAPI {

    @FindBy(xpath = "//android.widget.TextView[@text='FASHION']")
    WebElement FashionPage;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc='Open menu']")
    WebElement OpenMenu;

    @FindBy(xpath = "//android.widget.TextView[@content-desc='Turn On Notifications']")
    WebElement NotificationBell;

}
