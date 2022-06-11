package com.acsi.gpa.validators;

import com.acsi.gpa.dto.piecedto.PieceRequest;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class PieceValidator {
    public static List<String> validate(PieceRequest pieceRequest){
        List<String> errors = new ArrayList<>();

        if(pieceRequest == null){
            errors.add("Veuillez renseigner le nom de la pièce");
            errors.add("Veuillez préciser la date d'achat de la pièce");
            errors.add("Veuillez préciser le prix de la pièce");
            errors.add("Veuillez préciser le fournisseur ayant vendu la pièce");
            return errors;
        }
        if(!StringUtils.hasLength(pieceRequest.getNomPiece())){
            errors.add("Veuillez renseigner le nom de la pièce");
        }
        if(pieceRequest.getDateAchat() == null){
            errors.add("Veuillez préciser la date d'achat de la pièce");
        }
        if(pieceRequest.getPrix() == null){
            errors.add("Veuillez préciser le prix de la pièce");
        }
        if(pieceRequest.getFournisseurRequest() == null){
            errors.add("Veuillez préciser le fournisseur ayant vendu la pièce");
        }
        return errors;

    }
}
