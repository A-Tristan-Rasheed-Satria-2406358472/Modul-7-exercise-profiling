package com.advpro.profiling.tutorial.controller;

import com.advpro.profiling.tutorial.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author muhammad.khadafi
 */

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/all-student")
    public ResponseEntity<String> seedStudents() {
        return ResponseEntity.ok(studentService.getAllStudentsWithCourses());
    }
    @GetMapping("/highest-gpa")
    public ResponseEntity<String> highestGpa() {
        return ResponseEntity.ok(studentService.findStudentWithHighestGpa());
    }
    @GetMapping("/all-student-name")
    public ResponseEntity<String> allStudentName() {
        String joinedStudentNames = studentService.joinStudentNames();
        return ResponseEntity.ok(joinedStudentNames);
    }
}

