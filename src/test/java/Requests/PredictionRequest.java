package Requests;

import Bodies.PredictionBody.PredictionBody;
import Bodies.PredictionBody.PredictionSingleRequest;
import Bodies.RequestProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"properties", "singleRequest"})
public class PredictionRequest extends Request{

    public PredictionRequest(){
        this.properties = new RequestProperties();
        PredictionBody predictionBody = new PredictionBody();
        this.singleRequest = new PredictionSingleRequest(predictionBody);
    }

    public PredictionRequest(String query){
        this.properties = new RequestProperties();
        PredictionBody predictionBody = new PredictionBody(query);
        this.singleRequest = new PredictionSingleRequest(predictionBody);
    }

    public Object getProperties() {
        return properties;
    }

    public void setProperties(Object properties) {
        this.properties = properties;
    }

    public Object getSingleRequest() {
        return singleRequest;
    }

    public void setSingleRequest(Object singleRequest) {
        this.singleRequest = singleRequest;
    }
}
