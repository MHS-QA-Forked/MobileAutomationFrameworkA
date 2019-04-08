package testentertainment;

import entertainmentpage.EntertainmentPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EntertainmentTest {

    EntertainmentPage entertainmentPage;

//    @BeforeClass
//    public void initElements() {
//        entertainmentPage = PageFactory.initElements(ad, EntertainmentPage.class);


    @Test
    public void Test1() throws InterruptedException {
        entertainmentPage.getOpenMenu();
    }
    @Test
    public void Test2() throws InterruptedException{
        entertainmentPage.getEntertainment();
    }
}