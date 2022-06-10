package com.acsi.gpa.validators;

import com.acsi.gpa.dto.pleincarburantdto.PleinCarburantRequest;

import java.util.ArrayList;
import java.util.List;

public class PleinCarburantValidator {
    public static List<String> validate(PleinCarburantRequest pleinCarburantRequest){
        List<String> errors = new ArrayList<>();
        if(pleinCarburantRequest == null){
            errors.add("Veuillez renseigner la date de plein de carburant");
            errors.add("Veuillez renseigner le fournisseur ");
            errors.add("Veuillez renseigner la quantité de carburant");
            errors.add("Veuillez préciser le véhicule");
            return errors;
        }
        if(pleinCarburantRequest.getDatePlein() == null){
            errors.add("Veuillez renseigner la date de plein de carburant");
        }
        if(pleinCarburantRequest.getFournisseurs() == null){
            errors.add("Veuillez renseigner le fournisseur ");
        }
        if(pleinCarburantRequest.getQuantiteLitre() == null){
            errors.add("Veuillez renseigner la quantité de carburant");
        }
        if(pleinCarburantRequest.getVehicules() == null){
            errors.add("Veuillez préciser le véhicule");
        }
        return errors;
    }
}
