package com.dean.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONObject;

public class utilityTest {
    public static Response sendGetUser() {
        String fullEndPoint = endpoint_url.list;
        return RestAssured.get(fullEndPoint);
    }

    public static Response sendPostUser(JSONObject bodyObj) {
        return RestAssured
                .given().header("Content-Type", "application/json")
                .body(bodyObj.toString())
                .post(endpoint_url.list);
    }
    public static Response sendPutUser(JSONObject bodyObj, int userID) {
        return RestAssured
                .given().header("Content-Type", "application/json")
                .body(bodyObj.toString())
                .put(endpoint_url.users + userID);
    }

    public static Response sendPatchUser(JSONObject requestBody, int userID) {
        return RestAssured
                .given().header("Content-Type", "application/json")
                .body(requestBody.toString())
                .patch(endpoint_url.users + userID);
    }

    public static Response sendDeleteUser(int userID) {
        return RestAssured
                .given().when()
                .delete(endpoint_url.users + userID);
    }

    public static JSONObject userRequestBody(String email, String first_name, String last_name, String avatar) {
        JSONObject bodyObj = new JSONObject();
        bodyObj.put("email", email);
        bodyObj.put("first_name", first_name);
        bodyObj.put("last_name", last_name);
        bodyObj.put("avatar", avatar);
        return bodyObj;
    }
}
