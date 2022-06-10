package com.acsi.gpa.mapper;

import com.acsi.gpa.dto.directiondto.DirectionRequest;
import com.acsi.gpa.dto.directiondto.DirectionResponse;
import com.acsi.gpa.entities.Direction;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface DirectionMapper {
    //Mapping entité  vers Dto
    DirectionResponse DirectionToDirectionResponseDto(Direction direction);

    //Mapping Dto vers entité
    Direction DirectionRequestDtoToDirection(DirectionRequest directionRequest);

}
