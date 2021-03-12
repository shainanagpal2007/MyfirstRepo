package com.vapasi.RestAPITests;
import com.vapasi.RestRequestModel.AddBookRequest;
import com.vapasi.RestRequestModel.DeleteBookRequest;
import com.vapasi.RestResponseModel.AddBookresponse;
import com.vapasi.RestResponseModel.AddExistingBookResponse;
import com.vapasi.RestResponseModel.DeleteBookResponse;
import com.vapasi.RestResponseModel.GetBookResponse;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetBopokAPIResponseTest {

    public String bookname="API Automation";
    public String isbn="31";
    public String aisle="13";
    public String auther="John";
    AddBookRequest request=new AddBookRequest(bookname,isbn,aisle,auther);
    DeleteBookRequest deleteBookRequest=new DeleteBookRequest(isbn+aisle);

    @BeforeTest
    public void setup() {
        RestAssured.baseURI = "http://216.10.245.166/";
    }
   @Test
    public String verifyAddBook() {
        Response response = given()
                .body(request)
                .post("/Library/Addbook.php")
                .then()
                .statusCode(200)
               .extract()
                .response();
        System.out.println(response.getBody().asString());
        AddBookresponse book=response.body().as(AddBookresponse.class);
        Assert.assertEquals(book.getMsg(),"successfully added");
        System.out.println(book.getId()+" "+ book.getMsg());
        return book.getId();
    }
  // @Test
    public void verifyAddExistingBook() {
        Response response = given()
                .body(request)
                .post("/Library/Addbook.php")
                .then()
                .statusCode(200)
                .extract()
                .response();
        AddExistingBookResponse book=response.body().as(AddExistingBookResponse.class);
        Assert.assertEquals(book.getMsg(),"Add Book operation failed, looks like the book already exists");
    }
   //@Test
    public void verifyGetbookbyid()
    {
        Response response = given()
                .queryParam("ID","3456")
                .when()
                .get("http://216.10.245.166/Library/GetBook.php")
                .then()
                .log()
                .body().extract().response();
        System.out.println(response.body().asString());
        GetBookResponse[] bookResponse=response.body().as(GetBookResponse[].class);
        Assert.assertEquals(bookname,bookResponse[0].getBookname());
    }
  // @Test
    public String verifyDeleteBook()
    {
        Response response = given()
                .body(deleteBookRequest)
                .post("/Library/DeleteBook.php")
                .then()
                .statusCode(200)
                .extract()
                .response();
        System.out.println(response.body().asString());
        DeleteBookResponse deletebookresponse=response.body().as(DeleteBookResponse.class);
        Assert.assertEquals(deletebookresponse.getMsg(),"book is successfully deleted");
        System.out.println("Successfully deleted book with id" +deleteBookRequest.getId());
        return deleteBookRequest.getId();
    }
    //@Test
    public void verifyAddDeletedBookAgain()
    {   verifyDeleteBook();
        String newbookid=verifyAddBook();
        //Assert.assertEquals(newbookid,id);
        System.out.println("Book added again with name: \n" +request.getName()+"Book ISBN: \n" +request.getIsbn()+"Book AISLE: \n"+request.getAisle()+"Book Auther: "+request.getAuthor());

    }
}
