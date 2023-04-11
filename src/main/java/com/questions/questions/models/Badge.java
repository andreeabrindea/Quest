package com.questions.questions.models;

import jakarta.persistence.*;

@Entity
@Table(name="badges")
public class Badge {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "badge_id")
    private int badgeId;

    @Column(name="name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "imageUrl")
    private String imageUrl;

    public Badge(String name, String description, String imageUrl) {
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    public Badge() {

    }

    public long getBadgeId() {
        return badgeId;
    }

    public void setBadgeId(int badgeId) {
        this.badgeId = badgeId;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Badge{" +
                "badgeId=" + badgeId +
                ", name='" + name +
                ", description='" + description +
                ", imageUrl='" + imageUrl+
                '}';
    }
}
