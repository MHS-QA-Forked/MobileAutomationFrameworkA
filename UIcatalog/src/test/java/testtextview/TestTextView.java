package testtextview;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import textfieldspage.TextFields;
import textviewpage.TextView;

public class TestTextView extends CommonAPI {

    @Test
    public void Test1() {
        TextView textView = PageFactory.initElements(ad, TextView.class);
        textView.getBackButton();
    }
    @Test
    public void Test2() {
        TextView textView = PageFactory.initElements(ad, TextView.class);
        textView.getTextViewTab();
    }
}
