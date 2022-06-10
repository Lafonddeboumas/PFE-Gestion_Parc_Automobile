package com.acsi.gpa.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Fournisseur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fournisseur_id")
    private Long idFournisseur;

    @Column(name = "nom")
    private String nom;

    @Column(name = "adresse")
    private String adresse;

    @Column(name = "ville")
    private String ville;

    @Column(name = "contact")
    private BigDecimal contact;

    @Column(name = "email")
    private String email;

    @Column(name = "site_web")
    private String siteWeb;

    @OneToMany(
            mappedBy = "fournisseurs"
    )
    private List<Piece> pieces;

    @OneToMany(
            mappedBy = "fournisseurs"
    )
    private List<PleinCarburant> pleincarburant;

    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(name = "typeFournisseur_id")
    private TypeFournisseur typefournisseur;
}
