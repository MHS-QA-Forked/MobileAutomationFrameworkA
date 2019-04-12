package testalertpage;

import alertspage.Alerts;
import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestAlertPage extends CommonAPI {

    @Test
    public void Test1() {
        Alerts alerts = PageFactory.initElements(ad, Alerts.class);
        alerts.getBackButton();
    }
    @Test
    public void Test2() {
        Alerts alerts = PageFactory.initElements(ad, Alerts.class);
        alerts.getAlertsTab();
    }
    @Test
    public void Test3() {
        Alerts alerts = PageFactory.initElements(ad, Alerts.class);
        alerts.getUIActionSheet();
    }
    @Test
    public void Test4() {
        Alerts alerts = PageFactory.initElements(ad, Alerts.class);
        alerts.getShowSimple();
    }
    @Test
    public void Test5() {
        Alerts alerts = PageFactory.initElements(ad, Alerts.class);
        alerts.getAlertReviewControler();
    }
    @Test
    public void Test6() {
        Alerts alerts = PageFactory.initElements(ad, Alerts.class);
        alerts.getShowOkCancel();
    }
    @Test
    public void Test7() {
        Alerts alerts = PageFactory.initElements(ad, Alerts.class);
        alerts.getAlertViewConDialogOkCancelAction();
    }
    @Test
    public void Test8() {
        Alerts alerts = PageFactory.initElements(ad, Alerts.class);
        alerts.getShowCustomizedTab();
    }
    @Test
    public void Test9() {
        Alerts alerts = PageFactory.initElements(ad, Alerts.class);
        alerts.getUIAlertView();
    }
    @Test
    public void Test10() {
        Alerts alerts = PageFactory.initElements(ad, Alerts.class);
        alerts.getShowSimpleTab();
    }
    @Test
    public void Test11() {
        Alerts alerts = PageFactory.initElements(ad, Alerts.class);
        alerts.getAlertViewConAlertSimAction();
    }
    @Test
    public void Test12() {
        Alerts alerts = PageFactory.initElements(ad, Alerts.class);
        alerts.getUIAlertViewShowSimple();
    }
    @Test
    public void Test13() {
        Alerts alerts = PageFactory.initElements(ad, Alerts.class);
        alerts.getShowCustomTab();
    }
    @Test
    public void Test14() {
        Alerts alerts = PageFactory.initElements(ad, Alerts.class);
        alerts.getSecureTextInput();
    }
}