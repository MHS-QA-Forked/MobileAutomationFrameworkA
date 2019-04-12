package controlspage;


import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import reporting.TestLogger;

public class ControlsPage extends CommonAPI {

    public ControlsPage() {
        PageFactory.initElements(ad, this);

    }

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Controls\"] ")
    WebElement ControlsButton;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Standard Switch\"]\n")
    WebElement StandardSwitchTab;

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"UISlider\"])[1]")
    WebElement UISliderTab;

    public WebElement getControlsButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return ControlsButton;
    }
    public WebElement getStandardSwitchTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return StandardSwitchTab;
    }

    public WebElement getUISliderTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return UISliderTab;
    }

    public void ControlsPage() {
        ControlsButton.click();
        String title = ad.getTitle();
        Assert.assertEquals(title, "Appium");

        StandardSwitchTab.click();
        String title1 = ad.getTitle();
        Assert.assertEquals(title, "Appium");

        StandardSwitchTab.click();
        String title2 = ad.getTitle();
        Assert.assertEquals(title, "Appium");
    }
    }
