package testuicatalogpage;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import uicatalogpage.UiCatalog;

public class TestUICatalogPage extends CommonAPI {

    @Test
    public void Test1() {
        UiCatalog uiCatalog = PageFactory.initElements(ad, UiCatalog.class);
        uiCatalog.getTextViewTab();
    }
    @Test
    public void Test2() {
        UiCatalog uiCatalog = PageFactory.initElements(ad, UiCatalog.class);
        uiCatalog.getUICatalogTab();
    }
}
