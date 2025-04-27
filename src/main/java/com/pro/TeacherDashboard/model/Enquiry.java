package com.pro.TeacherDashboard.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
@Table(name = "enquiries")
public class Enquiry {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "enquiry_id")
    private Long enquiryId;
    
    @NotBlank(message = "Name is required")
    @Column(name = "name")
    private String name;
    
    @NotBlank(message = "Mobile number is required")
    @Column(name = "mobile_number")
    private String mobileNumber;
    
    @NotBlank(message = "Subject is required")
    @Column(name = "subject")
    private String subject;
    
    @NotBlank(message = "Class name is required")
    @Column(name = "class_name")
    private String className;
    
    @NotBlank(message = "Teaching mode is required")
    @Column(name = "teaching_mode")
    private String teachingMode;
}




