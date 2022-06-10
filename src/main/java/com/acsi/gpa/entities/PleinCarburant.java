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
public class PleinCarburant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "plein_id")
    private Long idPlein;

    @Temporal(TemporalType.DATE)
    @Column(name = "date_plein")
    private Date datePlein;

    @Column(name = "quantite_litre")
    private BigDecimal quantiteLitre;

    @Column(name = "note")
    private String note;


    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(name = "fournisseur_id")
    private Fournisseur fournisseurs;

    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(name = "vehicule_id")
    private Vehicule vehicules;
}
