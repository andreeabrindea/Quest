package com.questions.questions.models;

import jakarta.persistence.*;

@Entity
@Table(name = "rewards")
public class Reward {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="rewardId")
    private int rewardId;
    @Column(name="userId")
    private int userId;
    @Column(name = "badgeId")
    private int badgeId;
    @Column(name="questId")
    private int questId;

    public Reward() {
    }

    public Reward(int userId, int badgeId, int questId) {
        this.userId = userId;
        this.badgeId = badgeId;
        this.questId = questId;
    }

    public int getRewardId() {
        return rewardId;
    }

    public void setRewardId(int rewardId) {
        this.rewardId = rewardId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getBadgeId() {
        return badgeId;
    }

    public void setBadgeId(int badgeId) {
        this.badgeId = badgeId;
    }

    public int getQuestId() {
        return questId;
    }

    public void setQuestId(int questId) {
        this.questId = questId;
    }

    @Override
    public String toString() {
        return "Reward{" +
                "rewardId=" + rewardId +
                ", userId=" + userId +
                ", badgeId=" + badgeId +
                ", questId=" + questId +
                '}';
    }
}
