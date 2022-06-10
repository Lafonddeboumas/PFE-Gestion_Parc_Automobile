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
public class Taxe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "taxe_id")
    private Long idtaxe;

    @Temporal(TemporalType.DATE)
    @Column(name = "date_debut_taxe")
    private Date dateDebutTaxe;

    @Temporal(TemporalType.DATE)
    @Column(name = "date_expiration")
    private Date dateExpTaxe;

    @Column(name = "echeance")
    private String echeance;

    @Column(name = "frais")
    private BigDecimal frais;


    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(name = "idVehicule")
    private Vehicule vehicule;

}
