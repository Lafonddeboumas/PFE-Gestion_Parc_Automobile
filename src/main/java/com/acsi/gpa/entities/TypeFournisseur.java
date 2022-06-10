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
@Table(name = "type_fournisseur")
public class TypeFournisseur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "typeFournisseur_id")
    private Long idTypeFour;

    @Column(name = "type")
    private String typeFournisseur;

    @OneToMany(
            mappedBy = "typefournisseur"
    )
    private List<Fournisseur> fournisseurs;
}
