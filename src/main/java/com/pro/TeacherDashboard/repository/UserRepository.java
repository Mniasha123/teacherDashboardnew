package com.pro.TeacherDashboard.repository;

import com.pro.TeacherDashboard.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
