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
public class Affectation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "affectation_id")
    private Long idAffectation;

    @Temporal(TemporalType.DATE)
    @Column(name = "date_affectation")
    private  Date dateAffectation;

    @Temporal(TemporalType.TIME)
    @Column(name = "heure_depart")
    private  Date heureDepart;

    @Temporal(TemporalType.TIME)
    @Column(name = "heure_retour")
    private  Date heureRetour;

    @Column(name = "mission")
    private  String mission;

    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(name = "chauffeur_id")
    private ChauffeurMecanicien chauffeurMecanicien;

    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(name = "vehicule_id")
    private Vehicule vehicules;
}
