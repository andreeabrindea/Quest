package com.questions.questions.services;

import com.questions.questions.models.Badge;
import com.questions.questions.repositories.BadgeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BadgeService {
    private final BadgeRepository badgeRepository;

    @Autowired
    public BadgeService(BadgeRepository badgeRepository) {
        this.badgeRepository = badgeRepository;
    }

    public void addNewBadge(Badge badge){
        Optional<Badge> badgeByName = badgeRepository.findBadgeByName(badge.getName());
        if (badgeByName.isPresent()){
            throw new IllegalStateException("badge name taken");
        }
        badgeRepository.save(badge);

    }

}
