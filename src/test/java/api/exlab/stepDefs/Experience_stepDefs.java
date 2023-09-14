package api.exlab.stepDefs;

import api.exlab.pages.LoginPage;
import api.exlab.requests.ExlabRequest;
import api.exlab.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class Experience_stepDefs {
    @When("The user creates a POST request for add a new experience with {string} ad {string} and {string} and {string} {string} and {string} and {string}")
    public void the_user_creates_a_POST_request_for_add_a_new_experience_with_ad_and_and_and_and(String job,String company,String location,String fromdate,String todate,String current, String description) {
        ExlabRequest.postExperience(job, company, location, fromdate, todate, current, description);
    }

    @Then("The user is on te Dashboard page")
    public void the_user_is_on_te_Dashboard_page() throws InterruptedException {
        new LoginPage().setup();
    }

    @Then("The user verifies that UI and API experiences must be match job is {string}")
    public void the_user_verifies_that_UI_and_API_experiences_must_be_match_job_is(String expectedjob) throws InterruptedException {
        //from uı
        String actualJobFromUI=new LoginPage().getExperienceJob(expectedjob);
        //from api
        String actualJobFromAPI=ExlabRequest.experience_job;
        //compare
        assertEquals(actualJobFromAPI,actualJobFromUI);
        Driver.closeDriver();
    }

}


