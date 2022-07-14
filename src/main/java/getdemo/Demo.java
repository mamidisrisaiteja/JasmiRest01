package getdemo;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo {

	public static void main(String[] args) {
		RestAssured.baseURI="http://rahulshettyacademy.com";//baseUri
		
	
		RequestSpecification res=RestAssured.given();// specify object
		 
		Response response=res.queryParam("place_id","f96817934f08ce989e0ec9ac67ceb266")
				             .queryParam("key", "qaclick123").headers("Content-Type","application/json")
				             .get("/maps/api/place/get/json");
				
		response.prettyPrint();	
				              

	}

}
