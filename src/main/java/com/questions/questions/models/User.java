package com.questions.questions.models;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "user_id")
    private int userId;

    @Column(name="name")
    private String name;
    @Column(name="password")
    private String password;

    @Column(name="email")
    private String email;
    @Column(name="tokens")
    private int tokens;
    @Column(name="badge_id")
    private int badges;

    public User() {
    }

    public User(String name, String password, String email, int tokens, int badges) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.tokens = tokens;
        this.badges = badges;
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
