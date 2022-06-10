package com.acsi.gpa.mapper;

import com.acsi.gpa.dto.pleincarburantdto.PleinCarburantRequest;
import com.acsi.gpa.dto.pleincarburantdto.PleinCarburantResponse;
import com.acsi.gpa.entities.PleinCarburant;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface PleinCarburantMapper {

    //Mapping entité  vers Dto
    PleinCarburantResponse PleincarburantToPleinCarburantDto(PleinCarburant pleinCarburant);

    //Mapping Dto vers entités
    PleinCarburant PleincarburantRequestDtoToPleincarburant(PleinCarburantRequest pleinCarburantRequest);
}
