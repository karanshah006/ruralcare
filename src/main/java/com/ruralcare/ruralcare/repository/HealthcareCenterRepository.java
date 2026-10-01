package com.ruralcare.ruralcare.repository;

import com.ruralcare.ruralcare.model.HealthcareCenter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HealthcareCenterRepository extends JpaRepository<HealthcareCenter, Integer> {
}