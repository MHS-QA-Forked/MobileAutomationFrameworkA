package testtextfield;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import segmentspage.SegmentsPage;
import textfieldspage.TextFields;

public class TestTextField extends CommonAPI {

    @Test
    public void Test1() {
        TextFields textFields = PageFactory.initElements(ad, TextFields.class);
        textFields.getTextFieldst();
    }
    @Test
    public void Test2() {
        TextFields textFields = PageFactory.initElements(ad, TextFields.class);
        textFields.getUITextField();
    }
    @Test
    public void Test3() {
        TextFields textFields = PageFactory.initElements(ad, TextFields.class);
        textFields.getEnterTextFeild();
    }
    @Test
    public void Test4() {
        TextFields textFields = PageFactory.initElements(ad, TextFields.class);
        textFields.getUITextFieldRounded();
    }
    @Test
    public void Test5() {
        TextFields textFields = PageFactory.initElements(ad, TextFields.class);
        textFields.getUITextFieldSecure();
    }
}
