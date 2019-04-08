package entertainmentpage;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class EntertainmentPage  extends CommonAPI {

    @FindBy(id = "Id=br.com.golmobile.nypost:id/headline_text_view)")
    WebElement Entertainment;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Open menu\"]")
    WebElement OpenMenu;

    public WebElement getEntertainment() {
        return Entertainment;
    }
    public WebElement getOpenMenu(){
        return OpenMenu;

}
    public void showEntertainment() throws InterruptedException {
        OpenMenu.click();
        Entertainment.click();
        sleep(2);

    }

}


