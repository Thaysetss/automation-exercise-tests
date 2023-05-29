package com.expandtesting.healthckeck;

import com.expandtesting.model.UsersModel;
import com.expandtesting.requests.UsersRegisterRequests;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.expandtesting.data.Messages.USER_REGISTER_CREATED_SUCCESSFULLY;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class UserRegisterTests {

    @Test
    @DisplayName("Test new user success")
    void createNewUser(){
        UsersModel user = new UsersModel("NewName", "tests@guerrilha.com.ar", "ABC1234");
        Response responseUser = new UsersRegisterRequests().postNewUser(user);
        assertThat(responseUser.statusCode(), is(HttpStatus.SC_CREATED));
        assertThat(responseUser.getBody().jsonPath().get("message"), is(USER_REGISTER_CREATED_SUCCESSFULLY.getMessage()));
    }
}