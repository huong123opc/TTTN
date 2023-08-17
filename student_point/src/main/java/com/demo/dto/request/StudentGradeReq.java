package com.demo.dto.request;

import lombok.*;

import javax.validation.constraints.NotBlank;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StudentGradeReq {
    @NotBlank
    private String studentCode;
    @NotBlank
    private String subjectCode;
    @NotBlank
    private String semesterName;
    private double attendancePoint;
    private double testPoint;
    private double practicePoint;
    private double examPoint;
}
