package com.splitwise.splitwise.repository;

import com.splitwise.splitwise.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CountryRepository extends JpaRepository<Country,Integer> {
    List<Country> findByCountryPkId(Integer id);
    List<Country> findByCountryName(String id);

    void deleteByCountryPkId(Integer countryPkId);

    @Modifying
    @Query(value = "UPDATE t_country_table SET COUNTRY_NAME=: countryName,COUNTRY_CODE:=countryCode WHERE COUNTRY_PK_ID = :countryPkId",nativeQuery = true)
    int updateCountryData(Integer countryPkId,String countryName, String countryCode );
}
