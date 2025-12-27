package com.splitwise.splitwise.repository;

import com.splitwise.splitwise.entities.UserInsurance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserInsuranceRepo extends JpaRepository<UserInsurance, UUID> {

    UserInsurance findByUserInsurancePkId(Integer id);

    void deleteByUserInsurancePkId(UUID uuid);
}
