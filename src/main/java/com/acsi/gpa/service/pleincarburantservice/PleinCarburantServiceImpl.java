package com.acsi.gpa.service.pleincarburantservice;

import com.acsi.gpa.dto.pleincarburantdto.PleinCarburantRequest;
import com.acsi.gpa.dto.pleincarburantdto.PleinCarburantResponse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PleinCarburantServiceImpl implements PleinCarburantService {

    @Override
    public PleinCarburantResponse savePleinCarburant(PleinCarburantRequest pleinCarburantRequest) {
        return null;
    }

    @Override
    public PleinCarburantResponse updatePleinCarburant(PleinCarburantRequest pleinCarburantRequest) {
        return null;
    }

    @Override
    public PleinCarburantResponse findPleinCarburantById(Long id) {
        return null;
    }

    @Override
    public List<PleinCarburantResponse> listPleinCarburant() {
        return null;
    }

    @Override
    public void deletePleinCarburant() {

    }
}
