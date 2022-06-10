package com.acsi.gpa.web;

import com.acsi.gpa.dto.entretiendto.EntretienRequest;
import com.acsi.gpa.dto.entretiendto.EntretienResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.acsi.gpa.utils.Constants.APP_ROOT;

public interface EntretienApi {

    @PostMapping(value = APP_ROOT+"/entretien/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    EntretienResponse saveEntretien(@RequestBody EntretienRequest entretienRequest);


    EntretienResponse updateEntretien(EntretienRequest entretienRequest);

    @GetMapping(value = APP_ROOT+"/entretien/{identretien}", produces = MediaType.APPLICATION_JSON_VALUE)
    EntretienResponse findEntretienByid(@PathVariable("identretien") Long id);

    @GetMapping(value = APP_ROOT+"/entretien/all", produces = MediaType.APPLICATION_JSON_VALUE)
    List<EntretienResponse> listEntretien();

    @DeleteMapping(value = APP_ROOT+"/entretien/delete/{identretien}")
    void deleteEntretien(@PathVariable("identretien") Long id);
}
