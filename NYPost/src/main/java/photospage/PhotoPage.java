package photospage;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PhotoPage extends CommonAPI {

    @FindBy(xpath = "//android.widget.TextView[@text='PHOTOS']")
    WebElement PhotosPage;

    @FindBy(xpath = "/android.widget.ImageButton[@content-desc=\"Open menu\"]")
    WebElement OpenMenuPhotosPage;



}
