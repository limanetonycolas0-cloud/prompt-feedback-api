package com.nycolas.promp.feedback.api.entity;
import java.time.LocalDateTime;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_feedbacks")
public class PromptFeedbackEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private long promptId;

    @Column(nullable = false)
    private int rating = 10;
    
    @Column(nullable = false, columnDefinition = "TEXT")
    private String userFeedbackMessage;
    
    @Column(nullable = false, columnDefinition = "TEXT")
    private String aiMessage;
    
    @Column(nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now();
    

    public PromptFeedbackEntity(){
    }

    public PromptFeedbackEntity(Long id, Long promptId, int rating, String userFeedbackMessage,String aiMessage, LocalDateTime createdAt){
        this.id = id;
        this.promptId = promptId;
        this.rating = rating;
        this.userFeedbackMessage = userFeedbackMessage;
        this.aiMessage = aiMessage;
        this.createdAt = createdAt;
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
    
    public String getUserFeedbackMessage() {
    	return userFeedbackMessage;
    }
    
    public void setUserFeedbackMessage(String userFeedbackMessage) {
    	this.userFeedbackMessage = userFeedbackMessage;
    }
    
    public String getAiMessage() {
    	return aiMessage;
    }
    
    public void setAiMessage(String aiMessage) {
    	this.aiMessage = aiMessage;
    }
    
    public LocalDateTime getCreatedAt() {
    	return createdAt;
    }
    
    public void setCreatedAt(LocalDateTime createdAt) {
    	this.createdAt = createdAt;
    }
}
