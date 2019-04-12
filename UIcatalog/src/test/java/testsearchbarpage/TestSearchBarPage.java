package testsearchbarpage;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pickerspage.PickerPage;
import searchbarpage.SearchBar;

public class TestSearchBarPage extends CommonAPI {

    @Test
    public void Test1() {
        SearchBar searchBar = PageFactory.initElements(ad, SearchBar.class);
        searchBar.getBackTab();
    }
    @Test
    public void Test2() {
        SearchBar searchBar = PageFactory.initElements(ad, SearchBar.class);
        searchBar.getSearchBar();
    }

}
