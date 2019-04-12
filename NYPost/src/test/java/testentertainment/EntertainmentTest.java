package testentertainment;

import common.CommonAPI;
import entertainmentpage.EntertainmentPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EntertainmentTest extends CommonAPI {


    @Test
    public void Test1() {
        EntertainmentPage entertainmentPage= PageFactory.initElements(ad, EntertainmentPage.class);
        entertainmentPage.getOpenMenu();
    }
    @Test
    public void Test2() {
        EntertainmentPage entertainmentPage= PageFactory.initElements(ad, EntertainmentPage.class);
        entertainmentPage.getEntertainment();
    }
}