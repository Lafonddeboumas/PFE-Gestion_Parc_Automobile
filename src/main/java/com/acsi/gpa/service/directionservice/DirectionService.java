package com.acsi.gpa.service.directionservice;

import com.acsi.gpa.dto.directiondto.DirectionRequest;
import com.acsi.gpa.dto.directiondto.DirectionResponse;

import java.util.List;

public interface DirectionService {

    DirectionResponse saveDirection(DirectionRequest  directionRequest);
    DirectionResponse updateDirection(DirectionResponse directionResponse);

    DirectionResponse findDirectionById(Long id);

    List<DirectionResponse> listDirection();

    void deleteDirection(Long id);
}
