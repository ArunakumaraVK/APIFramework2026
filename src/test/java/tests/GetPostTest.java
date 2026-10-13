package tests;

import base.ApiBaseTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetPostTest extends ApiBaseTest {

    @Test
    public void getSinglePost() {

        given()
            .header("Accept", "application/json")

        .when()
            .get("/posts/1")

        .then()
            .statusCode(200)
            .body("id", equalTo(1))
            .body("userId", equalTo(1))
            .body("title", not(emptyString()))
            .body("body", not(emptyString()));
    }
}