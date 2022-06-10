package com.acsi.gpa.mapper;

import com.acsi.gpa.dto.piecedto.PieceRequest;
import com.acsi.gpa.dto.piecedto.PieceResponse;
import com.acsi.gpa.entities.Piece;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface PieceMapper {

    //Mapping entité  vers Dto
    PieceResponse PieceToPieceResponseDto(Piece piece);

    //Mapping Dto vers entités
    Piece PieceRequestDtoToPiece(PieceRequest pieceRequest);
}
