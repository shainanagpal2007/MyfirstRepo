package com.vapasi.RestAssured.RestResponseModel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AddBookresponse {
    @JsonProperty("Msg")
    private String msg;

    @JsonProperty("ID")
    private String id;
    public String getMsg() {
        return msg;
    }
    public String getId() {
        return id;
    }

}
