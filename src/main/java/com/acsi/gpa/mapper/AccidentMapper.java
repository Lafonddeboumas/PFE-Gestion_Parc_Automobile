package com.acsi.gpa.mapper;

import com.acsi.gpa.dto.accidentdto.AccidentRequest;
import com.acsi.gpa.dto.accidentdto.AccidentResponse;
import com.acsi.gpa.entities.Accident;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface AccidentMapper {

    //Mapping entité  vers Dto
    AccidentResponse AccidentToAccidentResponseDto(Accident accident);

    //Mapping Dto vers entité
    Accident AccidentRequestDtoToAccident(AccidentRequest accidentRequest);
}
