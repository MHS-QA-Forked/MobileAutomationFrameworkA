package newspage;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewsPage extends CommonAPI {

    @FindBy(xpath = "//android.widget.TextView[@text='News']")
    WebElement NewsTab;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Save article\"]\n")
    WebElement SaveArticles;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Share\"]\n")
    WebElement ShareButton;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]\n")
    WebElement NavigateUp;

}
