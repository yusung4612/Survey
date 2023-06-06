package com.example.event.controller;

import com.example.event.dto.SurveyDto;
import com.example.event.entity.Survey;
import com.example.event.repository.SurveyRepository;
import lombok.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class SurveyController {
    private final SurveyRepository surveyRepository;

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("surveyDto", new SurveyDto());
        return "surveyy.html";
    }

    @PostMapping("/submit")
        public String submitForm(@ModelAttribute SurveyDto surveyDto) {
        Survey survey = new Survey();
        survey.setName(surveyDto.getName());
        survey.setPhoneNumber(surveyDto.getPhoneNumber());
        survey.setGender(surveyDto.getGender());
        survey.setProduct(surveyDto.getProduct());
        survey.setPrivacyConsent(surveyDto.isPrivacyConsent());
        survey.setEventSmsConsent(surveyDto.isEventSmsConsent());
        survey.setAgeRange(surveyDto.getAgeRange());
        survey.setSource(surveyDto.getSource());

            surveyRepository.save(survey);
            return "redirect:/list.html";
        }
}
