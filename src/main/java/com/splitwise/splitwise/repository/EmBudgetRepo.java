package com.splitwise.splitwise.repository;

import com.splitwise.splitwise.entities.EmBudget;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmBudgetRepo extends JpaRepository<EmBudget,Integer> {
    void deleteByEmBudgetPkId(int id);

    EmBudget findByEmBudgetPkId(int id);
}
