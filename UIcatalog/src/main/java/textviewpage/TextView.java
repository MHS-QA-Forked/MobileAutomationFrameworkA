package textviewpage;


import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import reporting.TestLogger;

public class TextView extends CommonAPI {

    public TextView() { PageFactory.initElements(ad, this);

    }
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Back\"]")
    WebElement BackButton;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"TextView\"]")
    WebElement TextViewTab;

    public WebElement getBackButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return BackButton;
    }
    public WebElement getTextViewTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return TextViewTab;
    }


    public void TextViewPages() {
        BackButton.click();
        String title = ad.getTitle();
        Assert.assertEquals(title, "Appium");

        TextViewTab.click();
        String text = ad.getContext();
        Assert.assertEquals(text, "Back");
    }

    }