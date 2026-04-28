package com.advpro.profiling.tutorial.repository;

import com.advpro.profiling.tutorial.dto.StudentCourseSummary;
import com.advpro.profiling.tutorial.model.StudentCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author muhammad.khadafi
 */
@Repository
public interface StudentCourseRepository extends JpaRepository<StudentCourse, Long> {
    @Query("""
            select new com.advpro.profiling.tutorial.dto.StudentCourseSummary(s.name, c.name)
            from StudentCourse sc
            join sc.student s
            join sc.course c
            order by sc.id
            """)
    List<StudentCourseSummary> findAllStudentCourseSummaries();
}
