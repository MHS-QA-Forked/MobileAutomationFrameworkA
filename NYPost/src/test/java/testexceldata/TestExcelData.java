package testexceldata;

import common.CommonAPI;
import excelData.SearchForData;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestExcelData extends CommonAPI {

    SearchForData searchForData ;

    @BeforeMethod
    public void init(){
        searchForData = PageFactory.initElements(ad,SearchForData.class);
    }

    @Test
    public void testDataDrivenFromExcel(){
        searchForData.searchForItems();
    }

}
