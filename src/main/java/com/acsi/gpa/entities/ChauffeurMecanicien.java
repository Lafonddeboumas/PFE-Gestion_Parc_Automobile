package com.acsi.gpa.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ChauffeurMecanicien {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chauffeur_id")
    private Long idchauffeur;

    @Column(name = "numero_permis")
    private String numpermis;

    @Column(name = "date_exp_permis")
    private Date expPermis;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "email")
    private String email;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "adresse")
    private String adresse;

    @Column(name = "cin")
    private String cin;

    @Column(name = "photo")
    private String photo;

    @OneToMany(
            mappedBy = "chauffeurMecanicien"
    )
    private List<Affectation> affectations;

    @OneToMany(
            mappedBy = "mecaniciens"
    )
    private List<Reparation> reparations;


    @OneToMany(
            mappedBy = "mecaniciens"
    )
    private List<Panne> pannes;

    @OneToMany(
            mappedBy = "mecaniciens"
    )
    private List<Entretien>  entretiens;

    @OneToMany(
            mappedBy = "mecaniciens"
    )
    private List<Accident>  accidents;
}
