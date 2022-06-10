package com.acsi.gpa.service.accidentservice;

import com.acsi.gpa.dto.accidentdto.AccidentRequest;
import com.acsi.gpa.dto.accidentdto.AccidentResponse;

import java.util.List;

public interface AccidentService {

       AccidentResponse saveAccident(AccidentRequest accidentRequest);

       AccidentResponse findAccidentById(Long id);

       AccidentResponse findByLieuAccident(String lieu);

       AccidentResponse updateAccident(AccidentRequest accidentRequest);

       List<AccidentResponse> listAccident();

       void deleteAccidentById(Long id);



}
