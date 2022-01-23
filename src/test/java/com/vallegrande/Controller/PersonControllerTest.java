package com.vallegrande.Controller;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.ws.rs.core.MediaType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;

@QuarkusTest
class PersonControllerTest {

    @Test
    void getPersons() {
/*        given()
                .body("{\"namePerson\": \"Jesus Alejandro\", \"lastnamePerson\": \"Cardenas Vilca\", \"dniPerson\": \"76591745\"}")
                .header("Content-Type", MediaType.APPLICATION_JSON)
                .when()
                .get("/api/allPerson")
                .then()
                .statusCode(200)
                .body("$.size()", is(4),
                        "namePerson", containsInAnyOrder("Jesus Alejandro"),
                        "lastnamePerson", containsInAnyOrder("Cardenas Vilca"),
                        "dniPerson", containsInAnyOrder("76591745")
                        );*/
    }

    @Test
    void getPerson() {
    }

    @Test
    void updatePerson() {
    }

    @Test
    void addPerson() {
    }

    @Test
    void deletePerson() {
    }
}