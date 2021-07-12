package graphqltests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

    Graphql graphql = new Graphql();

    @Given("^I have graphql query$")
    public void i_have_graphql_query() {
        graphql.getQuery();
    }
    @When("Post {string} to the endpoint")
    public void postToTheEndpoint(String query) {
        graphql.post(query);
    }

    @Then("Can verify {string} response")
    public void can_verify_response(String string) {

    }


}
