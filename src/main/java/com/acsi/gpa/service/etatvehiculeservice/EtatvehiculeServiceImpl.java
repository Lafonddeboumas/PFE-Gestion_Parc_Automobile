package com.acsi.gpa.service.etatvehiculeservice;

import com.acsi.gpa.dto.etatvehiculedto.EtatvehiculeRequest;
import com.acsi.gpa.dto.etatvehiculedto.EtatvehiculeResponse;
import com.acsi.gpa.entities.EtatVehicule;
import com.acsi.gpa.mapper.EtatVehiculeMapper;
import com.acsi.gpa.repository.EtatVehiculeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EtatvehiculeServiceImpl implements EtatvehiculeService {

    private EtatVehiculeRepository etatVehiculeRepository;
    private EtatVehiculeMapper etatVehiculeMapper;
    
    @Override
    public EtatvehiculeResponse saveEtatEvhicule(EtatvehiculeRequest etatvehiculeRequest) {
        EtatVehicule etatVehicule = etatVehiculeMapper.etatVehiculeRequestDtoToEtatVehicule(etatvehiculeRequest);
        EtatVehicule saveEtatvehicule = etatVehiculeRepository.save(etatVehicule);
        return etatVehiculeMapper.etatVehiculeToEtatVehiculeResonseDto(saveEtatvehicule);
    }
}
