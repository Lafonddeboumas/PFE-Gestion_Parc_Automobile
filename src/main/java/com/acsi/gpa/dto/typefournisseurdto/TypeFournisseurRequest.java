package com.acsi.gpa.dto.typefournisseurdto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TypeFournisseurRequest {

    private Long idTypeFour;

    private String typeFournisseur;
}
