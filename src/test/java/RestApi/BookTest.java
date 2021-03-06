package RestApi;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

/**
 * 
 * 
 * @author AnkurBakshi
 * This class does complete test of adding and deleting - It is a complete test in itself
 *
 */


public class BookTest {
  
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

  
  
  public void f2(String isbn, String aisle) {
	
	  RestAssured.baseURI = "https://rahulshettyacademy.com";
	  
	  Response res=  given().body(BodyPost.getDeleteBody(isbn, aisle)).when().post("/Library/DeleteBook.php").then().extract().response();
	  System.out.println("Response starts------- " + res.asString() + " ends");

  }
  
  

  public Object[][] getData(){
	  //Multidimensional Array object [][]
	  return new Object[][] {{"chch","1989"}, {"td","2222"}, {"cd","3333"}};
  }
  

}

