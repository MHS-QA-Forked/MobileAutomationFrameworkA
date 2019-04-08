package testarticles;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testbusinesspage.BusinessPageTest;

public class TestArticles extends CommonAPI {

    TestArticles testArticles;

    @BeforeClass
    public void initElements() {
        testArticles = PageFactory.initElements(ad, TestArticles.class);

    }

    @Test
    public void Menu() {
        TestArticles testArticles = PageFactory.initElements(ad, TestArticles.class);
        testArticles.Menu();
    }
}