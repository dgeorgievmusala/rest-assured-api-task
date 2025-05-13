package musala.testautomationtutorials.tests;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import musala.testautomationtutorials.config.Constants;

public abstract class BaseTest {

    @BeforeAll
    static void init() {
        RestAssured.baseURI = Constants.BASE_URL;
    }
}
