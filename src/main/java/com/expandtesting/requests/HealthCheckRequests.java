package com.expandtesting.requests;

import com.expandtesting.config.Configuration;
import com.expandtesting.config.ConfigurationManager;
import io.restassured.response.Response;

import static io.restassured.RestAssured.when;

public final class HealthCheckRequests {

    private final Configuration config;

    public HealthCheckRequests() {
        this.config = ConfigurationManager.getConfiguration();
    }

    private String getURL() {
        final String url = config.baseUri() + config.basePath() + config.healthCheck();
        return url;
    }

    public Response getHealthCheck() {
        return when().
                get(getURL()).
                then().
                extract().
                response();
    }
}
