package com.acsi.gpa.dto.accidentdto;

import com.acsi.gpa.dto.chauffeurmecaniciendto.ChauffeurMecanicienRequest;
import com.acsi.gpa.dto.vehiculedto.VehiculeRequest;
import com.acsi.gpa.entities.ChauffeurMecanicien;
import com.acsi.gpa.entities.Vehicule;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data @AllArgsConstructor @NoArgsConstructor
public class AccidentRequest {

    private Date date;

    private Date heureAccident;

    private String lieuAccident;

    private String rapport;

    private ChauffeurMecanicienRequest chauffeurMecanicienRequest;

    private VehiculeRequest vehiculeRequest;
}
