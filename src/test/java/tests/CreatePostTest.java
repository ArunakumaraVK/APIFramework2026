package tests;

import base.ApiBaseTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class CreatePostTest extends ApiBaseTest {

    @Test
    public void createPost() {

        String requestBody = "{"
                + "\"title\":\"Learning API Automation\","
                + "\"body\":\"My first Rest Assured test\","
                + "\"userId\":1"
                + "}";

        given()
            .header("Content-Type", "application/json")
            .body(requestBody)

        .when()
            .post("/posts")

        .then()
            .statusCode(201)
            .body("title", equalTo("Learning API Automation"))
            .body("body", equalTo("My first Rest Assured test"))
            .body("userId", equalTo(1))
            .body("id", notNullValue());
    }
}