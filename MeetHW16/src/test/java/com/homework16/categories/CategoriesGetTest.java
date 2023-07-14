package com.homework16.categories;

import com.homework16.testbase.TestBase2;
import io.restassured.response.ValidatableResponse;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CategoriesGetTest extends TestBase2 {
    static ValidatableResponse response;

    @Test
    public void getdata() {
        given()
                .header("Content-Type","application/json")
                .when()
                .get()
                .then()
                .statusCode(200)
                .log().all();
    }
}
