package com.nycolas.promp.feedback.api;
import java.time.LocalDateTime;

public record FeedbackResponse(
		Long id,
		Long promptId,
		int rating,
		String userFeedbackMessage,
		String aiMessage,
        LocalDateTime createdAt
		
){}
