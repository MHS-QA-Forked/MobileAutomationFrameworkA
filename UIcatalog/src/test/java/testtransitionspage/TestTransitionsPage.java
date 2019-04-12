package testtransitionspage;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import toolbarpage.Toolbar;
import transitionspage.Transitions;

public class TestTransitionsPage extends CommonAPI {

    @Test
    public void Test1() {
        Transitions transitions = PageFactory.initElements(ad, Transitions.class);
        transitions.getTransitionsTab();
    }
    @Test
    public void Test2() {
        Transitions transitions = PageFactory.initElements(ad, Transitions.class);
        transitions.getFlipImage();
    }
    @Test
    public void Test3() {
        Transitions transitions = PageFactory.initElements(ad, Transitions.class);
        transitions.getCurlImage();
    }
}
