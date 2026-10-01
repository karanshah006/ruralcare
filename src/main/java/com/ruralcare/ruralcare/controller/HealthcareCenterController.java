package com.ruralcare.ruralcare.controller;

import com.ruralcare.ruralcare.model.HealthcareCenter;
import com.ruralcare.ruralcare.repository.HealthcareCenterRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/healthcare-centers")
public class HealthcareCenterController {

    private final HealthcareCenterRepository healthcareCenterRepository;

    public HealthcareCenterController(HealthcareCenterRepository healthcareCenterRepository) {
        this.healthcareCenterRepository = healthcareCenterRepository;
    }

    @GetMapping
    public List<HealthcareCenter> getCenters() {
        return healthcareCenterRepository.findAll();
    }

    @PostMapping
    public HealthcareCenter addCenter(@RequestBody HealthcareCenter center) {
        return healthcareCenterRepository.save(center);
    }

    @GetMapping("/{id}")
    public HealthcareCenter getCenter(@PathVariable int id) {
        return healthcareCenterRepository.findById(id).orElse(null);
    }
}