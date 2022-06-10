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
public class Accident {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_accident")
    private Long id;

    @Temporal(TemporalType.DATE)
    private Date date;

    @Temporal(TemporalType.TIME)
    private Date heureAccident;

    private String lieuAccident;

    private String rapport;

    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(name = "chauffeur_id")
    private ChauffeurMecanicien mecaniciens;

    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(name = "vehicule_id")
    private Vehicule vehicule;


}
