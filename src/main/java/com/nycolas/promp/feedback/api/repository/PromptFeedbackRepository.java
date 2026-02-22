package com.nycolas.promp.feedback.api.repository;
import com.nycolas.promp.feedback.api.entity.PromptFeedbackEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromptFeedbackRepository extends JpaRepository<PromptFeedbackEntity, Long> {
	List<PromptFeedbackEntity> findByPromptId(Long promptId);
}
