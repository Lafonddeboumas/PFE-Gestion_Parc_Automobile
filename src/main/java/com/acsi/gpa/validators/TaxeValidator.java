package com.acsi.gpa.validators;

import com.acsi.gpa.dto.taxedto.TaxeRequest;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class TaxeValidator {
    public static List<String> validate(TaxeRequest taxeRequest){

        List<String> errors = new ArrayList<>();
        if(taxeRequest == null){
            errors.add("Veuillez préciser la date de debut de la taxe");
            errors.add("Veuillez préciser la date d'expiration de la taxe");
            errors.add("Veuillez préciser les frais de la taxe");
            errors.add("Veuillez préciser le véhicule concerné par la taxe");
            return  errors;
        }

        if(taxeRequest.getDateDebutTaxe() == null){
            errors.add("Veuillez préciser la date de debut de la taxe");
        }
        if(taxeRequest.getDateExpTaxe() == null){
            errors.add("Veuillez préciser la date d'expiration de la taxe");
        }
        if(taxeRequest.getFrais() == null){
            errors.add("Veuillez préciser les frais de la taxe");
        }
        if(taxeRequest.getVehicule() == null){
            errors.add("Veuillez préciser le véhicule concerné par la taxe");
        }
        return errors;
    }
}
