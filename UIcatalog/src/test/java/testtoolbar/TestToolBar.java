package testtoolbar;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import textviewpage.TextView;
import toolbarpage.Toolbar;

public class TestToolBar extends CommonAPI {

    @Test
    public void Test1() {
        Toolbar toolbar = PageFactory.initElements(ad, Toolbar.class);
        toolbar.getToolBarTab();
    }
    @Test
    public void Test2() {
        Toolbar toolbar = PageFactory.initElements(ad, Toolbar.class);
        toolbar.getUIBarStyleTab();
    }
    @Test
    public void Test3() {
        Toolbar toolbar = PageFactory.initElements(ad, Toolbar.class);
        toolbar.getUIBarButtonItemStyle();
    }
}
