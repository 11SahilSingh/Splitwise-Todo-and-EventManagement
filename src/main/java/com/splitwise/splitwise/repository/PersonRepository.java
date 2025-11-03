package com.splitwise.splitwise.repository;

import com.splitwise.splitwise.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Integer> {
    List<Person> findByPersonPkId(Integer inputPkId);


    List<Person> findByStudentFkId(Integer id);

    void deleteByPersonPkId(Integer personId);

    @Modifying
    @Query (value = "UPDATE t_person SET STUDENT_FK_ID=:studentFkId ,PERSON_NAME=:PersonName ,AGE=:age ,ADDRESS=:address ,CITY=:city WHERE PERSON_PK_ID=:personPkId",nativeQuery = true)
    int updatePersonData(Integer personPkId, Integer studentFkId,String PersonName, Integer age, String address, String city);
}
