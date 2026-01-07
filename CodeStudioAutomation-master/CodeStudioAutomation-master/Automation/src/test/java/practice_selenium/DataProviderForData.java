package practice_selenium;

import org.testng.annotations.DataProvider;

public class DataProviderForData {

    @DataProvider(name = "StateCity")
    public Object[][] data(){
        Object[][]obj=new Object[2][2];
        obj[0][0]="Maharashtra";
        obj[0][1]="Pune";

        obj[1][0]="Tamilnadu";
        obj[1][1]="Chennai";

        return obj;
    }
}
