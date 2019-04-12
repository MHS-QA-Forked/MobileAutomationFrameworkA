package toolbarpage;


import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import reporting.TestLogger;

public class Toolbar extends CommonAPI {

    public Toolbar() { PageFactory.initElements(ad, this);

    }
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Toolbar\"]\n")
    WebElement ToolBarTab;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"UIBarStyle:\"]\n")
    WebElement UIBarStyleTab;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"UIBarButtonItemStyle:\"]\n")
    WebElement UIBarButtonItemStyle;

    public WebElement getToolBarTab () {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return ToolBarTab;
    }
    public WebElement getUIBarStyleTab () {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return UIBarStyleTab;
    }
    public WebElement getUIBarButtonItemStyle () {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return UIBarButtonItemStyle;
    }

    public void ToolBarPages() {
        ToolBarTab.click();
        String title = ad.getTitle();
        Assert.assertEquals(title, "Appium");

        UIBarStyleTab.click();
        String title1 = ad.getTitle();
        Assert.assertEquals(title, "Appium");

        UIBarButtonItemStyle.click();
        String title2 = ad.getTitle();
        Assert.assertEquals(title, "Appium");

    }
    }