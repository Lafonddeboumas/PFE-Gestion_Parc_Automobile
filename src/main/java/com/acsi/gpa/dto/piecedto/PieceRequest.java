package com.acsi.gpa.dto.piecedto;

import com.acsi.gpa.dto.fournisseurdto.FournisseurRequest;
import com.acsi.gpa.entities.Fournisseur;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PieceRequest {

    private String nomPiece;

    private BigDecimal prix;

    private Date dateAchat;

    private FournisseurRequest fournisseurRequest;
}
