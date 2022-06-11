package com.acsi.gpa.service.accidentservice;

import com.acsi.gpa.dto.accidentdto.AccidentRequest;
import com.acsi.gpa.dto.accidentdto.AccidentResponse;
import com.acsi.gpa.entities.Accident;
import com.acsi.gpa.entities.ChauffeurMecanicien;
import com.acsi.gpa.entities.Vehicule;
import com.acsi.gpa.exceptions.EntityNotFoundException;
import com.acsi.gpa.exceptions.ErrorsCode;
import com.acsi.gpa.exceptions.InvalidEntityException;
import com.acsi.gpa.mapper.AccidentMapper;
import com.acsi.gpa.repository.AccidentRepository;
import com.acsi.gpa.repository.ChauffeurMecanicienRepository;
import com.acsi.gpa.repository.VehiculeRepository;
import com.acsi.gpa.validators.AccidentValidator;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
@Slf4j
@AllArgsConstructor
public class AccidentServiceImpl implements AccidentService {

    private VehiculeRepository vehiculeRepository;
    private ChauffeurMecanicienRepository chauffeurMecanicienRepository;
    private AccidentRepository accidentRepository;
    private AccidentMapper accidentMapper;


    @Override
    public AccidentResponse saveAccident(AccidentRequest accidentRequest) {

        //Vérification des données saisie avec les validators
        List<String> errors = AccidentValidator.validate(accidentRequest);
        if(!errors.isEmpty()){
            log.error("Accident is not valid {} ", accidentRequest);
            throw new InvalidEntityException("L'accident n'est pas valide", ErrorsCode.ACCIDENT_NOT_VALID, errors);
        }

        //Vérification que le chauffeur enregistré existe bien dans la base de données
        Optional<ChauffeurMecanicien>  chauffeurMecanicien = chauffeurMecanicienRepository.findById(accidentRequest.getChauffeurMecanicienRequest().getIdchauffeur() );
        if(chauffeurMecanicien.isEmpty()){
            log.warn("chauffeur with ID {} was not found in the BDD ",accidentRequest.getChauffeurMecanicienRequest().getIdchauffeur());
            throw new EntityNotFoundException("Aucun chauffeur avec l'ID"+accidentRequest.getChauffeurMecanicienRequest().getIdchauffeur()+"n'a ete trouvé dans la base de données",ErrorsCode.CHAUFFEUR_NOT_FOUND);
        }

        //Vérification que le vehicule enregistré existe bien dans la base de données
        Optional<Vehicule>  vehicule = vehiculeRepository.findById(accidentRequest.getVehiculeRequest().getIdVehicule());
        if(vehicule.isEmpty()){
            log.warn("vehicule with ID {} was not found in the BDD ",accidentRequest.getVehiculeRequest().getIdVehicule());
            throw new EntityNotFoundException("Aucun véhicule avec l'ID"+accidentRequest.getVehiculeRequest().getIdVehicule()  +"n'a ete trouvé dans la base de données",ErrorsCode.VEHICULE_NOT_FOUND);
        }

        //Enregistrement de l'accident
        Accident accident = accidentMapper.AccidentRequestDtoToAccident(accidentRequest);
        Accident saveAccident = accidentRepository.save(accident);
        AccidentResponse accidentResponse = accidentMapper.AccidentToAccidentResponseDto(saveAccident);
        return accidentResponse;
    }

    @Override
    public AccidentResponse findAccidentById(Long id) {
        if(id == null){
            log.error("Accident ID is null");
            return null;
        }
        Accident accident = accidentRepository.findById(id).get();
        AccidentResponse accidentResponse = accidentMapper.AccidentToAccidentResponseDto(accident);
        return Optional.of(accidentResponse).orElseThrow(()->
                new EntityNotFoundException(
                        "Aucun accident avec l'ID ="+id+"n'a pas été trouvé dans la BDD",
                        ErrorsCode.ACCIDENT_NOT_FOUND
                )
        );
    }

    @Override
    public AccidentResponse findByLieuAccident(String lieu) {
        if(!StringUtils.hasLength(lieu)){
            log.error("Lieu accident null");
            return null;
        }
        Accident accident = accidentRepository.findAccidentByLieuAccident(lieu).get();
        AccidentResponse accidentResponse = accidentMapper.AccidentToAccidentResponseDto(accident);
        return Optional.of(accidentResponse).orElseThrow(()->
                new EntityNotFoundException(
                        "Aucun accident avec le lieu ="+lieu+"n'a pas été trouvé dans la BDD",
                        ErrorsCode.ACCIDENT_NOT_FOUND
                )
        );
    }

    @Override
    public AccidentResponse updateAccident(AccidentRequest accidentRequest) {
        return null;
    }

    @Override
    public List<AccidentResponse> listAccident() {
        List<Accident>  accidents = accidentRepository.findAll();
        List<AccidentResponse> accidentResponses =
                accidents.stream()
                        .map(cust->accidentMapper.AccidentToAccidentResponseDto(cust))
                        .collect(Collectors.toList());
        return accidentResponses;
    }

    @Override
    public void deleteAccidentById(Long id) {
        if(id == null){
            log.error("Lieu accident null");
            return ;
        }
        accidentRepository.deleteById(id);
    }
}
