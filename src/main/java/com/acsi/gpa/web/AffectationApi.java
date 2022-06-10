package com.acsi.gpa.web;

import com.acsi.gpa.dto.affectationdto.AffectationRequest;
import com.acsi.gpa.dto.affectationdto.AffectationResponse;
import com.acsi.gpa.entities.ChauffeurMecanicien;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

import static com.acsi.gpa.utils.Constants.APP_ROOT;

public interface AffectationApi {

    @PostMapping(value = APP_ROOT+"/affectation/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    AffectationResponse saveAffectation(@RequestBody AffectationRequest affectationRequest);

    @GetMapping(value = APP_ROOT+"/affectation/{idaffectation}", produces = MediaType.APPLICATION_JSON_VALUE)
    AffectationResponse findAffectationById(@PathVariable("idaffectation") Long id);

    @GetMapping(value = APP_ROOT+"/affectation/{dateaffectation}", produces = MediaType.APPLICATION_JSON_VALUE)
    AffectationResponse findByDateAffectation(@PathVariable("dateaffectation") Date dateAffectation);

    @GetMapping(value = APP_ROOT+"/affectation/{chauffeurname}", produces = MediaType.APPLICATION_JSON_VALUE)
    AffectationResponse findByChauffeur(@PathVariable("chauffeurname") ChauffeurMecanicien chauffeurMecanicien);

    AffectationResponse updateAffectation(AffectationRequest affectationRequest);

    @GetMapping(value = APP_ROOT+"/affectation/all", produces = MediaType.APPLICATION_JSON_VALUE)
    List<AffectationResponse> listAffectation();

    @DeleteMapping(value = APP_ROOT+"/affectation/delete/{idaffectation}")
    void deleteAffectationById(@PathVariable("idaffectation") Long id);
}
