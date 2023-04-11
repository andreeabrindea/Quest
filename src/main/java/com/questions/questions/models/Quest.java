package com.questions.questions.models;

import jakarta.persistence.*;

@Entity
@Table
public class Quest {
    @Id
    @SequenceGenerator(
            name = "quest_sequence",
            sequenceName="quest_sequence",
            allocationSize=1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "quest_sequence"
    )
    private int questId;
    private String title;
    private String description;
    private int creatorId;
    private int fee;

    public Quest() {
    }

    public Quest(int questId, String title, String description, int creatorId, int fee) {
        this.questId = questId;
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
