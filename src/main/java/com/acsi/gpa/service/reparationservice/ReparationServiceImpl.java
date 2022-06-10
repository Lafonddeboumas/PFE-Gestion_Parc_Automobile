package com.acsi.gpa.service.reparationservice;

import com.acsi.gpa.dto.reparationdto.ReparationResponse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ReparationServiceImpl implements ReparationService {
    @Override
    public ReparationResponse saveReparation(ReparationResponse reparationResponse) {
        return null;
    }

    @Override
    public ReparationResponse updateReparation(ReparationResponse reparationResponse) {
        return null;
    }

    @Override
    public ReparationResponse findReparationById(Long id) {
        return null;
    }

    @Override
    public List<ReparationResponse> listReparation() {
        return null;
    }

    @Override
    public void deleteReparation(Long id) {

    }
}
