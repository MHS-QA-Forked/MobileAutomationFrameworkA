package testmetropage;


import businesspage.BusinessPage;
import common.CommonAPI;
import mediapage.MediaPage;
import metropage.MetroPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class MetroPageTest extends CommonAPI {

    @Test
    public void Menu() {
        MetroPage metroPage = PageFactory.initElements(ad, MetroPage.class);
        metroPage.getMenu();
    }
    @Test
    public void MediaPage() {
        MetroPage metroPage = PageFactory.initElements(ad, MetroPage.class);
        metroPage.getMetroPage();
    }
    @Test
    public void TurnOnNotifications() {
        MetroPage metroPage = PageFactory.initElements(ad, MetroPage.class);
        metroPage.getTurnOnNotificationsTab();
    }
    @Test
    public void FrameLayout() {
        MetroPage metroPage = PageFactory.initElements(ad, MetroPage.class);
        metroPage.getFrameLayout();
    }

}

