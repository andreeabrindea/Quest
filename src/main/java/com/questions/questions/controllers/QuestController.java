package com.questions.questions.controllers;

import com.questions.questions.models.Quest;
import com.questions.questions.services.QuestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuestController {

    private final QuestService questService;

    public QuestController(QuestService questService) {
        this.questService = questService;
    }

    @RequestMapping("/quests")
    public List<Quest> getQuests(){
        return questService.getQuests();
    }
}
