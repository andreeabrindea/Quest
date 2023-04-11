package com.questions.questions.controllers;

import com.questions.questions.models.Reward;
import com.questions.questions.models.Submission;
import com.questions.questions.models.User;
import com.questions.questions.services.SubmissionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SubmissionController {
    private final SubmissionService submissionService;

    public SubmissionController(SubmissionService submissionService) {
        this.submissionService = submissionService;
    }


    @RequestMapping("/submissions")
    @CrossOrigin(origins = "http://localhost:8080")
    public List<Submission> getSubmissions(){
        return submissionService.getSubmissions();
    }

    @PostMapping(value="/submission")
    @CrossOrigin(origins = "http://localhost:8080")
    public void registerSubmission(@RequestBody Submission submission){
        submissionService.addNewSubmission(submission);
    }
}
