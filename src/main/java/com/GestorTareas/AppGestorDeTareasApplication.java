package com.GestorTareas;

import com.GestorTareas.controller.TaskController;
import com.GestorTareas.model.Task;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppGestorDeTareasApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppGestorDeTareasApplication.class, args);
//
//		TaskController taskController = null;
//
//		Task task = new Task(1,"Ingles","3 veces a la semana","10/12/2024","14:30:00","pendiente");
//		taskController.createTask(task);
//		System.out.println(taskController);
//
	}

}
