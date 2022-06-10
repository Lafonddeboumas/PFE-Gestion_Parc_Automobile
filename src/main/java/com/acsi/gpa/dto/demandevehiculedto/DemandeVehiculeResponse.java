package com.acsi.gpa.dto.demandevehiculedto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DemandeVehiculeResponse {

    private String lieu;

    private String objet;

    private Date heureDepart;

    private Date heureRetour;

    private String nomAgent;

    private String mission;
}
