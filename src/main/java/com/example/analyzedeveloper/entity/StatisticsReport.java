package com.example.analyzedeveloper.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "statistics_report")
@Setter
@Getter
@NoArgsConstructor
public class StatisticsReport {

    @Id
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "developerCommitDensity")
    private double developerCommitDensity;

    @Column(name = "pullRequestDensity")
    private double pullRequestDensity;

    @Column(name = "pullRequestCommitDensity")
    private double pullRequestCommitDensity;

    @Column(name = "conversationCount")
    private int conversationCount;

    @Column(name = "pullRequestCommitCommentCount")
    private int pullRequestCommitCommentCount;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StatisticsReport that = (StatisticsReport) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
