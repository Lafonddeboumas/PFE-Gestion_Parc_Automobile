package com.acsi.gpa.dto.entretiendto;

import com.acsi.gpa.dto.chauffeurmecaniciendto.ChauffeurMecanicienRequest;
import com.acsi.gpa.dto.vehiculedto.VehiculeRequest;
import com.acsi.gpa.entities.ChauffeurMecanicien;
import com.acsi.gpa.entities.Vehicule;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EntretienRequest {

    private Date dateEntretien;

    private BigDecimal cout;

    private String rapport;

    private ChauffeurMecanicienRequest  chauffeurMecanicienRequest;

    private VehiculeRequest vehiculeRequest;
}
