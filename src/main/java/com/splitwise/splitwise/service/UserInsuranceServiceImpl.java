package com.splitwise.splitwise.service;

import com.splitwise.splitwise.entities.EmUser;
import com.splitwise.splitwise.entities.UserInsurance;
import com.splitwise.splitwise.repository.EmUserRepo;
import com.splitwise.splitwise.repository.UserInsuranceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserInsuranceServiceImpl implements UserInsuranceService {

    @Autowired
    UserInsuranceRepo userInsuranceRepo;
    @Autowired
    EmUserRepo emUserRepo;


    @Override
    public List<UserInsurance> getInsuranceData(String inputpkid) {
        List<UserInsurance> userInsuranceList=new ArrayList<>();
        if(inputpkid!=null && inputpkid!="" && inputpkid!="null"){
            Integer id=Integer.parseInt(inputpkid);
            UserInsurance ui=userInsuranceRepo.findByUserInsurancePkId(id);
            userInsuranceList.add(ui);
        }else{
            userInsuranceList = userInsuranceRepo.findAll();
        }

        if(userInsuranceList!=null && userInsuranceList.size()>0){
            for(UserInsurance ui:userInsuranceList){
                EmUser umUser= emUserRepo.findByEmUserPkId(ui.getPersonFkId());
                ui.setUserName(umUser.getEmUserName());
            }
        }
        return userInsuranceList;
    }

    @Override
    public void postUserInsuranceData(UserInsurance userInsurance) {
        userInsuranceRepo.save(userInsurance);
    }

    @Override
    public void deleteUserInsaurance(String inputpkid) {
        UUID uuid = UUID.fromString(inputpkid);
        userInsuranceRepo.deleteByUserInsurancePkId(uuid);
    }


}
