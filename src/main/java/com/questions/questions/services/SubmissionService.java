package com.questions.questions.services;

import com.questions.questions.models.Reward;
import com.questions.questions.models.Submission;
import com.questions.questions.repositories.SubmissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubmissionService {
    private final SubmissionRepository submissionRepository;

    @Autowired
    public SubmissionService(SubmissionRepository submissionRepository) {
        this.submissionRepository = submissionRepository;
    }

    public void addNewSubmission(Submission submission){
        submissionRepository.save(submission);
    }
    public List<Submission> getSubmissions(){
        return submissionRepository.findAll();}
}

