package com.student.student_management.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {

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
}