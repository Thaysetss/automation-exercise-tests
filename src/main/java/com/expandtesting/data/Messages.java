package com.expandtesting.data;

public enum Messages {

    HEALTH_CHECK_MESSAGE("Notes API is Running");

    private final String message;

    Messages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
