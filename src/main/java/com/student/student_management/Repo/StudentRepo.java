package com.student.student_management.Repo;

import com.student.student_management.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {
    List<Student> findByDeletedFalse();

    List<Student> findByStudentNameContainingIgnoreCaseAndDeletedFalse(String name);
}
