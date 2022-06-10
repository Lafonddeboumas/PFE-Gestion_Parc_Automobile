package com.acsi.gpa.service.panneservice;

import com.acsi.gpa.dto.pannedto.PanneRequest;
import com.acsi.gpa.dto.pannedto.PanneResponse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PanneServiceImpl implements PanneService {
    @Override
    public PanneResponse savePanne(PanneRequest panneRequest) {
        return null;
    }

    @Override
    public PanneResponse upadtePanne(PanneRequest panneRequest) {
        return null;
    }

    @Override
    public PanneResponse findPanneByid(Long id) {
        return null;
    }

    @Override
    public List<PanneResponse> listPanne() {
        return null;
    }

    @Override
    public void deletePanne(Long id) {

    }
}
