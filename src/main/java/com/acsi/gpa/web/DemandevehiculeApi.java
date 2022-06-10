package com.acsi.gpa.web;

import com.acsi.gpa.dto.demandevehiculedto.DemandeVehiculeRequest;
import com.acsi.gpa.dto.demandevehiculedto.DemandeVehiculeResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.acsi.gpa.utils.Constants.APP_ROOT;

public interface DemandevehiculeApi {

    @PostMapping(value = APP_ROOT+"/demandevehicule/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    DemandeVehiculeResponse saveDemandevehicule(@RequestBody DemandeVehiculeRequest demandeVehiculeRequest);

    DemandeVehiculeResponse updateDemandeVehicule(DemandeVehiculeRequest demandeVehiculeRequest);

    @GetMapping(value = APP_ROOT+"/demandevehicule/{iddemande}", produces = MediaType.APPLICATION_JSON_VALUE)
    DemandeVehiculeResponse findDemandeVehiculeByID(@PathVariable("iddemande") Long id);

    @GetMapping(value = APP_ROOT+"/demandevehicule/all", produces = MediaType.APPLICATION_JSON_VALUE)
    List<DemandeVehiculeResponse> listDemandeVehicule();

    @DeleteMapping(value = APP_ROOT+"/demandevehicule/delete/{iddemande}")
    void deleteDemandeVehiculeById(@PathVariable("iddemande") Long id);
}
