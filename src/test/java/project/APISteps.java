package project;

import io.cucumber.core.options.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.apache.hc.client5.http.impl.async.H2AsyncClientBuilder;
import org.apache.http.client.HttpClient;
import org.junit.Test;
import utils.PayLoadUtils;

import static io.restassured.RestAssured.given;

public class APISteps {

    @Test
    @Given("user sends a post request with body")
    public void user_sends_a_post_request_with_body() {
        String user= PayLoadUtils.getNewUser();
        given().header("Accept","application/json")
                .header("Content-type","application/json")
                .when().post("https://gorest.co.in/public-api/users")
                .then().statusCode(200).contentType("application/json");
    }

    @Test
    @When("user sends a get request for validation")
    public void user_sends_a_get_request_for_validation() {
       given().header("Accept","application/json")
               .when().get("https://gorest.co.in/public-api/users/1428")
               .then().statusCode(200).contentType("application/json");
    }


    @Test
    @Given("the user sends a post request with a new body")
    public void the_user_sends_a_post_request_with_a_new_body() {
        String user2= PayLoadUtils.getSecondUser();
        given().header("Accept","application/json")
                .header("Content-type","application/json")
                .when().post("https://gorest.co.in/public-api/users")
                .then().statusCode(200).contentType("application/json");
    }

    @Test
    @When("user sends a get request to validate 2nd user")
    public void user_sends_a_get_request_to_validate_2nd_user() {
        given().header("Accept","application/json")
                .when().get("https://gorest.co.in/public-api/users/1446")
                .then().statusCode(200).contentType("application/json");
    }

    @Test
    @Given("the user sends a put request with updated body")
    public void the_user_sends_a_put_request_with_updated_body() {
        String putUser=PayLoadUtils.putFirstUser();
        given().header("Accept","application/json")
                .header("Content-type","application/json")
                .when().put("https://gorest.co.in/public-api/users")
                .then().statusCode(200).contentType("application/json");
    }
    @When("user sends a get request to validate updated one")
    public void user_sends_a_get_request_to_validate_updated_one() {
        given().header("Accept","application/json")
                .when().get("https://gorest.co.in/public-api/users/1428")
                .then().statusCode(200).contentType("application/json");
    }
}
