package com.acsi.gpa.service.chauffeurservice;

import com.acsi.gpa.dto.chauffeurmecaniciendto.ChauffeurMecanicienRequest;
import com.acsi.gpa.dto.chauffeurmecaniciendto.ChauffeurMecanicienResponse;

import java.util.List;

public interface ChauffeurMecanicienService {

    ChauffeurMecanicienResponse saveChauffeur(ChauffeurMecanicienRequest chauffeurMecanicienRequest);

    ChauffeurMecanicienResponse updateChauffeur(ChauffeurMecanicienRequest chauffeurMecanicienRequest);

    ChauffeurMecanicienResponse findChauffeurById(Long id);

    List<ChauffeurMecanicienResponse> listChauffeurMecanicien();

    void deleteChauffeur(Long id);
}
