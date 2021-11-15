package TestData;

import Requests.Request;
import Requests.RequestBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Test {

    String production_url = "https://api.cafebazaar.ir/rest-v1/process";

    @org.junit.jupiter.api.Test
    void testFun(){

        Request request = new RequestBuilder().getPageV2Request("home-game");
        Response response =
                given().
                        contentType(ContentType.JSON).
                        body(request).
                when().
                        post(production_url + request.getRequestPostFix()).
                then().
                        extract().response();

        System.out.println(response.asPrettyString());

    }

}
