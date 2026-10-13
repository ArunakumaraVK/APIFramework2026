package tests;

import base.ApiBaseTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DeletePostTest extends ApiBaseTest {

    @Test
    public void deletePost() {

        given()

        .when()
            .delete("/posts/1")

        .then()
            .statusCode(200);
    }
}