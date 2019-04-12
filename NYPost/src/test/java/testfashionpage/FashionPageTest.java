package testfashionpage;

import common.CommonAPI;
import entertainmentpage.EntertainmentPage;
import fashionpage.FashionPage;
import org.junit.BeforeClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class FashionPageTest extends FashionPage {

//    FashionPage fashionPage;
//    @BeforeClass
//    public void initElements() {
//        fashionPage = PageFactory.initElements(ad, FashionPage.class);
//
//    }

    @Test
    public void FashionPageTest() {
        FashionPage fashionPage = PageFactory.initElements(ad, FashionPage.class);
        fashionPage.getFashionPage();
    }

    @Test
    public void FashionPageTest2() {
        FashionPage fashionPage = PageFactory.initElements(ad, FashionPage.class);
        fashionPage.getOpenMenu();
    }

    @Test
    public void FashionPageTest3() {
        FashionPage fashionPage = PageFactory.initElements(ad, FashionPage.class);
        fashionPage.getNotificationBell();
    }
}