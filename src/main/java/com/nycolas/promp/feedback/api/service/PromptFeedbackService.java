package com.nycolas.promp.feedback.api.service;
import com.nycolas.promp.feedback.api.entity.PromptFeedbackEntity;
import com.nycolas.promp.feedback.api.repository.PromptFeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //business logic
public class PromptFeedbackService {
    @Autowired
    private final PromptFeedbackRepository repository;


    public PromptFeedbackService(PromptFeedbackRepository repository){
        this.repository = repository;
    }

    public boolean isRatingValid(PromptFeedbackEntity promptFeedback){
        int rating = promptFeedback.getRating();
        return rating >=0 && rating <= 10; //return a rating in 0 to 10 range
    }

    public boolean isFeebackValid(PromptFeedbackEntity promptFeedback) {
    	String userFeedbackMessage = promptFeedback.getUserFeedBackMessage();
    	return userFeedbackMessage != null && !userFeedbackMessage.isBlank(); //return need to be different of null and blank
    	}
    
    public boolean feedbackExists = PromptFeedbackRepository.reposiexistsPromptIdAndUserId(promptId, userId);
    
}



    
    
    

