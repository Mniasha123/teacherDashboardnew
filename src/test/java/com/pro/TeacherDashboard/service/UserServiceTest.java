package com.pro.TeacherDashboard.service;

import com.pro.TeacherDashboard.model.User;
import com.pro.TeacherDashboard.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @Test
    void createTeacher_Success() {
        // Arrange
        User teacher = new User();
        teacher.setFirstname("John");
        teacher.setLastname("Doe");
        teacher.setEmail("john@example.com");
        teacher.setTeachingMode("Online");
        teacher.setSubjects(Arrays.asList("Math", "Physics"));
        teacher.setClasses(Arrays.asList("10th", "12th"));

        when(userRepository.save(any(User.class))).thenReturn(teacher);

        // Act
        User createdTeacher = userService.createTeacher(teacher);

        // Assert
        assertNotNull(createdTeacher);
        assertEquals("John", createdTeacher.getFirstname());
        assertEquals("Doe", createdTeacher.getLastname());
    }
}