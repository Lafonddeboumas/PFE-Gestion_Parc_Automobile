package com.acsi.gpa.mapper;

import com.acsi.gpa.dto.affectationdto.AffectationRequest;
import com.acsi.gpa.dto.affectationdto.AffectationResponse;
import com.acsi.gpa.entities.Affectation;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface AffectationMapper {

    //Mapping entité  vers Dto
    AffectationResponse AffectationToAffectationResponseDto(Affectation affectation);

    //Mapping Dto vers entité
    Affectation AffectationRequestDtoToAffectation(AffectationRequest affectationRequest);
}
