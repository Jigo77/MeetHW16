package com.homework16.product;


import com.homework16.testbase.TestBase;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ProductDeleteTest extends TestBase {

    @Test
    public void delete(){
        given()
                .log().all()
                .header("Content-Type", "application/json")
                .pathParam("id", "103")
                .when()
                .delete("{id}")
                .then()
                .statusCode(204);
    }


}
