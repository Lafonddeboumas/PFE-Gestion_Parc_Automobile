package com.acsi.gpa.service.assuranceservice;

import com.acsi.gpa.dto.assurancedto.AssuranceRequest;
import com.acsi.gpa.dto.assurancedto.AssuranceResponse;

import java.util.Date;
import java.util.List;

public interface AssuranceService {
    
    AssuranceResponse saveAssurance(AssuranceRequest assuranceRequest);
    
    AssuranceResponse updateAssurance(AssuranceRequest assuranceRequest);

    AssuranceResponse findAssranceWithId(Long id);

    AssuranceResponse findAssuranceByDateDebut(Date dateDebut);
    List<AssuranceResponse> listAssurance();
    
    void deleteAssuranceById(Long id);
}
