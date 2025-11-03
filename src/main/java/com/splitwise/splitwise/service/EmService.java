package com.splitwise.splitwise.service;

import com.splitwise.splitwise.entities.*;

import java.util.List;

public interface EmService {
    List<EmUser> getEmUserData(String emUserPkId);

    void PostEmUserData(EmUser emUser);

    void deleteEmUserData(String emUserPkId);

    void updateEmUserData(EmUser emUser);

    List<EmCategory> getEmCatagoryData(String emCategoryPkId);

    void postEmCategoryData(EmCategory emCategory);

    void deleteEmCategoryData(String emCategoryPkId);

    void updateEmCategoryData(EmCategory emCategory);

    List<EmTransaction> getEmTransactionData(String emTransactionPkId);

    void postEmTransactionData(EmTransaction emTransaction);

    void deleteEmTransactionData(String emTransactionPkId);

    void updateEmTransactionData(EmTransaction emTransaction);

    List<EmBudget> getEmBudgetData(String emBudgetPkId);

    void postEmBudgetData(EmBudget emBudget);

    void deleteEmBudgetData(String emBudgetPkId);

    void updateEmBudgetData(EmBudget emBudget);

    List<EmAuditLog> getEmAuditLogData(String emAuditLogPkId);

    void postEmAuditLogData(EmAuditLog emAuditLog);

    void deleteEmAuditLogData(String emAuditLogPkId);

    void updateEmAuditLogData(EmAuditLog emAuditLog);
}
