package com.acsi.gpa.dto.taxedto;

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
public class TaxeResponse {

    private Date dateDebutTaxe;

    private Date dateExpTaxe;

    private String echeance;

    private BigDecimal frais;

    private VehiculeResponse vehiculeResponse;
}
