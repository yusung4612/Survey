package com.example.event.controller;

import com.example.event.dto.SurveyDto;
import com.example.event.entity.Survey;
import com.example.event.repository.SurveyRepository;
import com.example.event.service.SurveyService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class SurveyController {
    private final SurveyRepository surveyRepository;

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("surveyDto", new SurveyDto());
        return "redirect: survey.html";
    }

    @PostMapping("/submit")
    public String surveySubmit(@ModelAttribute SurveyDto survey) {

        Survey survey1 = Survey.builder()
                .name(survey.getName())
                .phoneNumber(survey.getPhoneNumber())
                .product(survey.getProduct())
                .gender(survey.getGender())
                .source(survey.getSource())
                .ageRange(survey.getAgeRange())
                .build();

        surveyRepository.save(survey1);
        return "redirect: survey.html";
    }

//    @PostMapping("/register")
//    public String processForm(SurveyDto surveyDto) {
//        surveyService.registerSurvey(surveyDto);
//        return "redirect:/survey.html/";
//    }
//
//    @GetMapping("/success")
//    public String showSuccessPage() {
//        return "survey.html";
//    }
}
