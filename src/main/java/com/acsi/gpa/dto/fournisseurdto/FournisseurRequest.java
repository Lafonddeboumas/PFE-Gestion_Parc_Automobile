package com.acsi.gpa.dto.fournisseurdto;

import com.acsi.gpa.dto.typefournisseurdto.TypeFournisseurRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

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
