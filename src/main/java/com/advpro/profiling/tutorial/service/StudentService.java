package com.advpro.profiling.tutorial.service;

import com.advpro.profiling.tutorial.dto.StudentCourseSummary;
import com.advpro.profiling.tutorial.model.Student;
import com.advpro.profiling.tutorial.repository.StudentCourseRepository;
import com.advpro.profiling.tutorial.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.StringJoiner;

/**
 * @author muhammad.khadafi
 */
@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentCourseRepository studentCourseRepository;

    @Transactional(readOnly = true)
    public String getAllStudentsWithCourses() {
        List<StudentCourseSummary> studentCourses = studentCourseRepository.findAllStudentCourseSummaries();
        StringBuilder result = new StringBuilder(studentCourses.size() * 80);

        result.append("[");
        for (int i = 0; i < studentCourses.size(); i++) {
            StudentCourseSummary studentCourse = studentCourses.get(i);
            if (i > 0) {
                result.append(", ");
            }
            result.append("StudentCourse{, student=")
                    .append(studentCourse.studentName())
                    .append(", course=")
                    .append(studentCourse.courseName())
                    .append("}\n");
        }
        result.append("]");

        return result.toString();
    }

    public Optional<Student> findStudentWithHighestGpa() {
        return studentRepository.findTopByOrderByGpaDesc();
    }

    public String joinStudentNames() {
        StringJoiner joinedNames = new StringJoiner(", ");
        for (String studentName : studentRepository.findAllNames()) {
            joinedNames.add(studentName);
        }
        return joinedNames.toString();
    }
}

