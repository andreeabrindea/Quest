package com.questions.questions.controllers;

import com.questions.questions.models.Reward;
import com.questions.questions.models.Submission;
import com.questions.questions.models.User;
import com.questions.questions.services.SubmissionService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SubmissionController {
    private final SubmissionService submissionService;

    public SubmissionController(SubmissionService submissionService) {
        this.submissionService = submissionService;
    }


    @RequestMapping("/submissions")
    public List<Submission> getSubmissions(){
        return submissionService.getSubmissions();
    }

    @PostMapping(value="/submission")
    public void registerSubmission(@RequestBody Submission submission){
        submissionService.addNewSubmission(submission);
    }
}
