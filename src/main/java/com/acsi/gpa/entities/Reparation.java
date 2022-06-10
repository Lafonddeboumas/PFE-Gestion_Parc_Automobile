package com.acsi.gpa.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Reparation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reparation_id")
    private Long idReparation;

    @Temporal(TemporalType.DATE)
    @Column(name = "reparation_date")
    private Date dateReparation;

    @Column(name = "frais_reparation")
    private BigDecimal frais;

    @Column(name = "note")
    private String note;


    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(name = "vehicule_id")
    private Vehicule vehicules;

    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(name = "chauffeur_id")
    private ChauffeurMecanicien mecaniciens;
}
