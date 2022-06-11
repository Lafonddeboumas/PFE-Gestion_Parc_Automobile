package com.acsi.gpa.validators;

import com.acsi.gpa.dto.vehiculedto.VehiculeRequest;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class VehiculeValidator {

    public static List<String> validate(VehiculeRequest vehiculeRequest){
        List<String> errors = new ArrayList<>();
        if(vehiculeRequest == null){
            errors.add("Veuillez entrer le matricule du véhicule");
            errors.add("Veuillez renseigner le type de carburant du véhicule");
            errors.add("Veuillez préciser la puissance du véhicule");
            errors.add("Veuillez renseigner l'état du véhicule");
            errors.add("Veuillez renseigner la date d'achat du véhicule");
            errors.add("Veuillez renseigner la marque du véhicule");
            errors.add("Veuillez préciser la direction auquelle appartient le véhicule");
            return  errors;
        }

        if(!StringUtils.hasLength(vehiculeRequest.getMatricule())){
            errors.add("Veuillez entrer le matricule du véhicule");
        }
        if(!StringUtils.hasLength(vehiculeRequest.getCarburant())){
            errors.add("Veuillez renseigner le type de carburant du véhicule");
        }
        if(!StringUtils.hasLength(vehiculeRequest.getPuissance())){
            errors.add("Veuillez préciser la puissance du véhicule");
        }
        if(vehiculeRequest.getEtatvehiculeRequest() == null){
            errors.add("Veuillez renseigner l'état du véhicule");
        }
        if(vehiculeRequest.getDateAchat() == null){
            errors.add("Veuillez renseigner la date d'achat du véhicule");
        }
        if(vehiculeRequest.getMarqueRequest() == null){
            errors.add("Veuillez renseigner la marque du véhicule");
        }
        if(vehiculeRequest.getDirectionRequest() == null){
            errors.add("Veuillez préciser la direction auquelle appartient le véhicule");
        }
        return errors;
    }
}
