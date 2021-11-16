package Bodies.GetPageV2Body;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"path", "referrers"})
public class GetPageBody {
    private String path;
    private String[] referrers;

    public GetPageBody(String path){
        this.path = path;
        this.referrers = null;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String[] getReferrers() {
        return referrers;
    }

    public void setReferrers(String[] referrers) {
        this.referrers = referrers;
    }
}
