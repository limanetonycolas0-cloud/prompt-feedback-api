package com.nycolas.promp.feedback.api.controller;
import com.nycolas.promp.feedback.api.FeedbackRequest;
import com.nycolas.promp.feedback.api.entity.PromptFeedbackEntity;
import com.nycolas.promp.feedback.api.repository.PromptFeedbackRepository;
import com.nycolas.promp.feedback.api.service.PromptFeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



//endpoints, API
@RestController
@RequestMapping("/api")//map URL address 
public class PromptFeedbackController {
    private final PromptFeedbackService service;


        public PromptFeedbackController(PromptFeedbackService service){
            this.service = service;
        }

        // Usuário envia feedback
        @PostMapping("/feedbacks")
        public ResponseEntity<?> create(@RequestBody FeedbackRequest request){
            return ResponseEntity.ok(service.create(request));
        }

        // Somente admin pode acessar (protegido pelo filtro)
        @GetMapping("/admin/feedbacks")
        public ResponseEntity<?> getAll(){
            return ResponseEntity.ok(service.getAll());
        }
  

	}
    