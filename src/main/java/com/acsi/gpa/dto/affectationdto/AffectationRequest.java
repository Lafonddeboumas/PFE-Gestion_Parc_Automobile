package com.acsi.gpa.dto.affectationdto;

import com.acsi.gpa.dto.chauffeurmecaniciendto.ChauffeurMecanicienRequest;
import com.acsi.gpa.dto.vehiculedto.VehiculeRequest;
import com.acsi.gpa.entities.ChauffeurMecanicien;
import com.acsi.gpa.entities.Vehicule;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AffectationRequest {

    private Date dateAffectation;

    private  Date heureDepart;

    private  Date heureRetour;

    private  String mission;

    private ChauffeurMecanicienRequest chauffeurMecanicienRequest;

    private VehiculeRequest vehiculeRequest;
}
