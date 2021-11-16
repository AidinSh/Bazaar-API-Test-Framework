package Requests;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Request {
    public Object properties;
    public Object singleRequest;
    @JsonIgnore
    public String requestPostFix;

    public String getRequestPostFix() {
        return requestPostFix;
    }

    public void setRequestPostFix(String requestPostFix) {
        this.requestPostFix = requestPostFix;
    }
}
