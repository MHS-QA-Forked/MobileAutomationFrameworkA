package videopage;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VideoPage extends CommonAPI {

    @FindBy(xpath = "//android.widget.TextView[@text='VIDEO']")
    WebElement videoPage;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Turn On Notifications\"]")
    WebElement TurnOnNotifications;


}
