package Bodies.VerifyOtpTokenBody;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VerifyOtpTokenSingleRequest {
    private Object verifyOtpBody;

    public VerifyOtpTokenSingleRequest(Object verifyOtpBody) {
        this.verifyOtpBody = verifyOtpBody;
    }

    @JsonProperty("verifyOtpTokenRequest")
    public Object getVerifyOtpBody() {
        return verifyOtpBody;
    }

    public void setVerifyOtpBody(Object verifyOtpBody) {
        this.verifyOtpBody = verifyOtpBody;
    }
}
