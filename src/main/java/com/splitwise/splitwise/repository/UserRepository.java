package com.splitwise.splitwise.repository;



import com.splitwise.splitwise.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {

    List<User> findByUserPkId(Integer id);

    List<User> findByUserName(String id);

    List<User> findAll();
}
