package imgespage;


import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import reporting.TestLogger;

public class ImagesPage extends CommonAPI {

    public ImagesPage() { PageFactory.initElements(ad, this);

    }
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Images\"]\n")
    WebElement ImagePage;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Back\"]\n")
    WebElement BackButton;

    public WebElement getImagePage() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return ImagePage;
    }
    public WebElement getBackButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return BackButton;
    }

    public void ImagePage () {
        ImagePage.click();
        String title = ad.getTitle();
        Assert.assertEquals(title, "Appium");

        BackButton.click();
        String title1 = ad.getTitle();
        Assert.assertEquals(title, "Appium");

    }
    }