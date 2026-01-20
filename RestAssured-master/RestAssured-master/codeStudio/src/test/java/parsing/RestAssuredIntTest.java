package parsing;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;


public class RestAssuredIntTest {

	@Test
	public void test() throws JsonProcessingException {





		RequestSpecification req=RestAssured.given()
				.header("Authorization","x-api-key ")
				.contentType(ContentType.JSON).baseUri("https://reqres.in/api/users?page=2");

		Response res=req.post();

		res.prettyPrint();
//
//		POJO pojo1=mapper.readValue(body,POJO.class);
//
//		System.out.println("Email :: "+pojo1.getEmail());
//		System.out.println("Password :: "+pojo1.getPassword());
//
//		JsonPath path=new JsonPath(res.prettyPrint());
//
//		String token=path.get("token");

//		Assert.assertEquals(token,"QpwL5tke4Pnpja7X4","not matching");

	}
}
