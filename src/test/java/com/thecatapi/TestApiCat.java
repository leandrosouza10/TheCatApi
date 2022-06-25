package com.thecatapi;
import org.junit.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class TestApiCat {

    @Test
    public void cadastroApi(){
        given()
                .contentType("application/json")
                .body("{\"email\": \"une@gmail.com\", \"appDescription\": \"teste 123\"}")
        .when()
                .post(" https://api.thecatapi.com/v1/user/passwordlesssignup\n")
        .then()
                .statusCode(200)
                 .log().all();
    }

    @Test
    public void cadastroApiCampoObrigatorio(){
        given()
                .contentType("application/json")
                .body("{\"appDescription\": \"teste 123\"}")
        .when()
                .post(" https://api.thecatapi.com/v1/user/passwordlesssignup\n")
        .then()
                .log().all()
                .body("message",containsString("\"email\" is required"))
                .statusCode(400);
    }



}














































