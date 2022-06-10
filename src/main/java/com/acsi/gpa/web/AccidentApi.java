package com.acsi.gpa.web;

import com.acsi.gpa.dto.accidentdto.AccidentRequest;
import com.acsi.gpa.dto.accidentdto.AccidentResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import static com.acsi.gpa.utils.Constants.APP_ROOT;
import javax.print.attribute.standard.Media;
import java.awt.*;
import java.util.List;

@Api(value = "API POUR LA GESTION DES ACCIDENTS")
public interface AccidentApi {

    @ApiOperation(value = "Enregistrer un accident", notes = "cette méthode permet d'enregistrer ou de modifier un accident",
            response = AccidentResponse.class)
    @PostMapping(value = APP_ROOT+"/accident/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "objet accident créer/modifier"),
            @ApiResponse(code = 400, message = "Accident non valide")
    })
    AccidentResponse saveAccident(@RequestBody AccidentRequest accidentRequest);


    @GetMapping(value = APP_ROOT+"/accident/{idaccident}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "rechercher un accident par ID", notes = "cette méthode permet de chercher un accident à partir de son id",
            response = AccidentResponse.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "l'accident a été trouvé dans la BDD"),
            @ApiResponse(code = 404, message = "Aucun accident n'existe dans la BDD avec l'ID fournit")
    })
    AccidentResponse findAccidentById(@PathVariable("idaccident") Long id);


    @GetMapping(value = APP_ROOT+"/accident/{lieu}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "rechercher un accident par LIEU", notes = "cette méthode permet de chercher un accident à partir du lieu de l'accident",
            response = AccidentResponse.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "l'accident a été trouvé dans la BDD"),
            @ApiResponse(code = 404, message = "Aucun accident n'existe dans la BDD avec le lieu fournit")
    })
    AccidentResponse findByLieuAccident(@PathVariable("lieu") String lieu);

    AccidentResponse updateAccident(AccidentRequest accidentRequest);

    @GetMapping(value = APP_ROOT+"/accident/all", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "renvoie la liste des accidents", notes = "cette méthode permet de chercher et renvoyer la liste des articles qui existent dans la BDD",
            responseContainer = "List<AccidentResponse>")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "la liste des articles / liste vide")
    })
    List<AccidentResponse> listAccident();

    @DeleteMapping(value = APP_ROOT+"/accident/delete/{idaccident}")
    @ApiOperation(value = "supprimer un accident par son id", notes = "cette méthode permet de supprimer un accident par son id",
            response = AccidentResponse.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "l'accident a été supprimer")
    })
    void deleteAccidentById(@PathVariable("idaccident") Long id);
}
