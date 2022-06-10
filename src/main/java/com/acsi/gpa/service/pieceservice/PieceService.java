package com.acsi.gpa.service.pieceservice;

import com.acsi.gpa.dto.piecedto.PieceRequest;
import com.acsi.gpa.dto.piecedto.PieceResponse;

import java.util.List;

public interface PieceService {

    PieceResponse savePiece(PieceRequest pieceRequest);

    PieceResponse updatePiece(PieceRequest pieceRequest);

    PieceResponse findPieceById(Long id);

    List<PieceResponse> listPiece();

    void deletePiece(Long id);
}
