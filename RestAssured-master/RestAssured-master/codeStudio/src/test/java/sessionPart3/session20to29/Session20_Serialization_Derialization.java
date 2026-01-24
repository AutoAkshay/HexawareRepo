package sessionPart3.session20to29;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

class Employee {
	private String firstName;
	private String lastName;
	private String gender;
	private int age;
	private double salary;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lasttName) {
		this.lastName = lasttName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}

public class Session20_Serialization_Derialization {

	@Test
	void serialization() throws JsonProcessingException {
		
		Employee emp1=new Employee();
		emp1.setFirstName("Suresh");
		emp1.setLastName("Mehra");
		emp1.setGender("Male");
		emp1.setAge(35);
		emp1.setSalary(10000.00);
		
		ObjectMapper objMapper=new ObjectMapper();
		String empJSON=objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(emp1);
		
//		System.out.println(empJSON);
		
		RestAssured.baseURI="https://httpbin.org/post";
		RequestSpecification reqSpec=RestAssured.given();
		reqSpec.body(empJSON);
		reqSpec.contentType(ContentType.JSON.toString());
		Response res= reqSpec.post();
		ValidatableResponse valRes= res.then().log().all().statusCode(200);
		
		Assert.assertEquals(res.getStatusCode(), 200,"Not maching");
		
		Employee emp2= objMapper.readValue(empJSON,Employee.class);
		System.out.println("********************************************************************");
		System.out.println(emp2.getFirstName());
		System.out.println(emp2.getLastName());
		System.out.println(emp2.getGender());
		System.out.println(emp2.getAge());
		System.out.println(emp2.getSalary());		
	}
}
