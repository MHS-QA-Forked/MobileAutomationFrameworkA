package testwebpage;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import uicatalogpage.UiCatalog;
import webpage.WebPage;

public class TestWebPage extends CommonAPI {

    @Test
    public void Test1() {
        WebPage webPage = PageFactory.initElements(ad, WebPage.class);
        webPage.getWebTab();
    }
    @Test
    public void Test2() {
        WebPage webPage = PageFactory.initElements(ad, WebPage.class);
        webPage.getiPhoneXRButton();
    }
}
