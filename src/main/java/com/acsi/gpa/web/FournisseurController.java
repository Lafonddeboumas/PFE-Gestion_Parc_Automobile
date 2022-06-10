package com.acsi.gpa.web;

import com.acsi.gpa.dto.fournisseurdto.FournisseurRequest;
import com.acsi.gpa.dto.fournisseurdto.FournisseurResponse;
import com.acsi.gpa.service.fournisseurservice.FournisseurService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class FournisseurController implements FournisseurApi {

    private FournisseurService fournisseurService;

    @Override
    public FournisseurResponse saveFournisseur(FournisseurRequest fournisseurRequest) {
        return fournisseurService.saveFournisseur(fournisseurRequest);
    }

    @Override
    public FournisseurResponse updateFournisseur(FournisseurRequest fournisseurRequest) {
        return null;
    }

    @Override
    public FournisseurResponse findFournisseurById(Long id) {
        return fournisseurService.findFournisseurById(id);
    }

    @Override
    public List<FournisseurResponse> listFournisseur() {
        return fournisseurService.listFournisseur();
    }

    @Override
    public void deleteFournisseur(Long id) {
        fournisseurService.deleteFournisseur(id);
    }
}
