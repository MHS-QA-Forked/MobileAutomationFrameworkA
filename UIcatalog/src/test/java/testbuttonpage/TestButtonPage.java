package testbuttonpage;

import alertspage.Alerts;
import buttonspage.ButtonsPage;
import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestButtonPage extends CommonAPI {

    @Test
    public void Test1() {
        ButtonsPage buttonsPage = PageFactory.initElements(ad, ButtonsPage.class);
        buttonsPage.getButtonsTab();
    }
    @Test
    public void Test2() {
        ButtonsPage buttonsPage = PageFactory.initElements(ad, ButtonsPage.class);
        buttonsPage.getBackgroundImage();
    }
    @Test
    public void Test3() {
        ButtonsPage buttonsPage = PageFactory.initElements(ad, ButtonsPage.class);
        buttonsPage.getGrayTab();
    }
    @Test
    public void Test4() {
        ButtonsPage buttonsPage = PageFactory.initElements(ad, ButtonsPage.class);
        buttonsPage.getButtonWithImage();
    }
    @Test
    public void Test5() {
        ButtonsPage buttonsPage = PageFactory.initElements(ad, ButtonsPage.class);
        buttonsPage.getAttributedText();
    }
}
