package put;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutDemo {

	public static void main(String[] args) {
		RestAssured.baseURI="http://rahulshettyacademy.com";
		
		RequestSpecification resp=RestAssured.given();
		Response response=resp.queryParam("place_id","e8f85f6f465a5d81d25111aa39b50d36")
				.queryParam("key","qaclick123").headers("Content-Type","application/json")
				.put("/maps/api/place/get/json");
		response.prettyPrint();

	}

}
