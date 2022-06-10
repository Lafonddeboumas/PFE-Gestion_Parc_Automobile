package com.acsi.gpa.dto.assurancedto;

import com.acsi.gpa.dto.vehiculedto.VehiculeRequest;
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
public class AssuranceRequest {

    private Date dateDebut;

    private Date dateFin;

    private String echeance;

    private BigDecimal frais;

    private String agence;

    private VehiculeRequest vehiculeRequest;
}
