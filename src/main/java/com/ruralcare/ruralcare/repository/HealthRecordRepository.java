package com.ruralcare.ruralcare.repository;

import com.ruralcare.ruralcare.model.HealthRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HealthRecordRepository extends JpaRepository<HealthRecord, Integer> {
}