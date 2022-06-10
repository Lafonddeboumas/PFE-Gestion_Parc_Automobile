package com.acsi.gpa.web;

import com.acsi.gpa.dto.directiondto.DirectionRequest;
import com.acsi.gpa.dto.directiondto.DirectionResponse;
import com.acsi.gpa.service.directionservice.DirectionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class DirectionApiControler implements DirectionApi {

    private DirectionService directionService;

    @Override
    public DirectionResponse saveDirection(DirectionRequest directionRequest) {
        return directionService.saveDirection(directionRequest);
    }

    @Override
    public DirectionResponse updateDirection(DirectionResponse directionResponse) {
        return null;
    }

    @Override
    public DirectionResponse findDirectionById(Long id) {
        return directionService.findDirectionById(id);
    }

    @Override
    public List<DirectionResponse> listDirection() {
        return directionService.listDirection();
    }

    @Override
    public void deleteDirection(Long id) {
        directionService.deleteDirection(id);
    }
}
