package com.sis.pojo;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Mohamed S. El-Shall on 4/12/2017.
 */

public class Response implements Serializable {


    /**
     * response : success
     */
    @SerializedName("response")
    private String response;

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
