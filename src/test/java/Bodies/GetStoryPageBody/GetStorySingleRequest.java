package Bodies.GetStoryPageBody;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetStorySingleRequest {
    private Object object;

    public GetStorySingleRequest(Object request){
        this.object = request;
    }

    @JsonProperty("getStoryPageRequest")
    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
