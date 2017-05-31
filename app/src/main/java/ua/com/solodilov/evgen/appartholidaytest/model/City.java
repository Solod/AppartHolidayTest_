package ua.com.solodilov.evgen.appartholidaytest.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class City {
    @SerializedName("response")
    @Expose
    private List<MyResponse> response = null;
    @SerializedName("api_version")
    @Expose
    private String apiVersion;
    @SerializedName("time")
    @Expose
    private Double time;

    public List<MyResponse> getResponse() {
        return response;
    }

    public void setResponse(List<MyResponse> response) {
        this.response = response;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public Double getTime() {
        return time;
    }

    public void setTime(Double time) {
        this.time = time;
    }

}