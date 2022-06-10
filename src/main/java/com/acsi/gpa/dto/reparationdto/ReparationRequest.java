package com.acsi.gpa.dto.reparationdto;

import com.acsi.gpa.dto.chauffeurmecaniciendto.ChauffeurMecanicienRequest;
import com.acsi.gpa.dto.vehiculedto.VehiculeRequest;
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
public class ReparationRequest {

    private Date dateReparation;

    private BigDecimal frais;

    private String note;

    private VehiculeRequest vehiculeRequest;

    private ChauffeurMecanicienRequest chauffeurMecanicienRequest;
}
