package com.example.analyzedeveloper.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "code_analyze_report")
public class CodeAnalyzeReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //private StatisticsReport statisticsReport;
    @OneToMany(mappedBy = "bug_entity")
    private List<BugEntity> bugEntityList;



}
