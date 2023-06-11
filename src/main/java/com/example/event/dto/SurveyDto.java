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
    private String eventSmsConsent;

}
