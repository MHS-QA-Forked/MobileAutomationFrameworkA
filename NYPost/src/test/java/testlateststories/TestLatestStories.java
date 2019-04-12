package testlateststories;

import lateststories.LatestStories;
import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestLatestStories extends CommonAPI {

    @Test
    public void Test1() {
        LatestStories latestStories = PageFactory.initElements(ad, LatestStories.class);
        latestStories.getLatestStories();
    }

    @Test
    public void Test2() {
        LatestStories latestStories = PageFactory.initElements(ad, LatestStories.class);
        latestStories.getSavedArticlesTab();
    }

    @Test
    public void Test3() {
        LatestStories latestStories = PageFactory.initElements(ad, LatestStories.class);
        latestStories.getSearchArticles();
    }

    @Test
    public void Test4() {
        LatestStories latestStories = PageFactory.initElements(ad, LatestStories.class);
        latestStories.getSearchFrameLayout();
    }

    @Test
    public void Test5() {
        LatestStories latestStories = PageFactory.initElements(ad, LatestStories.class);
        latestStories.getSettingsTab();

    }
}