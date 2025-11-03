package com.splitwise.splitwise.service;

import com.splitwise.splitwise.entities.ToDo;

import java.util.List;

public interface ToDoService {

    List<ToDo> getToDoData(String toDoPkId);

    ToDo addToDoTable(ToDo toDo);

    void deleteToDoTable(String toDoPkId);

    void updateToDoData(ToDo toDo);
}
