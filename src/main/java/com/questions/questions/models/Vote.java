package com.questions.questions.models;

import jakarta.persistence.*;

@Entity
@Table(name = "votes")
public class Vote {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "voteId")
    private int voteId;
    @Column(name = "userId")
    private int userId;
    @Column(name = "submissionId")
    private int submissionId;
    @Column(name="details")
    private String details;

    public Vote() {
    }

    public Vote(int userId, int submissionId, String details) {
        this.userId = userId;
        this.submissionId = submissionId;
        this.details = details;
    }

    public int getVoteId() {
        return voteId;
    }

    public void setVoteId(int voteId) {
        this.voteId = voteId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getSubmissionId() {
        return submissionId;
    }

    public void setSubmissionId(int submissionId) {
        this.submissionId = submissionId;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Vote{" +
                "voteId=" + voteId +
                ", userId=" + userId +
                ", submissionId=" + submissionId +
                ", details='" + details + '\'' +
                '}';
    }
}
