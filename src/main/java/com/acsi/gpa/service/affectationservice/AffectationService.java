package com.acsi.gpa.service.affectationservice;

import com.acsi.gpa.dto.affectationdto.AffectationRequest;
import com.acsi.gpa.dto.affectationdto.AffectationResponse;
import com.acsi.gpa.entities.ChauffeurMecanicien;

import java.util.Date;
import java.util.List;

public interface AffectationService {

    AffectationResponse saveAffectation(AffectationRequest affectationRequest);

    AffectationResponse findAffectationById(Long id);

    AffectationResponse findByDateAffectation(Date dateAffectation);

    AffectationResponse findByChauffeur(ChauffeurMecanicien chauffeurMecanicien);

    AffectationResponse updateAffectation(AffectationRequest affectationRequest);

    List<AffectationResponse> listAffectation();

    void deleteAffectationById(Long id);
}
