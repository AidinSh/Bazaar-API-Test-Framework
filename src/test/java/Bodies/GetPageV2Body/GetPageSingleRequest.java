package Bodies.GetPageV2Body;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetPageSingleRequest {

    private Object getPageSingleRequest;

    public GetPageSingleRequest(Object request){
        this.getPageSingleRequest = request;
    }

    @JsonProperty("getPageV2Request")
    public Object getGetPageSingleRequest() {
        return getPageSingleRequest;
    }

    public void setGetPageSingleRequest(Object getPageSingleRequest) {
        this.getPageSingleRequest = getPageSingleRequest;
    }
}
