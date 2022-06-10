package com.acsi.gpa.mapper;

import com.acsi.gpa.dto.typefournisseurservice.TypeFournisseurRequest;
import com.acsi.gpa.dto.typefournisseurservice.TypeFournisseurResponse;
import com.acsi.gpa.dto.typevehicule.TypeVehiculeRequest;
import com.acsi.gpa.dto.typevehicule.TypeVehiculeResponse;
import com.acsi.gpa.entities.TypeFournisseur;
import com.acsi.gpa.entities.TypeVehicule;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface TypeFournisseurMapper {

    //Mapping entité  vers Dto
    TypeFournisseurResponse TypeFournisseurToTypeFournisseurResponseDto(TypeFournisseur typeFournisseur);

    //Mapping Dto vers entité
    TypeFournisseur TypeFournisseurRequestDtoToTypeFournisseur(TypeFournisseurRequest typeFournisseurRequest);
}
