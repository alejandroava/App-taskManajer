package com.GestorTareas.controller;

import com.GestorTareas.model.Task;
import com.GestorTareas.services.interfaces.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api-task")

public class TaskController {
    @Autowired
    TaskService taskService = null;

    @PostMapping("/create-task")
    public Task createTask(@RequestBody Task task){
        return taskService.save(task);

    }
}
