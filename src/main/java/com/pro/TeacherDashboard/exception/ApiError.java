package com.pro.TeacherDashboard.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiError {
    private int status;
    private String message;
}