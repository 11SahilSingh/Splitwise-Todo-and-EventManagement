package com.splitwise.splitwise.repository;

import com.splitwise.splitwise.entities.SwExpense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SwExpenseRepository extends JpaRepository<SwExpense,Integer> {

    List<SwExpense> findByExpensePkId(Integer expensePkId);

    @Modifying
    @Query(value="update sw_expense set EXPENSE_TITLE=:expenseTitle,EXPENSE_AMOUNT=:expenseAmount,PAID_BY_PERSON_FK_ID=:paidByPersonFkId,GROUP_FK_ID=:groupFkId,CURRENCY_CODE=:currencyCode where EXPENSE_PK_ID=:expensePkId",nativeQuery = true)
    void updateExpenseData(int expensePkId, String expenseTitle, Integer expenseAmount, int paidByPersonFkId, int groupFkId, String currencyCode);

    List<SwExpense> findByGroupFkId(Integer id);
}