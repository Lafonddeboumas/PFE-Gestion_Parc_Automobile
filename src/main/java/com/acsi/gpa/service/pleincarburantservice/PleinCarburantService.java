package com.acsi.gpa.service.pleincarburantservice;

import com.acsi.gpa.dto.pleincarburantdto.PleinCarburantRequest;
import com.acsi.gpa.dto.pleincarburantdto.PleinCarburantResponse;

import java.util.List;

public interface PleinCarburantService {

    PleinCarburantResponse savePleinCarburant(PleinCarburantRequest pleinCarburantRequest);

    PleinCarburantResponse updatePleinCarburant(PleinCarburantRequest pleinCarburantRequest);

    PleinCarburantResponse findPleinCarburantById(Long id);

    List<PleinCarburantResponse> listPleinCarburant();

    void deletePleinCarburant();
}
