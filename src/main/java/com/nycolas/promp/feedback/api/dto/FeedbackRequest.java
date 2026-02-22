package com.nycolas.promp.feedback.api.dto;

public record FeedbackRequest(
        Long promptId,
        int rating,
        String userFeedbackMessage,
        String aiMessage

){}
