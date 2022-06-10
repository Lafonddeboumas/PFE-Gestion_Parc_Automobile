package com.acsi.gpa.mapper;

import com.acsi.gpa.dto.marquedto.MarqueRequest;
import com.acsi.gpa.dto.marquedto.MarqueResponse;
import com.acsi.gpa.entities.Marque;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface MarqueMapper {

    MarqueResponse marqueToMarqueResponseDto(MarqueResponse marqueResponse);

    Marque marqueRequestDtoToMarque(MarqueRequest marqueRequest);
}
