package com.example.nutan.mescomplain;

/**
 * Created by nutan on 9/21/15.
 */
public class User {
    private String userName;
    private String password;
    private Boolean status;

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getUserName() {                       //alt + insert
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
