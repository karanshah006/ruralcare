package com.ruralcare.ruralcare.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class HealthcareCenter {

    @Id
    private int id;

    private String name;
    private String type;
    private String village;
    private String phone;

    public HealthcareCenter() {}

    public HealthcareCenter(int id, String name, String type,
                            String village, String phone) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.village = village;
        this.phone = phone;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}