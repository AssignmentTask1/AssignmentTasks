package RestAssuredTask.Pages;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class RestAssuredPage {
    RequestSpecification request;
    Response response;
    public void setBaseURI(){
        RestAssured.baseURI = "https://official-joke-api.appspot.com/";
        request = RestAssured.given();
    }
    public void getRandomJoke(String endPoint){
        response = request.get(endPoint);
    }
    public Response getResponse(){
        return response;
    }
}
