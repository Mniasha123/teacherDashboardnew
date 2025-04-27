package com.pro.TeacherDashboard.controller;

import com.pro.TeacherDashboard.model.User;
import com.pro.TeacherDashboard.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TeacherController {
    
    @Autowired
    private UserService userService;
    
    @PostMapping("/teachers")
    public ResponseEntity<User> createTeacher(@RequestBody User user) {
        User createdTeacher = userService.createTeacher(user);
        return ResponseEntity.ok(createdTeacher);
    }
}
