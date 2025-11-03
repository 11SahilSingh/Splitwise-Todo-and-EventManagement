package com.splitwise.splitwise.service;
import com.splitwise.splitwise.entities.*;
import com.splitwise.splitwise.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmServiceImplementation implements EmService {

    @Autowired
    EmCategoryRepo emCategoryRepo;
    @Autowired
    EmUserRepo emUserRepo;
    @Autowired
    EmBudgetRepo emBudgetRepo;
    @Autowired
    EmAuditLogRepo emAuditLogRepo;
    @Autowired
    EmTransactionRepo emTransactionRepo;

    public List<EmUser> getEmUserData(String emUserPkId){
        List<EmUser> emUserData = new ArrayList<>();
        if(!emUserPkId.isEmpty() && emUserPkId!=null){
            int id=Integer.parseInt(emUserPkId);
            EmUser emUser=emUserRepo.findByEmUserPkId(id);
            emUserData.add(emUser);
        }else{
            emUserData=emUserRepo.findAll();
        }
        return emUserData;
    }
    public void PostEmUserData(EmUser emUser) {
        if (emUser != null) {
            emUserRepo.save(emUser);
        }
    }
    public void deleteEmUserData(String emUserPkId) {
        if(!emUserPkId.isEmpty() && emUserPkId!=null){
            int id=Integer.parseInt(emUserPkId);
            emUserRepo.deleteByEmUserPkId(id);
        }
    }
    public void updateEmUserData(EmUser emUser) {
        if (emUser != null) {
            emUserRepo.save(emUser);
        }
    }



    public List<EmCategory> getEmCatagoryData(String emCategoryPkId){
        List<EmCategory> emCategoryData = new ArrayList<>();
        if(!emCategoryPkId.isEmpty() && emCategoryPkId!=null){
            int id=Integer.parseInt(emCategoryPkId);
            EmCategory emCategory=emCategoryRepo.findByEmCategoryPkId(id);
            emCategoryData.add(emCategory);
        }else{
            emCategoryData=emCategoryRepo.findAll();
        }
        return emCategoryData;
    }
    public void postEmCategoryData(EmCategory emCategory) {
        if (emCategory != null) {
            emCategoryRepo.save(emCategory);
        }
    }
    public void deleteEmCategoryData(String emCategoryPkId) {
        if(!emCategoryPkId.isEmpty() && emCategoryPkId!=null){
            int id=Integer.parseInt(emCategoryPkId);
            emCategoryRepo.deleteByEmCategoryPkId(id);
        }
    }
    public void updateEmCategoryData(EmCategory emCategory) {
        if (emCategory != null) {
            emCategoryRepo.save(emCategory);
        }
    }




    public List<EmTransaction> getEmTransactionData(String emTransactionPkId){
        List<EmTransaction> emTransactionData = new ArrayList<>();
        if(!emTransactionPkId.isEmpty() && emTransactionPkId!=null){
            int id=Integer.parseInt(emTransactionPkId);
            EmTransaction emTransaction=emTransactionRepo.findByEmTransactionPkId(id);
            emTransactionData.add(emTransaction);
        }else{
            emTransactionData=emTransactionRepo.findAll();
        }
        return emTransactionData;
    }
    public void postEmTransactionData(EmTransaction emTransaction) {
        if (emTransaction != null) {
            emTransactionRepo.save(emTransaction);
        }
    }
    public void deleteEmTransactionData(String emTransactionPkId) {
        if(!emTransactionPkId.isEmpty() && emTransactionPkId!=null){
            int id=Integer.parseInt(emTransactionPkId);
            emTransactionRepo.deleteByEmTransactionPkId(id);
        }
    }
    public void updateEmTransactionData(EmTransaction emTransaction) {
        if (emTransaction != null) {
            emTransactionRepo.save(emTransaction);
        }
    }




    public List<EmBudget> getEmBudgetData(String emBudgetPkId){
        List<EmBudget> emBudgetData = new ArrayList<>();
        if(!emBudgetPkId.isEmpty() && emBudgetPkId!=null){
            int id=Integer.parseInt(emBudgetPkId);
            EmBudget emBudget=emBudgetRepo.findByEmBudgetPkId(id);
            emBudgetData.add(emBudget);
        }else{
            emBudgetData=emBudgetRepo.findAll();
        }
        return emBudgetData;
    }
    public void postEmBudgetData(EmBudget emBudget) {
        if (emBudget != null) {
            emBudgetRepo.save(emBudget);
        }
    }
    public void deleteEmBudgetData(String emBudgetPkId) {
        if(!emBudgetPkId.isEmpty() && emBudgetPkId!=null){
            int id=Integer.parseInt(emBudgetPkId);
            emBudgetRepo.deleteByEmBudgetPkId(id);
        }
    }
    public void updateEmBudgetData(EmBudget emBudget) {
        if (emBudget != null) {
            emBudgetRepo.save(emBudget);
        }
    }


    public List<EmAuditLog> getEmAuditLogData(String emAuditLogPkId){
        List<EmAuditLog> emAuditLogData = new ArrayList<>();
        if(!emAuditLogPkId.isEmpty() && emAuditLogPkId!=null){
            int id=Integer.parseInt(emAuditLogPkId);
            EmAuditLog emAuditLog= emAuditLogRepo.findByEmAuditLogPkId(id);
            emAuditLogData.add(emAuditLog);
        }else{
            emAuditLogData=emAuditLogRepo.findAll();
        }
        return emAuditLogData;
    }
    public void postEmAuditLogData(EmAuditLog emAuditLog) {
        if (emAuditLog != null) {
            emAuditLogRepo.save(emAuditLog);
        }
    }
    public void deleteEmAuditLogData(String emAuditLogPkId) {
        if(!emAuditLogPkId.isEmpty() && emAuditLogPkId!=null){
            int id=Integer.parseInt(emAuditLogPkId);
            emAuditLogRepo.deleteByEmAuditLogPkId(id);
        }
    }
    public void updateEmAuditLogData(EmAuditLog emAuditLog) {
        if (emAuditLog != null) {
            emAuditLogRepo.save(emAuditLog);
        }
    }


}
