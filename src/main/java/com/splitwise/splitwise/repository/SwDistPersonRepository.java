package com.splitwise.splitwise.repository;

import com.splitwise.splitwise.entities.SwDistPerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SwDistPersonRepository extends JpaRepository<SwDistPerson,Integer> {

    List<SwDistPerson> findByDistPrnPkId(Integer distPrnPkId);

    @Modifying
    @Query(value="update sw_dist_person set EXPENCE_FK_ID=:expenceFkId,LENDER_PERSON_FK_ID=:lenderPersonFkId,LENDED_AMOUNT=:lendedAmount where DIST_PRN_PK_ID=:distPrnPk",nativeQuery = true)
    void updateDistPerson(int distPrnPk, int expenceFkId, int lenderPersonFkId, double lendedAmount);

    List<SwDistPerson> findByExpenceFkId(int expensePkId);
}
