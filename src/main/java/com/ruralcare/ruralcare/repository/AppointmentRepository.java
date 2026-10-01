package com.ruralcare.ruralcare.repository;

import com.ruralcare.ruralcare.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {
}