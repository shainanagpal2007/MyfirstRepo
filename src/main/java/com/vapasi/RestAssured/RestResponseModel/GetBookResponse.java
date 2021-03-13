package com.vapasi.RestAssured.RestResponseModel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetBookResponse {
   @JsonProperty("book_name")
    private String bookname;
    private String isbn;
    private String aisle;
    private String author;

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAisle() {
        return aisle;
    }

    public void setAisle(String aisle) {
        this.aisle = aisle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
