package com.splitwise.splitwise.service;

import com.splitwise.splitwise.entities.*;
import com.splitwise.splitwise.repository.*;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SplitWiseServiceImpl implements SplitWiseService{

    @Autowired
    SwPersonRepository swPersonRepository;
    @Autowired
    SwExpenseRepository swExpenseRepository;
    @Autowired
    SwGroupMemberRepository swGroupMemberRepository;
    @Autowired
    SwDistPersonRepository swDistPersonRepository;
    @Autowired
    SwGroupRepository swGroupRepository;

  public List<SwPerson> getSwPersonData(String personPkId){
        List<SwPerson> swPersonList = new ArrayList<>();
        if(personPkId!=null && !personPkId.equals("null")){
            Integer Id=Integer.parseInt(personPkId);
            SwPerson swPerson = swPersonRepository.findByPersonPkId(Id);
            swPersonList.add(swPerson);
        }else {
            swPersonList = swPersonRepository.findAll();
        }
        return swPersonList;
    }
    public  void postSwPersonData(SwPerson swPerson){
        if(swPerson!=null){
            swPersonRepository.save(swPerson);
        }
    }
    @Transactional
    public void deleteSwPersonData(Integer personPkId){
        if(personPkId!=null && !personPkId.equals("null")){
            swPersonRepository.deleteById(personPkId);
        }
    }
    @Transactional
    public void updateSwPersonData(SwPerson swPerson){
        if(swPerson!=null){
            swPersonRepository.updateSwPersonData(swPerson.getPersonPkId(),swPerson.getPersonName());
        }
    }



    public List<SwExpense> getSwExpenseData(String expensePkId,String inputFkId){
        List<SwExpense> swExpenseList = new ArrayList<>();

        if(expensePkId!=null && !expensePkId.equals("null")){
            Integer Id=Integer.parseInt(expensePkId);
            swExpenseList=swExpenseRepository.findByExpensePkId(Id);
        }
        else if(inputFkId!=null && !inputFkId.equals("null")){
            Integer Id=Integer.parseInt(inputFkId);
            swExpenseList=swExpenseRepository.findByGroupFkId(Id);
        }
        else{
            swExpenseList=swExpenseRepository.findAll();
        }
        for(SwExpense swExpense:swExpenseList){
            SwPerson paidByPerson=swPersonRepository.findByPersonPkId(swExpense.getPaidByPersonFkId());
            swExpense.setSwPerson(paidByPerson);
            List<SwDistPerson> swDistPersonList=swDistPersonRepository.findByExpenceFkId(swExpense.getExpensePkId());
            for(SwDistPerson swDistPerson:swDistPersonList){
                 SwPerson lenderPerson=swPersonRepository.findByPersonPkId(swDistPerson.getLenderPersonFkId());
                 swDistPerson.setDistributionPerson(lenderPerson);
            }
            swExpense.setSwDistPersonList(swDistPersonList);
        }
        return swExpenseList;
    }

    public void postSwExpenseData(SwExpense swExpense){
        if(swExpense!=null){
            swExpense = swExpenseRepository.save(swExpense);
        }

        if(swExpense.getSwDistPersonList()!=null)
        {
         for(SwDistPerson swDistPerson:swExpense.getSwDistPersonList())    {
             swDistPerson.setExpenceFkId(swExpense.getExpensePkId());
             postDistPerson( swDistPerson);
         }
        }
    }

    public void deleteSwExpenseData(Integer expensePkId){
        if(expensePkId!=null && !expensePkId.equals("null")){
            swExpenseRepository.deleteById(expensePkId);
        }
    }
    @Transactional
    public void updateExpenseData(SwExpense swExpense){
        if(swExpense!=null){
            swExpenseRepository.updateExpenseData(swExpense.getExpensePkId(),swExpense.getExpenseTitle(),swExpense.getExpenseAmount(),swExpense.getPaidByPersonFkId(),swExpense.getGroupFkId(),swExpense.getCurrencyCode());
        }
    }


    //we have to get person data here
    public List<SwGroupMember> getSwGroupMemberData(String groupMemberPkId){
        List<SwGroupMember> swGroupMembersList = new ArrayList<>();
        if(groupMemberPkId!=null && !groupMemberPkId.equals("null")){
            Integer Id=Integer.parseInt(groupMemberPkId);
            swGroupMembersList=swGroupMemberRepository.findByGroupMemberPkId(Id);
        }else{
            swGroupMembersList=swGroupMemberRepository.findAll();
        }

        if(swGroupMembersList!=null && swGroupMembersList.size()>0){
            for(SwGroupMember swGroupMember:swGroupMembersList){
                SwPerson swPerson=swPersonRepository.findByPersonPkId(swGroupMember.getPersonFkId());
                List<SwPerson> swPersonList=new ArrayList<>();
                swPersonList.add(swPerson);
                swGroupMember.setSwPersonList(swPersonList);
            }
        }
        return swGroupMembersList;
    }

   public void postSwGroupMemberData(List<SwGroupMember> swGroupMembers){
      for(SwGroupMember swGroupMember:swGroupMembers){
          if(swGroupMember!=null){
              swGroupMemberRepository.save(swGroupMember);
          }
      }

    }
    public void deleteSwGroupMemberData(Integer groupMemberPkId){
        if(groupMemberPkId!=null && !groupMemberPkId.equals("null")){
            swGroupMemberRepository.deleteById(groupMemberPkId);
        }
    }
    @Transactional
    public void updateSwGroupMemberData(SwGroupMember swGroupMember){
        if(swGroupMember!=null){
            swGroupMemberRepository.updateSwGroupMemberData(swGroupMember.getGroupMemberPkId(),swGroupMember.getGroupFkId(),swGroupMember.getPersonFkId());
        }
    }


    public List<SwDistPerson> getDistPerson(String distPrnPkId){
        List<SwDistPerson> swDistPersonList = new ArrayList<>();
        if(distPrnPkId!=null && !distPrnPkId.equals("null")){
            Integer Id = Integer.parseInt(distPrnPkId);
            swDistPersonList=swDistPersonRepository.findByDistPrnPkId(Id);
        }else{
            swDistPersonList=swDistPersonRepository.findAll();
        }
        return swDistPersonList;
    }
    public void postDistPerson(SwDistPerson swDistPerson){
        if(swDistPerson!=null){
            swDistPersonRepository.save(swDistPerson);
        }
    }
    public void deleteDistPerson(Integer distPrnPkId){
        if(distPrnPkId!=null && !distPrnPkId.equals("null")){
            swDistPersonRepository.deleteById(distPrnPkId);
        }
    }
    @Transactional
    public void updateDistPerson(SwDistPerson swDistPerson){
        if(swDistPerson!=null){
            swDistPersonRepository.updateDistPerson(swDistPerson.getDistPrnPkId(),swDistPerson.getExpenceFkId(),swDistPerson.getLenderPersonFkId(),swDistPerson.getLendedAmount());
        }
    }


    public List<SwGroup> getGroupData(String groupPkId){
        List<SwGroup> swGroupList = new ArrayList<>();
        if(groupPkId!=null && !groupPkId.equals("null")){
            Integer Id=Integer.parseInt(groupPkId);
            swGroupList=swGroupRepository.findByGroupPkId(Id);
        }else{
            swGroupList=swGroupRepository.findAll();
        }
        return swGroupList;
    }
    public void postGroupData(SwGroup swGroup){
        if(swGroup!=null){
            swGroupRepository.save(swGroup);
        }
    }
    public void deleteGroupData(String groupPkId){
        if(groupPkId!=null && !groupPkId.equals("null")){
            Integer Id=Integer.parseInt(groupPkId);
            swGroupRepository.deleteById(Id);
        }
    }
    @Transactional
    public void updateGroupData(SwGroup swGroup){
        if(swGroup!=null){
            swGroupRepository.updateGroupData(swGroup.getGroupPkId(),swGroup.getGroupName(),swGroup.getGroupDesc());
        }
    }
}