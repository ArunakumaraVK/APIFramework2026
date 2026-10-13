package tests;

import base.ApiBaseTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class UpdatePostTest extends ApiBaseTest {

    @Test
    public void updatePost() {

        String requestBody = "{"
                + "\"id\":1,"
                + "\"title\":\"Updated API Post\","
                + "\"body\":\"Updated post content\","
                + "\"userId\":1"
                + "}";

        given()
            .header("Content-Type", "application/json")
            .body(requestBody)

        .when()
            .put("/posts/1")

        .then()
            .statusCode(200)
            .body("id", equalTo(1))
            .body("title", equalTo("Updated API Post"))
            .body("body", equalTo("Updated post content"));
    }
}