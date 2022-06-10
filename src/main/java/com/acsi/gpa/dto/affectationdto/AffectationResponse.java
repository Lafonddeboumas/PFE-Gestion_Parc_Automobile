package com.acsi.gpa.dto.affectationdto;

import com.acsi.gpa.dto.chauffeurmecaniciendto.ChauffeurMecanicienResponse;
import com.acsi.gpa.dto.vehiculedto.VehiculeResponse;
import com.acsi.gpa.entities.ChauffeurMecanicien;
import com.acsi.gpa.entities.Vehicule;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AffectationResponse {

    private Date dateAffectation;

    private  Date heureDepart;

    private  Date heureRetour;

    private  String mission;

    private ChauffeurMecanicienResponse  chauffeurMecanicienResponse;

    private VehiculeResponse  vehiculeResponse;
}
