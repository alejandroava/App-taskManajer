package com.GestorTareas.model.entities;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;

public class Task {

    private long id;
    private String title;
    private String description;
    private LocalDate dateCreation;
    private LocalTime currentlyCreation;
    private String status;

    public Task() {
    }

    public Task(long id, String title, String description, LocalDate dateCreation, LocalTime currentlyCreation, String status) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.dateCreation = dateCreation;
        this.currentlyCreation = currentlyCreation;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public LocalTime getCurrentlyCreation() {
        return currentlyCreation;
    }

    public String getStatus() {
        return status;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }

    public void setCurrentlyCreation(LocalTime currentlyCreation) {
        this.currentlyCreation = currentlyCreation;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", dateCreation=" + dateCreation +
                ", currentlyCreation=" + currentlyCreation +
                ", status='" + status + '\'' +
                '}';
    }
}
