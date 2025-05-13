package musala.testautomationtutorials.tests;

import musala.testautomationtutorials.enums.ApiEndpoint;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

class BooksApiTest extends BaseTest {

    @Test
    void shouldRetrieveAllBooks() {
        given()
        .when()
            .get(ApiEndpoint.BOOKS.path())
        .then()
            .statusCode(200)
            .contentType(ContentType.JSON)
            .body("size()", greaterThanOrEqualTo(0));
    }

    @Test
    void shouldRetrieveBookById() {
        given()
        .when()
            .get(ApiEndpoint.BOOKS.path() + "/{id}", 1)
        .then()
            .statusCode(200)
            .body("id", equalTo(1));
    }
    // TODO: add create, update, delete tests
}
