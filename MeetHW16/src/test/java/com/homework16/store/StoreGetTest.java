package com.homework16.store;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class StoreGetTest {
    static ValidatableResponse response;
    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI="http://localhost";
        RestAssured.port = 3030;
        RestAssured.basePath ="/stores";

    }
    @Test
    public void getAllStoreInfo() {
        response =given()
                .when()
                .get()
                .then();
        response.statusCode(200);

    }

}

