package com.acsi.gpa.web;

import com.acsi.gpa.dto.assurancedto.AssuranceRequest;
import com.acsi.gpa.dto.assurancedto.AssuranceResponse;
import com.acsi.gpa.service.assuranceservice.AssuranceService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@AllArgsConstructor
public class AssuranceController implements AssuranceApi {

    private AssuranceService assuranceService;

    @Override
    public AssuranceResponse saveAssurance(AssuranceRequest assuranceRequest) {
        return assuranceService.saveAssurance(assuranceRequest);
    }

    @Override
    public AssuranceResponse updateAssurance(AssuranceRequest assuranceRequest) {
        return null;
    }

    @Override
    public AssuranceResponse findAssranceWithId(Long id) {
        return assuranceService.findAssranceWithId(id);
    }

    @Override
    public AssuranceResponse findAssuranceByDateDebut(Date dateDebut) {
        return assuranceService.findAssuranceByDateDebut(dateDebut);
    }

    @Override
    public List<AssuranceResponse> listAssurance() {
        return assuranceService.listAssurance();
    }

    @Override
    public void deleteAssuranceById(Long id) {
        assuranceService.deleteAssuranceById(id);
    }
}
