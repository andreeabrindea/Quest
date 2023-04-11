package com.questions.questions.controllers;

import com.questions.questions.models.User;
import com.questions.questions.models.Vote;
import com.questions.questions.services.VoteService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VoteController {
    private final VoteService voteService;

    public VoteController(VoteService voteService) {
        this.voteService = voteService;
    }


    @RequestMapping("/votes")
    public List<Vote> getVotes(){
        return voteService.getVotes();
    }
}
