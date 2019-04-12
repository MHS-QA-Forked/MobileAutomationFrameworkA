package transitionspage;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import reporting.TestLogger;


public class Transitions extends CommonAPI {

    public Transitions() {
        PageFactory.initElements(ad, this);

    }
    @FindBy(xpath = "/XCUIElementTypeStaticText[@name=\"Transitions\"]")
    WebElement TransitionsTab;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Flip Image\"]\n")
    WebElement FlipImage;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Curl Image\"]")
    WebElement CurlImage;

    public WebElement getTransitionsTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return TransitionsTab;
    }

    public WebElement getFlipImage() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return FlipImage;
    }

    public WebElement getCurlImage() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return CurlImage;
    }


    public void TransitionsPage() {
        TransitionsTab.click();
        String title = ad.getTitle();
        Assert.assertEquals(title, "Appium");

        FlipImage.click();
        String title1 = ad.getTitle();
        Assert.assertEquals(title, "Appium");

        CurlImage.click();
        String title2 = ad.getTitle();
        Assert.assertEquals(title, "Appium");

    }
}
