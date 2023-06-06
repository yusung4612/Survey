package com.example.event.service;

import com.example.event.dto.SurveyDto;
import com.example.event.entity.Survey;
import com.example.event.repository.SurveyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class SurveyService {
    private SurveyRepository surveyRepository;

    @Transactional
    public void surveySubmit(SurveyDto surveyDto) {
        Survey survey = new Survey();
        survey.setName(surveyDto.getName());
        survey.setPhoneNumber(surveyDto.getPhoneNumber());
        survey.setGender(surveyDto.getGender());
        survey.setProduct(surveyDto.getProduct());
        survey.setSource(surveyDto.getSource());
        survey.setAgeRange(surveyDto.getAgeRange());
        surveyRepository.save(survey);
    }

//    @Transactional
//    public ResponseDto<?> createNews(NewsRequestDto requestDto, HttpServletRequest request) {
//        if (requestDto.getMessage().isEmpty())
//            return ResponseDto.fail(ErrorCode.NOT_BLANK_NAME.name(), ErrorCode.NOT_BLANK_NAME.getMessage());
//
//        News news = News.builder()
//                .id(requestDto.getId())
//                .message(requestDto.getMessage())
//                .author(requestDto.getAuthor())
//                .end_date(endTime)
//                .choiceNews("false")
////                .admin(admin)
//                .build();
//        newsRepository.save(news);
//
//        return ResponseDto.success(
//                NewsResponseDto.builder()
//                        .id(requestDto.getId())
//                        .message(requestDto.getMessage())
//                        .author(requestDto.getAuthor())
////                        .end_date(endTime)
//                        .build());
//    }
}