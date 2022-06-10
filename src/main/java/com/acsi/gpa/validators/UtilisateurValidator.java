package com.acsi.gpa.validators;

import com.acsi.gpa.dto.utilisateurdto.UtilisateurRequest;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class UtilisateurValidator {
    public static List<String> validate(UtilisateurRequest utilisateurRequest){

        List<String> errors = new ArrayList<>();
        if(utilisateurRequest == null){
            errors.add("Veuillez préciser le nom d'utilisateur");
            errors.add("Veuillez préciser l'adresse");
            errors.add("Veuillez préciser l'email de l'utilisateur");
            errors.add("Veuillez renseigner le mot de passe de l'utilisateur");
            return errors;
        }
        if(!StringUtils.hasLength(utilisateurRequest.getUsername())){
            errors.add("Veuillez préciser le nom d'utilisateur");
        }
        if(!StringUtils.hasLength(utilisateurRequest.getAdresse())){
            errors.add("Veuillez préciser l'adresse");
        }
        if(!StringUtils.hasLength(utilisateurRequest.getEmail())){
            errors.add("Veuillez préciser l'email de l'utilisateur");
        }
        if(!StringUtils.hasLength(utilisateurRequest.getPassword())){
            errors.add("Veuillez renseigner le mot de passe de l'utilisateur");
        }
        return errors;
    }
}
