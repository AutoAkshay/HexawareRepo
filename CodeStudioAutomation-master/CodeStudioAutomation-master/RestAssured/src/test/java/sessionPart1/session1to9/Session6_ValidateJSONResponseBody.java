package sessionPart1.session1to9;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.json.JSONObject;

import static org.hamcrest.CoreMatchers.equalTo;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.Validatable;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Session6_ValidateJSONResponseBody{

	@Test
	void test01() {
		
		RequestSpecification reqSpec=RestAssured.given().header("Authorization","x-api-key");
		
		reqSpec.baseUri("https://reqres.in/");
		reqSpec.basePath("api/users/2");
		
		Response res= reqSpec.get();
		
		String resBody=res.getBody().prettyPrint();
		
		System.out.println("Response Body::"+resBody);
		
		//check for presence
		Assert.assertEquals(resBody.contains("janet.weaver@reqres.in"), true,"Not visible");
		
	}	
	
	@Test
	void test02() {
		
		RequestSpecification reqSpec=RestAssured.given().header("Authorization","x-api-key");
		
		Response response= reqSpec.when().get("https://reqres.in/api/users?page=2");
		
		ResponseBody body= response.getBody();
		
		JsonPath path= body.jsonPath();
		
		System.out.println(path.get("data[2].avatar").toString());
		System.out.println(response.getBody().jsonPath().get("data[2].email").toString());
		

		String body2=body.prettyPrint();
//		JsonPath path=body2.jsonPath();
		String name=path.get("data[0].first_name");

		System.out.println(path.get("data[2].avatar").toString());
		System.out.println("Name::"+name);
		Assert.assertEquals(name, "Michael","Not found");
	}	
}
