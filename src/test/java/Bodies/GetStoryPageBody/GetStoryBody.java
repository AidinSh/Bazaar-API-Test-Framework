package Bodies.GetStoryPageBody;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;

@JsonPropertyOrder({"storySlugs", "referrers"})
public class GetStoryBody {
    private ArrayList<String> storySlugs;
    private String[] referrers;

    public GetStoryBody(ArrayList<String> storySlugs){
        this.storySlugs = storySlugs;
    }

    public ArrayList<String> getStorySlugs() {
        return storySlugs;
    }

    public void setStorySlugs(ArrayList<String> storySlugs) {
        this.storySlugs = storySlugs;
    }
}
