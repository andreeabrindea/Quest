package com.questions.questions.models;

import jakarta.persistence.*;

@Entity
@Table(name = "quests")
public class Quest {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="questId")
    private int questId;
    @Column(name = "title")
    private String title;
    @Column(name="description")
    private String description;
    @Column(name="creator_id")
    private int creatorId;
    @Column(name="fee")
    private int fee;

    public Quest() {
    }

    public Quest(String title, String description, int creatorId, int fee) {
        this.title = title;
        this.description = description;
        this.creatorId = creatorId;
        this.fee = fee;
    }

    public int getQuestId() {
        return questId;
    }

    public void setQuestId(int questId) {
        this.questId = questId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(int creatorId) {
        this.creatorId = creatorId;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Quest{" +
                "questId=" + questId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", creatorId=" + creatorId +
                '}';
    }
}
