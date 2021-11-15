import Requests.Request;
import Requests.RequestBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;


import static io.restassured.RestAssured.given;

public class NewEngineTest {

    String production_url = "https://api.cafebazaar.ir/rest-v1/process";
    String new_engine_url = "http://dilmaj-staging-search.test.cafebazaar.org/rest-v1/process";

    Request request = new RequestBuilder().searchV2Request("");


    @ParameterizedTest
    @CsvFileSource(files = "src/test/Resources/topk_queries.csv", numLinesToSkip = 1)
    void testCase(int number, String query) throws Exception{
        ArrayList<String> oldValues = new ArrayList<>();
        ArrayList<String> newValues = new ArrayList<>();

        Request request = new RequestBuilder().searchV2Request(query);

        Response oldEngineResponse =
                given().
                        contentType(ContentType.JSON).
                        body(request).
                when().
                        post(production_url + request.getRequestPostFix()).
                then().
                        extract().response();

        for(int i=0; i<24; i++) {

            String packageName = oldEngineResponse.jsonPath().
                    get(String.format("singleReply.searchV2Reply.page.pageBodyInfo.pageBody.rows[%d].simpleAppItem.info.packageName", i));
            if (packageName != null) {
                oldValues.add(packageName);
            }
        }
        Collections.sort(oldValues);

        Response newEngineResponse =
                given().
                        contentType(ContentType.JSON).
                        body(request).
                when().
                        post(production_url + request.getRequestPostFix()).
                then().
                        extract().response();

        for(int i=0; i<24; i++) {

            String packageName = newEngineResponse.jsonPath().
                    get(String.format("singleReply.searchV2Reply.page.pageBodyInfo.pageBody.rows[%d].simpleAppItem.info.packageName", i));
            if(packageName != null) {
                newValues.add(packageName);
            }
        }
        Collections.sort(newValues);

        ArrayList<String> productionResultDifference = new ArrayList<>(oldValues);
        ArrayList<String> newEngineResultDifference = new ArrayList<>(newValues);

        productionResultDifference.removeAll(newValues);
        newEngineResultDifference.removeAll(oldValues);

        System.out.println("old values : " + oldValues);
        System.out.println("new values : " + newValues);
        System.out.println("old dif : " + productionResultDifference);
        System.out.println("new dif : " + newEngineResultDifference);


        FileWriter fileWriter = new FileWriter("testLog.txt", true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);


        printWriter.println("old dif : " + productionResultDifference);
        printWriter.println("new dif : " + newEngineResultDifference);
        printWriter.println("///////////////////////////////////////");

        Assertions.assertEquals(newValues, oldValues);
    }
}
