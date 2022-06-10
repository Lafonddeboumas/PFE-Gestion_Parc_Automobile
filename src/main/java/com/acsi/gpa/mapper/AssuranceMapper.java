package com.acsi.gpa.mapper;

import com.acsi.gpa.dto.assurancedto.AssuranceRequest;
import com.acsi.gpa.dto.assurancedto.AssuranceResponse;
import com.acsi.gpa.entities.Assurance;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface AssuranceMapper {

    //Mapping entité  vers Dto
    AssuranceResponse AssuranceToAssuranceResponseDto(Assurance assurance);

    //Mapping Dto vers entité
    Assurance AssuranceRequestDtoToAssurance(AssuranceRequest assuranceRequest);
}
