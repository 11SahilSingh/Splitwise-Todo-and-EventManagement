package com.splitwise.splitwise.repository;

import com.splitwise.splitwise.entities.EmCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmCategoryRepo extends JpaRepository<EmCategory,Integer> {
     EmCategory findByEmCategoryPkId(int Id);

    void deleteByEmCategoryPkId(int id);
}
