package com.splitwise.splitwise.controller;

import com.splitwise.splitwise.entities.*;
import com.splitwise.splitwise.service.SplitWiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/splitWiseController")
public class SplitWiseController {

    @Autowired
    SplitWiseService splitWiseService;

    @GetMapping("/getSwPersonData")
    List<SwPerson> getSwPersonData(@RequestParam("PERSON_PK_ID") String personPkId){
        return splitWiseService.getSwPersonData(personPkId);
    }

    @PostMapping("/postSwPersonData")
    void postSwPersonData(@RequestBody SwPerson swPerson){
        splitWiseService.postSwPersonData(swPerson);
    }
    @DeleteMapping("/deleteSwPersonData")
    void deleteSwPersonData(@RequestParam("PERSON_PK_ID") Integer personPkId){
        splitWiseService.deleteSwPersonData(personPkId);
    }
    @PutMapping("/updateSwPersonData")
    void updateSwPersonData(@RequestBody SwPerson swPerson){
        splitWiseService.updateSwPersonData(swPerson);
    }




    @GetMapping("/getSwExpenseData")
    List<SwExpense> getSwExpenseData (@RequestParam ("EXPENSE_PK_ID") String expensePkId,@RequestParam ("inputFkId") String inputFkId){
        return splitWiseService.getSwExpenseData(expensePkId,inputFkId);
    }
    @PostMapping("/postSwExpenseData")
    void postSwExpenseData(@RequestBody SwExpense swExpense){
        splitWiseService.postSwExpenseData(swExpense);
    }
    @DeleteMapping("/deleteSwExpenseData")
    void deleteSwExpenseData (@RequestParam ("EXPENSE_PK_ID") Integer expensePkId){
        splitWiseService.deleteSwExpenseData(expensePkId);
    }
    @PutMapping("/updateExpenseData")
    void updateExpenseData(@RequestBody SwExpense swExpense){
        splitWiseService.updateExpenseData(swExpense);
    }



    @GetMapping("/getSwGroupMemberData")
    List<SwGroupMember> getSwGroupMemberData (@RequestParam ("GROUPMEMBER_PK_ID") String groupMemberPkId){
        return splitWiseService.getSwGroupMemberData(groupMemberPkId);
    }
    @PostMapping("/postSwGroupMemberData")
    void postSwGroupMemberData(@RequestBody List<SwGroupMember> swGroupMembers){
        splitWiseService.postSwGroupMemberData(swGroupMembers);
    }
    @DeleteMapping("/deleteSwGroupMemberData")
    void deleteSwGroupMemberData(@RequestParam("GROUPMEMBER_PK_ID") Integer groupMemberPkId){
        splitWiseService.deleteSwGroupMemberData(groupMemberPkId);
    }
    @PutMapping("/updateSwGroupMemberData")
    void updateSwGroupMemberData(@RequestBody SwGroupMember swGroupMember){
        splitWiseService.updateSwGroupMemberData(swGroupMember);
    }




    @GetMapping("/getDistPerson")
    List<SwDistPerson>  getDistPerson(@RequestParam ("DIST_PRN_PK_ID") String distPrnPkId){
        return splitWiseService.getDistPerson(distPrnPkId);
    }
    @PostMapping("/postDistPerson")
    void postDistPerson(@RequestBody SwDistPerson swDistPerson){
        splitWiseService.postDistPerson(swDistPerson);
    }
    @DeleteMapping("/deleteDistPerson")
    void deleteDistPerson(@RequestParam ("DIST_PRN_PK_ID") Integer distPrnPkId){
        splitWiseService.deleteDistPerson(distPrnPkId);
    }
    @PutMapping("/updateDistPerson")
    void updateDistPerson(@RequestBody SwDistPerson swDistPerson){
        splitWiseService.updateDistPerson(swDistPerson);
    }




    @GetMapping("/getGroupData")
    List<SwGroup>  getGroupData(@RequestParam ("GROUP_PK_ID") String groupPkId){
        return splitWiseService.getGroupData(groupPkId);
    }
    @PostMapping("/postGroupData")
    void postGroupData(@RequestBody SwGroup swGroup){
        splitWiseService.postGroupData(swGroup);
    }
    @DeleteMapping("/deleteGroupData")
    void deleteGroupData(@RequestParam ("GROUP_PK_ID") String groupPkId){
        splitWiseService.deleteGroupData(groupPkId);
    }
    @PutMapping("/updateGroupData")
    void updateGroupData(@RequestBody SwGroup swGroup){
        splitWiseService.updateGroupData(swGroup);
    }
}
