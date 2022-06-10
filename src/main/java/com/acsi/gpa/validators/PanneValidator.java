package com.acsi.gpa.validators;

import com.acsi.gpa.dto.pannedto.PanneRequest;
import com.acsi.gpa.dto.vehiculedto.VehiculeRequest;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class PanneValidator {
    public static List<String> validate(PanneRequest panneRequest){
        List<String> errors = new ArrayList<>();
        if(panneRequest == null){
            errors.add("Veuillez entrer le nom de la panne");
            errors.add("Veuillez entrer la date de déclaration de la panne");
            errors.add("Veuillez préciser le véhicule concerné");
            return  errors;
        }

        if(!StringUtils.hasLength(panneRequest.getNomPanne())){
            errors.add("Veuillez entrer le nom de la panne");
        }
        if(panneRequest.getDateDeclaration() == null){
            errors.add("Veuillez entrer la date de déclaration de la panne");
        }
        if(panneRequest.getMecaniciens() == null){
            errors.add("Veuillez préciser le chauffeur ayant déclaré  la panne");
        }
        if(panneRequest.getVehicules() == null){
            errors.add("Veuillez préciser le véhicule concerné");
        }
        return errors;
    }
}
