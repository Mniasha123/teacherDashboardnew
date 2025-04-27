package com.pro.TeacherDashboard.repository;

import com.pro.TeacherDashboard.model.Enquiry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface EnquiryRepository extends JpaRepository<Enquiry, Long> {
    List<Enquiry> findByTeachingMode(String teachingMode);
    List<Enquiry> findBySubject(String subject);
    List<Enquiry> findByClassName(String className);
    
    @Query("SELECT e FROM Enquiry e WHERE " +
           "(:teachingMode IS NULL OR e.teachingMode = :teachingMode) AND " +
           "(:subject IS NULL OR e.subject = :subject) AND " +
           "(:className IS NULL OR e.className = :className)")
    List<Enquiry> findByFilters(String teachingMode, String subject, String className);
}
