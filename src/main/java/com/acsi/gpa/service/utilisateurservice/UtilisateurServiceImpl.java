package com.acsi.gpa.service.utilisateurservice;

import com.acsi.gpa.dto.utilisateurdto.UtilisateurRequest;
import com.acsi.gpa.dto.utilisateurdto.UtilisateurResponse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UtilisateurServiceImpl implements UtilisateurService {
    @Override
    public UtilisateurResponse saveUtilisateur(UtilisateurRequest utilisateurRequest) {
        return null;
    }

    @Override
    public UtilisateurResponse updateUtilisateur(UtilisateurRequest utilisateurRequest) {
        return null;
    }

    @Override
    public UtilisateurResponse findUtilisateurById(Long id) {
        return null;
    }

    @Override
    public List<UtilisateurResponse> listUtilisateur() {
        return null;
    }

    @Override
    public void deleteUtilisateur(Long id) {

    }
}
