package com.nycolas.promp.feedback.api;

public record FeedbackRequest (
	Long promptId,
	int rating,
	String userFeedbackMessage,
	String aiMessage						
) {}


