package com.ruralcare.ruralcare.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Appointment {

    @Id
    private int id;

    private int userId;
    private int doctorId;
    private String date;
    private String time;
    private String status;

    public Appointment() {}

    public Appointment(int id, int userId, int doctorId,
                       String date, String time, String status) {
        this.id = id;
        this.userId = userId;
        this.doctorId = doctorId;
        this.date = date;
        this.time = time;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}