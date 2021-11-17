package Bodies.AppDetailsV2Body;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppDetailsV2SingleRequest {
    private Object appDetailBody;

    public AppDetailsV2SingleRequest(Object body){
        this.appDetailBody = body;
    }

    @JsonProperty("appDetailsV2Request")
    public Object getAppDetailBody() {
        return appDetailBody;
    }

    public void setAppDetailBody(Object appDetailBody) {
        this.appDetailBody = appDetailBody;
    }
}
