package com.acsi.gpa.web;

import com.acsi.gpa.dto.affectationdto.AffectationRequest;
import com.acsi.gpa.dto.affectationdto.AffectationResponse;
import com.acsi.gpa.entities.ChauffeurMecanicien;
import com.acsi.gpa.service.affectationservice.AffectationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@AllArgsConstructor
public class AffectationController implements AffectationApi {

    private AffectationService affectationService;

    @Override
    public AffectationResponse saveAffectation(AffectationRequest affectationRequest) {
        return affectationService.saveAffectation(affectationRequest);
    }

    @Override
    public AffectationResponse findAffectationById(Long id) {
        return affectationService.findAffectationById(id);
    }

    @Override
    public AffectationResponse findByDateAffectation(Date dateAffectation) {
        return affectationService.findByDateAffectation(dateAffectation);
    }

    @Override
    public AffectationResponse findByChauffeur(ChauffeurMecanicien chauffeurMecanicien) {
        return affectationService.findByChauffeur(chauffeurMecanicien);
    }

    @Override
    public AffectationResponse updateAffectation(AffectationRequest affectationRequest) {
        return null;
    }

    @Override
    public List<AffectationResponse> listAffectation() {
        return affectationService.listAffectation();
    }

    @Override
    public void deleteAffectationById(Long id) {
        affectationService.deleteAffectationById(id);
    }
}
