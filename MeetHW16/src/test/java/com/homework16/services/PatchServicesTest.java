package com.homework16.services;

import com.homework16.model.ServiesPojo;
import com.homework16.testbase.TestBase1;
import io.restassured.response.ValidatableResponse;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PatchServicesTest extends TestBase1 {
    static ValidatableResponse response;

    @Test
    public void patch(){
        ServiesPojo serviesPojo = new ServiesPojo();
        serviesPojo.setName("Meet");

        given()
                .log().all()
                .header("Content-Type","application/json")
                .pathParam("id",2)
                .body(serviesPojo)
                .when()
                .patch("/{id}")
                .then()
                .statusCode(200)
                .log().all();

    }
}
