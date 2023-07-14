package com.homework16.product;

import com.homework16.model.ProductsPojo;
import com.homework16.testbase.TestBase;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class ProductPostTest extends TestBase {

    @Test
    public void createProduct() {


        ProductsPojo productsPojo = new ProductsPojo();
        productsPojo.setName("Iphone");
        productsPojo.setType("Apple");
        productsPojo.setPrice(2000);
        productsPojo.setShipping(0);
        productsPojo.setUpc("830023380");
        productsPojo.setDescription("hello");
        productsPojo.setManufacturer("Apple");
        productsPojo.setModel("Iphone 14");
        productsPojo.setUrl("www.iphone.com");


        given()
                .header("Content-Type", "application/json")
                .body(productsPojo)
                .when()
                .post()
                .then()
                .statusCode(201)
                .log().all();

    }
}
