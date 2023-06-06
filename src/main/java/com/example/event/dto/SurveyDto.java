package com.example.event.dto;

import com.example.event.entity.Survey;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SurveyDto {

    private Long id;
    private String name;
    private String phoneNumber;
    private String gender;
    private String product;
    private String source;
    private String ageRange;
    private boolean privacyConsent;
    private boolean eventSmsConsent;

//    private static Survey save(SurveyDto surveyDto) {
//
//        return Survey.builder()
//                .id(surveyDto.id)
//                .name(surveyDto.name)
//                .phoneNumber(surveyDto.phoneNumber)
//                .gender(surveyDto.gender)
//                .product(surveyDto.product)
//                .source(surveyDto.source)
//                .ageRange(surveyDto.ageRange)
//                .privacyConsent(surveyDto.privacyConsent)
//                .eventSmsConsent(surveyDto.eventSmsConsent)
//                .build();
//    }
}
