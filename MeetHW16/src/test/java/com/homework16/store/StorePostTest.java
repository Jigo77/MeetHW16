package com.homework16.store;

import com.homework16.model.StorePojo;
import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class StorePostTest {
    static ValidatableResponse response;
    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI="http://localhost";
        RestAssured.port = 3030;
        RestAssured.basePath ="/stores";

    }
    @Test
    public void addStoreData(){
        StorePojo storePojo = new StorePojo();
        storePojo.setName("Booker");
        storePojo.setType("Wholesale");
        storePojo.setAddress("Harrow");
        storePojo.setAddress2("London");
        storePojo.setCity("London");
        storePojo.setState("UK");
        storePojo.setZip("HA3 5XC");
        storePojo.setLat(25.5);
        storePojo.setLng(45.5);
        storePojo.setHours("10");

        given()
                .header("Content-Type", "application/json")
                .body(storePojo)
                .when()
                .post()
                .then()
                .statusCode(400);
    }
}
