package com.acsi.gpa.validators;

import com.acsi.gpa.dto.assurancedto.AssuranceRequest;
import com.acsi.gpa.dto.vehiculedto.VehiculeRequest;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class AssuranceValidator {
    public static List<String> validate(AssuranceRequest assuranceRequest){
        List<String> errors = new ArrayList<>();
        if(assuranceRequest == null){
            errors.add("Veuillez renseigner le véhicule assurer");
            errors.add("Veuillez entrer les frais d'assurance");
            errors.add("Veuillez entrer la date de fin de l'assurance");
            errors.add("Veuillez entrer la date de début de l'assurance");
            errors.add("Veuillez renseigner l'agence assurreur");
            return errors;
        }
        if(!StringUtils.hasLength(assuranceRequest.getAgence())){
            errors.add("Veuillez renseigner l'agence assurreur");
        }
        if(assuranceRequest.getDateDebut() == null){
            errors.add("Veuillez entrer la date de début de l'assurance");
        }
        if(assuranceRequest.getDateFin() == null){
            errors.add("Veuillez entrer la date de fin de l'assurance");
        }
        if(assuranceRequest.getFrais() == null){
            errors.add("Veuillez entrer les frais d'assurance");
        }
        if(assuranceRequest.getVehicule() == null){
            errors.add("Veuillez renseigner le véhicule assurer");
        }
        return errors;
    }
}
