package RestAssuredTask.StepDefinitions;

import RestAssuredTask.Pages.AutomateContactUsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AutomateContactUsSteps {
    AutomateContactUsPage pajeObj = new AutomateContactUsPage();
    @Given("Launch Test Website <{string}>")
    public void launchTestWebsite(String url) {
        pajeObj.launchWebsite(url);
    }

    @Then("Assert Page Title to verify site launched")
    public void assertPageTitleToVerifySiteLaunched() {
        Assert.assertEquals(pajeObj.getPageTitle(),"My Store", "Page Title is not same as expected! ");
    }
    @When("Navigate to Contact us")
    public void navigateToContactUs() {
        pajeObj.navigateToContactUsLink();
    }
    @And("Enter Data for Email address <{string}>")
    public void enterDataForEmailAddress(String emailAddress) {
        pajeObj.enterEmail(emailAddress);
    }

    @And("Enter Data for Order reference <{string}>")
    public void enterDataForOrderReference(String orderReference) {
        pajeObj.enterOrder(orderReference);
    }

    @And("Enter Data for Message <{string}>")
    public void enterDataForMessage(String message) {
        pajeObj.enterMessage(message);
    }

    @And("Click Send")
    public void clickSend() {
        pajeObj.clickSendBtn();
    }

    @Then("Assert that error is displayed <{string}>")
    public void assertThatErrorIsDisplayed(String expectedErrorMessage) {
        Assert.assertEquals(pajeObj.getErrorMessage(),expectedErrorMessage,"Error message is not displayed as expected! ");
        pajeObj.quitBrowser();
    }

}
