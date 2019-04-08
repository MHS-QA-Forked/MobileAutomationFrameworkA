package businesspage;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.awt.*;

public class BusinessPage extends CommonAPI {

        @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Menu\"]")
        public static WebElement menu;

        @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[6]")
        public static WebElement business;

        public WebElement getMenu() {
                return menu;
        }
        public WebElement getBusiness(){
                return business;
        }
                public void showNews () throws InterruptedException {
                        menu.click();
                        business.click();
                        sleep(2);

                }
        }


