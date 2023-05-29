package com.expandtesting.data;

public enum Messages {

    HEALTH_CHECK_MESSAGE("Notes API is Running"),
    USER_REGISTER_CREATED_SUCCESSFULLY("User account created successfully");

    private final String message;

    Messages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}