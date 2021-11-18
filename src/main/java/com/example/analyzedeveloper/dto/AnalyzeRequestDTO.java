package com.example.analyzedeveloper.dto;

import lombok.Data;

import java.util.Date;

@Data
public class AnalyzeRequestDTO {
    private String username;
    private String organization;
    private String repository;
    private Date startDate;
    private Date endDate;
}
