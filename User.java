package com.company;

public class User {
    private int userId;
    private static int id = 0;
    private String username, level; // level - beginner, expert, legend

    public User(String username, String level) {
        id++;
        this.userId = id;
        this.username = username;
        this.level = level.toLowerCase();
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level.toLowerCase();
    }

    @Override
    public String toString() {
        return "user: " + username + ", level: " + level;
    }
}
