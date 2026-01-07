package basicJava.collections.dataprovider;

/*
Collections are utility class which has it's methods such as shuffle,sort,reverse,reverseOrder
*/

public class DataProvider {

    @org.testng.annotations.DataProvider(name = "searchData")
   public Object[][] data(){
       Object[][] obj=new Object[2][2];
       obj[0][0]="Maharashtra";
       obj[0][1]="Ellora";

       obj[1][0]="Uttar Pradesh";
       obj[1][1]="Agra";

       return obj;
   }
}
