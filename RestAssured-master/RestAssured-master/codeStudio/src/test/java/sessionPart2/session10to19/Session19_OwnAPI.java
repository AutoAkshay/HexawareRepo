package sessionPart2.session10to19;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class Session19_OwnAPI {
	@Test
	void OwnAPI() {
		
		HashMap map=new HashMap<>();
		
		map.put("name", "Akshay");
		map.put("location", "India");
		map.put("phone", "788740");		
		String[] courses= {"C++","JAVA"};		
		map.put("courses", courses);
		
		Response response=  given().body(map).contentType(ContentType.JSON)
		
		.when().get("http://localhost:3000/students");
		
		ValidatableResponse valRes= response.then().log().all();
//		String id=response.jsonPath().get("id");
//		
//		System.out.println(id);
	}
}
