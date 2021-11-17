package Requests;

import java.util.ArrayList;

public class RequestBuilder {

    ///////////////////////////////////////
    ////////// Search V2 Request //////////
    ///////////////////////////////////////

    public Request searchV2Request(String query){
        return new SearchV2Request(query);
    }

    public Request searchV2Request(String query, String language, String scope){
        return new SearchV2Request(query, language, scope);
    }

    ////////////////////////////////////////
    ////////// Prediction Request //////////
    ////////////////////////////////////////

    public Request predictionRequest(){
        return new PredictionRequest();
    }

    public Request predictionRequest(String query){
        return new PredictionRequest(query);
    }

    ////////////////////////////////////////
    ////////// GetPage V2 Request //////////
    ////////////////////////////////////////

    public Request getPageV2Request(String path){
        return new GetPageV2Request(path);
    }

    //////////////////////////////////////////
    ////////// GetStoryPage Request //////////
    //////////////////////////////////////////

    public Request getStoryPageRequest(ArrayList<String> slugs){
        return new GetStoryPageRequest(slugs);
    }

    //////////////////////////////////////////
    ////////// AppDetailsV2 Request //////////
    //////////////////////////////////////////

    public Request appDetailsV2Request(String packageName) {
        return new AppDetailsV2Request(packageName);
    }

    //////////////////////////////////////////////
    ////////// Verify OTP Token Request //////////
    //////////////////////////////////////////////

    public Request verifyOtpTokenRequest(String username, String token) {
        return new VerifyOtpTokenRequest(username, token);
    }
}
