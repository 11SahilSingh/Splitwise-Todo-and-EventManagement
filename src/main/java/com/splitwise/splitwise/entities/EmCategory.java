package com.splitwise.splitwise.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="EM_CATEGORY")
public class EmCategory {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="EM_CATEGORY_PK_ID")
    private int emCategoryPkId;

    @Column(name="EM_USER_FK_ID")
    private int emUserFkId;

    @Column(name="EM_CATEGORY_NAME")
    private String emCategoryName;

    @Column(name="EM_CATEGORY_TYPE")
    private String emCategoryType;


    @Column(name="CREATED_AT")
    private LocalDateTime createdAt;

    public int getEmCategoryPkId() {
        return emCategoryPkId;
    }

    public void setEmCategoryPkId(int emCategoryPkId) {
        this.emCategoryPkId = emCategoryPkId;
    }

    public int getEmUserFkId() {
        return emUserFkId;
    }

    public void setEmUserFkId(int emUserFkId) {
        this.emUserFkId = emUserFkId;
    }

    public String getEmCategoryName() {
        return emCategoryName;
    }

    public void setEmCategoryName(String emCategoryName) {
        this.emCategoryName = emCategoryName;
    }

    public String getEmCategoryType() {
        return emCategoryType;
    }

    public void setEmCategoryType(String emCategoryType) {
        this.emCategoryType = emCategoryType;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
