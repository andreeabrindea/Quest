package com.questions.questions.services;

import com.questions.questions.models.User;
import com.questions.questions.models.Vote;
import com.questions.questions.repositories.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoteService {
    private final VoteRepository voteRepository;

    @Autowired
    public VoteService(VoteRepository voteRepository) {
        this.voteRepository = voteRepository;
    }
    public void addNewVote(Vote vote){
        voteRepository.save(vote);
    }
    public List<Vote> getVotes(){
        return voteRepository.findAll();}
}
