package com.questions.questions.models;

import jakarta.persistence.*;

@Entity(name = "users")
@Table
public class User {
    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName="user_sequence",
            allocationSize=1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )
    private int userId;
    private String name;
    private String password;
    private String email;
    private int tokens;
    private int badges;

    public User(int userId, String name, String password, String email, int tokens, int badges) {
        this.userId = userId;
        this.name = name;
        this.password = password;
        this.email = email;
        this.tokens = tokens;
        this.badges = badges;
    }

    public User() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTokens() {
        return tokens;
    }

    public void setTokens(int tokens) {
        this.tokens = tokens;
    }

    public int getBadges() {
        return badges;
    }

    public void setBadges(int badges) {
        this.badges = badges;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", tokens=" + tokens +
                ", badges=" + badges +
                '}';
    }
}
