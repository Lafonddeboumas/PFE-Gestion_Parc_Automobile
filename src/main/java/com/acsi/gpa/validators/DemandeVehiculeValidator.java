package com.acsi.gpa.validators;

import com.acsi.gpa.dto.demandevehiculedto.DemandeVehiculeRequest;
import com.acsi.gpa.dto.vehiculedto.VehiculeRequest;
import com.acsi.gpa.entities.DemandeVehicule;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class DemandeVehiculeValidator {
    public static List<String> validate(DemandeVehiculeRequest demandeVehiculeRequest){
        List<String> errors = new ArrayList<>();
        if(demandeVehiculeRequest == null){
            errors.add("Veuillez préciser l'heure de retour");
            errors.add("Veuillez préciser l'heure de départ");
            errors.add("Veuillez préciser le lieu de déplacement");
            errors.add("Veuillez préciser le nom de l'agent");
            errors.add("Veuillez préciser l'objet de la demande");
            return errors;
        }
        if(!StringUtils.hasLength(demandeVehiculeRequest.getObjet())){
            errors.add("Veuillez préciser l'objet de la demande");
        }
        if(!StringUtils.hasLength(demandeVehiculeRequest.getNomAgent())){
            errors.add("Veuillez préciser le nom de l'agent");
        }
        if(!StringUtils.hasLength(demandeVehiculeRequest.getLieu())){
            errors.add("Veuillez préciser le lieu de déplacement");
        }
        if(demandeVehiculeRequest.getHeureDepart() == null){
            errors.add("Veuillez préciser l'heure de départ");
        }
        if(demandeVehiculeRequest.getHeureRetour() == null){
            errors.add("Veuillez préciser l'heure de retour");
        }
        return errors;
    }
}
