package parsing;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;

public class PracticeHexaware {

	@Test
	public void test() {
		String bodyInString = "{\r\n" + "\"id\": \"0001\",\r\n" + "\"type\": \"donut\",\r\n" + "\"name\": \"Cake\",\r\n"
				+ "\"ppu\": 0.55,\r\n" + "\"batters\":\r\n" + "{\r\n" + "\"batter\":\r\n" + "[\r\n"
				+ "{ \"id\": \"1001\", \"type\": \"Regular\" },\r\n"
				+ "{ \"id\": \"1002\", \"type\": \"Chocolate\" },\r\n"
				+ "{ \"id\": \"1003\", \"type\": \"Blueberry\" },\r\n"
				+ "{ \"id\": \"1004\", \"type\": \"Devil's Food\" }\r\n" + "]\r\n" + "}\r\n" + "}\r\n" + "";
	
		JSONObject obj=new JSONObject(bodyInString);
		JSONArray array=obj.getJSONObject("batters").getJSONArray("batter");
		
		for (int i = 0; i < array.length(); i++) {
			
			JSONObject object = array.getJSONObject(i);
			
			if(object.get("id").equals("1002")) {
				System.out.println(object);
			}
		}
	
	}

}
