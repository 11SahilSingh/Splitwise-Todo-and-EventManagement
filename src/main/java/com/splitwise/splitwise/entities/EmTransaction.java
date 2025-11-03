package com.splitwise.splitwise.entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "EM_TRANSACTION")
public class EmTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EM_TRANSACTION_PK_ID")
    private int emTransactionPkId;

    @Column(name = "EM_USER_FK_ID")
    private int emUserFkId;

    @Column(name = "EM_CATEGORY_FK_ID")
    private int emCategoryFkId;

    @Column(name = "EM_TRANSACTION_TYPE")
    private String emTransactionType;

    @Column(name = "EM_TRANSACTION_AMOUNT")
    private double emTransactionAmount;

    @Column(name = "EM_TRANSACTION_DESCRIPTION")
    private String emTransactionDescription;

    @Column(name = "EM_TRANSACTION_DATE")
    private LocalDateTime emTransactionDate;

    public int getEmTransactionPkId() {
        return emTransactionPkId;
    }

    public void setEmTransactionPkId(int emTransactionPkId) {
        this.emTransactionPkId = emTransactionPkId;
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

    public String getEmTransactionType() {
        return emTransactionType;
    }

    public void setEmTransactionType(String emTransactionType) {
        this.emTransactionType = emTransactionType;
    }

    public double getEmTransactionAmount() {
        return emTransactionAmount;
    }

    public void setEmTransactionAmount(double emTransactionAmount) {
        this.emTransactionAmount = emTransactionAmount;
    }

    public String getEmTransactionDescription() {
        return emTransactionDescription;
    }

    public void setEmTransactionDescription(String emTransactionDescription) {
        this.emTransactionDescription = emTransactionDescription;
    }

    public LocalDateTime getEmTransactionDate() {
        return emTransactionDate;
    }

    public void setEmTransactionDate(LocalDateTime emTransactionDate) {
        this.emTransactionDate = emTransactionDate;
    }
}
