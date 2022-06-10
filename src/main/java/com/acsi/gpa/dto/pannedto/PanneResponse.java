package com.acsi.gpa.dto.pannedto;

import com.acsi.gpa.dto.chauffeurmecaniciendto.ChauffeurMecanicienResponse;
import com.acsi.gpa.dto.vehiculedto.VehiculeResponse;
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
public class PanneResponse {

    private String nomPanne;

    private Date dateDeclaration;

    private String rapport;

    private ChauffeurMecanicienResponse chauffeurMecanicienResponse;

    private VehiculeResponse vehiculeResponse;
}
