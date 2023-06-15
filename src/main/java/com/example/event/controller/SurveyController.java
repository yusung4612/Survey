package com.example.event.controller;

import com.example.event.dto.SurveyDto;
import com.example.event.entity.Survey;
import com.example.event.exception.ErrorCode;
import com.example.event.repository.SurveyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class SurveyController {
    private final SurveyRepository surveyRepository;

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("surveyDto", new SurveyDto());
        return "survey";
    }

    @GetMapping("/surveys")
    public String getAllSurveys(Model model) {
        // 리포지토리에서 설문 데이터를 검색
        List<Survey> surveys = surveyRepository.findAll();
        // 설문 데이터를 모델에 추가
        model.addAttribute("survey", surveys);
        return "list";
    }

    @PostMapping("/submit")
    public String submitForm(@ModelAttribute SurveyDto surveyDto) throws Exception {

        if (null == surveyDto.getName() ||
                null == surveyDto.getPhoneNumber() ||
                null == surveyDto.getGender() ||
                null == surveyDto.getProduct() ||
                null == surveyDto.getSource() ||
                null == surveyDto.getAgeRange() ||
                !surveyDto.isPrivacyConsent() ||
                null == surveyDto.getEventSmsConsent()) {
            throw new Exception(ErrorCode.NOT_BLANK.getMessage());
        }

        Survey survey = new Survey();
        survey.setName(surveyDto.getName());
        survey.setPhoneNumber(surveyDto.getPhoneNumber());
        survey.setGender(surveyDto.getGender());
        survey.setProduct(surveyDto.getProduct());
        survey.setPrivacyConsent(surveyDto.isPrivacyConsent());
        survey.setEventSmsConsent(surveyDto.getEventSmsConsent());
        survey.setAgeRange(surveyDto.getAgeRange());
        survey.setSource(surveyDto.getSource());

        surveyRepository.save(survey);
        return "redirect:/";
    }
}
