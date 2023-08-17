package com.demo.dto.request;

import lombok.Data;

import java.util.Date;

@Data
public class ScheduleReq {
    private String subjectCode;
    private String place;
    private String note;
    private Date startTime;
    private Date finishTime;
    private String lecturer;
    private String emailLecture;
}
