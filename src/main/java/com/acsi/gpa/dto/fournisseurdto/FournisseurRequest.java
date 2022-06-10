package com.acsi.gpa.dto.fournisseurdto;

import com.acsi.gpa.dto.typefournisseurservice.TypeFournisseurRequest;
import com.acsi.gpa.entities.Piece;
import com.acsi.gpa.entities.PleinCarburant;
import com.acsi.gpa.entities.TypeFournisseur;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FournisseurRequest {

    private String nom;

    private String adresse;

    private String ville;

    private BigDecimal contact;

    private String email;

    private String siteWeb;

    private TypeFournisseurRequest typeFournisseurRequest;
}
