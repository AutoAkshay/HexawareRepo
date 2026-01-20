package parsing;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class restAssuredPractice {

    @Test
    public void test(){

        RequestSpecification reqSpec=RestAssured.given()
                .headers("Authorization","x-api-key")
                .baseUri("https://reqres.in/api/users?page=2");

        Response res=reqSpec.get();

        String str=res.prettyPrint();

        JSONObject jsonObject=new JSONObject(str);
        JSONArray jsonArray=jsonObject.getJSONArray("data");

        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject obj=jsonArray.getJSONObject(i);
            if(obj.get("id").equals(5)){
                String email= obj.get("email").toString();
                System.out.println(email+"::EmailID");
            }
        }
    }

}
