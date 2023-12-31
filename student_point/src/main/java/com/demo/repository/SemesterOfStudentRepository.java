package com.demo.repository;

import com.demo.model.SemesterOfStudent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SemesterOfStudentRepository extends JpaRepository<SemesterOfStudent, String> {
    Optional<SemesterOfStudent> findByStudent_StudentCodeAndSemester_Name(String studentCode, String semesterName);
    Optional<List<SemesterOfStudent>> findByStudent_StudentCodeOrderBySemester_yearAscSemester_name(String studentCode);
}
