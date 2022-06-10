package com.acsi.gpa.validators;

import com.acsi.gpa.dto.fournisseurdto.FournisseurRequest;
import com.acsi.gpa.dto.vehiculedto.VehiculeRequest;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class FournisseurValidator {
    public static List<String> validate(FournisseurRequest fournisseurRequest){
        List<String> errors = new ArrayList<>();
        if (fournisseurRequest == null){
            errors.add("Veuillez entrer le nom du fournisseur");
            errors.add("Veuillez entrer l'email du fournisseur");
            errors.add("Veuillez entrer les contacts du fournisseur");
            return errors;
        }
        if(!StringUtils.hasLength(fournisseurRequest.getNom())){
            errors.add("Veuillez entrer le nom du fournisseur");
        }
        if(!StringUtils.hasLength(fournisseurRequest.getEmail())){
            errors.add("Veuillez entrer l'email du fournisseur");
        }
        if(fournisseurRequest.getContact() == null){
            errors.add("Veuillez entrer les contacts du fournisseur");
        }
        return  errors;
    }

}
