package testsegmentpage;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import searchbarpage.SearchBar;
import segmentspage.SegmentsPage;

public class TestSegmentPage extends CommonAPI {

    @Test
    public void Test1() {
        SegmentsPage segmentsPage = PageFactory.initElements(ad, SegmentsPage.class);
        segmentsPage.getSegmentsTab();
    }
    @Test
    public void Test2() {
        SegmentsPage segmentsPage = PageFactory.initElements(ad, SegmentsPage.class);
        segmentsPage.getUISegmentedControl();
    }
    @Test
    public void Test3() {
        SegmentsPage segmentsPage = PageFactory.initElements(ad, SegmentsPage.class);
        segmentsPage.getCheckTab();
    }
    @Test
    public void Test4() {
        SegmentsPage segmentsPage = PageFactory.initElements(ad, SegmentsPage.class);
        segmentsPage.getSearchKey();
    }
    @Test
    public void Test5() {
        SegmentsPage segmentsPage = PageFactory.initElements(ad, SegmentsPage.class);
        segmentsPage.getToolsTab();
    }
    @Test
    public void Test6() {
        SegmentsPage segmentsPage = PageFactory.initElements(ad, SegmentsPage.class);
        segmentsPage.getUISegmentControlStyleBordered();
    }
    @Test
    public void Test7() {
        SegmentsPage segmentsPage = PageFactory.initElements(ad, SegmentsPage.class);
        segmentsPage.getUISegmentControlStyleBar();
    }
}
