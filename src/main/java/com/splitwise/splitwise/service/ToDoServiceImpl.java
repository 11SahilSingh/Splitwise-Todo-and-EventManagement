package com.splitwise.splitwise.service;

import com.splitwise.splitwise.entities.ToDo;
import com.splitwise.splitwise.repository.ToDoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoServiceImpl implements ToDoService{

    @Autowired
    private ToDoRepository toDoRepository;

  public List<ToDo> getToDoData(String toDoPkId){
      List<ToDo> list=new ArrayList<>();
        if(toDoPkId != null && !toDoPkId.equals("null")){
            Integer Id = Integer.parseInt(toDoPkId);
            list= toDoRepository.findByToDoPkId(Id);
        }else {
            list= toDoRepository.findAll();
        }
        return list;
    }

    @Override
    public ToDo addToDoTable(ToDo todo) {
        return toDoRepository.save(todo);
    }

    @Transactional
    public void deleteToDoTable(String toDoPkId){
      if(toDoPkId!=null && !toDoPkId.equals("null")){
          Integer Id = Integer.parseInt(toDoPkId);
          toDoRepository.deleteByToDoPkId(Id);
      }
  }

    @Transactional
    public void updateToDoData(ToDo toDo) {
          toDoRepository.updateToDoData(toDo.getToDoPkId(),toDo.getToDoTitle(),toDo.getToDoDes(),toDo.isCompleted(),toDo.getCreatedDateTime());
  }
}
