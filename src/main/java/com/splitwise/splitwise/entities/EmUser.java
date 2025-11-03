package com.splitwise.splitwise.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="EM_USER")
public class EmUser {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="EM_USER_PK_ID")
    private int emUserPkId;

    @Column(name="EM_USER_NAME")
    private String emUserName;

    @Column(name="EM_USER_EMAIL")
    private String emUserEmail;

    @Column(name="EM_USER_PASSWORD")
    private String emUserPassword;

    @Column(name="EM_USER_ROLE")
    private String emUserRole;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt = LocalDateTime.now();

    public int getEmUserPkId() {
        return emUserPkId;
    }

    public void setEmUserPkId(int emUserPkId) {
        this.emUserPkId = emUserPkId;
    }

    public String getEmUserName() {
        return emUserName;
    }

    public void setEmUserName(String emUserName) {
        this.emUserName = emUserName;
    }

    public String getEmUserEmail() {
        return emUserEmail;
    }

    public void setEmUserEmail(String emUserEmail) {
        this.emUserEmail = emUserEmail;
    }

    public String getEmUserPassword() {
        return emUserPassword;
    }

    public void setEmUserPassword(String emUserPassword) {
        this.emUserPassword = emUserPassword;
    }

    public String getEmUserRole() {
        return emUserRole;
    }

    public void setEmUserRole(String emUserRole) {
        this.emUserRole = emUserRole;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}


