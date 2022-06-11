package com.acsi.gpa.mapper;

import com.acsi.gpa.dto.typefournisseurdto.TypeFournisseurRequest;
import com.acsi.gpa.dto.typefournisseurdto.TypeFournisseurResponse;
import com.acsi.gpa.entities.TypeFournisseur;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface TypeFournisseurMapper {

    //Mapping entité  vers Dto
    TypeFournisseurResponse TypeFournisseurToTypeFournisseurResponseDto(TypeFournisseur typeFournisseur);

    //Mapping Dto vers entité
    TypeFournisseur TypeFournisseurRequestDtoToTypeFournisseur(TypeFournisseurRequest typeFournisseurRequest);
}
