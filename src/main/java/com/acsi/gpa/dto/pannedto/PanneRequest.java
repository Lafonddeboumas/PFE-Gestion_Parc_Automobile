package com.acsi.gpa.dto.pannedto;

import com.acsi.gpa.dto.chauffeurmecaniciendto.ChauffeurMecanicienRequest;
import com.acsi.gpa.dto.vehiculedto.VehiculeRequest;
import com.acsi.gpa.entities.ChauffeurMecanicien;
import com.acsi.gpa.entities.Vehicule;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PanneRequest {

    private String nomPanne;

    private Date dateDeclaration;

    private String rapport;

    private ChauffeurMecanicienRequest  chauffeurMecanicienRequest;

    private VehiculeRequest vehiculeRequest;
}
