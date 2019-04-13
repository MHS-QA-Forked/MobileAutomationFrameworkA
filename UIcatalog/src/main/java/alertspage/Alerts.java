package alertspage;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import reporting.TestLogger;

public class Alerts extends CommonAPI {

    public Alerts() {
        PageFactory.initElements(ad, this);

    }
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Back\"]")
    WebElement BackButton;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Alerts\"]")
    WebElement AlertsTab;

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"UIActionSheet\"])[1]\n")
    WebElement UIActionSheet;

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Show Simple\"])[1]")
    WebElement ShowSimple;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"AlertsViewController.m - dialogSimpleAction\"]")
    WebElement AlertReviewControler;

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Show OK-Cancel\"])[1]\n")
    WebElement ShowOkCancel;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"AlertsViewController.m - dialogOKCancelAction\"]\n")
    WebElement AlertViewConDialogOkCancelAction;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Show Customized\"]")
    WebElement ShowCustomizedTab;

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"UIAlertView\"])[1]")
    WebElement UIAlertView;

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Show Simple\"])[2]\n")
    WebElement ShowSimpleTab;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"AlertsViewController.m - alertSimpleAction\"]")
    WebElement AlertViewConAlertSimAction;

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Show Simple\"])[2]")
    WebElement UIAlertViewShowSimple;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Show Custom\"]")
    WebElement ShowCustomTab;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Secure Text Input\"]")
    WebElement SecureTextInput;


    public WebElement getBackButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return BackButton;
    }
    public WebElement getAlertsTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return AlertsTab;
    }
    public WebElement getUIActionSheet() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return UIActionSheet;
    }
    public WebElement getShowSimple() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return ShowSimple;
    }public WebElement getAlertReviewControler() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return AlertReviewControler;
    }
    public WebElement getShowOkCancel () {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return ShowOkCancel;
    }
    public WebElement getAlertViewConDialogOkCancelAction() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return AlertViewConDialogOkCancelAction;
    }
    public WebElement getShowCustomizedTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return ShowCustomizedTab;
    }
    public WebElement getUIAlertView() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return UIAlertView;
    }
    public WebElement getShowSimpleTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return ShowSimpleTab;
    }
    public WebElement getAlertViewConAlertSimAction () {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return AlertViewConAlertSimAction ;
    }
    public WebElement getUIAlertViewShowSimple() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return UIAlertViewShowSimple;
    }
    public WebElement getShowCustomTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return ShowCustomTab;
    }
    public WebElement getSecureTextInput() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return SecureTextInput;
    }
    public void AlertsPage() {
        BackButton.click();
//        String title = ad.getTitle();
//        Assert.assertEquals(title, "Appium");

        AlertsTab.click();
//        String title1 = ad.getTitle();
//        Assert.assertEquals(title, "Appium");

        UIActionSheet.click();
//        String title2 = ad.getTitle();
//        Assert.assertEquals(title, "Appium");

        ShowSimple.click();
//        String title3 = ad.getTitle();
//        Assert.assertEquals(title, "Appium");

        AlertReviewControler.click();
//        String title4 = ad.getTitle();
//        Assert.assertEquals(title, "Appium");

        ShowOkCancel.click();
//        String title5 = ad.getTitle();
//        Assert.assertEquals(title, "Appium");

        AlertViewConDialogOkCancelAction.click();
//        String title6 = ad.getTitle();
//        Assert.assertEquals(title, "Appium");

        ShowCustomizedTab.click();
//        String title7 = ad.getTitle();
//        Assert.assertEquals(title, "Appium");

        UIAlertView.click();
//        String title8 = ad.getTitle();
//        Assert.assertEquals(title, "Appium");

        ShowSimpleTab.click();
//        String title9 = ad.getTitle();
//        Assert.assertEquals(title, "Appium");

        AlertViewConAlertSimAction.click();
//        String title10 = ad.getTitle();
//        Assert.assertEquals(title, "Appium");

        UIAlertViewShowSimple.click();
//        String title11 = ad.getTitle();
//        Assert.assertEquals(title, "Appium");

        ShowCustomTab.click();
//        String title12 = ad.getTitle();
//        Assert.assertEquals(title, "Appium");

        SecureTextInput.click();
//        String title13 = ad.getTitle();
//        Assert.assertEquals(title, "Appium");

    }
}
