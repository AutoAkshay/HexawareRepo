package day3;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import java.util.Map;

public class CookiesDemo {

	//	@Test(priority = 1)
	void testCookies() {
		given()

				.when()
				.get("https://www.google.com/")
				.then()
				.cookies("AEC", "AQTF6Hx8BCviKrFrcDugT53iz6nckfi25zPtwwxptQHAJw70RLIygPNs9g")
				.log().all();

	}

	@Test(priority = 2)
	void getCookiesInfo() {

		RequestSpecification requestSpecification=RestAssured.given().baseUri("https://www.flipkart.com/");

		Response res=requestSpecification.get();

//		ValidatableResponse resVal=res.then().log().all();



		Map<String, String> cookies=res.getCookies();

		Headers headers=res.headers();
		int p=1;
		for(Header header:headers) {

			System.out.println("Header "+p+"::"+header);
			p++;
		}

//		System.out.println(cookies);

		for(Map.Entry entry:cookies.entrySet()) {
			System.out.println(entry.getValue()+"::"+ entry.getKey());
		}

	}

}
