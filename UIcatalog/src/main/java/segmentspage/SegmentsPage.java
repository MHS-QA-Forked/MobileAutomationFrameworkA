package segmentspage;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import reporting.TestLogger;

public class SegmentsPage extends CommonAPI {

    public SegmentsPage() {
        PageFactory.initElements(ad, this);
    }

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Segments\"]\n")
    WebElement SegmentsTab;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"UISegmentedControl:\"]\n")
    WebElement UISegmentedControl;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Check\"])[1]")
    WebElement CheckTab;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Search\"])[1]")
    WebElement SearchKey;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Tools\"])[1]")
    WebElement ToolsTab;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"UISegmentControlStyleBordered:\"]\n")
    WebElement UISegmentControlStyleBordered;

    @FindBy(xpath = "\t//XCUIElementTypeStaticText[@name=\"UISegmentControlStyleBar:\"]")
    WebElement UISegmentControlStyleBar;

    public WebElement getSegmentsTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return SegmentsTab;
    }
    public WebElement getUISegmentedControl() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return UISegmentedControl;
    }
    public WebElement getCheckTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return CheckTab;
    }
    public WebElement getSearchKey() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return SearchKey;
    }
    public WebElement getToolsTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return ToolsTab;
    }
    public WebElement getUISegmentControlStyleBordered() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return UISegmentControlStyleBordered;
    }
    public WebElement getUISegmentControlStyleBar() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return UISegmentControlStyleBar;
    }
    public void SegmentsPage() {
        SegmentsTab.click();
        UISegmentedControl.click();
        CheckTab.click();
        SearchKey.click();
        ToolsTab.click();
        UISegmentControlStyleBordered.click();
        UISegmentControlStyleBar.click();

    }

}