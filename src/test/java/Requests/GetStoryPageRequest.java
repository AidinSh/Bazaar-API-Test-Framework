package Requests;

import Bodies.GetPageV2Body.GetPageSingleRequest;
import Bodies.GetStoryPageBody.GetStoryBody;
import Bodies.RequestProperties;

public class GetStoryPageRequest extends Request{

    String postFix = "GetStoryPage";

    public GetStoryPageRequest(String[] slugs){
        this.properties = new RequestProperties();
        GetStoryBody getStoryBody = new GetStoryBody(slugs);
        this.singleRequest = new GetPageSingleRequest(getStoryBody);
        this.requestPostFix = postFix;
    }
}
