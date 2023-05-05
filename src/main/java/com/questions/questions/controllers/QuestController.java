package com.questions.questions.controllers;

import com.questions.questions.models.Quest;
import com.questions.questions.services.QuestService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuestController {

    private final QuestService questService;

    public QuestController(QuestService questService) {
        this.questService = questService;
    }

    @RequestMapping("/quests")
    @CrossOrigin(origins = "http://localhost:8080")
    public List<Quest> getQuests(){
        return questService.getQuests();
    }

    @PostMapping(value="/quest")
    @CrossOrigin(origins = "http://localhost:8080")
    public void registerQuest(@RequestBody Quest quest){
        questService.addNewQuest(quest);
    }
    @RequestMapping(value="/quest/{id}", method = RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:8080")
    public Object getQuestById(@PathVariable("id") int id){
        return questService.getQuestById(id);
    }
}
