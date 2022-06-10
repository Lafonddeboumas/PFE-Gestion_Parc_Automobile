package com.acsi.gpa.service.demandevehiculeservice;

import com.acsi.gpa.dto.demandevehiculedto.DemandeVehiculeRequest;
import com.acsi.gpa.dto.demandevehiculedto.DemandeVehiculeResponse;
import com.acsi.gpa.entities.DemandeVehicule;
import com.acsi.gpa.exceptions.EntityNotFoundException;
import com.acsi.gpa.exceptions.ErrorsCode;
import com.acsi.gpa.exceptions.InvalidEntityException;
import com.acsi.gpa.mapper.DemandeVehiculeMapper;
import com.acsi.gpa.repository.DemandeVehiculeRepository;
import com.acsi.gpa.validators.DemandeVehiculeValidator;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
@Transactional
@Slf4j
@AllArgsConstructor
public class DemandeVehiculeServiceImpl implements DemandeVehiculeService {

    private DemandeVehiculeRepository demandeVehiculeRepository;
    private DemandeVehiculeMapper demandeVehiculeMapper;

    @Override
    public DemandeVehiculeResponse saveDemandevehicule(DemandeVehiculeRequest demandeVehiculeRequest) {

        List<String> errors = DemandeVehiculeValidator.validate(demandeVehiculeRequest);
        if (!errors.isEmpty()){
            log.error("demande vehicule non valide",demandeVehiculeRequest);
            throw new InvalidEntityException("demande vehicule non valide", ErrorsCode.DEMANDEVEHICULE_NOT_VALID,errors);
        }
        DemandeVehicule demandeVehicule = demandeVehiculeMapper.DemandeVehiculeRequestToDemandeVehicule(demandeVehiculeRequest);
        DemandeVehicule saveDemandeVehicule =  demandeVehiculeRepository.save(demandeVehicule);
        return demandeVehiculeMapper.DemandeVehiculeToDemandeVehiculeDto(saveDemandeVehicule);
    }

    @Override
    public DemandeVehiculeResponse updateDemandeVehicule(DemandeVehiculeRequest demandeVehiculeRequest) {
        return null;
    }

    @Override
    public DemandeVehiculeResponse findDemandeVehiculeByID(Long id) {
        if(id == null){
            log.error("Affectation ID is null");
            return null;
        }
        DemandeVehicule demandeVehicule = demandeVehiculeRepository.findById(id).get();
        DemandeVehiculeResponse demandeVehiculeResponse = demandeVehiculeMapper.DemandeVehiculeToDemandeVehiculeDto(demandeVehicule);
        return Optional.of(demandeVehiculeResponse).orElseThrow( ()->
                new EntityNotFoundException(
                        "Aucune demande vehicule avec l'ID ="+id+"n'a pas été trouvé dans la BDD",
                        ErrorsCode.DEMANDEVEHICULE_NOT_FOUND
                )
        );
    }

    @Override
    public List<DemandeVehiculeResponse> listDemandeVehicule() {
        List<DemandeVehicule> demandeVehicules = demandeVehiculeRepository.findAll();
        List<DemandeVehiculeResponse> demandeVehiculeResponses =
                demandeVehicules.stream()
                        .map(cust->demandeVehiculeMapper.DemandeVehiculeToDemandeVehiculeDto(cust))
                        .collect(Collectors.toList());
        return demandeVehiculeResponses;
    }

    @Override
    public void deleteDemandeVehiculeById(Long id) {
        if(id == null){
            log.error("Affectation ID is null");
            return ;
        }
        demandeVehiculeRepository.deleteById(id);
    }
}
