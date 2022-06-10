package com.acsi.gpa.service.demandevehiculeservice;

import com.acsi.gpa.dto.demandevehiculedto.DemandeVehiculeRequest;
import com.acsi.gpa.dto.demandevehiculedto.DemandeVehiculeResponse;

import java.util.List;

public interface DemandeVehiculeService {

    DemandeVehiculeResponse saveDemandevehicule(DemandeVehiculeRequest demandeVehiculeRequest);

    DemandeVehiculeResponse updateDemandeVehicule(DemandeVehiculeRequest demandeVehiculeRequest);

    DemandeVehiculeResponse findDemandeVehiculeByID(Long id);

    List<DemandeVehiculeResponse> listDemandeVehicule();

    void deleteDemandeVehiculeById(Long id);
}
