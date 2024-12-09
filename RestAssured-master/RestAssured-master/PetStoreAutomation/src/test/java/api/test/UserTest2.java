package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.endpoints.UserEndPoints2;
import api.payload.User;
import io.restassured.response.Response;


public class UserTest2 {
	
	Faker faker;
	User userPayload;
	
	public Logger logger;
	
	@BeforeClass
	public void setupData() {
		
		faker=new Faker();
		userPayload=new User();
		
		userPayload.setId(faker.idNumber().hashCode());
		userPayload.setUsername(faker.name().username());
		userPayload.setFirstName(faker.name().firstName());
		userPayload.setLastName(faker.name().lastName());
		userPayload.setEmail(faker.internet().safeEmailAddress());
		userPayload.setPassword(faker.internet().password());
		userPayload.setPhone(faker.phoneNumber().cellPhone());	
		
		logger=LogManager.getLogger(this.getClass());
	}
	
	@Test(priority = 1)
	public void testPostUser(){
		
		logger.info("********************Creating User**********************");
		
		Response response= UserEndPoints2.createUser(userPayload);
		response.then().log().all();
		
		Assert.assertEquals(response.statusCode(), 200);
		
		logger.info("********************User Created**********************");
	}
	
	@Test(priority = 2)
	public void testGetUser(){
		
		logger.info("********************Reading User Info**********************");
		
		Response response= UserEndPoints2.readUser(this.userPayload.getUsername());
		response.then().log().all();
		
		Assert.assertEquals(response.statusCode(), 200);
		
		logger.info("********************User Info Displayed**********************");
	}
	
	@Test(priority = 3)
	public void testUpdateUser(){
		
		logger.info("********************Updating User Info**********************");
		
		userPayload.setUsername(faker.name().username());
		userPayload.setFirstName(faker.name().firstName());
		userPayload.setLastName(faker.name().lastName());
		userPayload.setEmail(faker.internet().safeEmailAddress());
		userPayload.setPassword(faker.internet().password());
		userPayload.setPhone(faker.phoneNumber().cellPhone());	
		
		Response response= UserEndPoints2.updateUser(this.userPayload.getUsername(),userPayload);
		response.then().log().all();
		
		Assert.assertEquals(response.statusCode(), 200);
		
		//check the data update
		
		Response responseUpdate= UserEndPoints2.readUser(this.userPayload.getUsername());
		responseUpdate.then().log().all();
		
		Assert.assertEquals(response.statusCode(), 200);
		
		logger.info("********************User Info Updated**********************");
	}
	
	@Test(priority = 4)
	public void testDeleteUser(){
		
		logger.info("********************deleting User Info**********************");
		
		Response response= UserEndPoints2.deleteUser(this.userPayload.getUsername());
		response.then().log().all();
		
		Assert.assertEquals(response.statusCode(), 200);
		
		logger.info("********************User Info deleted**********************");
	}

}
