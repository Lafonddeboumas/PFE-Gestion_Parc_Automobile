package com.acsi.gpa.service.assuranceservice;

import com.acsi.gpa.dto.affectationdto.AffectationResponse;
import com.acsi.gpa.dto.assurancedto.AssuranceRequest;
import com.acsi.gpa.dto.assurancedto.AssuranceResponse;
import com.acsi.gpa.entities.Affectation;
import com.acsi.gpa.entities.Assurance;
import com.acsi.gpa.entities.Vehicule;
import com.acsi.gpa.exceptions.EntityNotFoundException;
import com.acsi.gpa.exceptions.ErrorsCode;
import com.acsi.gpa.exceptions.InvalidEntityException;
import com.acsi.gpa.mapper.AssuranceMapper;
import com.acsi.gpa.repository.AssuranceRepository;
import com.acsi.gpa.repository.VehiculeRepository;
import com.acsi.gpa.validators.AssuranceValidator;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
@Slf4j
@AllArgsConstructor
public class AssuranceServiceImpl implements AssuranceService  {

    private VehiculeRepository vehiculeRepository;
    private AssuranceRepository assuranceRepository;
    private AssuranceMapper assuranceMapper;

    @Override
    public AssuranceResponse saveAssurance(AssuranceRequest assuranceRequest) {

        //Vérification des données saisie avec les validators
        List<String> errors = AssuranceValidator.validate(assuranceRequest);
        if(!errors.isEmpty()){
            log.error("Assurance non valide", assuranceRequest);
            throw new InvalidEntityException("cette assurance n'est pas valide", ErrorsCode.ASSURANCE_NOT_VALID, errors);
        }

        //Vérification que le vehicule enregistré existe bien dans la base de données
        Optional<Vehicule> vehicule = vehiculeRepository.findById(assuranceRequest.getVehicule().getIdVehicule());
        if(vehicule.isEmpty()){
            log.warn("véhicule with ID {} was not found in the BDD ",assuranceRequest.getVehicule().getIdVehicule());
            throw new EntityNotFoundException("Aucun véhicule avec l'ID"+assuranceRequest.getVehicule().getIdVehicule() +"n'a ete trouvé dans la base de données",ErrorsCode.VEHICULE_NOT_FOUND);
        }

        //Enregistrement de l'assurance
        Assurance assurance = assuranceMapper.AssuranceRequestDtoToAssurance(assuranceRequest);
        Assurance saveAssurance = assuranceRepository.save(assurance);
        AssuranceResponse assuranceResponse = assuranceMapper.AssuranceToAssuranceResponseDto(saveAssurance);
        return assuranceResponse;
    }

    @Override
    public AssuranceResponse updateAssurance(AssuranceRequest assuranceRequest) {
        return null;
    }

    @Override
    public AssuranceResponse findAssranceWithId(Long id) {
        if(id == null){
            log.error("Affectation ID is null");
            return null;
        }
        Assurance assurance = assuranceRepository.findById(id).get();
        AssuranceResponse assuranceResponse = assuranceMapper.AssuranceToAssuranceResponseDto(assurance);
        return Optional.of(assuranceResponse).orElseThrow( ()->
                new EntityNotFoundException(
                        "Aucune assurance avec l'ID ="+id+"n'a pas été trouvé dans la BDD",
                        ErrorsCode.ASSURANCE_NOT_FOUND
                )
        );
    }

    @Override
    public AssuranceResponse findAssuranceByDateDebut(Date dateDebut) {
        if(dateDebut == null){
            log.error("date debut assurance null");
            return null;
        }
        Assurance assurance = assuranceRepository.findAssuranceByDateDebut(dateDebut).get();
        AssuranceResponse assuranceResponse = assuranceMapper.AssuranceToAssuranceResponseDto(assurance);
        return Optional.of(assuranceResponse).orElseThrow( ()->
                new EntityNotFoundException(
                        "Aucune assurance avec la date = "+dateDebut+" n'a pas été trouvé dans la BDD",
                        ErrorsCode.ASSURANCE_NOT_FOUND
                )
        );
    }

    @Override
    public List<AssuranceResponse> listAssurance() {
        List<Assurance> assurances = assuranceRepository.findAll();
        List<AssuranceResponse> assuranceResponses =
                assurances.stream()
                        .map(cust->assuranceMapper.AssuranceToAssuranceResponseDto(cust))
                        .collect(Collectors.toList());
        return assuranceResponses;
    }

    @Override
    public void deleteAssuranceById(Long id) {

        if(id == null){
            log.error("Affectation ID is null");
            return ;
        }
        assuranceRepository.deleteById(id);

    }
}
