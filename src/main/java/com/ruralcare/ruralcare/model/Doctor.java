package com.ruralcare.ruralcare.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Doctor {

    @Id
    private int id;

    private String name;
    private String specialization;
    private String hospital;
    private String village;

    public Doctor() {}

    public Doctor(int id, String name, String specialization,
                  String hospital, String village) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.hospital = hospital;
        this.village = village;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }
}