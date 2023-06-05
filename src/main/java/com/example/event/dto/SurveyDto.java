package com.example.event.dto;

import com.example.event.entity.Survey;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class SurveyDto {

    private String name;
    private String phoneNumber;
    private String gender;
    private String product;
    private String source;
    private String ageRange;

    private static Survey save(SurveyDto surveyDto) {

        return Survey.builder()
                .name(surveyDto.name)
                .build();
    }
}
