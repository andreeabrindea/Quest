package com.questions.questions.models;

import jakarta.persistence.*;

@Entity
@Table
public class Badge {
    @Id
    @SequenceGenerator(
            name = "badge_sequence",
            sequenceName="badge_sequence",
            allocationSize=1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "badge_sequence"
    )
    private int badgeId;

    private String name;
    private String description;
    private String imageUrl;

    public Badge() {
    }

    public Badge(int badgeId, String name, String description, String imageUrl) {
        this.badgeId = badgeId;
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    public int getBadgeId() {
        return badgeId;
    }

    public void setBadgeId(int badgeId) {
        this.badgeId = badgeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Badge{" +
                "badgeId=" + badgeId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
