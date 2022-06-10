package com.acsi.gpa.service.panneservice;

import com.acsi.gpa.dto.pannedto.PanneRequest;
import com.acsi.gpa.dto.pannedto.PanneResponse;

import java.util.List;

public interface PanneService {

    PanneResponse savePanne(PanneRequest panneRequest);

    PanneResponse upadtePanne(PanneRequest panneRequest);

    PanneResponse findPanneByid(Long id);

    List<PanneResponse> listPanne();

    void deletePanne(Long id);
}
