package com.acsi.gpa.mapper;

import com.acsi.gpa.dto.entretiendto.EntretienRequest;
import com.acsi.gpa.dto.entretiendto.EntretienResponse;
import com.acsi.gpa.entities.Entretien;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface EntretienMapper {

    //Mapping entité  vers Dto
    EntretienResponse EntretienToEntretienresponseDto(Entretien entretien);

    //Mapping Dto vers entités
    Entretien EntretienRequestDtoToEntretien(EntretienRequest entretienRequest);

}
