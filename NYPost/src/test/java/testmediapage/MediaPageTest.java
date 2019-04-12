package testmediapage;

import common.CommonAPI;
import livingpage.LivingPage;
import mediapage.MediaPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class MediaPageTest extends CommonAPI {

    @Test
    public void MediaPageTest() {
        MediaPage mediaPage = PageFactory.initElements(ad, MediaPage.class);
        mediaPage.getMediaPage();
    }

    @Test
    public void MediaPageTest2() {
        MediaPage mediaPage = PageFactory.initElements(ad, MediaPage.class);
        mediaPage.getOpenMenu();
    }

    @Test
    public void MediaPageTest3() {
        MediaPage mediaPage = PageFactory.initElements(ad, MediaPage.class);
        mediaPage.getTurOnNotifications();
    }
}