package Requests;

import Bodies.RequestProperties;
import Bodies.SearchBody.SearchBody;
import Bodies.SearchBody.SearchSingleRequest;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"properties", "singleRequest"})
public class SearchV2Request extends Request{

    String postFix = "/SearchV2Request";


    public SearchV2Request(String query, String language, String scope){
        this.properties = new RequestProperties();
        SearchBody searchBody = new SearchBody(query, language, scope);
        this.singleRequest = new SearchSingleRequest(searchBody);
        this.requestPostFix = postFix;
    }

    public SearchV2Request(String query){
        this.properties = new RequestProperties();
        SearchBody searchBody = new SearchBody(query, "fa", "app");
        this.singleRequest = new SearchSingleRequest(searchBody);
        this.requestPostFix = postFix;
    }

    public Object getProperties() {
        return properties;
    }

    public void setProperties(Object properties) {
        this.properties = properties;
    }

    public Object getSingleRequest() {
        return singleRequest;
    }

    public void setSingleRequest(Object singleRequest) {
        this.singleRequest = singleRequest;
    }
}
