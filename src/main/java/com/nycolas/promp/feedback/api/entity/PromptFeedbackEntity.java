package com.nycolas.promp.feedback.api.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_feedbacks")
public class PromptFeedbackEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, updatable = false, unique = true, name = "prompt_id")
    private long promptId;

    @Column(nullable = false, updatable = false, unique = true, name = "prompt_rating")
    private int rating = 10;
    
    @Column(nullable = false, updatable = false, unique = true, name = "prompt_feedbackMessage")
    private String userFeedbackMessage;
    
    
    private String aiMessage;
    

    public PromptFeedbackEntity(){
    }

    public PromptFeedbackEntity(Long id, Long promptId, int rating, String userFeedbackMessage,String aiMessage){
        this.id = id;
        this.promptId = promptId;
        this.rating = rating;
        this.userFeedbackMessage = userFeedbackMessage;
        this.aiMessage = aiMessage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getPromptId() {
        return promptId;
    }

    public void setPromptId(long promptId) {
        this.promptId = promptId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
    
    public String getUserFeedBackMessage() {
    	return userFeedbackMessage;
    }
    
    public void setUserFeedBackMessage(String userFeedbackMessage) {
    	this.userFeedbackMessage = userFeedbackMessage;
    }
    
    public String getAiMessage() {
    	return aiMessage;
    }
    
    public void setAiMessage(String aiMessage) {
    	this.aiMessage = aiMessage;
    }
}
