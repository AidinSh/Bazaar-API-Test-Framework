package Requests;

import Bodies.RequestProperties;
import Bodies.VerifyOtpTokenBody.VerifyOtpTokenBody;
import Bodies.VerifyOtpTokenBody.VerifyOtpTokenSingleRequest;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"properties", "singleRequest"})
public class VerifyOtpTokenRequest extends Request {

    String postFix = "/VerifyOtpTokenRequest";

    public VerifyOtpTokenRequest(String username, String token){
        this.requestPostFix = postFix;
        this.properties = new RequestProperties();
        this.singleRequest = new VerifyOtpTokenSingleRequest(new VerifyOtpTokenBody(username, token));
    }


}
