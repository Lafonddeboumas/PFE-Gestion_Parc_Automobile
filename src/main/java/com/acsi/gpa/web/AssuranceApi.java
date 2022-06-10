package com.acsi.gpa.web;

import com.acsi.gpa.dto.assurancedto.AssuranceRequest;
import com.acsi.gpa.dto.assurancedto.AssuranceResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

import static com.acsi.gpa.utils.Constants.APP_ROOT;

public interface AssuranceApi {

    @PostMapping(value = APP_ROOT+"/assurance/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    AssuranceResponse saveAssurance(@RequestBody AssuranceRequest assuranceRequest);

    AssuranceResponse updateAssurance(AssuranceRequest assuranceRequest);

    @GetMapping(value = APP_ROOT+"/assurance/{idassurance}", produces = MediaType.APPLICATION_JSON_VALUE)
    AssuranceResponse findAssranceWithId(@PathVariable("idarticle") Long id);

    @GetMapping(value = APP_ROOT+"/assurance/{datedebut}", produces = MediaType.APPLICATION_JSON_VALUE)
    AssuranceResponse findAssuranceByDateDebut(@PathVariable("datedebut") Date dateDebut);

    @GetMapping(value = APP_ROOT+"/assurance/all", produces = MediaType.APPLICATION_JSON_VALUE)
    List<AssuranceResponse> listAssurance();

    @DeleteMapping(value = APP_ROOT+"/accident/delete/{idassurance}")
    void deleteAssuranceById(@PathVariable("idassurance") Long id);
}
