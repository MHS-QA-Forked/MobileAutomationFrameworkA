package photospage;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import reporting.TestLogger;

public class PhotoPage extends CommonAPI {

    public PhotoPage(){
        PageFactory.initElements(ad, this);
    }

    @FindBy(xpath = "//android.widget.TextView[@text='PHOTOS']")
    WebElement PhotosPage;

    @FindBy(xpath = "/android.widget.ImageButton[@content-desc=\"Open menu\"]")
    WebElement OpenMenuPhotosPage;

    public WebElement getPhotosPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return PhotosPage;
    }

    public WebElement getOpenMenuPhotosPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return OpenMenuPhotosPage;
    }

    public void PhotoPage() {
        OpenMenuPhotosPage.click();
        String title = ad.getTitle();
        Assert.assertEquals(title, "Appium");

        PhotosPage.click();
        String title1 = ad.getTitle();
        Assert.assertEquals(title, "Appium");

    }
}
