package com.ruralcare.ruralcare.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class HealthRecord {

    @Id
    private int id;

    private int userId;
    private String diagnosis;
    private String medicine;
    private String date;
    private String notes;

    public HealthRecord() {}

    public HealthRecord(int id, int userId, String diagnosis,
                        String medicine, String date, String notes) {
        this.id = id;
        this.userId = userId;
        this.diagnosis = diagnosis;
        this.medicine = medicine;
        this.date = date;
        this.notes = notes;
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

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}