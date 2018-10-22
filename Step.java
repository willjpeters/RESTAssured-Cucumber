package com.qa.restassuredtest;

//import org.json.simple.JSONArray;
import org.json.JSONObject;
//import org.json.simple.parser.JSONParser;
//import org.json.simple.parser.ParseException;
import groovyjarjarantlr.Parser;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static org.junit.Assert.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class Step {
	
	RequestSpecification request1 = RestAssured.given();
	Response Guardians = request1.get(Constants.Guardians);
	RequestSpecification request2 = RestAssured.given();
	Response IT = request2.get(Constants.IT);
	JSONObject jason = null;
	RequestSpecification request3 = RestAssured.given();
	
	@Given("^a film exists with the Title Guardians of the Galaxy Two$")
	public void a_film_exists_with_the_Title_Guardians_of_the_Galaxy_Two()
	{
		request1.given().contentType(ContentType.JSON);
	}

	@When("^a user retrieves the film by the title Guardians of the Galaxy Two$")
	public void a_user_retrieves_the_film_by_the_title_Guardians_of_the_Galaxy_Two()
	{
		Guardians.prettyPrint();
	}

	@Then("^the status code reads (\\d+)$")
	public void the_status_code_reads(int arg1)
	{
	    ValidatableResponse json = Guardians.then().statusCode(arg1);
	}

	@Given("^a film exists with the Title IT$")
	public void a_film_exists_with_the_Title_IT()
	{
		request2.given().contentType(ContentType.JSON);
	}

	@When("^a user retrieves the film by the title IT$")
	public void a_user_retrieves_the_film_by_the_title_IT()
	{
	    IT.prettyPrint();
	}

	@Then("^the Rated Field is equal to R$")
	public void the_Rated_Field_is_equal_to_R()
	{
		jason = new JSONObject(IT.asString());
		assertEquals("R",jason.getString("Rated"));
	}

	@Given("^a film exists with the Title \"([^\"]*)\"$")
	public void a_film_exists_with_the_Title(String arg1)
	{}

	@When("^a user retrieves the film by the title \"([^\"]*)\"$")
	public void a_user_retrieves_the_film_by_the_title(String arg1)
	{
		"\"http://www.omdbapi.com/?apikey=b7bc0672&t="
	}

	@Then("^the Rated Field is equal to \"([^\"]*)\"$")
	public void the_Rated_Field_is_equal_to(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
