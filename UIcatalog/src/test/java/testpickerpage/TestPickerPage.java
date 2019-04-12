package testpickerpage;

import common.CommonAPI;
import controlspage.ControlsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pickerspage.PickerPage;

public class TestPickerPage extends CommonAPI {

    @Test
    public void Test1() {
        PickerPage pickerPage = PageFactory.initElements(ad, PickerPage.class);
        pickerPage.getPickersPage();
    }
    @Test
    public void Test2() {
        PickerPage pickerPage = PageFactory.initElements(ad, PickerPage.class);
        pickerPage.getJohnApplesseed();
    }
    @Test
    public void Test3() {
        PickerPage pickerPage = PageFactory.initElements(ad, PickerPage.class);
        pickerPage.getUIPickerTab();
    }
    @Test
    public void Test4() {
        PickerPage pickerPage = PageFactory.initElements(ad, PickerPage.class);
        pickerPage.getUIDatePickerTab();
    }
    @Test
    public void Test5() {
        PickerPage pickerPage = PageFactory.initElements(ad, PickerPage.class);
        pickerPage.getCustomTab();
    }
}
