package com.pro.TeacherDashboard.service;

import com.pro.TeacherDashboard.model.Enquiry;
import com.pro.TeacherDashboard.repository.EnquiryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EnquiryService {

    @Autowired
    private EnquiryRepository enquiryRepository;

    public Enquiry createEnquiry(Enquiry enquiry) {
        return enquiryRepository.save(enquiry);
    }

    public List<Enquiry> getFilteredEnquiries(String teachingMode, String subject, String className) {
        if (teachingMode != null && teachingMode.equalsIgnoreCase("All")) {
            teachingMode = null;
        }
        return enquiryRepository.findByFilters(teachingMode, subject, className);
    }
}
