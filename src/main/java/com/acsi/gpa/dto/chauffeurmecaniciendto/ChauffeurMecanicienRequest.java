package com.acsi.gpa.dto.chauffeurmecaniciendto;

import com.acsi.gpa.dto.accidentdto.AccidentRequest;
import com.acsi.gpa.dto.affectationdto.AffectationRequest;
import com.acsi.gpa.dto.entretiendto.EntretienRequest;
import com.acsi.gpa.dto.pannedto.PanneRequest;
import com.acsi.gpa.dto.reparationdto.ReparationRequest;
import com.acsi.gpa.entities.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChauffeurMecanicienRequest {

    private Long idchauffeur;

    private String numpermis;

    private Date expPermis;

    private String nom;

    private String prenom;

    private String email;

    private String telephone;

    private String adresse;

    private String cin;

    private String photo;

    private List<AffectationRequest> affectationRequests;

    private List<ReparationRequest> reparationRequests;

    private List<PanneRequest> panneRequests;

    private List<EntretienRequest>  entretienRequests;

    private List<AccidentRequest>  accidentRequests;
}
