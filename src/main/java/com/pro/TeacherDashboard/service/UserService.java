package com.pro.TeacherDashboard.service;

import com.pro.TeacherDashboard.model.User;
import com.pro.TeacherDashboard.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;
    
    public User createTeacher(User user) {
        return userRepository.save(user);
    }
}
