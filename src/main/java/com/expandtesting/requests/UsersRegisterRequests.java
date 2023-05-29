package com.expandtesting.requests;

import com.expandtesting.config.Configuration;
import com.expandtesting.config.ConfigurationManager;
import com.expandtesting.model.UsersModel;
import com.google.gson.Gson;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class UsersRegisterRequests {

    private final Configuration config;

    public UsersRegisterRequests() {
        this.config = ConfigurationManager.getConfiguration();
    }

    private String getUrl() {
        return config.baseUri() + config.basePath() + config.usersRegister();
    }

    public Response postNewUser(UsersModel userModel) {
        return given().
                header("Accept", "application/json").
                header("Content-Type", "application/json").
                formParam("name", userModel.getName()).
                formParam("email", userModel.getEmail()).
                formParam("password", userModel.getPassword()).
                when().
                post(getUrl()).
                then().
                extract().response();
    }
}