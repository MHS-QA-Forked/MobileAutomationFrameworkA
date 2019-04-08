package realestatepage;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RealStatePage extends CommonAPI {

@FindBy(xpath = "//android.widget.TextView[@text='REAL ESTATE']")
    WebElement RealEstatePage;

@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup\n")
    WebElement LayoutOfRealEstate;

@FindBy(xpath = "//android.widget.TextView[@content-desc=\"Turn On Notifications\"]")
    WebElement TurnOnNotifications;

}
