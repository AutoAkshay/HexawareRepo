package hexaware_practice;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.hamcrest.core.IsEqual;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.equalTo;


public class ProjectInterviewTest {

	ResponseSpecification resSpec;

	@BeforeMethod
	public void beforeMethod(){

		ResponseSpecBuilder builder=new ResponseSpecBuilder();

		builder.expectContentType(ContentType.JSON);
		builder.expectStatusCode(200);
		builder.expectStatusLine("HTTP/1.1 200 OK");
		resSpec=builder.build();

	}

	@Test
	public void test(){

		JSONObject jsonObject=new JSONObject();
		jsonObject.put( "email", "eve.holt@reqres.in");
		jsonObject.put("password", "pistol");


		RequestSpecification req=RestAssured.given().header("Authorization","x-api-key").body(jsonObject.toString())
				.contentType(ContentType.JSON).baseUri("https://reqres.in/api/register");

		Response res=req.post();

		ValidatableResponse validatableResponse=res.then().body("_meta.powered_by", equalTo("ReqRes")).spec(resSpec);

		System.out.println(validatableResponse.extract().asPrettyString());

		JsonPath path=new JsonPath(res.prettyPrint());



		String token=path.get("$._meta.powered_by");

		if(res.time()<300L){
			System.out.println("Response time::"+res.time());
			System.out.println("Test case passed");

		}

//		else {
//			System.out.println("Response time::"+res.time());
//			System.out.println("Test case failed");
//			System.exit(0);
//		}

		System.out.println(token);

	}

}
