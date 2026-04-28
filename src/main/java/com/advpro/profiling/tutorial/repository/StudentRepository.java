package com.advpro.profiling.tutorial.repository;

import com.advpro.profiling.tutorial.dto.StudentSummary;
import com.advpro.profiling.tutorial.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author muhammad.khadafi
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<StudentSummary> findFirstByOrderByGpaDesc();

    @Query(value = "select coalesce(string_agg(name, ', ' order by id), '') from students", nativeQuery = true)
    String findJoinedNames();
}
