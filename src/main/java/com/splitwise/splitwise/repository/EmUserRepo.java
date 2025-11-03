package com.splitwise.splitwise.repository;

import com.splitwise.splitwise.entities.EmUser;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface EmUserRepo extends JpaRepository<EmUser,Integer> {
    EmUser findByEmUserPkId(int id);

    void deleteByEmUserPkId(int emUserPkId);

}
