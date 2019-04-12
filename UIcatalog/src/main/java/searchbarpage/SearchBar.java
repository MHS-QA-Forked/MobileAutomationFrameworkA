package searchbarpage;


import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import reporting.TestLogger;

public class SearchBar extends CommonAPI {

    public SearchBar() {
        PageFactory.initElements(ad, this);
    }
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Back\"]\n")
    WebElement BackTab;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"SearchBar\"]\n")
    WebElement SearchBar;

    public WebElement getBackTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return BackTab;
    }
    public WebElement getSearchBar() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return SearchBar;
    }

    public void SearchPage() {
        BackTab.click();
        String title = ad.getTitle();
        Assert.assertEquals(title, "Appium");

        SearchBar.click();
        String title1 = ad.getTitle();
        Assert.assertEquals(title, "Appium");
    }
}
