package com.ruralcare.ruralcare.controller;

import com.ruralcare.ruralcare.model.AiRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ai")
public class AiController {

    @PostMapping("/ask")
    public String askAI(@RequestBody AiRequest request) {

        String message = request.getMessage().toLowerCase();

        if (message.contains("fever")) {
            return "For fever, stay hydrated and take adequate rest. If the fever is high or persistent, consult a doctor.";
        }

        if (message.contains("headache")) {
            return "For a mild headache, rest, drink enough water and avoid excessive screen time. Consult a doctor if it is severe or persistent.";
        }

        if (message.contains("cough")) {
            return "For cough, stay hydrated and rest. If you have difficulty breathing or the cough persists, consult a doctor.";
        }

        if (message.contains("cold")) {
            return "For a common cold, get adequate rest and drink plenty of fluids. Consult a doctor if symptoms become severe.";
        }

        return "I can provide basic health information. Please describe your symptoms clearly, or consult a qualified healthcare professional for medical advice.";
    }
}