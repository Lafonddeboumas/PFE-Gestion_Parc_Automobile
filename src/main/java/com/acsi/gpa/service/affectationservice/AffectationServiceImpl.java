package com.acsi.gpa.service.affectationservice;

import com.acsi.gpa.dto.affectationdto.AffectationRequest;
import com.acsi.gpa.dto.affectationdto.AffectationResponse;
import com.acsi.gpa.entities.Affectation;
import com.acsi.gpa.entities.ChauffeurMecanicien;
import com.acsi.gpa.entities.Vehicule;
import com.acsi.gpa.exceptions.EntityNotFoundException;
import com.acsi.gpa.exceptions.ErrorsCode;
import com.acsi.gpa.exceptions.InvalidEntityException;
import com.acsi.gpa.mapper.AffectationMapper;
import com.acsi.gpa.repository.AffectationRepository;
import com.acsi.gpa.repository.ChauffeurMecanicienRepository;
import com.acsi.gpa.repository.VehiculeRepository;
import com.acsi.gpa.validators.AffectationValidator;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
@Slf4j
@AllArgsConstructor
public class AffectationServiceImpl implements AffectationService {

    private ChauffeurMecanicienRepository chauffeurMecanicienRepository;
    private VehiculeRepository vehiculeRepository;
    private AffectationRepository affectationRepository;
    private AffectationMapper affectationMapper;

    @Override
    public AffectationResponse saveAffectation(AffectationRequest affectationRequest) {

        //Vérification des données saisie avec les validators
        List<String> errors = AffectationValidator.validate(affectationRequest);
        if(!errors.isEmpty()){
            log.error("Affectation non valide ", affectationRequest);
            throw new InvalidEntityException("l'affectation n'est pas valide ", ErrorsCode.AFFECTATION_NOT_VALID, errors);
        }

        //Vérification que le chauffeur enregistré existe bien dans la base de données
        Optional<ChauffeurMecanicien> chauffeurMecanicien = chauffeurMecanicienRepository.findById(affectationRequest.getChauffeurMecanicien().getIdchauffeur());
        if(chauffeurMecanicien.isEmpty()){
            log.warn("chauffeur with ID {} was not found in the BDD ",affectationRequest.getChauffeurMecanicien().getIdchauffeur());
            throw new EntityNotFoundException("Aucun chauffeur avec l'ID"+affectationRequest.getChauffeurMecanicien().getIdchauffeur()+"n'a ete trouvé dans la base de données",ErrorsCode.CHAUFFEUR_NOT_FOUND);
        }

        //Vérification que le vehicule enregistré existe bien dans la base de données
        Optional<Vehicule>  vehicule = vehiculeRepository.findById(affectationRequest.getVehicules().getIdVehicule());
        if(vehicule.isEmpty()){
            log.warn("vehicule with ID {} was not found in the BDD ",affectationRequest.getVehicules().getIdVehicule());
            throw new EntityNotFoundException("Aucun véhicule avec l'ID"+affectationRequest.getVehicules().getIdVehicule() +"n'a ete trouvé dans la base de données",ErrorsCode.VEHICULE_NOT_FOUND);
        }

        //Enregistrement de l'affectaion
        Affectation affectation = affectationMapper.AffectationRequestDtoToAffectation(affectationRequest);
        Affectation saveAffectation = affectationRepository.save(affectation);
        AffectationResponse affectationResponse = affectationMapper.AffectationToAffectationResponseDto(saveAffectation);
        return affectationResponse;
    }

    @Override
    public AffectationResponse findAffectationById(Long id) {
        if(id == null){
            log.error("Affectation ID is null");
            return null;
        }
        Affectation affectation = affectationRepository.findById(id).get();
        AffectationResponse affectationResponse = affectationMapper.AffectationToAffectationResponseDto(affectation);
        return Optional.of(affectationResponse).orElseThrow( ()->
                new EntityNotFoundException(
                        "Aucune affectation avec l'ID ="+id+"n'a pas été trouvé dans la BDD",
                        ErrorsCode.AFFECTATION_NOT_FOUND
                )
        );
    }

    @Override
    public AffectationResponse findByDateAffectation(Date dateAffectation) {
        if(dateAffectation == null){
            log.error("date affectation null");
            return null;
        }
        Affectation affectation = affectationRepository.findAffectationByDateAffectation(dateAffectation).get();
        AffectationResponse affectationResponse = affectationMapper.AffectationToAffectationResponseDto(affectation);
        return Optional.of(affectationResponse).orElseThrow( ()->
                new EntityNotFoundException(
                        "Aucune affectation avec la date = "+dateAffectation+" n'a pas été trouvé dans la BDD",
                        ErrorsCode.AFFECTATION_NOT_FOUND
                )
        );
    }

    @Override
    public AffectationResponse findByChauffeur(ChauffeurMecanicien chauffeurMecanicien) {
        if(chauffeurMecanicien.getNom() == null){
            log.error("nom chauffeur null");
            return null;
        }
        Affectation affectation = affectationRepository.findAffectationByChauffeurMecanicienNom(chauffeurMecanicien).get();
        AffectationResponse affectationResponse = affectationMapper.AffectationToAffectationResponseDto(affectation);
        return Optional.of(affectationResponse).orElseThrow( ()->
                new EntityNotFoundException(
                        "Aucun chauffeur avec le nom  = "+chauffeurMecanicien+" n'a pas été trouvé dans la BDD",
                        ErrorsCode.AFFECTATION_NOT_FOUND
                )
        );
    }

    @Override
    public AffectationResponse updateAffectation(AffectationRequest affectationRequest) {
        return null;
    }

    @Override
    public List<AffectationResponse> listAffectation() {
        List<Affectation> affectations = affectationRepository.findAll();
        List<AffectationResponse> affectationResponses =
                affectations.stream()
                        .map(cust->affectationMapper.AffectationToAffectationResponseDto(cust))
                        .collect(Collectors.toList());
        return affectationResponses;
    }

    @Override
    public void deleteAffectationById(Long id) {

        if(id == null){
            log.error("id null");
            return ;
        }
        affectationRepository.deleteById(id);
    }
}
