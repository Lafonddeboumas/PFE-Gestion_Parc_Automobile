package com.acsi.gpa.validators;

import com.acsi.gpa.dto.directiondto.DirectionRequest;
import com.acsi.gpa.dto.vehiculedto.VehiculeRequest;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class DirectionValidator {
    public static List<String> validate(DirectionRequest directionRequest){
        List<String> errors = new ArrayList<>();
        if(directionRequest == null){
            errors.add("Veuillez entrer le nom de la direction");
            errors.add("Veuillez préciser lenombre de véhicule de la direcction");
            return errors;
        }
        if(!StringUtils.hasLength(directionRequest.getNomDirection())){
            errors.add("Veuillez entrer le nom de la direction");
        }
        if(directionRequest.getNombreVehicule() == null){
            errors.add("Veuillez préciser lenombre de véhicule de la direcction");
        }
        return errors;
    }
}
