package com.dean.api;

import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.File;

import static org.hamcrest.Matchers.*;

@DisplayName("API Test")
public class reqresAssignment {
    @Test
    public void testGetUser() { //positive test case -> passed
        File JSONSchema = payload.testGetData();
        Response response = utilityTest.sendGetUser();

        response
                .then().log().all()
                .assertThat().statusCode(200)
                .assertThat().body(JsonSchemaValidator.matchesJsonSchema(JSONSchema))
                .assertThat().body("total_pages", equalTo(2));
    }

    @Test
    public void testPostUser() { //positive test case -> passed
        Response response = utilityTest.sendPostUser(payload.testPostData());
        String expectedLastName = "dheana";

        response
                .then().log().all()
                .assertThat().statusCode(201)
                .assertThat().body("last_name",Matchers.equalTo(expectedLastName))
                .assertThat().body("email", containsString("@"));
    }

    @Test
    public void testPostUser_WithInvalidData() { //negative test case -> failed
        Response response = utilityTest.sendPostUser(payload.testPostInvalidData());

        response
                .then().log().all()
                .assertThat().statusCode(400)
                .assertThat().body("email", containsString("@"));

    }

    @Test
    public void testPutUser() { //positive test case -> passed
        String newLastName = "Lawson"; //updated user
        Response response = utilityTest.sendPutUser(payload.testPutData(7), 7);

        response
                .then().log().all()
                .assertThat().statusCode(200)
                .assertThat().body("last_name", Matchers.equalTo(newLastName));
    }

    @Test
    public void testPatchUser() { //positive test case -> passed
        String newFirstName = "Emma";
        Response response = utilityTest.sendPatchUser(payload.testPatchData(3), 3);

        response
                .then().log().all()
                .assertThat().statusCode(200)
                .assertThat().body("first_name", Matchers.equalTo(newFirstName));
    }

    @Test
    public void testDeleteUser() { //positive test case -> passed
        Response response = utilityTest.sendDeleteUser(4);
        response
                .then()
                .assertThat().statusCode(204)
                .assertThat().body(equalTo(""));
    }

    @Test
    public void testCreateUserWithMinChar() { //negative test case -> failed
        String firstName = "D";
        String lastName = "A";
        Response response = utilityTest.sendPostUser(payload.testDataLength(firstName, lastName));

        int expectedStatusCode = 400; //di reqres bisa post user with only one char :)
        response
                .then().log().all()
                .assertThat().statusCode(expectedStatusCode);
    }

    @Test
    public void testCreateUserWithMaxChar() { //positive test case -> passed
        String firstName = "Faisyah Dheana Ratna Dewi Ratna Dheana Faisyah Dheana Ratna Dewi";
        String lastName = "Faisyah Dheana Ratna Dewi Ratna Dheana Faisyah Dheana Ratna Dewi";
        Response response = utilityTest.sendPostUser(payload.testDataLength(firstName, lastName));

        int expectedStatusCode = 201;
        response
                .then().log().all()
                .assertThat().statusCode(expectedStatusCode);
    }
}

