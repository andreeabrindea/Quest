package com.questions.questions.services;

import com.questions.questions.models.Badge;
import com.questions.questions.models.Quest;
import com.questions.questions.models.Submission;
import com.questions.questions.repositories.QuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestService {
    private final QuestRepository questRepository;

    @Autowired
    public QuestService(QuestRepository questRepository) {
        this.questRepository = questRepository;
    }

    public void addNewQuest(Quest quest){
        questRepository.save(quest);

    }
    public List<Quest> getQuests(){
        return questRepository.findAll();}

    public Optional<Quest> getQuestById(int id){
        return questRepository.findById((long) id);
    }
}

