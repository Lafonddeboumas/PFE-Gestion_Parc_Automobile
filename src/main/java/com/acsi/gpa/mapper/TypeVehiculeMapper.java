package com.acsi.gpa.mapper;

import com.acsi.gpa.dto.accidentdto.AccidentRequest;
import com.acsi.gpa.dto.accidentdto.AccidentResponse;
import com.acsi.gpa.dto.typevehicule.TypeVehiculeRequest;
import com.acsi.gpa.dto.typevehicule.TypeVehiculeResponse;
import com.acsi.gpa.entities.Accident;
import com.acsi.gpa.entities.TypeVehicule;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface TypeVehiculeMapper {

    //Mapping entité  vers Dto
    TypeVehiculeResponse typeVehiculeToTypeVehiculeResponseDto(TypeVehicule typeVehicule);

    //Mapping Dto vers entité
    TypeVehicule typeVehiculeRequestDtoTotypeVehicule(TypeVehiculeRequest typeVehiculeRequest);
}
