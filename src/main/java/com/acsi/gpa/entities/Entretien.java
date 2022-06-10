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
public class Entretien {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "entretien_id")
    private Long idEntretien;

    @Temporal(TemporalType.DATE)
    @Column(name = "entretien_date")
    private Date dateEntretien;

    @Column(name = "cout_entretien")
    private BigDecimal cout;

    @Column(name = "rapport")
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
    private Vehicule vehicules;
}
