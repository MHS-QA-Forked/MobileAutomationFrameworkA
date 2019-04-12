package webpage;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import reporting.TestLogger;


public class WebPage extends CommonAPI {

    public WebPage() { PageFactory.initElements(ad, this);

    }
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Web\"]\n" + "\n")
    WebElement WebTab;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"iPhone X R\"]")
    WebElement iPhoneXRButton;

    public WebElement getWebTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return WebTab;
    }
    public WebElement getiPhoneXRButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return iPhoneXRButton;
    }

    public void WebPages() {
        WebTab.click();
        String title = ad.getTitle();
        Assert.assertEquals(title, "Appium");

        iPhoneXRButton.click();
        String title1 = ad.getTitle();
        Assert.assertEquals(title, "Appium");

    }

    }