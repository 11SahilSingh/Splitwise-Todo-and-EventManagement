package com.splitwise.splitwise.entities;

import jakarta.persistence.*;

@Entity
@Table(name="t_user")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="USER_PK_ID")
    Integer userPkId;

    @Column(name="USER_NAME")
    String userName;

    @Column(name="USER_IMAGE")
    String userImage;

    @Column(name="USER_EMAIL")
    String userEmail;

    @Column(name="USER_PASSWORD")
    String userPassword;

    public Integer getUserPkId() {
        return userPkId;
    }

    public void setUserPkId(Integer userPkId) {
        this.userPkId = userPkId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
