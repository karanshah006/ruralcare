package com.ruralcare.ruralcare.controller;

import com.ruralcare.ruralcare.model.Doctor;
import com.ruralcare.ruralcare.repository.DoctorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {

    private final DoctorRepository doctorRepository;

    public DoctorController(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    @GetMapping
    public List<Doctor> getDoctors() {
        return doctorRepository.findAll();
    }

    @PostMapping
    public Doctor addDoctor(@RequestBody Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    @GetMapping("/{id}")
    public Doctor getDoctor(@PathVariable int id) {
        return doctorRepository.findById(id).orElse(null);
    }
}