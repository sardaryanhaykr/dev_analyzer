package com.example.analyzedeveloper.service;

import com.example.analyzedeveloper.dto.AnalyzeRequestDTO;
import com.example.analyzedeveloper.entity.AnalyzeReport;
import com.example.analyzedeveloper.entity.CodeAnalyzeReport;
import com.example.analyzedeveloper.entity.StatisticsReport;
import com.example.analyzedeveloper.repository.AnalyzeReportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class AnalyzeReportServiceImpl implements AnalyzeReportService {

    private final AnalyzeReportRepository analyzeReportRepository;
    private final RestTemplateBuilder restTemplateBuilder;

    @Override
    public AnalyzeReport collectData(AnalyzeRequestDTO analyzeRequest) {
        RestTemplate restTemplate = restTemplateBuilder.build();

        StatisticsReport statisticsReport = restTemplate.getForEntity("uri", StatisticsReport.class, analyzeRequest).getBody();
        CodeAnalyzeReport codeAnalyzerReport = restTemplate.getForEntity("uri", CodeAnalyzeReport.class, analyzeRequest).getBody();
        AnalyzeReport analyzeReport = new AnalyzeReport();
//create report----------------------------------------------
        return  analyzeReport;
    }
}
