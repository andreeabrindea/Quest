package com.questions.questions.services;

import com.questions.questions.models.Reward;
import com.questions.questions.repositories.RewardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RewardService {
    private final RewardRepository rewardRepository;

    @Autowired
    public RewardService(RewardRepository rewardRepository) {
        this.rewardRepository = rewardRepository;
    }

    public void addNewReward(Reward reward){
        rewardRepository.save(reward);
    }
    public List<Reward> getRewards(){
        return rewardRepository.findAll();}
}

