package com.acsi.gpa.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class DemandeVehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "demande_id")
    private Long idDemande;

    @Column(name = "lieu_deplacement")
    private String lieu;

    @Column(name = "objet_demande")
    private String objet;

    @Temporal(TemporalType.TIME)
    @Column(name = "heure_depart")
    private Date heureDepart;

    @Temporal(TemporalType.TIME)
    @Column(name = "heure_retour")
    private Date heureRetour;

    @Column(name = "nom_agent")
    private String nomAgent;

    @Column(name = "mission")
    private String mission;


}
