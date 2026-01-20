package sessionPart3.session20to29;

import org.hamcrest.Matchers;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;

import io.restassured.RestAssured;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;


public class Session29_ResponseSpecificationAndResponseSpecBuilder {

	ResponseSpecification res;
	
	@BeforeMethod
	public void statusValidation() {
		ResponseSpecBuilder builder=new ResponseSpecBuilder();
		builder.expectStatusCode(200);
		builder.expectStatusLine("HTTP/1.1 200 OK");
		builder.expectContentType(ContentType.JSON);
		builder.expectResponseTime(Matchers.lessThan(2000L));
		res=builder.build();
	}
	
	@Test
	public void createUser() throws JsonProcessingException {
		
        RestAssured.baseURI = "https://reqres.in/api/users";        
        RequestSpecification reqSpec = RestAssured.given().header("Authorization","x-api-key");
        Response response = reqSpec.get();
        ValidatableResponse valRes = response.then().spec(res);

		System.out.println(valRes.extract().asPrettyString());

		System.out.println(response.prettyPrint());
        
	}
}
