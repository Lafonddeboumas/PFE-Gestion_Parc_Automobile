package com.acsi.gpa.mapper;

import com.acsi.gpa.dto.etatvehiculedto.EtatvehiculeRequest;
import com.acsi.gpa.dto.etatvehiculedto.EtatvehiculeResponse;
import com.acsi.gpa.entities.EtatVehicule;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface EtatVehiculeMapper {

    EtatvehiculeResponse etatVehiculeToEtatVehiculeResonseDto(EtatVehicule etatVehicule);

    EtatVehicule etatVehiculeRequestDtoToEtatVehicule(EtatvehiculeRequest etatvehiculeRequest);
}
