package delete;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteDemo {

	public static void main(String[] args) {
	RestAssured.baseURI="https://rahulshettyacademy.com";
	RequestSpecification resp=RestAssured.given();
	
	Response response=resp.queryParam("key", "qaclick123")
			.headers("Content-Type","application/json")
			.body("{\r\n"
					+ "    \"place_id\":\"1cf18b574cfb5a4b464e1ea166fedc43\"\r\n"
					+ "}")
			.delete("/maps/api/place/delete/json");
	
	response.prettyPrint();
			

	}

}
