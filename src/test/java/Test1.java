import io.restassured.RestAssured;
import testData.AddPlaceData;

import static io.restassured.RestAssured.given;

public class Test1 {
	
	public static void main(String[] args) {
		
		AddPlaceData add = new AddPlaceData();
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		given().queryParam("key", "click123").header("Content-Type","application/json")
		.body(add.addPlacePayload())
		.when().post("/maps/api/place/add/json").then().assertThat().log().all().statusCode(200);
	}

}
