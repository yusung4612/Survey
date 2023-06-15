//package com.example.event.controller;
//
//import com.example.event.dto.SurveyDto;
//import com.example.event.entity.Survey;
//import com.example.event.repository.SurveyRepository;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.ActiveProfiles;
//
//@SpringBootTest
//@ActiveProfiles("dev")
//class SurveyControllerTest {
//
//    @Autowired
//    SurveyRepository surveyRepository;
//
//    @Test
//    void test() {
//        SurveyDto surveyDto = new SurveyDto();
//        surveyDto.setName("안녕");
//
//        Survey test = Survey.builder()
//                .name(surveyDto.getName())
//                .build();
//
//        surveyRepository.save(test);
//
//    }
//
//}