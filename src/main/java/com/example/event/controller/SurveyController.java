package com.example.event.controller;

import com.example.event.dto.SurveyDto;
import com.example.event.entity.Survey;
import com.example.event.repository.SurveyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class SurveyController {
    private final SurveyRepository surveyRepository;

//    @GetMapping("/")
//    public String showForm(Model model) {
//        model.addAttribute("surveyDto", new SurveyDto());
//        return "redirect:survey.html";
//    }
@GetMapping("/")
public String showForm(@RequestParam(name = "continue", required = false) String continueUrl, Model model) {
    model.addAttribute("surveyDto", new SurveyDto());
    if (continueUrl != null) {
        model.addAttribute("continueUrl", continueUrl);
    }
    return "redirect:survey.html";
}

//    @PostMapping("/submit")
//    public String surveySubmit(@ModelAttribute SurveyDto survey) {
//
//        Survey survey1 = Survey.builder()
//                .name(survey.getName())
//                .phoneNumber(survey.getPhoneNumber())
//                .product(survey.getProduct())
//                .gender(survey.getGender())
//                .source(survey.getSource())
//                .ageRange(survey.getAgeRange())
//                .build();
//
//        surveyRepository.save(survey1);
//        return "redirect: survey.html";
//    }

    @PostMapping("/submit/{id}")
    public String surveySubmit(@ModelAttribute SurveyDto survey, @PathVariable Long id) {

        Survey surveyResult = Survey.builder()
                .name(survey.getName())
                .phoneNumber(survey.getPhoneNumber())
                .product(survey.getProduct())
                .gender(survey.getGender())
                .source(survey.getSource())
                .ageRange(survey.getAgeRange())
                .build();
        surveyRepository.save(surveyResult);
        return "redirect:" + id;
    }
}
