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
public class Assurance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "assurance_id")
    private Long idAssurance;

    @Temporal(TemporalType.DATE)
    @Column(name = "debut_assurance")
    private Date dateDebut;

    @Temporal(TemporalType.DATE)
    @Column(name = "fin_assurance")
    private Date dateFin;

    @Column(name = "echeance")
    private String echeance;

    @Column(name = "frais")
    private BigDecimal frais;

    @Column(name = "agence")
    private String agence;


    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(name = "idVehicule")
    private Vehicule vehicule;

}
