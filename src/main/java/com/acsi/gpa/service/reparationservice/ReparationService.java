package com.acsi.gpa.service.reparationservice;

import com.acsi.gpa.dto.reparationdto.ReparationResponse;
import com.acsi.gpa.entities.Reparation;

import java.util.List;

public interface ReparationService {

    ReparationResponse saveReparation(ReparationResponse reparationResponse);

    ReparationResponse updateReparation(ReparationResponse reparationResponse);

    ReparationResponse findReparationById(Long id);

    List<ReparationResponse> listReparation();

    void deleteReparation(Long id);
}
