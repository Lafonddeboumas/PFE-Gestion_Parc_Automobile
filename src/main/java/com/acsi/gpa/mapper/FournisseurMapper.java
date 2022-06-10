package com.acsi.gpa.mapper;

import com.acsi.gpa.dto.fournisseurdto.FournisseurRequest;
import com.acsi.gpa.dto.fournisseurdto.FournisseurResponse;
import com.acsi.gpa.entities.Fournisseur;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface FournisseurMapper {

    //Mapping entité  vers Dto
    FournisseurResponse FournisseurToFournisseurResponseDto(Fournisseur fournisseur);

    //Mapping Dto vers entités
    Fournisseur FournisseurRequestDtoToFournisseur(FournisseurRequest fournisseurRequest);
}
