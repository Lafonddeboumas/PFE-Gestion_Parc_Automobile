package com.acsi.gpa.mapper;

import com.acsi.gpa.dto.demandevehiculedto.DemandeVehiculeRequest;
import com.acsi.gpa.dto.demandevehiculedto.DemandeVehiculeResponse;
import com.acsi.gpa.entities.DemandeVehicule;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface DemandeVehiculeMapper {

    //Mapping entité  vers Dto
    DemandeVehiculeResponse DemandeVehiculeToDemandeVehiculeDto(DemandeVehicule demandeVehicule);

    //Mapping Dto vers entité
    DemandeVehicule DemandeVehiculeRequestToDemandeVehicule(DemandeVehiculeRequest demandeVehiculeRequest);

}
