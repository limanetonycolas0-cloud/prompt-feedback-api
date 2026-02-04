package com.nycolas.promp.feedback.api.controller;

import com.nycolas.promp.feedback.api.entity.PromptFeedbackEntity;
import com.nycolas.promp.feedback.api.repository.PromptFeedbackRepository;
import com.nycolas.promp.feedback.api.service.PromptFeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



//endpoints, API
@RestController
@RequestMapping("/prompts")//map URL address 
public class PromptFeedbackController {
    private final PromptFeedbackService service;

    @Autowired
    private  PromptFeedbackRepository repository;

    public PromptFeedbackController(PromptFeedbackService service, PromptFeedbackRepository repository){
        this.service = service;
        this.repository = repository;
    }
    
    @GetMapping//map http GET requests
    public String testHello(){
    	return"Hello";
    }
    
    @RequestMapping("/testejson")
    public int displayRating(PromptFeedbackEntity promptFeedbackEntity) {
    	return promptFeedbackEntity.getRating();
    }
    
    @RequestMapping("/error")
    public String errorPage() {
    	return "OOPS... Deu erro";
    }
    
    public <T> ResponseEntity saveFeedback(){
    	
    }
    
 
}