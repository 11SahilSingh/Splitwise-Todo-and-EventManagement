package com.splitwise.splitwise.repository;

import com.splitwise.splitwise.entities.EmTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmTransactionRepo extends JpaRepository<EmTransaction,Integer> {
    EmTransaction findByEmTransactionPkId(int id);

    void deleteByEmTransactionPkId(int id);
}
