package com.example.event.dto;

import com.example.event.entity.Survey;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
//    private String otherProduct;
    private String source;
    private String ageRange;
    private boolean privacyConsent;
    private String eventSmsConsent;

}
