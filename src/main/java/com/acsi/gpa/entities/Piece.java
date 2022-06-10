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
public class Piece {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "piece_id")
    private Long idPiece;

    @Column(name = "piece")
    private String nomPiece;

    @Column(name = "prix")
    private BigDecimal prix;

    @Column(name = "date_achat")
    private Date dateAchat;

    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(name = "fournisseur_id")
    private Fournisseur fournisseurs;
}
