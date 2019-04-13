package home;

import common.CommonAPI;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHome extends CommonAPI {

    @Test
    public void TestHomePage(){
        HomePage homePage = PageFactory.initElements(ad, HomePage.class);
        homePage.BRGRMenu();
    }

    @Test
    public void TestSearchBox(){
        HomePage homePage = PageFactory.initElements(ad, HomePage.class);
        homePage.Search();
    }

    @Test
    public void TestMessages(){
        HomePage homePage = PageFactory.initElements(ad, HomePage.class);
        homePage.Messages();
    }

    @Test
    public void TestSellPage(){
        HomePage homePage = PageFactory.initElements(ad, HomePage.class);
        homePage.SellPage();
    }

    @Test
    public void TestDealPage(){
        HomePage homePage = PageFactory.initElements(ad, HomePage.class);
        homePage.DealPage();
    }

    @Test
    public void TestBabyPage(){
        HomePage homePage = PageFactory.initElements(ad, HomePage.class);
        homePage.CategoriesPage();
    }

    @Test
    public void TestFeatured(){
        HomePage homePage = PageFactory.initElements(ad, HomePage.class);
        homePage.FeauturedPage();
    }


}



