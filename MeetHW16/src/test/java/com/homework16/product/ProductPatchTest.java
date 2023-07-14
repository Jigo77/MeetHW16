package com.homework16.product;

import com.homework16.model.ProductsPojo;
import com.homework16.testbase.TestBase;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class ProductPatchTest extends TestBase {

    @Test
    public void updateStudentWithPatch(){

       /* StudentPojo studentPojo= new StudentPojo();
        studentPojo.setEmail("shweta@gmail.com");
        studentPojo.setProgramme("manual testing");*/
        ProductsPojo productsPojo = new ProductsPojo();
        productsPojo.setType("iphone");


        given()
                .log().all()
                .header("Content-Type", "application/json")
                .pathParam("id","9999679")
                .body(productsPojo)
                .when()
                .patch("/{id}")
                .then()
                .statusCode(200);
    }
}
