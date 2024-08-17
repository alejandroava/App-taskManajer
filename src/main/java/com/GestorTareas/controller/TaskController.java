package com.GestorTareas.controller;

import com.GestorTareas.model.Task;
import com.GestorTareas.services.interfaces.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api-task")

public class TaskController {
    @Autowired
    TaskService taskService = null;

    @PostMapping("/create-task")
    public Task createTask(@RequestBody Task task){
        return taskService.save(task);
    }
    @GetMapping("/find-all")
   public Iterable<Task> getAll(){
        return taskService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id){
        taskService.deleteById(id);
    }
    @PutMapping("/update/{id}")
    public Task updateTask(@RequestBody Task task, @PathVariable Long id){
        task.setId(id);
        return taskService.save(task);
    }
}
