package com.acsi.gpa.web;

import com.acsi.gpa.dto.directiondto.DirectionRequest;
import com.acsi.gpa.dto.directiondto.DirectionResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.acsi.gpa.utils.Constants.APP_ROOT;

public interface DirectionApi {

    @PostMapping(value = APP_ROOT+"/direction/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    DirectionResponse saveDirection(@RequestBody DirectionRequest directionRequest);

    DirectionResponse updateDirection(DirectionResponse directionResponse);

    @GetMapping(value = APP_ROOT+"/direction/{iddirection}", produces = MediaType.APPLICATION_JSON_VALUE)
    DirectionResponse findDirectionById(@PathVariable("iddirection") Long id);

    @GetMapping(value = APP_ROOT+"/direction/all", produces = MediaType.APPLICATION_JSON_VALUE)
    List<DirectionResponse> listDirection();

    @DeleteMapping(value = APP_ROOT+"/direction/delete/{iddirection}")
    void deleteDirection(@PathVariable("iddirection") Long id);
}
