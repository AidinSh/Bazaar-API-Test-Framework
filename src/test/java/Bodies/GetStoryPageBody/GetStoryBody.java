package Bodies.GetStoryPageBody;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"storySlugs"})
public class GetStoryBody {
    private String[] storySlugs;

    public GetStoryBody(String[] storySlugs){
        this.storySlugs = storySlugs;
    }

    public String[] getStorySlugs() {
        return storySlugs;
    }

    public void setStorySlugs(String[] storySlugs) {
        this.storySlugs = storySlugs;
    }
}
