package restAssuredAPI;

import io.cucumber.cienvironment.internal.com.eclipsesource.json.Json;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.path.json.JsonPath;
import junit.framework.Assert;


import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import files.Payload;


public class Basics {

	public static void main(String[] args) {
		
		//Add Place
		
	//Given -- All input Details 
	//When -- Submit Api - resource,http methods
	//then -- validate response
		
		RestAssured.baseURI= "https://rahulshettyacademy.com";
		String response = given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json").
		body(Payload.Addplace()).when().post("maps/api/place/add/json").then().statusCode(200).body("scope", equalTo("APP"))
		.header("server","Apache/2.4.52 (Ubuntu)").extract().response().asString();
		
		System.out.println(response);
		JsonPath js = ReUsableMethods.rawToJson(response);
		String placeid = js.getString("place_id");
		System.out.println(placeid);
		
		//Update place
		
		String updateAdress ="70 winter walk, USA";
		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json").
		body("{\r\n"
				+ "\"place_id\":\""+placeid+"\",\r\n"
				+ "\"address\":\""+updateAdress+"\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}").when().put("maps/api/place/update/json").then().assertThat().log().all().statusCode(200).body("msg",equalTo("Address successfully updated"));
	
		
		//Get place
		
	 String getPlaceResponse = given().log().all().queryParam("key", "qaclick123").queryParam("place_id",placeid).
	 when().get("maps/api/place/get/json").then().assertThat().log().all().statusCode(200).extract().response().asString();
	 System.out.println(getPlaceResponse);
	 
	 JsonPath js1 = ReUsableMethods.rawToJson(getPlaceResponse);
	 String actualaddress = js1.getString("address");
	 System.out.println(actualaddress);
	 Assert.assertEquals(actualaddress, updateAdress);
	 
		
	
		
		
	

	} 

}
