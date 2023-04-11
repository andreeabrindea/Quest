package com.questions.questions.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Submission {
    @Id
    @SequenceGenerator(
            name = "submission_sequence",
            sequenceName="submission_sequence",
            allocationSize=1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "submission_sequence"
    )
    private int submissionId;
    private int userId;
    private int questId;
    private String details;
    private LocalDate time;

    public Submission() {
    }

    public Submission(int submissionId, int userId, int questId, String details, LocalDate time) {
        this.submissionId = submissionId;
        this.userId = userId;
        this.questId = questId;
        this.details = details;
        this.time = time;
    }

    public int getSubmissionId() {
        return submissionId;
    }

    public void setSubmissionId(int submissionId) {
        this.submissionId = submissionId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getQuestId() {
        return questId;
    }

    public void setQuestId(int questId) {
        this.questId = questId;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public LocalDate getTime() {
        return time;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Submission{" +
                "submissionId=" + submissionId +
                ", userId=" + userId +
                ", questId=" + questId +
                ", details='" + details + '\'' +
                ", time=" + time +
                '}';
    }
}
