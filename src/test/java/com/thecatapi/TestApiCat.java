package com.thecatapi;
import org.junit.Test;
import static io.restassured.RestAssured.*;

public class TestApiCat {

    @Test
    public void cadastroApi(){
        given()
                .contentType("application/json")
                .body("{\"email\": \"une@gmail.com\", \"appDescription\": \"teste 123\"}")
        .when()
                .post(" https://api.thecatapi.com/v1/user/passwordlesssignup\n")
        .then()
                 .log().all();
    }
}













































