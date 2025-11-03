package com.splitwise.splitwise.service;
import com.splitwise.splitwise.entities.*;

import java.util.List;

public interface SplitWiseService {
    public List<SwPerson> getSwPersonData(String personPkId);

    void postSwPersonData(SwPerson swPerson);

    void deleteSwPersonData(Integer personPkId);

    void updateSwPersonData(SwPerson swPerson);

    List<SwExpense> getSwExpenseData(String expensePkId,String inputFkId);

    void postSwExpenseData(SwExpense swExpense);

    void deleteSwExpenseData(Integer expensePkId);

    void updateExpenseData(SwExpense swExpense);

    List<SwGroupMember> getSwGroupMemberData(String groupMemberPkId);

    void postSwGroupMemberData(List<SwGroupMember> swGroupMembers);

    void deleteSwGroupMemberData(Integer groupMemberPkId);

    void updateSwGroupMemberData(SwGroupMember swGroupMember);

    List<SwDistPerson> getDistPerson(String distPrnPkId);

    void postDistPerson(SwDistPerson swDistPerson);

    void deleteDistPerson(Integer distPrnPkId);

    void updateDistPerson(SwDistPerson swDistPerson);

    List<SwGroup> getGroupData(String groupPkId);

    void postGroupData(SwGroup swGroup);

    void deleteGroupData(String groupPkId);

    void updateGroupData(SwGroup swGroup);
}
