package com.expandtesting.healthckeck;

import com.expandtesting.data.Messages;
import com.expandtesting.requests.HealthCheckRequests;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class HealthCheckTests {

    @Test
    @DisplayName("Validate Status 200 and success message in the Health Check endpoint")
    void getHealthCheckSuccess() {
        Response response = new HealthCheckRequests().getHealthCheck();
        assertThat(response.statusCode(), is(HttpStatus.SC_OK));
        assertThat(response.getBody().jsonPath().get("success"), is(true));
        assertThat(response.getBody().jsonPath().get("message"), is(Messages.HEALTH_CHECK_MESSAGE.getMessage()));
    }
}