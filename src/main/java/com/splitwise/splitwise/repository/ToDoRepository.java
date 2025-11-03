package com.splitwise.splitwise.repository;

import com.splitwise.splitwise.entities.ToDo;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ToDoRepository extends JpaRepository<ToDo,Integer> {
    List<ToDo> findByToDoPkId(Integer id);

    void deleteByToDoPkId(Integer id);

    @Modifying
    @Transactional
    @Query (value="UPDATE to_do_table SET TO_DO_TITLE=:toDoTitle,TO_DO_DES=:toDoDes,IS_COMPLETED=:completed,CREATED_DATE_TIME=:createdDateTime WHERE TO_DO_PK_ID=:toDoPkId",nativeQuery = true)
    void updateToDoData(int toDoPkId, String toDoTitle, String toDoDes, boolean completed, String createdDateTime);
}
