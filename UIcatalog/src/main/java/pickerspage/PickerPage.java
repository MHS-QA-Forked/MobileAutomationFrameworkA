package pickerspage;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PickerPage extends CommonAPI {

    public PickerPage() {
        PageFactory.initElements(ad, this);
    }
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Pickers\"]\n")
    WebElement PickersPage;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"John Appleseed - 0\"]\n" + "\n")
    WebElement JohnApplesseed;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"UIPicker\"]\n")
    WebElement UIPickerTab;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"UIDatePicker\"]\n")
    WebElement UIDatePickerTab;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Custom\"]")
    WebElement CustomTab;

    public WebElement getPickersPage() { return PickersPage; }
    public WebElement getJohnApplesseed() {
        return JohnApplesseed;
    }
    public WebElement getUIPickerTab() {
        return UIPickerTab;
    }
    public WebElement getUIDatePickerTab() {
        return UIDatePickerTab;
    }
    public WebElement getCustomTab() {
        return CustomTab;
    }

    public void PickerPage(){
        PickersPage.click();
        JohnApplesseed.click();
        UIPickerTab.click();
        UIDatePickerTab.click();
        CustomTab.click();
    }
}