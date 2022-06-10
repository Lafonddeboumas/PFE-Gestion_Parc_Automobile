package com.acsi.gpa.web;

import com.acsi.gpa.dto.entretiendto.EntretienRequest;
import com.acsi.gpa.dto.entretiendto.EntretienResponse;
import com.acsi.gpa.service.entretienservice.EntretienService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class EntretienController implements EntretienApi {
    
    private EntretienService entretienService;
    
    @Override
    public EntretienResponse saveEntretien(EntretienRequest entretienRequest) {
        return entretienService.saveEntretien(entretienRequest);
    }

    @Override
    public EntretienResponse updateEntretien(EntretienRequest entretienRequest) {
        return null;
    }

    @Override
    public EntretienResponse findEntretienByid(Long id) {
        return entretienService.findEntretienByid(id);
    }

    @Override
    public List<EntretienResponse> listEntretien() {
        return entretienService.listEntretien();
    }

    @Override
    public void deleteEntretien(Long id) {
        entretienService.deleteEntretien(id);
    }
}
