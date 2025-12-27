package com.splitwise.splitwise.controller;

import com.splitwise.splitwise.entities.UserInsurance;
import com.splitwise.splitwise.service.UserInsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "/userInsuranceController")
public class UserInsuranceController {

    @Autowired
    private UserInsuranceService userInsuranceService;

    @GetMapping(name="/getInsuranceData")
    public List<UserInsurance> getInsuranceData(@RequestParam("inputpkid") String inputpkid , @RequestParam("size") int size) {
        return userInsuranceService.getInsuranceData(inputpkid);
    }

    @PostMapping(name="/postUserInsuranceData")
    public void postUserInsuranceData(@RequestBody UserInsurance userInsurance) {
        userInsuranceService.postUserInsuranceData(userInsurance);
    }

    @DeleteMapping(name = "/deleteUserInsaurance")
    public void deleteUserInsurance(@RequestParam("inputpkid") String inputpkid) {
        userInsuranceService.deleteUserInsaurance(inputpkid);
    }

}
