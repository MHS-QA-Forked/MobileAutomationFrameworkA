package testimagepage;

import common.CommonAPI;
import controlspage.ControlsPage;
import imgespage.ImagesPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestImagePage extends CommonAPI {

    @Test
    public void Test1() {
        ImagesPage imagesPage = PageFactory.initElements(ad, ImagesPage.class);
        imagesPage.getImagePage();
    }
    @Test
    public void Test2() {
        ImagesPage imagesPage = PageFactory.initElements(ad, ImagesPage.class);
        imagesPage.getBackButton();
    }
}
