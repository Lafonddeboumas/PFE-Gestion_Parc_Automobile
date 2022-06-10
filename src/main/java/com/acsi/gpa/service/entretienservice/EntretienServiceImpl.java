package com.acsi.gpa.service.entretienservice;

import com.acsi.gpa.dto.entretiendto.EntretienRequest;
import com.acsi.gpa.dto.entretiendto.EntretienResponse;
import com.acsi.gpa.entities.Entretien;
import com.acsi.gpa.exceptions.EntityNotFoundException;
import com.acsi.gpa.exceptions.ErrorsCode;
import com.acsi.gpa.exceptions.InvalidEntityException;
import com.acsi.gpa.mapper.EntretienMapper;
import com.acsi.gpa.repository.EntretienRepository;
import com.acsi.gpa.validators.EntretienValidator;
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
public class EntretienServiceImpl implements EntretienService {

    private EntretienRepository entretienRepository;
    private EntretienMapper entretienMapper;

    @Override
    public EntretienResponse saveEntretien(EntretienRequest entretienRequest) {
        List<String> errors = EntretienValidator.validate(entretienRequest);
        if(!errors.isEmpty()){
            log.error("entrtien non valide",entretienRequest);
            throw new InvalidEntityException("Entretien non valide ", ErrorsCode.ENTRETIEN_NOT_VALID,errors);
        }
        Entretien entretien = entretienMapper.EntretienRequestDtoToEntretien(entretienRequest);
        Entretien saveEntretien = entretienRepository.save(entretien);
        return entretienMapper.EntretienToEntretienresponseDto(saveEntretien);
    }

    @Override
    public EntretienResponse updateEntretien(EntretienRequest entretienRequest) {
        return null;
    }

    @Override
    public EntretienResponse findEntretienByid(Long id) {
        if (id == null){
            log.error("id null");
            return null;
        }
        Entretien entretien  = entretienRepository.findById(id).get();
        EntretienResponse entretienResponse= entretienMapper.EntretienToEntretienresponseDto(entretien);
        return Optional.of(entretienResponse).orElseThrow( ()->
                new EntityNotFoundException(
                        "Aucun entretien avec l'ID ="+id+"n'a pas été trouvé dans la BDD",
                        ErrorsCode.ENTRETIEN_NOT_FOUND
                )
        );
    }

    @Override
    public List<EntretienResponse> listEntretien() {
        List<Entretien> entretiens = entretienRepository.findAll();
        List<EntretienResponse> entretienResponses =
                entretiens.stream()
                        .map(cust->entretienMapper.EntretienToEntretienresponseDto(cust))
                        .collect(Collectors.toList());
        return entretienResponses;
    }

    @Override
    public void deleteEntretien(Long id) {
        if (id == null){
            log.error("id null");
            return ;
        }
        entretienRepository.deleteById(id);
    }
}
