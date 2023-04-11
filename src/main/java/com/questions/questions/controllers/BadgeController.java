package com.questions.questions.controllers;

import com.questions.questions.models.Badge;
import com.questions.questions.services.BadgeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BadgeController {
    private final BadgeService badgeService;

    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    @RequestMapping("/badges")
    public List<Badge> getBadges(){
        return badgeService.getBadges();
    }

    public void addBadge(Badge badge){
        badgeService.addNewBadge(badge);
    }

}
