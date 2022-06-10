package com.acsi.gpa.service.directionservice;

import com.acsi.gpa.dto.directiondto.DirectionRequest;
import com.acsi.gpa.dto.directiondto.DirectionResponse;
import com.acsi.gpa.entities.Direction;
import com.acsi.gpa.entities.Vehicule;
import com.acsi.gpa.exceptions.EntityNotFoundException;
import com.acsi.gpa.exceptions.ErrorsCode;
import com.acsi.gpa.exceptions.InvalidEntityException;
import com.acsi.gpa.mapper.DirectionMapper;
import com.acsi.gpa.repository.DirectionRepository;
import com.acsi.gpa.validators.DirectionValidator;
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
public class DirectionServiceImpl implements DirectionService {

    private DirectionRepository directionRepository;
    private DirectionMapper directionMapper;

    @Override
    public DirectionResponse saveDirection(DirectionRequest directionRequest) {

        List<String> errors = DirectionValidator.validate(directionRequest);
        if (!errors.isEmpty()){
            log.error("direction non valide",directionRequest);
            throw new InvalidEntityException("direction non valide ", ErrorsCode.DIRECTION_NOT_VALID,errors);
        }
        Direction direction = directionMapper.DirectionRequestDtoToDirection(directionRequest);
        Direction saveDirection = directionRepository.save(direction);
        return directionMapper.DirectionToDirectionResponseDto(saveDirection);
    }

    @Override
    public DirectionResponse updateDirection(DirectionResponse directionResponse) {
        return null;
    }

    @Override
    public DirectionResponse findDirectionById(Long id) {
        if(id == null){
            log.error("direction ID is null");
            return null;
        }
        Direction direction = directionRepository.findById(id).get();
        DirectionResponse directionResponse = directionMapper.DirectionToDirectionResponseDto(direction);
        return Optional.of(directionResponse).orElseThrow( ()->
                new EntityNotFoundException(
                        "Aucune direction avec l'ID ="+id+"n'a pas été trouvé dans la BDD",
                        ErrorsCode.DIRECTION_NOT_FOUND
                )
        );
    }

    @Override
    public List<DirectionResponse> listDirection() {
        List<Direction> directions = directionRepository.findAll();
        List<DirectionResponse> directionResponses =
                directions.stream()
                        .map(cust->directionMapper.DirectionToDirectionResponseDto(cust))
                        .collect(Collectors.toList());
        return directionResponses;
    }

    @Override
    public void deleteDirection(Long id) {
        if(id == null){
            log.error("direction ID is null");
            return ;
        }
        directionRepository.deleteById(id);
    }
}
