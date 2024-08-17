package com.GestorTareas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity(name = "Tasks")

public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String description;
    private Date dateCreation;
    private Time currentlyCreation;
    private String status;

    public Task() {
    }

    public Task(long id, String title, String description, Date dateCreation, Time currentlyCreation, String status) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.dateCreation = dateCreation;
        this.currentlyCreation = currentlyCreation;
        this.status = status;
    }

    public Task(int id, String ingles, String description, String s, String time, String pendiente) {
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

    public Date getDateCreation() {
        return dateCreation;
    }

    public Time getCurrentlyCreation() {
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

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public void setCurrentlyCreation(Time currentlyCreation) {
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
