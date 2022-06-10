package com.acsi.gpa.mapper;

import com.acsi.gpa.dto.pannedto.PanneRequest;
import com.acsi.gpa.dto.pannedto.PanneResponse;
import com.acsi.gpa.entities.Panne;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface PanneMapper {

    //Mapping entité  vers Dto
    PanneResponse PanneToPanneResponseDto(Panne panne);

    //Mapping Dto vers entités
    Panne PanneRequestDtoToPanne(PanneRequest panneRequest);
}
