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
        Request appDetailRequest = new RequestBuilder().appDetailsV2Request("ir.nomogame.ClutchGame");

        String accessToken = getAccessToken("09039269421", "7327");

        Response response =
                given().
                        log().all().
                        header("Authorization", accessToken).
                        contentType(ContentType.JSON).
                        body(appDetailRequest).
                when().
                        post(production_url + appDetailRequest.getRequestPostFix()).
                then().
                        extract().response();

        System.out.println(response.asPrettyString());

    }


    String getAccessToken(String username, String token){

        Request verifyToken = new RequestBuilder().verifyOtpTokenRequest(username, token);

        Response response =
                given().
                        contentType(ContentType.JSON).
                        body(verifyToken).
                when().
                        post(production_url + verifyToken.getRequestPostFix()).
                then().
                        extract().response();


        String accessToken = response.jsonPath().get("singleReply.verifyOtpTokenReply.accessToken");
        return "Bearer " + accessToken;

    }

}
