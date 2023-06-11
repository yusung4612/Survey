package com.example.event.entity;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
//public class Survey extends Timestamped {
public class Survey {

//    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="phoneNumber")
    private String phoneNumber;

    @Column(name="gender")
    private String gender;

    @NotNull
    @Column(name="product")
    private String product;

    @Column(name="source")
    private String source;

    @Column(name="ageRange")
    private String ageRange;

    @Column(name="privacyConsent")
    private boolean privacyConsent;

    @Column(name="eventSmsConsent")
    private String eventSmsConsent;

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
//    public void setName(String name) {
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
}
