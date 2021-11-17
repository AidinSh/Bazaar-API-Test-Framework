package Bodies.AppDetailsV2Body;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"packageName", "referrers"})
public class AppDetailsV2Body {
    private String packageName;
    private String[] referrers;

    public AppDetailsV2Body(String packageName){
        this.packageName = packageName;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String[] getReferrers() {
        return referrers;
    }

    public void setReferrers(String[] referrers) {
        this.referrers = referrers;
    }
}
