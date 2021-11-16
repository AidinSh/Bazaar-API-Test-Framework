package TestData;

import Requests.Request;
import Requests.RequestBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.*;

public class Test {

    String production_url = "https://api.cafebazaar.ir/rest-v1/process";

    @org.junit.jupiter.api.Test
    void testFun(){

        ArrayList<String> slugs = new ArrayList<>();
        slugs.add("callofduty-2021-11-16");

        Request storyPageRequest = new RequestBuilder().getStoryPageRequest(slugs);

        Request getPageRequest = new RequestBuilder().getPageV2Request("app-home");

        Response response =
                given().
                        log().body().
                        contentType(ContentType.JSON).
                        body(getPageRequest).
                when().
                        post(production_url + getPageRequest.getRequestPostFix()).
                then().
                        extract().response();

        System.out.println(response.asPrettyString());

    }

}
