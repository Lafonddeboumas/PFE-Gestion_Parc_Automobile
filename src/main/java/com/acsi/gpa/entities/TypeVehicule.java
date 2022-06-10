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
public class TypeVehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_typevehicule")
    private Long idTypeVehicule;

    @Column(name = "type_vehicule")
    private String type;

    @OneToMany(
            mappedBy = "typevehicules"
    )
    private List<Vehicule> vehicules;
}
