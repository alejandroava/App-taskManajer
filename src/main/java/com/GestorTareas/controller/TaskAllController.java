package com.GestorTareas.controller;

import com.GestorTareas.model.Task;
import com.GestorTareas.services.interfaces.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/views")
public class TaskAllController {
    @Autowired
    TaskService taskService;
    @GetMapping("/")
    public String viewsTasks(Model model){
        Iterable<Task> tasks = taskService.findAll();
        model.addAttribute("tasks",tasks);
        return "views/tasks";
    }

}


