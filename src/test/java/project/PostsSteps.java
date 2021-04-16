package project;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;
import utils.PayLoadUtils;

import static io.restassured.RestAssured.given;

public class PostsSteps {

    String text=PayLoadUtils.postMessage(1449);
    @Given("create a post for user")
    public void create_a_post_for_user() {
       given().header("Accept","application/json")
               .header("Content-type","application/json")
               .header("OAuth2.0","106b8f21995c73c87f315a314df2a751097151c10820b7bf28bed937c94a191f")
               .body(text)
               .when().post("https://gorest.co.in/public-api//users/1449/posts")
               .then().statusCode(200).contentType("application/json");
    }

    @When("send a get request for validation")
    public void send_a_get_request_for_validation() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @Then("list post for user")
    public void list_post_for_user() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
