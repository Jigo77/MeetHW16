package com.homework16.categories;

import com.homework16.model.CategoriesPojo;
import com.homework16.testbase.TestBase2;
import io.restassured.response.ValidatableResponse;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CategoriesPostTest extends TestBase2 {
    static ValidatableResponse response;
    @Test
    public void createdata(){
        CategoriesPojo categoriesPojo = new CategoriesPojo();
        categoriesPojo.setName("Meet");

        given()
                .header("Content-Type","application/json")
                .body(categoriesPojo)
                .when()
                .post()
                .then()
                .statusCode(200);

    }
}
