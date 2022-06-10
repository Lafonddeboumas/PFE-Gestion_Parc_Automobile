package com.acsi.gpa.dto.chauffeurmecaniciendto;

import com.acsi.gpa.dto.accidentdto.AccidentResponse;
import com.acsi.gpa.dto.affectationdto.AffectationResponse;
import com.acsi.gpa.dto.entretiendto.EntretienResponse;
import com.acsi.gpa.dto.pannedto.PanneResponse;
import com.acsi.gpa.dto.reparationdto.ReparationResponse;
import com.acsi.gpa.entities.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChauffeurMecanicienResponse {

    private String numpermis;

    private Date expPermis;

    private String nom;

    private String prenom;

    private String email;

    private String telephone;

    private String adresse;

    private String cin;

    private String photo;

    private List<AffectationResponse> affectationResponsestions;

    private List<ReparationResponse> reparationResponses;

    private List<PanneResponse> panneResponses;

    private List<EntretienResponse>  entretienResponses;

    private List<AccidentResponse>  accidentResponses;

}
