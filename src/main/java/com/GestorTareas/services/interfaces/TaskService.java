package com.GestorTareas.services.interfaces;

import com.GestorTareas.model.Task;
import com.GestorTareas.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    @Autowired
    TaskRepository taskRepository=null;

    public Task save(Task task){
        return taskRepository.save(task);

    }


}
