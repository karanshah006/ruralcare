package com.ruralcare.ruralcare.controller;

import com.ruralcare.ruralcare.model.Appointment;
import com.ruralcare.ruralcare.repository.AppointmentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/appointments")
public class AppointmentController {

    private final AppointmentRepository appointmentRepository;

    public AppointmentController(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    @GetMapping
    public List<Appointment> getAppointments() {
        return appointmentRepository.findAll();
    }

    @PostMapping
    public Appointment addAppointment(@RequestBody Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @GetMapping("/{id}")
    public Appointment getAppointment(@PathVariable int id) {
        return appointmentRepository.findById(id).orElse(null);
    }
}