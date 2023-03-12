package RestAssuredTask.StepDefinitions;

import RestAssuredTask.Pages.RestAssuredPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class RestAssuredSteps {
    RestAssuredPage pajeObj = new RestAssuredPage();
    Response response;
    @Given("Set Rest Assured base URI")
    public void setRestAssuredBaseURI() {
        pajeObj.setBaseURI();
    }
    @When("Get Random Joke <{string}>")
    public void getRandomJoke(String endPoint) {
        pajeObj.getRandomJoke(endPoint);
    }

    @Then("Print setup and punchline for a Random Joke")
    public void printSetupAndPunchlineForARandomJoke() {
        response = pajeObj.getResponse();
        System.out.println("Printing a Random Joke Setup: "+ response.jsonPath().getString("setup"));
        System.out.println("Printing a Random Joke Punchline: "+ response.jsonPath().getString("punchline"));
    }
    @When("Get Random Ten Jokes <{string}>")
    public void getRandomTenJokes(String endPoint) {
        pajeObj.getRandomJoke(endPoint);
    }
    @Then("Print setup and punchline for the first array element")
    public void printSetupAndPunchlineForTheFirstArrayElement() {
        response = pajeObj.getResponse();
//        System.out.println("Response: "+ response.asPrettyString());

        JsonPath jsonPath = response.jsonPath();

        System.out.println("Printing first array element of Setup: "+ jsonPath.getJsonObject("setup[0]").toString());
        System.out.println("Printing first array element of Punchline: "+ jsonPath.getJsonObject("punchline[0]").toString());
    }

    @When("Get Ten Jokes <{string}>")
    public void getTenJokes(String endPoint) {
        pajeObj.getRandomJoke(endPoint);
    }

    @Then("Print setup and punchline for the 2nd last array element")
    public void printSetupAndPunchlineForTheNdLastArrayElement() {
        response = pajeObj.getResponse();
//        System.out.println("Response: "+ response.asPrettyString());

        JsonPath jsonPath = response.jsonPath();
        int size = jsonPath.getList("array").size();

        System.out.println("Printing last array element of Setup: "+ jsonPath.getJsonObject("setup["+(size-2)+"]").toString());
        System.out.println("Printing last array element of Punchline: "+ jsonPath.getJsonObject("punchline["+(size-2)+"]").toString());

    }
}
