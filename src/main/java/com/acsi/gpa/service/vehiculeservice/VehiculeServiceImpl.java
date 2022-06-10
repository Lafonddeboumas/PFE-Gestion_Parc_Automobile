package com.acsi.gpa.service.vehiculeservice;

import com.acsi.gpa.dto.vehiculedto.VehiculeRequest;
import com.acsi.gpa.dto.vehiculedto.VehiculeResponse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class VehiculeServiceImpl implements VehiculeService {

    @Override
    public VehiculeResponse saveVehicule(VehiculeRequest vehiculeRequest) {
        return null;
    }

    @Override
    public VehiculeResponse updateVehicule(VehiculeRequest vehiculeRequest) {
        return null;
    }

    @Override
    public VehiculeResponse findVehiculeById(Long id) {
        return null;
    }

    @Override
    public List<VehiculeResponse> listvehicule() {
        return null;
    }

    @Override
    public void deleteVehicule(Long id) {

    }
}
