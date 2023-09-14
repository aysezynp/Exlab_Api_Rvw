package api.exlab.stepDefs;

import api.exlab.requests.ExlabRequest;
import api.exlab.utilities.ConfigurationReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class Users_stepDefs {
    @When("The user creates a POST request with {string} and {string} and {string} and {string} and {string}")
    public void the_user_creates_a_POST_request_with_and_and_and_and(String name,String email,String password,String about,String terms) {
        ExlabRequest.registerNewUser(name, email, password, about, terms);
        ExlabRequest.response.prettyPrint();
    }

    @Then("The user verifies that the status code is {int}")
    public void the_user_verifies_that_the_status_code_is(int expectedStatusCode) {
        assertEquals(expectedStatusCode,ExlabRequest.response.statusCode());
    }

    @Then("The user verifies that body contains {string}")
    public void the_user_verifies_that_body_contains(String content) {
        assertTrue(ExlabRequest.response.body().asString().contains(content));
    }

    @Then("The compiler gets the token")
    public void the_compiler_gets_the_token() {
        ConfigurationReader.set("newUserToken",ExlabRequest.token);
    }

}

