package Requests;

import Bodies.GetPageV2Body.GetPageBody;
import Bodies.GetPageV2Body.GetPageSingleRequest;
import Bodies.RequestProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"properties", "singleRequest"})
public class GetPageV2Request extends Request {

    String postFix = "/GetPageV2Request";

    public GetPageV2Request(String path){
        this.properties = new RequestProperties();
        GetPageBody getPageBody = new GetPageBody(path);
        this.singleRequest = new GetPageSingleRequest(getPageBody);
        this.requestPostFix = postFix;
    }

}
