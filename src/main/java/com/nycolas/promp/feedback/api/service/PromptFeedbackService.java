package com.nycolas.promp.feedback.api.service;
import com.nycolas.promp.feedback.api.FeedbackRequest;
import com.nycolas.promp.feedback.api.FeedbackResponse;
import com.nycolas.promp.feedback.api.entity.PromptFeedbackEntity;
import com.nycolas.promp.feedback.api.repository.PromptFeedbackRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service //business logic
public class PromptFeedbackService {
    
    private final PromptFeedbackRepository repository;
    
    public PromptFeedbackService(PromptFeedbackRepository repository){
        this.repository = repository;
    }

    public FeedbackResponse create(FeedbackRequest request){

        if(request.rating() < 0 || request.rating() > 10){
            throw new IllegalArgumentException("Rating must be between 0 and 10");
        }

        if(request.userFeedbackMessage() == null || request.userFeedbackMessage().isBlank()){
            throw new IllegalArgumentException("Feedback message cannot be empty");
        }

        PromptFeedbackEntity feedback = new PromptFeedbackEntity();
        feedback.setPromptId(request.promptId());
        feedback.setRating(request.rating());
        feedback.setUserFeedbackMessage(request.userFeedbackMessage());
        feedback.setAiMessage(request.aiMessage());

        PromptFeedbackEntity saved = repository.save(feedback);

        return new FeedbackResponse(
                saved.getId(),
                saved.getPromptId(),
                saved.getRating(),
                saved.getUserFeedbackMessage(),
                saved.getAiMessage(),
                saved.getCreatedAt()
        );
    }

    public List<FeedbackResponse> getAll(){
        return repository.findAll()
                .stream()
                .map(f -> new FeedbackResponse(
                        f.getId(),
                        f.getPromptId(),
                        f.getRating(),
                        f.getUserFeedbackMessage(),
                        f.getAiMessage(),
                        f.getCreatedAt()
                ))
                .toList();
    }
  }
