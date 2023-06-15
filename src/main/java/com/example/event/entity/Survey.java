package com.example.event.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.data.annotation.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
//public class Survey extends Timestamped {
public class Survey {

    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "phoneNumber", nullable = false, unique = true)
    private String phoneNumber;

    @Column(name = "gender", nullable = false)
    private String gender;

    @Column(name = "product", nullable = false)
    private String product;

//    @Column(name = "otherProduct")
//    private String otherProduct;

    @Column(name = "source", nullable = false)
    private String source;

    @Column(name = "ageRange", nullable = false)
    private String ageRange;

    @Column(name = "privacyConsent", nullable = false)
    private boolean privacyConsent;

    @Column(name = "eventSmsConsent", nullable = false)
    private String eventSmsConsent;
}
//    public Survey(String name, String phoneNumber, String gender, String product, String source,
//                  String ageRange, boolean privacyConsent, boolean eventSmsConsent) {
//        this.name = name;
//        this.phoneNumber = phoneNumber;
//        this.gender = gender;
//        this.product = product;
//        this.source = source;
//        this.ageRange = ageRange;
//        this.privacyConsent = privacyConsent;
//        this.eventSmsConsent = eventSmsConsent;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name){
//        this.name = name;
//    }
//
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//
//    public String getProduct() {
//        return product;
//    }
//
//    public void setProduct(String product) {
//        this.product = product;
//    }
//
//    public String getSource() {
//        return source;
//    }
//
//    public void setSource(String source) {
//        this.source = source;
//    }
//
//    public String getAgeRange() {
//        return ageRange;
//    }
//
//    public void setAgeRange(String ageRange) {
//        this.ageRange = ageRange;
//    }
//
//    public boolean isPrivacyConsent() {
//        return privacyConsent;
//    }
//
//    public void setPrivacyConsent(boolean privacyConsent) {
//        this.privacyConsent = privacyConsent;
//    }
//
//    public boolean isEventSmsConsent() {
//        return eventSmsConsent;
//    }
//
//    public void setEventSmsConsent(boolean eventSmsConsent) {
//        this.eventSmsConsent = eventSmsConsent;
//    }
