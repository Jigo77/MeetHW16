package com.homework16.services;

import com.homework16.testbase.TestBase1;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class DeleteServicesTest extends TestBase1 {


    @Test
    public void delete(){
        given()
                .header("Content-Type","application/json")
                .pathParams("id","3")
                .when()
                .delete("/{id}")
                .then()
                .statusCode(404)
                .log().all();
    }
}
