package com.homework16.store;

import com.homework16.model.StorePojo;
import io.restassured.RestAssured;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class StorePutTest {
    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 3030;
        RestAssured.basePath = "/stores";

    }

    @Test
    public void putData() {


        StorePojo storePojo = new StorePojo();
        storePojo.setName("Damecha");
        storePojo.setLng(30);

        given()
                .header("content-Type", "application/json")
                .pathParam("id", "9")
                .body(storePojo)
                .when()
                .put("/{id}")
                .then()
                .statusCode(400);
    }
}
