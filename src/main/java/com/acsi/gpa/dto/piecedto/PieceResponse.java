package com.acsi.gpa.dto.piecedto;

import com.acsi.gpa.dto.fournisseurdto.FournisseurResponse;
import com.acsi.gpa.entities.Fournisseur;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PieceResponse {

    private String nomPiece;

    private BigDecimal prix;

    private Date dateAchat;

    private FournisseurResponse fournisseurResponse;
}

