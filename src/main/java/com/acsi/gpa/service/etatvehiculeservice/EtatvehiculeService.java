package com.acsi.gpa.service.etatvehiculeservice;

import com.acsi.gpa.dto.etatvehiculedto.EtatvehiculeRequest;
import com.acsi.gpa.dto.etatvehiculedto.EtatvehiculeResponse;
import com.acsi.gpa.entities.EtatVehicule;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public interface EtatvehiculeService {

    EtatvehiculeResponse saveEtatEvhicule(EtatvehiculeRequest etatvehiculeRequest);

}
