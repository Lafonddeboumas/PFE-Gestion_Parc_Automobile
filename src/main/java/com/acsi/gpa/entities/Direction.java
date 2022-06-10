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
public class Direction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "direction_id")
    private Long idDirection;

    @Column(name = "nom")
    private String nomDirection;

    @Column(name = "nombre_vehicule")
    private BigDecimal nombreVehicule;


    @OneToMany(
            mappedBy = "directions"
    )
    private List<Vehicule> vehicules;


    /*@OneToMany(
            mappedBy = "direction"
    )
    private List<Servces> service;*/

}
