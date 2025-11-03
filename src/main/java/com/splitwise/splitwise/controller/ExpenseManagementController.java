package com.splitwise.splitwise.controller;

import com.splitwise.splitwise.entities.*;
import com.splitwise.splitwise.entities.EmCategory;
import com.splitwise.splitwise.service.EmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expenseManagement")
public class ExpenseManagementController {

    @Autowired
    EmService emService;

    @GetMapping("/getEmUserData")
    List<EmUser>  getEmUserData(@RequestParam("EM_USER_PK_ID") String  emUserPkId) {
        return emService.getEmUserData(emUserPkId);
    }
    @PostMapping("/PostEmUserData")
    void postEmUserData(@RequestBody EmUser emUser) {
        emService.PostEmUserData(emUser);
    }
    @DeleteMapping("/deleteEmUserData")
    void deleteEmUserData(@RequestParam("EM_USER_PK_ID") String  emUserPkId){
        emService.deleteEmUserData(emUserPkId);
    }
    @PutMapping("/updateEmUserData")
    void updateEmUserData(@RequestBody EmUser emUser) {
        emService.updateEmUserData(emUser);
    }




    @GetMapping("/getEmCategoryData")
    List<EmCategory>  getEmCategoryData(@RequestParam("EM_CATEGORY_PK_ID") String  emCategoryPkId) {
        return emService.getEmCatagoryData(emCategoryPkId);
    }
    @PostMapping("/postEmCategoryData")
    void postEmCategoryData(@RequestBody EmCategory emCategory) {
        emService.postEmCategoryData(emCategory);
    }
    @DeleteMapping("/deleteEmCategoryData")
    void deleteEmCategoryData(@RequestParam("EM_CATEGORY_PK_ID") String  emCategoryPkId){
        emService.deleteEmCategoryData(emCategoryPkId);
    }
    @PutMapping("/updateEmCategoryData")
    void updateEmCategoryData(@RequestBody EmCategory emCategory) {
        emService.updateEmCategoryData(emCategory);
    }





    @GetMapping("/getEmTransactionData")
    List<EmTransaction>  getEmTransactionData(@RequestParam("EM_TRANSACTION_PK_ID") String  emTransactionPkId) {
        return emService.getEmTransactionData(emTransactionPkId);
    }
    @PostMapping("/postEmTransactionData")
    void postEmTransactionData(@RequestBody EmTransaction emTransaction) {
        emService.postEmTransactionData(emTransaction);
    }
    @DeleteMapping("/deleteEmTransactionData")
    void deleteEmTransactionData(@RequestParam("EM_TRANSACTION_PK_ID") String  emTransactionPkId){
        emService.deleteEmTransactionData(emTransactionPkId);
    }
    @PutMapping("/updateEmTransactionData")
    void updateEmTransactionData(@RequestBody EmTransaction emTransaction) {
        emService.updateEmTransactionData(emTransaction);
    }





    @GetMapping("/getEmBudgetData")
    List<EmBudget>  getEmBudgetData(@RequestParam("EM_BUDGET_PK_ID") String  emBudgetPkId) {
        return emService.getEmBudgetData(emBudgetPkId);
    }
    @PostMapping("/postEmBudgetData")
    void postEmBudgetData(@RequestBody EmBudget emBudget) {
        emService.postEmBudgetData(emBudget);
    }
    @DeleteMapping("/deleteEmBudgetData")
    void deleteEmBudgetData(@RequestParam("EM_BUDGET_PK_ID") String  emBudgetPkId){
        emService.deleteEmBudgetData(emBudgetPkId);
    }
    @PutMapping("/updateEmBudgetData")
    void updateEmBudgetData(@RequestBody EmBudget emBudget) {
        emService.updateEmBudgetData(emBudget);
    }





    @GetMapping("/getEmAuditLogData")
    List<EmAuditLog>  getEmAuditLogData(@RequestParam("EM_AUDIT_LOG_PK_ID") String  emAuditLogPkId) {
        return emService.getEmAuditLogData(emAuditLogPkId);
    }
    @PostMapping("/postEmAuditLogData")
    void postEmAuditLogData(@RequestBody EmAuditLog emAuditLog) {
        emService.postEmAuditLogData(emAuditLog);
    }
    @DeleteMapping("/deleteEmAuditLogData")
    void deleteEmAuditLogData(@RequestParam("EM_AUDIT_LOG_PK_ID") String  emAuditLogPkId){
        emService.deleteEmAuditLogData(emAuditLogPkId);
    }
    @PutMapping("/updateEmAuditLogData")
    void updateEmAuditLogData(@RequestBody EmAuditLog emAuditLog) {
        emService.updateEmAuditLogData(emAuditLog);
    }

}
