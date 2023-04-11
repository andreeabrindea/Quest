package com.questions.questions.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "submissions")
public class Submission {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="submissionId")
    private int submissionId;
    @Column(name = "userId")
    private int userId;
    @Column(name="questId")
    private int questId;
    @Column(name="details")
    private String details;
    @Column(name="time")
    private LocalDate time;

    public Submission() {
    }

    public Submission(int userId, int questId, String details, LocalDate time) {
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
