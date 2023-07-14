package com.homework16.product;

import com.homework16.testbase.TestBase;
import io.restassured.response.ValidatableResponse;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class ProductGetTest extends TestBase {
   static ValidatableResponse response;

    @Test
    public void getAllProductInfo() {
         response =given()
                .when()
                .get()
                 .then();
         response.statusCode(200);



    }

    @Test
    public void getSingleProductInfo() {
        response =given()
                .pathParam("id",9999679)
                .when()
                .get("/{id}")
                .then();
        response.statusCode(200);

    }


}
