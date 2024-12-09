package aaa;

import com.github.scribejava.core.model.Response;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Project_Interview {
	
	public void getMethod() {
		
		RequestSpecification reqSpec=RestAssured.given();//.baseUri("https://reqres.in/api/users?page=2");
		
		io.restassured.response.Response res= reqSpec.get("https://reqres.in/api/users?page=2");
		
		ValidatableResponse valRes= res.then().body("", equalTo(""));
		
		
		
	}

}
