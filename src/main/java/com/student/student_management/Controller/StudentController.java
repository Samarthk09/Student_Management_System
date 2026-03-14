package com.student.student_management.Controller;

import com.student.student_management.Entity.Student;
import com.student.student_management.Service.StudentService;
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
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student) {
        student.setStudentId(id);
        return studentService.updateStudent(student);
    }

    @PutMapping("/{id}/soft-delete")
    public void softDeleteStudent(@PathVariable Long id) {
        studentService.softDeleteStudent(id);
    }
}
