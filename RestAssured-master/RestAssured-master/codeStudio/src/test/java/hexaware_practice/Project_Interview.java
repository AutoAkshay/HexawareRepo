package hexaware_practice;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.path.json.JsonPath;


public class Project_Interview {
	
	
	public static void main(String[] args) throws JsonProcessingException {
		
		String str="{\r\n"
				+ "  \"book\": [\r\n"
				+ "    {\r\n"
				+ "      \"author\": \"Nigel Rees\",\r\n"
				+ "      \"category\": \"reference\",\r\n"
				+ "      \"price\": 150.5,\r\n"
				+ "      \"title\": \"Saying of the Century\"\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"author\": \"Evelyn Waugh\",\r\n"
				+ "      \"category\": \"fiction\",\r\n"
				+ "      \"price\": 100,\r\n"
				+ "      \"title\": \"Sword of the Honour\"\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"author\": \"Herman Melville\",\r\n"
				+ "      \"category\": \"fiction\",\r\n"
				+ "      \"isbn\": \"0-553-21311-3\",\r\n"
				+ "      \"price\": 75.5,\r\n"
				+ "      \"title\": \"Moby Dick\"\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"author\": \"J. R. R. Tokien\",\r\n"
				+ "      \"category\": \"fiction\",\r\n"
				+ "      \"isbn\": \"0-395-19395-8\",\r\n"
				+ "      \"price\": 200,\r\n"
				+ "      \"title\": \"The Lord of the Rings\"\r\n"
				+ "    }\r\n"
				+ "  ]\r\n"
				+ "}";
		
		JsonPath jsonPath=new JsonPath(str);
		
//		JSONObject jsonObject=new JSONObject(jsonPath);
		
		
		
		
	}
	
}