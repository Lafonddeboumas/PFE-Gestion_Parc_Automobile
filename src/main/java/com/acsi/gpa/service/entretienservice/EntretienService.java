package com.acsi.gpa.service.entretienservice;

import com.acsi.gpa.dto.entretiendto.EntretienRequest;
import com.acsi.gpa.dto.entretiendto.EntretienResponse;

import java.util.List;

public interface EntretienService {

    EntretienResponse saveEntretien(EntretienRequest entretienRequest);

    EntretienResponse updateEntretien(EntretienRequest entretienRequest);

    EntretienResponse findEntretienByid(Long id);

    List<EntretienResponse> listEntretien();

    void deleteEntretien(Long id);
}
