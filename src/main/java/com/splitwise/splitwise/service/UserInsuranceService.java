package com.splitwise.splitwise.service;

import com.splitwise.splitwise.entities.UserInsurance;

import java.util.List;

public interface UserInsuranceService {

    List<UserInsurance> getInsuranceData(String inputpkid);

    void postUserInsuranceData(UserInsurance userInsurance);

    void deleteUserInsaurance(String inputpkid);
}
