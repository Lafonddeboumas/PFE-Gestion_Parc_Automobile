package com.acsi.gpa.service.fournisseurservice;

import com.acsi.gpa.dto.fournisseurdto.FournisseurRequest;
import com.acsi.gpa.dto.fournisseurdto.FournisseurResponse;
import com.acsi.gpa.entities.Fournisseur;

import java.util.List;

public interface FournisseurService {

    FournisseurResponse saveFournisseur(FournisseurRequest fournisseurRequest);

    FournisseurResponse updateFournisseur(FournisseurRequest fournisseurRequest);

    FournisseurResponse findFournisseurById(Long id);

    List<FournisseurResponse> listFournisseur();

    void deleteFournisseur(Long id);
}
