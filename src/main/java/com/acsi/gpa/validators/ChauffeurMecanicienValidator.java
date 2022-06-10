package com.acsi.gpa.validators;

import com.acsi.gpa.dto.chauffeurmecaniciendto.ChauffeurMecanicienRequest;
import com.acsi.gpa.dto.vehiculedto.VehiculeRequest;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ChauffeurMecanicienValidator {

    public static List<String> validate(ChauffeurMecanicienRequest chauffeurMecanicienRequest){
        List<String> errors = new ArrayList<>();
        if(chauffeurMecanicienRequest == null){
            errors.add("Veuillez préciser le nom du chauffeur");
            errors.add("Veuillez préciser le prenom du chauffeur");
            errors.add("Veuillez préciser le mail du chauffeur");
            errors.add("Veuillez préciser le numéro de permis du chauffeur");
            errors.add("Veuillez préciser la date d'expiration du permis du chauffeur");
            errors.add("Veuillez préciser le CIN du chauffeur");
            return errors;
        }
        if(!StringUtils.hasLength(chauffeurMecanicienRequest.getNom())){
            errors.add("Veuillez préciser le nom du chauffeur");
        }
        if(!StringUtils.hasLength(chauffeurMecanicienRequest.getPrenom())){
            errors.add("Veuillez préciser le prenom du chauffeur");
        }
        if(!StringUtils.hasLength(chauffeurMecanicienRequest.getCin())){
            errors.add("Veuillez préciser le CIN du chauffeur");
        }
        if(!StringUtils.hasLength(chauffeurMecanicienRequest.getNumpermis())){
            errors.add("Veuillez préciser le numéro de permis du chauffeur");
        }
        if(chauffeurMecanicienRequest.getExpPermis() == null){
            errors.add("Veuillez préciser la date d'expiration du permis du chauffeur");
        }
        if(!StringUtils.hasLength(chauffeurMecanicienRequest.getEmail())){
            errors.add("Veuillez préciser le mail du chauffeur");
        }
        return errors;
    }
}
