package com.splitwise.splitwise.repository;

import com.splitwise.splitwise.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CityRepository extends JpaRepository<City,Integer> {

    List<City> findByCityPkId(Integer cityPkId);

    List<City> findByCityName(String id);

    void deleteByCityPkId(Integer cityPkId);

    @Modifying
    @Query(value = " UPDATE t_city SET  CITY_NAME = :cityName ,ZIP_CODE = :zipCode ,CITY_CODE = :cityCode  WHERE CITY_PK_ID = :cityPkId ", nativeQuery = true)
    int updateCityData(Integer cityPkId,String cityName, Integer zipCode, Integer cityCode);
}
