package com.homework16.services;

import com.homework16.model.ServiesPojo;
import com.homework16.testbase.TestBase1;
import io.restassured.response.ValidatableResponse;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PostServicesTest extends TestBase1 {
    static ValidatableResponse response;

    @Test
    public void createdata(){

        ServiesPojo serviesPojo = new ServiesPojo();
        serviesPojo.setName("Meet");

        given()
                .header("Content-Type","application/json")
                .body(serviesPojo)
                .when()
                .post()
                .then()
                .statusCode(400)
                .log().all();
    }
}
