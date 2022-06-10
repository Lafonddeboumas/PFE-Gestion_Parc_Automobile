package com.acsi.gpa.dto.etatvehiculedto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EtatvehiculeResponse {

    @Column(name = "etat")
    private String etat;
}
