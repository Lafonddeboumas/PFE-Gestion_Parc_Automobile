package com.acsi.gpa.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EtatVehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idEtatVehicule;

    @Column(name = "etat")
    private String etat;

    @OneToMany(
            mappedBy = "etatVehicule"
    )
    private List<Vehicule> vehicules;
}
