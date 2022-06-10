package com.acsi.gpa.mapper;

import com.acsi.gpa.dto.vehiculedto.VehiculeRequest;
import com.acsi.gpa.dto.vehiculedto.VehiculeResponse;
import com.acsi.gpa.entities.Vehicule;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface VehiculeMapper {

    VehiculeResponse VehiculeToVehiculeResponseDto(Vehicule vehicule);

    Vehicule vehiculeRequestdtoTovehicule(VehiculeRequest vehiculeRequest);
}
