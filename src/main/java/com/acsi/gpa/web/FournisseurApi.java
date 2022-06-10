package com.acsi.gpa.web;

import com.acsi.gpa.dto.fournisseurdto.FournisseurRequest;
import com.acsi.gpa.dto.fournisseurdto.FournisseurResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.acsi.gpa.utils.Constants.APP_ROOT;

public interface FournisseurApi {

    @PostMapping(value = APP_ROOT+"/fournisseur/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    FournisseurResponse saveFournisseur(@RequestBody FournisseurRequest fournisseurRequest);

    FournisseurResponse updateFournisseur(FournisseurRequest fournisseurRequest);

    @GetMapping(value = APP_ROOT+"/fournisseur/{idfournisseur}", produces = MediaType.APPLICATION_JSON_VALUE)
    FournisseurResponse findFournisseurById(@PathVariable("idfournisseur") Long id);

    @GetMapping(value = APP_ROOT+"/fournisseur/all", produces = MediaType.APPLICATION_JSON_VALUE)
    List<FournisseurResponse> listFournisseur();

    @DeleteMapping(value = APP_ROOT+"/fournisseur/delete/{idfournisseur}")
    void deleteFournisseur(@PathVariable("idfournisseur") Long id);
}
