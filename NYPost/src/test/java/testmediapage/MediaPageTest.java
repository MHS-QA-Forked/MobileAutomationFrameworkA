package testmediapage;

import common.CommonAPI;
import livingpage.LivingPage;
import mediapage.MediaPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MediaPageTest extends CommonAPI {

    MediaPage mediaPage;

    @BeforeMethod
    public void setUp(){
        mediaPage = PageFactory.initElements(ad, MediaPage.class);
    }

    @Test
    public void MediaPageTest() {
        mediaPage.getMediaPage();
    }

    @Test
    public void MediaPageTest2() {
        mediaPage.getOpenMenu();
    }

    @Test
    public void MediaPageTest3() {
        mediaPage.getTurOnNotifications();
    }
}