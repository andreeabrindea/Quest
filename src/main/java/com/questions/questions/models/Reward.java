package com.questions.questions.models;

import jakarta.persistence.*;

@Entity
@Table
public class Reward {
    @Id
    @SequenceGenerator(
            name = "reward_sequence",
            sequenceName="reward_sequence",
            allocationSize=1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "reward_sequence"
    )
    private int rewardId;
    private int userId;
    private int badgeId;
    private int questId;

    public Reward() {
    }

    public Reward(int rewardId, int userId, int badgeId, int questId) {
        this.rewardId = rewardId;
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
