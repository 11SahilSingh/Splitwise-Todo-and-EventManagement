package com.splitwise.splitwise.entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "EM_BUDGET")
public class EmBudget {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EM_BUDGET_PK_ID")
    private int emBudgetPkId;

    @Column(name = "EM_USER_FK_ID")
    private int emUserFkId; // Which user this budget belongs to

    @Column(name = "EM_CATEGORY_FK_ID")
    private int emCategoryFkId; // Optional: budget per category

    @Column(name = "EM_BUDGET_AMOUNT")
    private double emBudgetAmount; // Limit amount set by user

    @Column(name = "EM_BUDGET_MONTH")
    private String emBudgetMonth; // e.g., "2025-11" or "November 2025"

    @Column(name = "EM_BUDGET_DESCRIPTION")
    private String emBudgetDescription; // Notes like "Food budget" or "Monthly groceries"

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt = LocalDateTime.now();

    // ===== Getters & Setters =====

    public int getEmBudgetPkId() {
        return emBudgetPkId;
    }

    public void setEmBudgetPkId(int emBudgetPkId) {
        this.emBudgetPkId = emBudgetPkId;
    }

    public int getEmUserFkId() {
        return emUserFkId;
    }

    public void setEmUserFkId(int emUserFkId) {
        this.emUserFkId = emUserFkId;
    }

    public int getEmCategoryFkId() {
        return emCategoryFkId;
    }

    public void setEmCategoryFkId(int emCategoryFkId) {
        this.emCategoryFkId = emCategoryFkId;
    }

    public double getEmBudgetAmount() {
        return emBudgetAmount;
    }

    public void setEmBudgetAmount(double emBudgetAmount) {
        this.emBudgetAmount = emBudgetAmount;
    }

    public String getEmBudgetMonth() {
        return emBudgetMonth;
    }

    public void setEmBudgetMonth(String emBudgetMonth) {
        this.emBudgetMonth = emBudgetMonth;
    }

    public String getEmBudgetDescription() {
        return emBudgetDescription;
    }

    public void setEmBudgetDescription(String emBudgetDescription) {
        this.emBudgetDescription = emBudgetDescription;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
