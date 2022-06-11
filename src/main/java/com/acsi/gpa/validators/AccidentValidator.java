package com.acsi.gpa.validators;

import com.acsi.gpa.dto.accidentdto.AccidentRequest;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class AccidentValidator {
    public static List<String> validate(AccidentRequest accidentRequest){
        List<String> errors = new ArrayList<>();
        if(accidentRequest == null){
            errors.add("Veuillez préciser le lieu de l'accident");
            errors.add("Veuillez préciser un rapport concernant l'accident");
            errors.add("Veuillez préciser la date de l'accident");
            errors.add("Veuillez préciser l'heure de l'accident");
            errors.add("Veuillez préciser le chauffeur concerné");
            errors.add("Veuillez préciser le véhicule concerné ");
            return errors;
        }
        if(!StringUtils.hasLength(accidentRequest.getLieuAccident())){
            errors.add("Veuillez préciser le lieu de l'accident");
        }
        if(!StringUtils.hasLength(accidentRequest.getRapport())){
            errors.add("Veuillez préciser un rapport concernant l'accident");
        }
        if(accidentRequest.getDate() == null ){
            errors.add("Veuillez préciser la date de l'accident");
        }
        if(accidentRequest.getHeureAccident() == null ){
            errors.add("Veuillez préciser l'heure de l'accident");
        }
        if(accidentRequest.getChauffeurMecanicienRequest()== null ){
            errors.add("Veuillez préciser le chauffeur concerné");
        }
        if(accidentRequest.getVehiculeRequest()== null ){
            errors.add("Veuillez préciser le véhicule concerné ");
        }
        return errors;
    }
}
