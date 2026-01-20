package parsing;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.json.JSONObject;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RestAssuredIntTest {

	RequestSpecification reqSpec;
	ResponseSpecification resSpec;
	Response res;
	@BeforeMethod
	public void reqSpec(){
		RequestSpecBuilder builder=new RequestSpecBuilder();
		JSONObject object=new JSONObject();
		object.put("email","eve.holt@reqres.in");
		object.put("password","pistol");
		builder.setBaseUri("https://reqres.in/api/register");
		builder.setContentType(ContentType.JSON);
		builder.setBody(object.toString());
		reqSpec =builder.build();
	}

	@Test
	public void test() {
		RequestSpecification req=RestAssured.given().spec(reqSpec).header("Authorization","x-api-key");
		res=req.post();
		res.prettyPrint();
	}

	@AfterMethod
	public void resSpec(){
		ResponseSpecBuilder resBuilder=new ResponseSpecBuilder();
		resBuilder.expectStatusCode(200);
		resBuilder.expectContentType(ContentType.JSON);
		resSpec=resBuilder.build();
		ValidatableResponse valRes=res.then().spec(resSpec);
	}
}
