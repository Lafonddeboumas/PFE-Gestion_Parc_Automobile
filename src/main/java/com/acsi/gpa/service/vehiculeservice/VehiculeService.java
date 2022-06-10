package com.acsi.gpa.service.vehiculeservice;

import com.acsi.gpa.dto.vehiculedto.VehiculeRequest;
import com.acsi.gpa.dto.vehiculedto.VehiculeResponse;

import java.util.List;

public interface VehiculeService {

    VehiculeResponse  saveVehicule(VehiculeRequest vehiculeRequest);

    VehiculeResponse updateVehicule(VehiculeRequest  vehiculeRequest);

    VehiculeResponse findVehiculeById(Long id);

    List<VehiculeResponse> listvehicule();

    void deleteVehicule(Long id);
}
