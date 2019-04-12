package textfieldspage;


import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import reporting.TestLogger;

public class TextFields extends CommonAPI {

    public TextFields() { PageFactory.initElements(ad, this);
    }

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"TextFields\"]\n")
    WebElement TextFields;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"UITextField\"]\n")
    WebElement UITextField;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]\n")
    WebElement EnterTextFeild;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"UITextField Rounded\"]\n")
    WebElement UITextFieldRounded;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"UITextField Secure\"]")
    WebElement UITextFieldSecure;

    public WebElement getTextFieldst() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return TextFields;
    }
    public WebElement getUITextField() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return UITextField;
    }
    public WebElement getEnterTextFeild() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return EnterTextFeild;
    }
    public WebElement getUITextFieldRounded() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return UITextFieldRounded;
    }
    public WebElement getUITextFieldSecure() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return UITextFieldSecure;
    }

    public void TextFields() {
        TextFields.click();
        String title = ad.getTitle();
        Assert.assertEquals(title, "Appium");

        UITextField.click();
        String title1 = ad.getTitle();
        Assert.assertEquals(title, "Appium");

        EnterTextFeild.click();
        String title2 = ad.getTitle();
        Assert.assertEquals(title, "Appium");

        UITextFieldRounded.click();
        String title3 = ad.getTitle();
        Assert.assertEquals(title, "Appium");

        UITextFieldSecure.click();
        String title4 = ad.getTitle();
        Assert.assertEquals(title, "Appium");

    }
}


