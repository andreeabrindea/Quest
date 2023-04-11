package com.questions.questions.controllers;

import com.questions.questions.models.Reward;
import com.questions.questions.services.RewardService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RewardController {
    private final RewardService rewardService;

    public RewardController(RewardService rewardService) {
        this.rewardService = rewardService;
    }

    @RequestMapping("/rewards")
    public List<Reward> getRewards(){
        return rewardService.getRewards();
    }
}
