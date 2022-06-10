package com.acsi.gpa.web;

import com.acsi.gpa.dto.demandevehiculedto.DemandeVehiculeRequest;
import com.acsi.gpa.dto.demandevehiculedto.DemandeVehiculeResponse;
import com.acsi.gpa.service.demandevehiculeservice.DemandeVehiculeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class DemandevehiculeController implements DemandevehiculeApi {

    private DemandeVehiculeService demandeVehiculeService;

    @Override
    public DemandeVehiculeResponse saveDemandevehicule(DemandeVehiculeRequest demandeVehiculeRequest) {
        return demandeVehiculeService.saveDemandevehicule(demandeVehiculeRequest);
    }

    @Override
    public DemandeVehiculeResponse updateDemandeVehicule(DemandeVehiculeRequest demandeVehiculeRequest) {
        return null;
    }

    @Override
    public DemandeVehiculeResponse findDemandeVehiculeByID(Long id) {
        return demandeVehiculeService.findDemandeVehiculeByID(id);
    }

    @Override
    public List<DemandeVehiculeResponse> listDemandeVehicule() {
        return demandeVehiculeService.listDemandeVehicule();
    }

    @Override
    public void deleteDemandeVehiculeById(Long id) {
        demandeVehiculeService.deleteDemandeVehiculeById(id);
    }
}
