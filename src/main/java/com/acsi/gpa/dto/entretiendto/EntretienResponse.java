package com.acsi.gpa.dto.entretiendto;

import com.acsi.gpa.dto.chauffeurmecaniciendto.ChauffeurMecanicienResponse;
import com.acsi.gpa.dto.vehiculedto.VehiculeResponse;
import com.acsi.gpa.entities.ChauffeurMecanicien;
import com.acsi.gpa.entities.Vehicule;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EntretienResponse {

    private Date dateEntretien;

    private BigDecimal cout;

    private String rapport;

    private ChauffeurMecanicienResponse chauffeurMecanicienResponse;

    private VehiculeResponse vehiculeResponse;
}
