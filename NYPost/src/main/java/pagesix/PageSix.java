package pagesix;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageSix extends CommonAPI {

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageView\n")
    WebElement PageSixPage;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Turn On Notifications\"]")
    WebElement TurnOnNotifications;

}
