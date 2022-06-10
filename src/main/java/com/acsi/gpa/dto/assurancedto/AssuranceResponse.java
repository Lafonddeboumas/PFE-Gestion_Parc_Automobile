package com.acsi.gpa.dto.assurancedto;

import com.acsi.gpa.dto.vehiculedto.VehiculeResponse;
import com.acsi.gpa.entities.Vehicule;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssuranceResponse {

    private Date dateDebut;

    private Date dateFin;

    private String echeance;

    private BigDecimal frais;

    private String agence;

    private VehiculeResponse vehiculeResponse;
}
