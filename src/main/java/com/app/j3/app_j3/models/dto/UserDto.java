package com.app.j3.app_j3.models.dto;

import com.app.j3.app_j3.models.User;

public class UserDto {
    private String title;
    private User user;
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
}
