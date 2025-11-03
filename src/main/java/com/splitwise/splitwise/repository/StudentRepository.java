package com.splitwise.splitwise.repository;

import com.splitwise.splitwise.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface StudentRepository extends JpaRepository<Student,Integer> {
    List<Student> findByStudentPkId(Integer inputPkId);
    List<Student> findByStudentName(String inputFkId);
    void deleteByStudentPkId(Integer studentId);

    @Modifying
    @Query(value = " UPDATE t_student_table SET  student_name=:studentName ,AGE=:age ,ADDRESS=:address ,city=:City WHERE STUDENT_PK_ID=:pkId ",nativeQuery = true)
    int updateStudentData(String studentName,Integer age,String address,String city,Integer pkId);



}
