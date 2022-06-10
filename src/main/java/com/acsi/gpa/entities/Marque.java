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
public class Marque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "marque_id")
    private Long idMarque;

    private String designation;

    @OneToMany(
            mappedBy = "marques"
    )
    private List<Vehicule> vehicules;
}
