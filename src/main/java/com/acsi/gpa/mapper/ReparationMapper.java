package com.acsi.gpa.mapper;

import com.acsi.gpa.dto.reparationdto.ReparationRequest;
import com.acsi.gpa.dto.reparationdto.ReparationResponse;
import com.acsi.gpa.entities.Reparation;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface ReparationMapper {

    //Mapping entité  vers Dto
    ReparationResponse ReparationToReparationResponseDto(Reparation reparation);

    //Mapping Dto vers entités
    Reparation ReparationRequestDtoToReparation(ReparationRequest reparationRequest);
}
