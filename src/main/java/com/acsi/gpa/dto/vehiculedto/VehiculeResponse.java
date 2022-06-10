package com.acsi.gpa.dto.vehiculedto;

import com.acsi.gpa.dto.directiondto.DirectionResponse;
import com.acsi.gpa.dto.etatvehiculedto.EtatvehiculeResponse;
import com.acsi.gpa.dto.marquedto.MarqueResponse;
import com.acsi.gpa.dto.typevehicule.TypeVehiculeResponse;
import com.acsi.gpa.entities.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VehiculeResponse {

    private Long idVehicule;

    private String matricule;

    private Date dateAchat;

    private String puissance;

    private String imagevehicule;

    private Date datecirculation;

    private String carburant;

    private DirectionResponse directionResponse;

    private MarqueResponse marqueResponse;

    private TypeVehiculeResponse typeVehiculeResponse;

    private EtatvehiculeResponse  etatvehiculeResponse;

}
