package com.acsi.gpa.validators;

import com.acsi.gpa.dto.entretiendto.EntretienRequest;
import com.acsi.gpa.dto.vehiculedto.VehiculeRequest;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class EntretienValidator {
    public static List<String> validate(EntretienRequest entretienRequest){
        List<String> errors = new ArrayList<>();
        if(entretienRequest == null){
            errors.add("Veuillez préciser le véhicule concerné par l'entretien");
            errors.add("Veuillez renseigner un rapport de l'entretien");
            errors.add("Veuillez préciser la cout de l'entretien");
            errors.add("Veuillez préciser la date de l'entretien");
            return  errors;
        }
        if(!StringUtils.hasLength(entretienRequest.getRapport())){
            errors.add("Veuillez renseigner un rapport de l'entretien");
        }
        if(entretienRequest.getDateEntretien() == null){
            errors.add("Veuillez préciser la date de l'entretien");
        }
        if(entretienRequest.getCout() == null){
            errors.add("Veuillez préciser la cout de l'entretien");
        }
        if(entretienRequest.getMecaniciens() == null){
            errors.add("Veuillez préciser le mécanicen ayant éffectuer l'entretien");
        }
        if(entretienRequest.getVehicules() == null){
            errors.add("Veuillez préciser le véhicule concerné par l'entretien");
        }
        return errors;
    }
}
