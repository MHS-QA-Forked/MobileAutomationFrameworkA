package buttonspage;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import reporting.TestLogger;


public class ButtonsPage extends CommonAPI {

    public ButtonsPage() {
        PageFactory.initElements(ad, this);
    }

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Buttons\"]\n" + "\n")
    WebElement ButtonsTab;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Background Image\"]\n" + "\n")
    WebElement BackgroundImage;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Gray\"]")
    WebElement GrayTab;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Button with Image\"]")
    WebElement ButtonWithImage;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Attributed Text\"]")
    WebElement AttributedText;

    public WebElement getButtonsTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return ButtonsTab;
    }
    public WebElement getBackgroundImage(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return BackgroundImage;
    }
    public WebElement getGrayTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return GrayTab;
    }
    public WebElement getButtonWithImage() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return ButtonWithImage;
    }
    public WebElement getAttributedText() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return AttributedText;
    }

    public void ButtonsPageTabs() {
        ButtonsTab.click();
        String title = ad.getTitle();
        Assert.assertEquals(title, "Appium");

        BackgroundImage.click();
        String title1 = ad.getTitle();
        Assert.assertEquals(title, "Appium");

        GrayTab.click();
        String title2 = ad.getTitle();
        Assert.assertEquals(title, "Appium");

        ButtonWithImage.click();
        String title3 = ad.getTitle();
        Assert.assertEquals(title, "Appium");

        AttributedText.click();
        String title4 = ad.getTitle();
        Assert.assertEquals(title, "Appium");

    }
}