package com.student.student_management.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long studentId;

    @Getter
    @Setter
    private String studentName;

    @Getter
    @Setter
    private String studentEmail;

    @Getter
    @Setter
    private String studentCourse;

    @Getter
    @Setter
    private Double studentFees;

    @Getter
    @Setter
    private boolean deleted = false;
}
