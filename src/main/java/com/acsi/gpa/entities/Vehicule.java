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
public class Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vehicule_id")
    private Long idVehicule;

    @Column(name = "immatriculation")
    private String matricule;

    @Column(name = "date_achat")
    private Date dateAchat;

    @Column(name = "puissance")
    private String puissance;

    @Column(name = "imagevehicule")
    private String imagevehicule;

    @Column(name = "date_circulation")
    private Date datecirculation;

    @Column(name = "carburant")
    private String carburant;


    @OneToMany(
            mappedBy = "vehicules"
    )
    private List<Affectation> affectations;

    @OneToMany(
            mappedBy = "vehicule"
    )
    private List<Assurance> assurances;

    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(name = "direction_id")
    private Direction directions;

    @OneToMany(
            mappedBy = "vehicules"
    )
    private List<Entretien> entretiens;

    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(name = "marque_id")
    private Marque marques;

    @OneToMany(
            mappedBy = "vehicules"
    )
    private List<Panne> pannes;

    @OneToMany(
            mappedBy = "vehicules"
    )
    private List<PleinCarburant> pleinCarburant;

    @OneToMany(
            mappedBy = "vehicules"
    )
    private List<Reparation> reparations;

    @OneToMany(
            mappedBy = "vehicule"
    )
    private List<Taxe> taxes;

    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(name = "id_typevehicule")
    private TypeVehicule typevehicules;

    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(name = "idEtatVehicule")
    private  EtatVehicule etatVehicule;

    @OneToMany(
            mappedBy = "vehicule"
    )
    private List<Accident>  accidents;

}
