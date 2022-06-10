package com.acsi.gpa.service.chauffeurservice;

import com.acsi.gpa.dto.chauffeurmecaniciendto.ChauffeurMecanicienRequest;
import com.acsi.gpa.dto.chauffeurmecaniciendto.ChauffeurMecanicienResponse;
import com.acsi.gpa.entities.Affectation;
import com.acsi.gpa.entities.ChauffeurMecanicien;
import com.acsi.gpa.entities.Vehicule;
import com.acsi.gpa.exceptions.ErrorsCode;
import com.acsi.gpa.exceptions.InvalidEntityException;
import com.acsi.gpa.mapper.AffectationMapper;
import com.acsi.gpa.mapper.ChauffeurMecanicienMapper;
import com.acsi.gpa.repository.AffectationRepository;
import com.acsi.gpa.repository.ChauffeurMecanicienRepository;
import com.acsi.gpa.repository.VehiculeRepository;
import com.acsi.gpa.validators.ChauffeurMecanicienValidator;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
@Slf4j
@AllArgsConstructor
public class ChauffeurMecanicienServiceImpl implements ChauffeurMecanicienService {

    private ChauffeurMecanicienRepository chauffeurMecanicienRepository;
    private VehiculeRepository vehiculeRepository;
    private AffectationRepository affectationRepository;
    private ChauffeurMecanicienMapper chauffeurMecanicienMapper;
    private AffectationMapper affectationMapper;




    @Override
    public ChauffeurMecanicienResponse saveChauffeur(ChauffeurMecanicienRequest chauffeurMecanicienRequest) {

        List<String> errors = ChauffeurMecanicienValidator.validate(chauffeurMecanicienRequest);
        if (!errors.isEmpty()){
            log.error("Chauffeur non valide {}", chauffeurMecanicienRequest);
            throw new InvalidEntityException(" Chauffeur non valide", ErrorsCode.CHAUFFEUR_NOT_VALID,errors);
        }

        List<String> vehiculeErrors = new ArrayList<>();
        //Tester si une affectation existe lors de l'enregistrement d'un chauffeur afin de verifier si le véhicule existe dans la BDD
        if (chauffeurMecanicienRequest.getAffectationRequests()!= null) {
            chauffeurMecanicienRequest.getAffectationRequests().forEach(affectation -> {
                if(affectation.getVehiculeRequest() != null){
                    Optional<Vehicule> vehicule = vehiculeRepository.findById(affectation.getVehiculeRequest().getIdVehicule());
                    if(vehicule.isEmpty()){
                        vehiculeErrors.add("le vehicule avec l'id = "+affectation.getVehiculeRequest().getIdVehicule() +"n'existe pas dans la BDD");
                    }
                }else {
                    vehiculeErrors.add("impossible d'enregistrer un chauffeur avec un véhicule null");
                }
            });
        }
        //Tester si une reparation existe lors de l'enregistrement d'un chauffeur afin de verifier si le véhicule existe dans la BDD
        if (chauffeurMecanicienRequest.getReparationRequests() != null){
            chauffeurMecanicienRequest.getReparationRequests().forEach(reparation -> {
                if (reparation.getVehiculeRequest() != null){
                    Optional<Vehicule> vehicule = vehiculeRepository.findById(reparation.getVehiculeRequest().getIdVehicule());
                    if (vehicule.isEmpty()){
                        vehiculeErrors.add("le vehicule avec l'id ="+reparation.getVehiculeRequest().getIdVehicule()+"n'existe pas dans la BDD");
                    }
                }else {
                    vehiculeErrors.add("impossible d'enregistrer un chauffeur avec un véhicule null");
                }
            });
        }
        //Tester si une panne existe lors de l'enregistrement d'un chauffeur afin de verifier si le véhicule existe dans la BDD
        if (chauffeurMecanicienRequest.getPanneRequests() != null){
            chauffeurMecanicienRequest.getPanneRequests().forEach(panne -> {
                if (panne.getVehiculeRequest() != null) {
                    Optional<Vehicule> vehicule = vehiculeRepository.findById(panne.getVehiculeRequest().getIdVehicule());
                    if (vehicule.isEmpty()){
                        vehiculeErrors.add("le vehicule avec l'id ="+panne.getVehiculeRequest().getIdVehicule()+"n'existe pas dans la BDD");
                    }
                }else {
                    vehiculeErrors.add("impossible d'enregistrer un chauffeur avec un véhicule null");
                }
            });
        }
        //Tester si un accident existe lors de l'enregistrement d'un chauffeur afin de verifier si le véhicule existe dans la BDD
        if (chauffeurMecanicienRequest.getAccidentRequests() != null){
            chauffeurMecanicienRequest.getAccidentRequests().forEach(accident -> {
                if (accident.getVehiculeRequest() != null) {
                    Optional<Vehicule> vehicule = vehiculeRepository.findById(accident.getVehiculeRequest().getIdVehicule());
                    if (vehicule.isEmpty()){
                        vehiculeErrors.add("le vehicule avec l'id ="+accident.getVehiculeRequest().getIdVehicule()+"n'existe pas dans la BDD");
                    }
                }else {
                    vehiculeErrors.add("impossible d'enregistrer un chauffeur avec un véhicule null");
                }
            });
        }
        //Tester si un entretien existe lors de l'enregistrement d'un chauffeur afin de verifier si le véhicule existe dans la BDD
        if (chauffeurMecanicienRequest.getEntretienRequests() != null){
            chauffeurMecanicienRequest.getEntretienRequests().forEach(entretien -> {
                if (entretien.getVehiculeRequest() != null) {
                    Optional<Vehicule> vehicule = vehiculeRepository.findById(entretien.getVehiculeRequest().getIdVehicule());
                    if (vehicule.isEmpty()){
                        vehiculeErrors.add("le vehicule avec l'id ="+entretien.getVehiculeRequest().getIdVehicule()+"n'existe pas dans la BDD");
                    }
                }else {
                    vehiculeErrors.add(" Impossible d'enregistrer un chauffeur avec un véhicule null");
                }
            });
        }

        if(!vehiculeErrors.isEmpty()){
            log.warn("");
            throw new InvalidEntityException("le véhicule n'existe pas dans BDD", ErrorsCode.VEHICULE_NOT_FOUND,vehiculeErrors);
        }

        ChauffeurMecanicien chauffeurMecanicien = chauffeurMecanicienMapper.ChauffeurMecanicienRequestToChauffeur(chauffeurMecanicienRequest);
        ChauffeurMecanicien saveChauffeur = chauffeurMecanicienRepository.save(chauffeurMecanicien);

        if(chauffeurMecanicienRequest.getAffectationRequests() != null){
            chauffeurMecanicienRequest.getAffectationRequests().forEach(affect->{
                Affectation affectation = affectationMapper.AffectationRequestDtoToAffectation(affect);
                affectation.setChauffeurMecanicien(saveChauffeur);
                affectationRepository.save(affectation);
            });
        }

        return chauffeurMecanicienMapper.ChauffeurToChauffeurMecanicienDto(saveChauffeur);
    }

    @Override
    public ChauffeurMecanicienResponse updateChauffeur(ChauffeurMecanicienRequest chauffeurMecanicienRequest) {
        return null;
    }

    @Override
    public ChauffeurMecanicienResponse findChauffeurById(Long id) {
        return null;
    }

    @Override
    public List<ChauffeurMecanicienResponse> listChauffeurMecanicien() {
        return null;
    }

    @Override
    public void deleteChauffeur(Long id) {

    }
}
