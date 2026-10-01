package com.ruralcare.ruralcare.repository;

import com.ruralcare.ruralcare.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}