package com.acsi.gpa.dto.vehiculedto;

import com.acsi.gpa.dto.directiondto.DirectionRequest;
import com.acsi.gpa.dto.etatvehiculedto.EtatvehiculeRequest;
import com.acsi.gpa.dto.marquedto.MarqueRequest;
import com.acsi.gpa.dto.typevehicule.TypeVehiculeRequest;
import com.acsi.gpa.entities.Direction;
import com.acsi.gpa.entities.EtatVehicule;
import com.acsi.gpa.entities.Marque;
import com.acsi.gpa.entities.TypeVehicule;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VehiculeRequest {

    private Long idVehicule;

    private String matricule;

    private Date dateAchat;

    private String puissance;

    private String imagevehicule;

    private Date datecirculation;

    private String carburant;

    private DirectionRequest directionRequest;

    private MarqueRequest marqueRequest;

    private TypeVehiculeRequest typeVehiculeRequest;

    private EtatvehiculeRequest etatvehiculeRequest;
}
