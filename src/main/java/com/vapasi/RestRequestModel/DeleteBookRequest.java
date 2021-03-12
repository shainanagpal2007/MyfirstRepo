package com.vapasi.RestRequestModel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeleteBookRequest {

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    @JsonProperty("ID")
    private String id;

    public DeleteBookRequest(String id) {
        this.id = id;
    }
}
