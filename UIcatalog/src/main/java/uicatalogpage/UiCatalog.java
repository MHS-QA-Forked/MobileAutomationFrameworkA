package uicatalogpage;


import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import reporting.TestLogger;

public class UiCatalog extends CommonAPI {

    public UiCatalog() {
        PageFactory.initElements(ad, this);
    }
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"UICatalog\"]\n" + "\n")
    WebElement UICatalogTab;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"TextView\"]")
    WebElement TextViewTab;

    public WebElement getUICatalogTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return UICatalogTab;
    }
    public WebElement getTextViewTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return TextViewTab;
    }

    public void UICatalogPage() {
        UICatalogTab.click();
        String title = ad.getTitle();
        Assert.assertEquals(title, "Appium");

        TextViewTab.click();
        String title1 = ad.getTitle();
        Assert.assertEquals(title, "Appium");

    }
}