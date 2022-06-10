package com.acsi.gpa.web;

import com.acsi.gpa.dto.accidentdto.AccidentRequest;
import com.acsi.gpa.dto.accidentdto.AccidentResponse;
import com.acsi.gpa.service.accidentservice.AccidentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class AccidentController implements AccidentApi {

    private AccidentService accidentService;

    @Override
    public AccidentResponse saveAccident(AccidentRequest accidentRequest) {
        return accidentService.saveAccident(accidentRequest);
    }

    @Override
    public AccidentResponse findAccidentById(Long id) {
        return accidentService.findAccidentById(id);
    }

    @Override
    public AccidentResponse findByLieuAccident(String lieu) {
        return accidentService.findByLieuAccident(lieu);
    }

    @Override
    public AccidentResponse updateAccident(AccidentRequest accidentRequest) {
        return null;
    }

    @Override
    public List<AccidentResponse> listAccident() {
        return accidentService.listAccident();
    }

    @Override
    public void deleteAccidentById(Long id) {
        accidentService.deleteAccidentById(id);
    }
}
