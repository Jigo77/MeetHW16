package com.homework16.product;


import com.homework16.model.ProductsPojo;
import com.homework16.testbase.TestBase;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ProductPutTest extends TestBase {

    @Test
    public void put() {



        ProductsPojo productsPojo = new ProductsPojo();
        productsPojo.setName("Iphone");
        productsPojo.setType("Apple");
        productsPojo.setPrice(5000);
        productsPojo.setShipping(0);
        productsPojo.setUpc("830023380");
        productsPojo.setDescription("hello");
        productsPojo.setManufacturer("Apple");
        productsPojo.setModel("Iphone 14");
        productsPojo.setUrl("www.iphone.com");




        given()
                .log().all()
                .header("Content-Type", "application/json")
                .pathParam("id", "9999679")
                .body(productsPojo)
                .when()
                .put("/{id}")
                .then()
                .statusCode(200)
                .log().all();
    }

}


