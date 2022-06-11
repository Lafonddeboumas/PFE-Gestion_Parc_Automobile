package com.acsi.gpa.validators;

import com.acsi.gpa.dto.reparationdto.ReparationRequest;
import com.acsi.gpa.dto.vehiculedto.VehiculeRequest;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ReparationValidator {
    public static List<String> validate(ReparationRequest reparationRequest){
        List<String> errors = new ArrayList<>();

        if(reparationRequest == null){
            errors.add("Veuillez renseigner un rapport concernant la réparation du véhicule");
            errors.add("Veuillez renseigner la date de réparation du véhicule");
            errors.add("Veuillez renseigner les frais de réparations du véhicule");
            errors.add("Veuillez préciser le mécanicien ayant réparé le véhicule");
            errors.add("Veuillez préciser le véhicule réparé");
            return  errors;
        }
        if(!StringUtils.hasLength(reparationRequest.getNote())){
            errors.add("Veuillez entrer un rapport concernant la réparation");
        }
        if(reparationRequest.getDateReparation() == null){
            errors.add("Veuillez renseigner la date de réparation du véhicule");
        }
        if(reparationRequest.getFrais() == null){
            errors.add("Veuillez renseigner les frais de réparations du véhicule");
        }
        if(reparationRequest.getChauffeurMecanicienRequest() == null){
            errors.add("Veuillez préciser le mécanicien ayant réparé le véhicule");
        }
        if(reparationRequest.getVehiculeRequest() == null){
            errors.add("Veuillez préciser le véhicule réparé");
        }
        return  errors;
    }

}
