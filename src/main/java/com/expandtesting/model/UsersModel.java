package com.expandtesting.model;

public class UsersModel {

    private String name;
    private String email;
    private String password;
    private boolean success;
    private int status;
    private String message;

    public UsersModel(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public UsersModel(boolean success, int status, String message, String name, String email, String password) {
        this.success = success;
        this.status = status;
        this.message = message;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}