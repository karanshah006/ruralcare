package com.ruralcare.ruralcare.controller;

import com.ruralcare.ruralcare.model.HealthRecord;
import com.ruralcare.ruralcare.repository.HealthRecordRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/health-records")
public class HealthRecordController {

    private final HealthRecordRepository healthRecordRepository;

    public HealthRecordController(HealthRecordRepository healthRecordRepository) {
        this.healthRecordRepository = healthRecordRepository;
    }

    @GetMapping
    public List<HealthRecord> getRecords() {
        return healthRecordRepository.findAll();
    }

    @PostMapping
    public HealthRecord addRecord(@RequestBody HealthRecord record) {
        return healthRecordRepository.save(record);
    }

    @GetMapping("/{id}")
    public HealthRecord getRecord(@PathVariable int id) {
        return healthRecordRepository.findById(id).orElse(null);
    }
}