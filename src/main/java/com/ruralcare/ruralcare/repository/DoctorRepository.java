package com.ruralcare.ruralcare.repository;

import com.ruralcare.ruralcare.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
}