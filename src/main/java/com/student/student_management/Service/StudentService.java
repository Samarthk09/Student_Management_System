package com.student.student_management.Service;

import com.student.student_management.Entity.Student;
import com.student.student_management.Repo.StudentRepo;
import com.student.student_management.dto.StudentDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepo studentRepo;

    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public StudentDTO addStudent(StudentDTO dto) {
        Student student = convertToEntity(dto);
        Student savedStudent = studentRepo.save(student);
        return convertToDTO(savedStudent);
    }

    public List<StudentDTO> getAllStudents() {
        List<Student> students = studentRepo.findByDeletedFalse();
        return students.stream()
                .map(this::convertToDTO)
                .toList();
    }

    public StudentDTO getStudentById(Long id) {
        Student student = studentRepo.findById(id).orElseThrow();
        return convertToDTO(student);
    }

    public StudentDTO updateStudent(StudentDTO dto) {
        Student student = convertToEntity(dto);
        Student updatedStudent = studentRepo.save(student);
        return convertToDTO(updatedStudent);
    }

    public void softDeleteStudent(Long id) {
        Student student = studentRepo.findById(id).orElseThrow();
        student.setDeleted(true);
        studentRepo.save(student);
    }

    private StudentDTO convertToDTO(Student student) {
        StudentDTO dto = new StudentDTO();
        dto.setStudentId(student.getStudentId());
        dto.setStudentName(student.getStudentName());
        dto.setStudentEmail(student.getStudentEmail());
        dto.setStudentCourse(student.getStudentCourse());
        dto.setStudentFees(student.getStudentFees());
        return dto;
    }

    private Student convertToEntity(StudentDTO dto) {
        Student student = new Student();
        student.setStudentId(dto.getStudentId());
        student.setStudentName(dto.getStudentName());
        student.setStudentEmail(dto.getStudentEmail());
        student.setStudentCourse(dto.getStudentCourse());
        student.setStudentFees(dto.getStudentFees());
        return student;
    }
}
