package com.acsi.gpa.dto.pleincarburantdto;

import com.acsi.gpa.dto.fournisseurdto.FournisseurRequest;
import com.acsi.gpa.dto.vehiculedto.VehiculeRequest;
import com.acsi.gpa.entities.Fournisseur;
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
public class PleinCarburantRequest {

    private Date datePlein;

    private BigDecimal quantiteLitre;

    private String note;

    private FournisseurRequest fournisseurRequest;

    private VehiculeRequest vehiculeRequest;
}
