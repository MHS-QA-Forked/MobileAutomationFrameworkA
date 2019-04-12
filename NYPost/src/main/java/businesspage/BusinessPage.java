package businesspage;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import reporting.TestLogger;

import java.awt.*;

public class BusinessPage extends CommonAPI {

        public BusinessPage(){ PageFactory.initElements(ad, this);
        }

        @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Menu\"]")
        public static WebElement menu;

        @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[6]")
        public static WebElement business;

        public WebElement getMenu() {
                TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
                return menu;
        }

        public WebElement getBusiness() {
                TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
                return business;
        }

        public void OpenMenu() {
                menu.click();
                String title = ad.getTitle();
                Assert.assertEquals(title, "Appium");

                business.click();
                String title1 = ad.getTitle();
                Assert.assertEquals(title1, "Appium");
        }
}