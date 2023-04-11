package com.questions.questions.controllers;

import com.questions.questions.models.Reward;
import com.questions.questions.models.User;
import com.questions.questions.services.RewardService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RewardController {
    private final RewardService rewardService;

    public RewardController(RewardService rewardService) {
        this.rewardService = rewardService;
    }

    @RequestMapping("/rewards")
    @CrossOrigin(origins = "http://localhost:8080")
    public List<Reward> getRewards(){
        return rewardService.getRewards();
    }

    @PostMapping(value="/reward")
    @CrossOrigin(origins = "http://localhost:8080")
    public void registerReward(@RequestBody Reward reward){
        rewardService.addNewReward(reward);
    }
}
