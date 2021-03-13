package com.vapasi.RestAssured.RestAPITests;
import com.vapasi.RestAssured.RestRequestModel.AddBookRequest;
import com.vapasi.RestAssured.RestRequestModel.DeleteBookRequest;
import com.vapasi.RestAssured.RestResponseModel.AddBookresponse;
import com.vapasi.RestAssured.RestResponseModel.AddExistingBookResponse;
import com.vapasi.RestAssured.RestResponseModel.DeleteBookResponse;
import com.vapasi.RestAssured.RestResponseModel.GetBookResponse;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetBopokAPIResponseTest {

    public String bookname="API Automation";
    public String isbn="9000";
    public String aisle="001";
    public String auther="Bala Guruswami";

    DeleteBookRequest[] deleteBookRequests=new DeleteBookRequest[]{new DeleteBookRequest("12367"),new DeleteBookRequest("9000002"),new DeleteBookRequest("9000003")};
    DeleteBookRequest deleteBookRequest=deleteBookRequests[0];
    AddBookRequest[] bookRequests = new AddBookRequest[]{new AddBookRequest("Drawing Book", "9000", "002", "Doxom"), new AddBookRequest("Secret", "9000", "003", "Doxom"), new AddBookRequest("C++", "9000", "001", "Doxom")};
    AddBookRequest bookRequest = bookRequests[0];
    AddBookresponse book;
    @BeforeTest
    public void setup() {
        RestAssured.baseURI = "http://216.10.245.166/";
    }

  // @Test
    public void verifyAddBook() {
        Response response = given()
                .body(bookRequest)
                .post("/Library/Addbook.php")
                .then()
                    .statusCode(200)
               .extract()
                .response();
        System.out.println(response.getBody().asString());
        book=response.body().as(AddBookresponse.class);
        Assert.assertEquals(book.getMsg(),"successfully added");
        System.out.println(book.getId()+" "+ book.getMsg());
    }
    @Test
    public void verifyAddBooks(){
        for(int i=0;i<3;i++) {
            Response response = given()
                    .body(bookRequests[i])
                    .post("/Library/Addbook.php")
                    .then()
                    .statusCode(200)
                    .extract()
                    .response();
            System.out.println(response.getBody().asString());
        }
    }

  //@Test(dependsOnMethods={"verifyAddBook"})
    public void verifyAddExistingBook() {
        Response response = given()
                .body(bookRequests)
                .post("/Library/Addbook.php")
                .then()
                .statusCode(404)
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
    public void verifyDeleteBook()
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
    }
    @Test
    public void verifyDeleteBooks()
    {
        for(int i=0;i<3;i++) {
            Response response = given()
                    .body(deleteBookRequests[i])
                    .post("/Library/DeleteBook.php")
                    .then()
                    .statusCode(200)
                    .extract()
                    .response();
            System.out.println("Successfully deleted book with id" +deleteBookRequests[i].getId());
        }

    }
   // @Test(dependsOnMethods={"verifyDeleteBook"})
    public void verifyAddDeletedBookAgain() {
        verifyAddBook();
        Assert.assertEquals(book.getId(), deleteBookRequest.getId());
        System.out.println("Book added again");
    }
    @Test(dependsOnMethods = {"verifyAddBooks"})
    public void verifyGetBookbyAuthor()
    {
        Response response = given()
                .queryParam("AuthorName","Doxom")
                .when()
                .get("/Library/GetBook.php")
                .then()
                .log()
                .body().extract().response();
        System.out.println(response.body().asString());
        GetBookResponse[] bookResponse=response.body().as(GetBookResponse[].class);
        Assert.assertEquals(bookResponse.length,3);
        for(int i=0;i<3;i++)
        {
            System.out.println(bookResponse[i].getBookname());
        }
    }
    @Test
    public void verifyDeleteByAuthor()
    {
        Response getByAuthorResponse = given()
                .queryParam("AuthorName","Doom")
                .when()
                .get("/Library/GetBook.php")
                .then()
                .log()
                .body().extract().response();
        System.out.println(getByAuthorResponse.body().asString());
        GetBookResponse[] bookResponse=getByAuthorResponse.body().as(GetBookResponse[].class);
        deleteBookRequest.setId(bookResponse[0].getIsbn()+bookResponse[0].getAisle());
        Response deleteBookResponse = given()
                .body(deleteBookRequest)
                .post("/Library/DeleteBook.php")
                .then()
                .statusCode(200)
                .extract()
                .response();
        System.out.println("Successfully deleted book with id :=" +deleteBookRequest.getId()+"and Author Name 'Doom'");

        Response getByAuthorresp = given()
                .queryParam("AuthorName","Doxom")
                .when()
                .get("/Library/GetBook.php")
                .then()
                .log()
                .body().extract().response();
        GetBookResponse[] getBookResponse=getByAuthorresp.body().as(GetBookResponse[].class);
        Assert.assertEquals(getBookResponse.length,3);
    }
}
