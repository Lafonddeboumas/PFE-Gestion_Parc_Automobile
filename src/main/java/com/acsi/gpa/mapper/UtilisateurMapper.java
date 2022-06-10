package com.acsi.gpa.mapper;

import com.acsi.gpa.dto.utilisateurdto.UtilisateurRequest;
import com.acsi.gpa.dto.utilisateurdto.UtilisateurResponse;
import com.acsi.gpa.entities.Utilisateur;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface UtilisateurMapper {

    //Mapping entité  vers Dto
    UtilisateurResponse UtilisateurToUtilisateurResponseDto(Utilisateur utilisateur);

    //Mapping Dto vers entités
    Utilisateur UtilisateurRequestDtoToUtilisateur(UtilisateurRequest utilisateurRequest);
}
