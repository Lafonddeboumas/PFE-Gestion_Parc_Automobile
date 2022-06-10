package com.acsi.gpa.dto.accidentdto;

import com.acsi.gpa.dto.chauffeurmecaniciendto.ChauffeurMecanicienResponse;
import com.acsi.gpa.dto.vehiculedto.VehiculeResponse;
import com.acsi.gpa.entities.ChauffeurMecanicien;
import com.acsi.gpa.entities.Vehicule;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data @AllArgsConstructor @NoArgsConstructor
public class AccidentResponse {

    private Date date;

    private Date heureAccident;

    private String lieuAccident;

    private String rapport;

    private ChauffeurMecanicienResponse chauffeurMecanicienResponse;

    private VehiculeResponse vehiculeResponse;
}
