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
public class Panne {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "panne_id")
    private Long idPanne;

    @Column(name = "panne")
    private String nomPanne;

    @Temporal(TemporalType.DATE)
    @Column(name = "date_declaration")
    private Date dateDeclaration;


    @Column(name = "rapport_panne")
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
