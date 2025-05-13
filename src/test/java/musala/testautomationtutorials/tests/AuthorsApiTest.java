package musala.testautomationtutorials.tests;

import musala.testautomationtutorials.enums.ApiEndpoint;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

class AuthorsApiTest extends BaseTest {

    @Test
    void shouldRetrieveAllAuthors() {
        given()
        .when()
            .get(ApiEndpoint.AUTHORS.path())
        .then()
            .statusCode(200)
            .contentType(ContentType.JSON)
            .body("size()", greaterThanOrEqualTo(0));
    }

    @Test
    void shouldRetrieveAuthorById() {
        given()
        .when()
            .get(ApiEndpoint.AUTHORS.path() + "/{id}", 1)
        .then()
            .statusCode(200)
            .body("id", equalTo(1));
    }
    // TODO: add create, update, delete tests
}
