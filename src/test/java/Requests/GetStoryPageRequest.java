package Requests;

import Bodies.GetPageV2Body.GetPageSingleRequest;
import Bodies.GetStoryPageBody.GetStoryBody;
import Bodies.GetStoryPageBody.GetStorySingleRequest;
import Bodies.RequestProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;

@JsonPropertyOrder({"properties", "singleRequest"})
public class GetStoryPageRequest extends Request{

    String postFix = "/GetStoryPage";

    public GetStoryPageRequest(ArrayList<String> slugs){
        this.properties = new RequestProperties();
        GetStoryBody getStoryBody = new GetStoryBody(slugs);
        this.singleRequest = new GetStorySingleRequest(getStoryBody);
        this.requestPostFix = postFix;
    }
}
