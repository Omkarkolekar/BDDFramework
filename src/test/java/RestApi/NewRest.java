package RestApi;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

class NewRest {

	@Test
	public void f(String isbn, String aisle) {

		
		  RestAssured.baseURI = "https://rahulshettyacademy.com";
		  
		  Response res=  given().body(BodyPost.getBody(isbn,aisle)).when().post("/Library/Addbook.php").then().extract().response();
		  System.out.println("Response starts " + res.asString() + " ends");

		  ///---------------above or below--------------//
	  
		  Response response = given()
		            .header("Content-type", "application/json")
		            .and()
		            .body(BodyPost.getBody(isbn,aisle))
		            .when()
		            .post("/posts")
		            .then()
		            .extract().response();
		  
		  System.out.println("Response starts======= " + response.asString() + "==== ends");

		  //System.out.println("ID returned : " + BodyPost.getDeleteBody(isbn, aisle));
	  
	}

}
