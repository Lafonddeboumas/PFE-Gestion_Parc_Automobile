package com.acsi.gpa.service.utilisateurservice;

import com.acsi.gpa.dto.utilisateurdto.UtilisateurRequest;
import com.acsi.gpa.dto.utilisateurdto.UtilisateurResponse;

import java.util.List;

public interface UtilisateurService {

    UtilisateurResponse saveUtilisateur(UtilisateurRequest utilisateurRequest);

    UtilisateurResponse updateUtilisateur(UtilisateurRequest utilisateurRequest);

    UtilisateurResponse findUtilisateurById(Long id);

    List<UtilisateurResponse> listUtilisateur();

    void deleteUtilisateur(Long id);
}
