package com.homework16.services;

import com.homework16.testbase.TestBase1;
import io.restassured.response.ValidatableResponse;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetServicesTest extends TestBase1 {
    static ValidatableResponse response;

    @Test
    public void getAllServicesData(){
        response=given()
                .when()
                .get()
                .then();
        response.statusCode(200);
    }

    @Test
    public void getDetailByID(){
        response=given()
                .when()
                .pathParam("id",1)
                .get("/{id}")
                .then()
                .log().all();
        response.statusCode(200);
    }

    @Test
    public void searchServicesWithParameter(){
       response= given()
               .when()
               .queryParam("name","Best Buy Mobile")
               .get()
               .then()
               .log().all();
       response.statusCode(200);
    }


}
