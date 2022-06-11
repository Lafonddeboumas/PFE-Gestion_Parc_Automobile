package com.acsi.gpa.validators;

import com.acsi.gpa.dto.affectationdto.AffectationRequest;
import com.acsi.gpa.dto.vehiculedto.VehiculeRequest;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class AffectationValidator {
    public static List<String> validate(AffectationRequest affectationRequest){
        List<String> errors = new ArrayList<>();
        if(affectationRequest == null){
            errors.add("Veuillez préciser la mission d'affectation");
            errors.add("Veuillez préciser la date d'affectation");
            errors.add("Veuillez préciser le chauffeur");
            errors.add("Veuillez préciser le l'heure de départ");
            errors.add("Veuillez préciser le l'heure de retour");
            errors.add("Veuillez préciser le véhicule affecté");
            return errors;
        }
        if(!StringUtils.hasLength(affectationRequest.getMission())){
            errors.add("Veuillez préciser la mission d'affectation");
        }
        if(affectationRequest.getDateAffectation() == null){
            errors.add("Veuillez préciser la date d'affectation");
        }
        if(affectationRequest.getChauffeurMecanicienRequest() == null){
            errors.add("Veuillez préciser le chauffeur");
        }
        if(affectationRequest.getHeureDepart() == null){
            errors.add("Veuillez préciser le l'heure de départ");
        }
        if(affectationRequest.getHeureRetour() == null){
            errors.add("Veuillez préciser le l'heure de retour");
        }
        if(affectationRequest.getVehiculeRequest()== null){
            errors.add("Veuillez préciser le véhicule affecté");
        }
        return errors;
    }
}
