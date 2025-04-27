package com.pro.TeacherDashboard.controller;

import com.pro.TeacherDashboard.model.Enquiry;
import com.pro.TeacherDashboard.service.EnquiryService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*") // Add this to allow cross-origin requests
public class EnquiryController {
    
    @Autowired
    private EnquiryService enquiryService;
    
    @PostMapping("/enquiries")
    public ResponseEntity<Enquiry> createEnquiry(@Valid @RequestBody Enquiry enquiry) {
        Enquiry savedEnquiry = enquiryService.createEnquiry(enquiry);
        return new ResponseEntity<>(savedEnquiry, HttpStatus.CREATED);
    }
    
    @GetMapping("/enquiries")
    public ResponseEntity<List<Enquiry>> getFilteredEnquiries(
            @RequestParam(required = false) String teachingMode,
            @RequestParam(required = false) String subject,
            @RequestParam(required = false) String className) {
        List<Enquiry> enquiries = enquiryService.getFilteredEnquiries(teachingMode, subject, className);
        return ResponseEntity.ok(enquiries);
    }
}


