package com.questions.questions.models;

import jakarta.persistence.*;

@Entity
@Table
public class Vote {
    @Id
    @SequenceGenerator(
            name = "vote_sequence",
            sequenceName="vote_sequence",
            allocationSize=1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "vote_sequence"
    )
    private int voteId;
    private int userId;
    private int submissionId;
    private String details;

    public Vote() {
    }

    public Vote(int voteId, int userId, int submissionId, String details) {
        this.voteId = voteId;
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
