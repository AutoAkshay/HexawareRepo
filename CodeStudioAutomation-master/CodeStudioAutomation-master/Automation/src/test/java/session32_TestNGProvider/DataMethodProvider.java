package session32_TestNGProvider;

import org.testng.annotations.DataProvider;

public class DataMethodProvider {
	
	@DataProvider(name = "searchDataSet")
	public Object[][] searchData(){
		Object[][]searchKeyWord=new Object[3][2];
		searchKeyWord[0][0]="India";
		searchKeyWord[0][1]="Qutub Minar";
		
		searchKeyWord[1][0]="Agra";
		searchKeyWord[1][1]="Tajmahal";
		
		searchKeyWord[2][0]="Hyderabad";
		searchKeyWord[2][1]="Charminar";
		
		return searchKeyWord;
	}

}
