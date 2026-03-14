package com.student.student_management.Controller;

import com.student.student_management.Service.StudentService;
import com.student.student_management.dto.StudentDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public StudentDTO addStudent(@RequestBody StudentDTO dto) {
        return studentService.addStudent(dto);
    }

    @GetMapping
    public List<StudentDTO> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public StudentDTO getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    @PutMapping("/{id}")
    public StudentDTO updateStudent(@PathVariable Long id, @RequestBody StudentDTO dto) {
        dto.setStudentId(id);
        return studentService.updateStudent(dto);
    }

    @PutMapping("/{id}/soft-delete")
    public void softDeleteStudent(@PathVariable Long id) {
        studentService.softDeleteStudent(id);
    }
}
