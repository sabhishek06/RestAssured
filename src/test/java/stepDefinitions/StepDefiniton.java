package stepDefinitions;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.io.IOException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import testData.AddPlaceData;
import utilities.Endpoints;
import utilities.RequestAndResponse;

public class StepDefiniton extends RequestAndResponse{

	AddPlaceData addPlacedata = new AddPlaceData();
	
	RequestSpecification res;
	ResponseSpecification resspec;
	Response response;

	@Given("Add place payload")
	public void add_place_payload() throws IOException {
		 res=given().spec(requestSpecification())
					.body(addPlacedata.addPlacePayload());
	}

	@When("user call the {string} api with {string} http request")
	public void user_call_the_api_with_post_http_request(String resource , String method) {
		Endpoints resourceEndpoints = Endpoints.valueOf(resource);
		
		resspec =new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		
		if(method.equalsIgnoreCase("POST"))
		 response =res.when().post(resourceEndpoints.getEndPoints());
		else if(method.equalsIgnoreCase("GET"))
			 response =res.when().get(resourceEndpoints.getEndPoints());

	}

	@Then("added place api should be success with status code {int}")
	public void added_place_api_should_be_success_with_status_code(Integer int1) {
		assertEquals(response.getStatusCode(), 200);
	}

	@And("the {string} in response is {string}")
	public void the_in_response_is(String string, String string2) {
		System.out.println("--------------------------");
	}

	@And("{string} in response body is {string}")
	public void in_response_body_is(String string, String string2) {
		System.out.println("--------------------------");
	}

}
