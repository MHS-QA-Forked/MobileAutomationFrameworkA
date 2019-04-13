package homepage;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;

public class HomePage extends CommonAPI {

    public HomePage (){ PageFactory.initElements(ad, this);

    }
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Main navigation, open\"]")
    WebElement brgrbtn;
    @FindBy(className = "_highlighter-box_6a798")
    WebElement searchBox;
    @FindBy(id = "com.ebay.mobile:id/recycler_view_main")
    WebElement messages;
    @FindBy(xpath = "/android.widget.TextView[@content-desc=\"Selling button\"]")
    WebElement selling;
    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Deals button\"]")
    WebElement deals;
    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Categories button\"]")
    WebElement categories;
    @FindBy(xpath="//android.widget.TextView[@text='Baby']")
    WebElement baby;
    @FindBy(xpath = "//android.widget.TextView[@text='FEATURED']")
    WebElement featured;

    public WebElement getBrgrbtn(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return brgrbtn;
    }

    public WebElement getSearchBox(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return getSearchBox();
    }

    public WebElement getMessages(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return messages;
    }

    public WebElement getSelling(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return selling;
    }

    public WebElement getDeals(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return deals;
    }
    public WebElement getCategories(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return categories;
    }

    public WebElement getBaby() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return baby;
    }

    public WebElement getFeatured() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return featured;
    }
    public void BRGRMenu(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getBrgrbtn().click();
    }

    public void Search(){ getSearchBox().sendKeys("toys");
    }

    public void Messages(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getMessages().click();
    }

    public void SellPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getSelling().click();
    }

    public void DealPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getDeals().click();
    }

    public void CategoriesPage(){
        getCategories().click();
        getBaby().click();
    }

    public void FeauturedPage(){
        getDeals().click();
        getFeatured().click();
    }

}
