package com.vapasi.RestAssured.RestAPITests;

import com.vapasi.RestAssured.RestRequestModel.AddBookRequest;
import com.vapasi.RestAssured.RestRequestModel.DeleteBookRequest;
import com.vapasi.RestAssured.RestResponseModel.AddBookresponse;
import com.vapasi.RestAssured.RestResponseModel.AddExistingBookResponse;
import com.vapasi.RestAssured.RestResponseModel.DeleteBookResponse;
import com.vapasi.RestAssured.RestResponseModel.GetBookResponse;
import io.restassured.RestAssured;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class BookAPITest {

    public String bookname = "API Automation";
    public String isbn = "9000";
    public String aisle = "001";
    public String auther = "Bala Guruswami";

    public String ADD_BOOK_URI="Addbook.php";
    public String GET_BOOK_URI="GetBook.php";
    public String DELETE_BOOK_URI="DeleteBook.php";

    DeleteBookRequest[] deleteBookRequests = new DeleteBookRequest[]{new DeleteBookRequest("12367"), new DeleteBookRequest("9000002"), new DeleteBookRequest("9000003")};
    DeleteBookRequest deleteBookRequest = deleteBookRequests[0];
    AddBookRequest[] bookRequests = new AddBookRequest[]{new AddBookRequest("Drawing Book", "9000", "002", "Doxom"), new AddBookRequest("Secret", "9000", "003", "Doxom"), new AddBookRequest("C++", "9000", "001", "Doxom")};
    AddBookRequest bookRequest = bookRequests[0];
    AddBookresponse book;

    @BeforeTest
    public void setup() {
        RestAssured.baseURI = "http://216.10.245.166/Library/";
    }

    @Test
    public void verifyAddBook() {
        AddBookresponse bookResponse =
                given()
                .body(bookRequest)
                .post(ADD_BOOK_URI)
                .then()
                .statusCode(200)
                .extract()
                .response()
                .as(AddBookresponse.class);
        Assert.assertEquals(bookResponse.getMsg(), "successfully added");
        System.out.println(bookResponse.getId() + " " + bookResponse.getMsg());
    }
    @Test
    public void verifyAddBooks() {
        for (int i = 0; i < 3; i++) {
            AddBookresponse addBookresponse = given()
                    .body(bookRequests[i])
                    .post(ADD_BOOK_URI)
                    .then()
                    .statusCode(200)
                    .extract()
                    .response().as(AddBookresponse.class);
            Assert.assertEquals(addBookresponse.getMsg(),"successfully added");
        }
    }
    @Test(dependsOnMethods={"verifyAddBook"})
    public void verifyAddExistingBook() {
        AddExistingBookResponse bookResponse = given()
                .body(bookRequests)
                .post(ADD_BOOK_URI)
                .then()
                .statusCode(404)
                .extract()
                .response()
                .as(AddExistingBookResponse.class);
        Assert.assertEquals(bookResponse.getMsg(), "Add Book operation failed, looks like the book already exists");
    }
    @Test
    public void verifyGetBookById() {
        GetBookResponse[] bookResponse = given()
                .queryParam("ID", "3456")
                .when()
                .get(GET_BOOK_URI)
                .then()
                .extract()
                .response()
                .as(GetBookResponse[].class);
        Assert.assertEquals(bookname, bookResponse[0].getBookname());
    }
    @Test
    public void verifyDeleteBook() {
        DeleteBookResponse deletebookresponse = given()
                .body(deleteBookRequest)
                .post(DELETE_BOOK_URI)
                .then()
                .statusCode(200)
                .extract()
                .response().as(DeleteBookResponse.class);
        Assert.assertEquals(deletebookresponse.getMsg(), "book is successfully deleted");
        //printing for my reference
        System.out.println("Successfully deleted book with id" + deleteBookRequest.getId());
    }
    @Test
    public void verifyDeleteBooks() {
        for (int i = 0; i < 3; i++) {
            DeleteBookResponse deleteBookResponse = given()
                    .body(deleteBookRequests[i])
                    .post(DELETE_BOOK_URI)
                    .then()
                    .statusCode(200)
                    .extract()
                    .response().as(DeleteBookResponse.class);
            Assert.assertEquals(deleteBookResponse.getMsg(),"book is successfully deleted");
        }
    }
    @Test(dependsOnMethods={"verifyDeleteBook"})
    public void verifyAddDeletedBookAgain() {
        verifyAddBook();
        Assert.assertEquals(book.getId(), deleteBookRequest.getId());
    }
    @Test(dependsOnMethods = {"verifyAddBooks"})
    public void verifyGetBookbyAuthor() {
        GetBookResponse[] bookResponse = given()
                .queryParam("AuthorName", "Doxom")
                .when()
                .get(GET_BOOK_URI)
                .then()
                .extract()
                .response()
                .as(GetBookResponse[].class);
        Assert.assertEquals(bookResponse.length, 3);
        for (int i = 0; i < 3; i++) {
            System.out.println(bookResponse[i].getBookname());
        }
    }
    @Test(dependsOnMethods = {"verifyAddBooks"})
    public void verifyDeleteByAuthor() {
        //Depends on Addbooks method which add 3 books with author name "Doxom"
        //Get book by author name "Doom"
        GetBookResponse[] bookResponse = given()
                .queryParam("AuthorName", "Doom")
                .when()
                .get(GET_BOOK_URI)
                .then()
                .extract()
                .response()
                .as(GetBookResponse[].class);
        //Get id of Book with author name "Doom" and delete it.
        deleteBookRequest.setId(bookResponse[0].getIsbn() + bookResponse[0].getAisle());
        DeleteBookResponse deleteBookResponse = given()
                .body(deleteBookRequest)
                .post("DeleteBook.php")
                .then()
                .statusCode(200)
                .extract()
                .response().as(DeleteBookResponse.class);
        //Book delete message just for my reference
        System.out.println("Successfully deleted book with id :=" + deleteBookRequest.getId() + "and Author Name 'Doom'");
        //Validate books by author name "Doxom"
        GetBookResponse[] getByAuthorresp = given()
                .queryParam("AuthorName", "Doxom")
                .when()
                .get("GetBook.php")
                .then()
                .extract()
                .response()
                .as(GetBookResponse[].class);
        Assert.assertEquals(getByAuthorresp.length, 3);
    }
    @AfterTest
    public void tearDown()
    {
        verifyDeleteBooks();
    }
}
