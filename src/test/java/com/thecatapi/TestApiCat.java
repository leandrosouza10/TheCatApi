package com.thecatapi;
import org.junit.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class TestApiCat {

    @Test
    public void testCadastroApi(){
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
    public void testCadastroApiCampoObrigatorio(){
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
// 0455fc37-94cb-4b00-8760-3837c3cdecf3
    @Test
    public void testEfetuarVotacao(){
        given()
                .contentType("application/json")
                .body("  {\"image_id\": \"cjc\", \"value\": true, \"sub_id\": \"demo-a4ccbf\"}")
                .header("x-api-key","0455fc37-94cb-4b00-8760-3837c3cdecf3")
        .when()
                .post("https://api.thecatapi.com/v1/votes/")
        .then()
                .statusCode(200)
                .body("message", is("SUCCESS"))
                .log().all();
    }



    @Test
    public void testPegarVotacao(){
        given()
                .contentType("application/json")
                .body("")
        .when()
                .post(" ")
        .then()
                .statusCode(200)
                .log().all();
    }

    @Test
    public void testDeletarVotacao(){
        given()
                .contentType("application/json")
                .body("")
        .when()
                .post(" ")
        .then()
                .statusCode(200)
                .log().all();
    }



}














































