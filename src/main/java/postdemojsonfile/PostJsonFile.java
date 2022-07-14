package postdemojsonfile;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostJsonFile {

	public static void main(String[] args) throws Exception, ParseException {
RestAssured.baseURI="https://rahulshettyacademy.com";//we will specify base URI
		
		RequestSpecification res=RestAssured.given();//declared the request object
		
	JSONParser jsonParser=new JSONParser(); //it performs operations on jsondata
FileReader fr=new FileReader("C:\\Users\\AN574BV\\eclipse-workspace\\MvnTest2\\src\\main\\java\\objectresources\\demoJson.json");//it reads jsondata butnot know how to handle with it
Object obj=	jsonParser.parse(fr);//storing file content in java object(obj)
JSONObject jsonobject=(JSONObject)obj;// typecasting javaobject into jsonobject
      String strobj=jsonobject.toString();   // inorder to transport the data through network we have to serialize the data(converted into string)
      //serialization - converting lumpsum data into series of characters
      
      

Response response=  res.queryParam("key","qaclick123")
				.headers("Content-Type","application/json")
				.body(strobj)
				.post("maps/api/place/add/json");
		response.prettyPrint();

	}

}
