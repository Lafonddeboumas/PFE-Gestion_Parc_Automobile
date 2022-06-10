package com.acsi.gpa.mapper;

import com.acsi.gpa.dto.chauffeurmecaniciendto.ChauffeurMecanicienRequest;
import com.acsi.gpa.dto.chauffeurmecaniciendto.ChauffeurMecanicienResponse;
import com.acsi.gpa.entities.ChauffeurMecanicien;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface ChauffeurMecanicienMapper {

    //Mapping entité  vers Dto
    ChauffeurMecanicienResponse ChauffeurToChauffeurMecanicienDto(ChauffeurMecanicien chauffeurMecanicien);

    //Mapping Dto vers entité
    ChauffeurMecanicien ChauffeurMecanicienRequestToChauffeur(ChauffeurMecanicienRequest chauffeurMecanicienRequest);
}
