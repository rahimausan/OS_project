package stepdefinitions;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pojo.ResponsePojo;
import static io.restassured.RestAssured.given;
public class OS_TC_02StepDefs {
    Response response;
    ResponsePojo responsePojo;
    /*
    Task 2:
•	Using the following API endpoint, and the Java RestAssured library within an IDE of your choice,
    create a set of automated test scenarios to verify the response status and its payload including
    the returned attributes and corresponding values. Note: you don’t have to verify all of the payload,
     just a portion of it.  https://api.os.uk/downloads/v1

    Test Execution Steps:

    1) Given user sends a request for data
    2) When gets response
    3) Then verify payload
     */
     //  1) Given user sends a request for data
    @Given("user sends a request for data")
    public void user_sends_a_request_for_data() {
        response=given().when().get("https://api.os.uk/downloads/v1");
         response.prettyPrint();
        System.out.println(response.getStatusCode());
    }
    //   2) When gets response
    @When("gets response")
    public void gets_response()  throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        responsePojo = objectMapper.readValue(response.asString(),ResponsePojo.class);
    }
    // 3) Then verify payload
    @Then("verify payload")
    public void verify_payload() {
        System.out.println(responsePojo.getLinks()[0].getHref());
    }
}
