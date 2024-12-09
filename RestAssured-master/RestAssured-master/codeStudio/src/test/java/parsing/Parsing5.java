package parsing;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class Parsing5 {



	@Test
	public void test() {
        String str = "{\n"
                + "\"id\": \"0001\",\n"
                + "\"type\": \"donut\",\n"
                + "\"name\": \"Cake\",\n"
                + "\"ppu\": 0.55,\n"
                + "\"batters\": {\n"
                + "\"batter\": [\n"
                + "{ \"id\": \"1001\", \"type\": \"Regular\" },\n"
                + "{ \"id\": \"1002\", \"type\": \"Chocolate\" },\n"
                + "{ \"id\": \"1003\", \"type\": \"Blueberry\" },\n"
                + "{ \"id\": \"1004\", \"type\": \"Devil's Food\" }\n"
                + "]\n"
                + "}\n"
                + "}";
        
        JSONObject object=new JSONObject(str);
        
        JSONObject batters = object.getJSONObject("batters");
        
        JSONArray array = batters.getJSONArray("batter");
        
        for (int i = 0; i < array.length(); i++) {
			
        	JSONObject jsonObject = array.getJSONObject(i);
        	
        	if(jsonObject.get("type").equals("Chocolate")) {
        		System.out.println(jsonObject.get("id"));
        	}
			
		}
        
	}


}
