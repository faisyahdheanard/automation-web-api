package com.dean.api;

import org.json.JSONObject;
import java.io.File;
import static io.restassured.RestAssured.given;

public class payload {
    public static File testGetData() {
        File JSONSchema = new File("src/test/resources/api/JSONSchema/userData.json");
        return JSONSchema;
    }

    public static JSONObject testPostData() {
        JSONObject bodyObj = utilityTest.userRequestBody("testestes123@gmail.com",
                            "faisyah", "dheana",
                            "https://reqres.in/img/faces/12-image.jpg");
        return bodyObj;
    }

    public static JSONObject testPutData(int userID) {
        String firstN = given().when().get((endpoint_url.users + userID)).jsonPath().get("data.first_name");
        String lastN = given().when().get((endpoint_url.users + userID)).jsonPath().get("data.last_name");
        String email = given().when().get((endpoint_url.users + userID)).jsonPath().get("data.email");
        String avatar = given().when().get((endpoint_url.users + userID)).jsonPath().get("data.avatar");
        System.out.println("NAME BEFORE = " + lastN);

        JSONObject bodyObj = utilityTest.userRequestBody(email,firstN,lastN,avatar);
        return bodyObj;
    }

    public static JSONObject testPatchData(int userID) {
        String firstN = given().when().get(endpoint_url.users + userID).jsonPath().get("data.first_name");
        System.out.println("NAME BEFORE = " + firstN);

        JSONObject bodyObj = new JSONObject();
        bodyObj.put("first_name", firstN);
        return bodyObj;
    }

    public static JSONObject testDataLength(String first_name, String last_name) {
        JSONObject bodyObj = utilityTest.userRequestBody("halo@gmail.com", first_name, last_name,
                            "\"https://reqres.in/img/faces/13-image.jpg\"");
        bodyObj.put("first_name", first_name);
        bodyObj.put("last_name", last_name);
        return bodyObj;
    }

    public static JSONObject testPostInvalidData() {
        JSONObject bodyObj = utilityTest.userRequestBody("testestes123gmail.com", "faisyah",
                            "dheana", "halo");
        return bodyObj;
    }
}
