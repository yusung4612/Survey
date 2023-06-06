package com.example.event.repository;

import com.example.event.dto.SurveyDto;
import com.example.event.entity.Survey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurveyRepository extends JpaRepository<Survey,Long> {
//public interface SurveyRepository extends CrudRepository<Survey,Long> {

}
