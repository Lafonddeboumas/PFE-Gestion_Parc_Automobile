package com.acsi.gpa.service.fournisseurservice;

import com.acsi.gpa.dto.fournisseurdto.FournisseurRequest;
import com.acsi.gpa.dto.fournisseurdto.FournisseurResponse;
import com.acsi.gpa.entities.Fournisseur;
import com.acsi.gpa.entities.TypeFournisseur;
import com.acsi.gpa.exceptions.EntityNotFoundException;
import com.acsi.gpa.exceptions.ErrorsCode;
import com.acsi.gpa.exceptions.InvalidEntityException;
import com.acsi.gpa.mapper.FournisseurMapper;
import com.acsi.gpa.repository.FournisseurRepository;
import com.acsi.gpa.repository.TypeFournisseurRepository;
import com.acsi.gpa.validators.FournisseurValidator;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
@Slf4j
@AllArgsConstructor
public class FournisseurServiceImpl implements FournisseurService {

    private FournisseurRepository fournisseurRepository;
    private FournisseurMapper fournisseurMapper;
    private TypeFournisseurRepository typeFournisseurRepository;

    @Override
    public FournisseurResponse saveFournisseur(FournisseurRequest fournisseurRequest) {

        List<String> errors = FournisseurValidator.validate(fournisseurRequest);
        if (!errors.isEmpty()){
          log.error("fournisseur non valide");
          throw new InvalidEntityException("fournisseur non valide", ErrorsCode.FOURNISSEUR_NOT_VALID,errors);
        }

        Optional<TypeFournisseur> typeFournisseur = typeFournisseurRepository.findById(fournisseurRequest.getTypeFournisseurRequest().getIdTypeFour());
        if (typeFournisseur.isEmpty()){
            log.warn("le type fournisseur avec cet id n'existe pas dans la BDD",fournisseurRequest.getTypeFournisseurRequest().getIdTypeFour() );
            throw new EntityNotFoundException("Aucun type de fournisseur avec l'ID"+fournisseurRequest.getTypeFournisseurRequest().getIdTypeFour()+"n'existe pas dans la BDD",ErrorsCode.TYPEFOURNISSEUR_NOT_FOUND);
        }
        Fournisseur fournisseur = fournisseurMapper.FournisseurRequestDtoToFournisseur(fournisseurRequest);
        Fournisseur saveFournisseur = fournisseurRepository.save(fournisseur);
        return fournisseurMapper.FournisseurToFournisseurResponseDto(saveFournisseur);
    }

    @Override
    public FournisseurResponse updateFournisseur(FournisseurRequest fournisseurRequest) {
        return null;
    }

    @Override
    public FournisseurResponse findFournisseurById(Long id) {
        if(id == null){
            log.error("id nul");
            return null;
        }
        Fournisseur fournisseur = fournisseurRepository.findById(id).get();
        FournisseurResponse fournisseurResponse = fournisseurMapper.FournisseurToFournisseurResponseDto(fournisseur);
        return Optional.of(fournisseurResponse).orElseThrow( ()->
                new EntityNotFoundException(
                        "Aucun fournisseur avec l'ID ="+id+"n'a pas été trouvé dans la BDD",
                        ErrorsCode.FOURNISSEUR_NOT_FOUND
                )
        );
    }

    @Override
    public List<FournisseurResponse> listFournisseur() {
        List<Fournisseur> fournisseurs = fournisseurRepository.findAll();
        List<FournisseurResponse>  fournisseurResponses =
                fournisseurs.stream()
                        .map(cust->fournisseurMapper.FournisseurToFournisseurResponseDto(cust))
                        .collect(Collectors.toList());
        return fournisseurResponses;
    }

    @Override
    public void deleteFournisseur(Long id) {
        if (id == null){
            log.error("id null");
            return ;
        }
        fournisseurRepository.deleteById(id);
    }
}
