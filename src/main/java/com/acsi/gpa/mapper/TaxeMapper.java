package com.acsi.gpa.mapper;

import com.acsi.gpa.dto.taxedto.TaxeRequest;
import com.acsi.gpa.dto.taxedto.TaxeResponse;
import com.acsi.gpa.entities.Taxe;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface TaxeMapper {

    //Mapping entité  vers Dto
    TaxeResponse TaxeToTaxeResponseDto(Taxe taxe);

    //Mapping Dto vers entités
    Taxe TaxeRequestDtoToTaxe(TaxeRequest taxeRequest);

}
