package com.splitwise.splitwise.controller;

import com.splitwise.splitwise.entities.ToDo;
import com.splitwise.splitwise.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/toDoController")
public class ToDoController {

    @Autowired
    ToDoService toDoService;

    // fetch all todos if param is not provided
    @GetMapping("/getToDoTable")
    public List<ToDo> getToDoData(@RequestParam(value = "toDoPkId", required = false) String toDoPkId) {
        return toDoService.getToDoData(toDoPkId);
    }

    @PostMapping("/addToDoTable")
    public ToDo addToDoTable(@RequestBody ToDo todo) {
        return toDoService.addToDoTable(todo);
    }

    @DeleteMapping("/deleteToDoData")
    public void deleteToDoData(@RequestParam("toDoPkId") String toDoPkId) {
        toDoService.deleteToDoTable(toDoPkId);
    }

    @PutMapping("/updateToDoData")
    public void updateToDoData(@RequestBody ToDo toDo) {
        toDoService.updateToDoData(toDo);
    }


}
