package testcontrolpage;


import common.CommonAPI;
import controlspage.ControlsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestControlPage extends CommonAPI {

    @Test
    public void Test1() {
        ControlsPage controlsPage = PageFactory.initElements(ad, ControlsPage.class);
        controlsPage.getControlsButton();
    }
    @Test
    public void Test2() {
        ControlsPage controlsPage = PageFactory.initElements(ad, ControlsPage.class);
        controlsPage.getStandardSwitchTab();
    }
    @Test
    public void Test3() {
        ControlsPage controlsPage = PageFactory.initElements(ad, ControlsPage.class);
        controlsPage.getUISliderTab();
    }
}
