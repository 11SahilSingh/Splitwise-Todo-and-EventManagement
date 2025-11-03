package com.splitwise.splitwise.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="sw_expense")
public class SwExpense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EXPENSE_PK_ID")
    private Integer expensePkId;

    @Column(name="EXPENSE_TITLE")
    private String expenseTitle;

    @Column(name="EXPENSE_AMOUNT")
    private Integer expenseAmount;

    @Column(name="PAID_BY_PERSON_FK_ID")
    private Integer paidByPersonFkId;

    @Column(name="GROUP_FK_ID")
    private Integer groupFkId;


    @Column(name="CURRENCY_CODE")
    private String currencyCode;

    @Transient
    List<SwDistPerson> swDistPersonList;

    @Transient
    SwPerson swPerson;



    public List<SwDistPerson> getSwDistPersonList() {
        return swDistPersonList;
    }

    public void setSwDistPersonList(List<SwDistPerson> swDistPersonList) {
        this.swDistPersonList = swDistPersonList;
    }

    public int getExpensePkId() {
        return expensePkId;
    }

    public Integer getGroupFkId() {
        return groupFkId;
    }

    public void setGroupFkId(Integer groupFkId) {
        this.groupFkId = groupFkId;
    }

    public void setExpensePkId(Integer expensePkId) {
        this.expensePkId = expensePkId;
    }

    public String getExpenseTitle() {
        return expenseTitle;
    }

    public void setExpenseTitle(String expenseTitle) {
        this.expenseTitle = expenseTitle;
    }

    public Integer getExpenseAmount() {
        return expenseAmount;
    }

    public void setExpenseAmount(Integer expenseAmount) {
        this.expenseAmount = expenseAmount;
    }

    public Integer getPaidByPersonFkId() {
        return paidByPersonFkId;
    }

    public void setPaidByPersonFkId(Integer paidByPersonFkId) {
        this.paidByPersonFkId = paidByPersonFkId;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public SwPerson getSwPerson() {
        return swPerson;
    }

    public void setSwPerson(SwPerson swPerson) {
        this.swPerson = swPerson;
    }

}