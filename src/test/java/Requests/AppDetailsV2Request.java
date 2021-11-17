package Requests;

import Bodies.AppDetailsV2Body.AppDetailsV2Body;
import Bodies.AppDetailsV2Body.AppDetailsV2SingleRequest;
import Bodies.RequestProperties;

public class AppDetailsV2Request extends Request{

    String postFix = "/AppDetailsV2Request";

    public AppDetailsV2Request(String packageName){
        this.requestPostFix = postFix;
        this.properties = new RequestProperties();
        this.singleRequest = new AppDetailsV2SingleRequest(new AppDetailsV2Body(packageName));
    }
}
