package com.acsi.gpa.service.pieceservice;

import com.acsi.gpa.dto.piecedto.PieceRequest;
import com.acsi.gpa.dto.piecedto.PieceResponse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PieceServiceImpl implements PieceService {
    @Override
    public PieceResponse savePiece(PieceRequest pieceRequest) {
        return null;
    }

    @Override
    public PieceResponse updatePiece(PieceRequest pieceRequest) {
        return null;
    }

    @Override
    public PieceResponse findPieceById(Long id) {
        return null;
    }

    @Override
    public List<PieceResponse> listPiece() {
        return null;
    }

    @Override
    public void deletePiece(Long id) {

    }
}
