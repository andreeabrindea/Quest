package com.questions.questions.controllers;

import com.questions.questions.models.User;
import com.questions.questions.models.Vote;
import com.questions.questions.services.VoteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VoteController {
    private final VoteService voteService;

    public VoteController(VoteService voteService) {
        this.voteService = voteService;
    }


    @RequestMapping("/votes")
    @CrossOrigin(origins = "http://localhost:8080")
    public List<Vote> getVotes(){
        return voteService.getVotes();
    }
    @PostMapping(value="/vote")
    @CrossOrigin(origins = "http://localhost:8080")
    public void registerVote(@RequestBody Vote vote){
        voteService.addNewVote(vote);
    }
}
