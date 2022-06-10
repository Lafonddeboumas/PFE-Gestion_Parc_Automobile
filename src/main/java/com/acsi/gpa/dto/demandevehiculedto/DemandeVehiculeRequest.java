package com.acsi.gpa.dto.demandevehiculedto;

import com.acsi.gpa.entities.Vehicule;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DemandeVehiculeRequest {

    private String lieu;

    private String objet;

    private Date heureDepart;

    private Date heureRetour;

    private String nomAgent;

    private String mission;

}
